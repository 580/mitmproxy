import pytest

from mitmproxy import http
from mitmproxy.addons.browserup import har_capture_addon
from mitmproxy.test import taddons
from mitmproxy.test import tflow
from mitmproxy.test import tutils


class TestHARCounters:
    def test_counter_added(self, hc, flow):
        hc.add_counter_to_har({"name": "time-to-first-paint", "value": 3})
        assert len(hc.get_or_create_current_page().get("_counters")) == 1

    def test_valid_counters_added(self, hc, flow):
        hc.add_counter_to_har({"name": "time-to-first-byte", "value": 1})
        hc.add_counter_to_har({"name": "time-to-first-paint", "value": 2})
        counters = hc.get_or_create_current_page().get("_counters")
        assert len(counters) == 2
        assert counters[0].get("name") == "time-to-first-byte"
        assert counters[0].get("value") == 1
        assert counters[1].get("name") == "time-to-first-paint"
        assert counters[1].get("value") == 2

    def test_valid_counter_added_then_reset(self, hc, flow):
        hc.add_counter_to_har({"name": "time-to-first-byte", "value": 1})
        hc.add_counter_to_har({"name": "time-to-first-paint", "value": 2})
        hc.new_page("page1", "New Page!")
        assert hc.get_or_create_current_page().get("_counters") is None
        hc.add_counter_to_har({"name": "time-to-first-byte", "value": 1})
        counters = hc.get_or_create_current_page().get("_counters")
        assert len(counters) == 1

    def test_new_har_empty_counters(self, hc, flow):
        hc.add_counter_to_har({"name": "time-to-first-byte", "value": 1})
        hc.add_counter_to_har({"name": "time-to-first-paint", "value": 2})
        hc.reset_har_and_return_old_har()
        hc.new_page("page1", "New Page!")
        assert hc.get_or_create_current_page().get("_counters") is None


@pytest.fixture()
def flow():
    resp_content = b"message"
    times = dict(
        timestamp_start=746203200,
        timestamp_end=746203290,
    )

    return tflow.tflow(
        req=tutils.treq(method=b"GET", **times),
        resp=tutils.tresp(content=resp_content, **times),
    )


@pytest.fixture()
def json_flow():
    times = dict(
        timestamp_start=746203200,
        timestamp_end=746203290,
    )

    return tflow.tflow(
        req=tutils.treq(method=b"GET", path=b"/path/foo.json", **times),
        resp=tutils.tresp(
            content=b'{"foo": "bar"}',
            headers=http.Headers(
                (
                    (b"header-response", b"svalue"),
                    (b"content-type", b"application/json"),
                )
            ),
            **times,
        ),
    )


@pytest.fixture()
def hc(flow):
    a = har_capture_addon.HarCaptureAddOn()
    with taddons.context(hc) as ctx:
        ctx.configure(a)
    return a
