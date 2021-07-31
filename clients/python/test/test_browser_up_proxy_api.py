"""
    BrowserUp Proxy

    ___ This is the REST API for controlling the BrowserUp Proxy. The BrowserUp Proxy is a swiss army knife for automated testing that captures HTTP traffic in HAR files. It is also useful for Selenium/Cypress tests. ___   # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""


import unittest

import BrowserUpProxyClient
from BrowserUpProxyClient.api.browser_up_proxy_api import BrowserUpProxyApi  # noqa: E501


class TestBrowserUpProxyApi(unittest.TestCase):
    """BrowserUpProxyApi unit test stubs"""

    def setUp(self):
        self.api = BrowserUpProxyApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_add_counter(self):
        """Test case for add_counter

        """
        pass

    def test_add_error(self):
        """Test case for add_error

        """
        pass

    def test_get_har_log(self):
        """Test case for get_har_log

        """
        pass

    def test_healthcheck(self):
        """Test case for healthcheck

        """
        pass

    def test_new_page(self):
        """Test case for new_page

        """
        pass

    def test_reset_har_log(self):
        """Test case for reset_har_log

        """
        pass

    def test_verify_not_present(self):
        """Test case for verify_not_present

        """
        pass

    def test_verify_present(self):
        """Test case for verify_present

        """
        pass

    def test_verify_size(self):
        """Test case for verify_size

        """
        pass

    def test_verify_sla(self):
        """Test case for verify_sla

        """
        pass


if __name__ == '__main__':
    unittest.main()
