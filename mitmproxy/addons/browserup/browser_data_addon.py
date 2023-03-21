import mitmproxy.http
import logging
import re
import json
import os


# Inject a script into browser-responses for html that lets us get DOM timings, first paint time, and other metrics.
class BrowserDataAddOn:
    def __init__(self, har_capture_addon):
        filepath = os.path.normpath(("scripts/browsertime/browser-data.js"))
        logging.info(filepath)
        with open(filepath, 'r') as file:
            self.browser_data_script = f'<script data-browserup=true>' + file.read() + '</script>'
            self.browser_data_script_len = len(self.browser_data_script)
            self.HarCaptureAddon = har_capture_addon

    def load(self, l):
        logging.info('Loading BrowserDataAddOn')

    def request(self, f: mitmproxy.http.HTTPFlow):
        if f.request.url.rfind('BrowserData') and 'action' in f.request.query.keys():
            action = f.request.query['action']
            logging.info(f'BrowserData {action}')
            f.metadata['blocklisted'] = True
            if action == 'page_info':
                form = f.request.multipart_form
                logging.info(f'-->PageTimings {form.fields}')
                data = form.fields[0][1].decode('UTF-8')
                page_timings = json.loads(data)
                self.HarCaptureAddon.add_page_info_to_har(page_timings)
                f.response = mitmproxy.http.Response.make(204)

    def response(self, f: mitmproxy.http.HTTPFlow):
        if f.response is None or f.response.status_code != 200 or f.request.method not in ['GET', 'POST', 'PUT']:
            return

        if "content-type" in f.response.headers and "text/html" in f.response.headers["content-type"]:
            if f.response.content is not None:
                html = f.response.content.decode('utf-8')
                html = re.sub('</body', self.browser_data_script + '</body', html)
                f.metadata['injected_script_len'] = self.browser_data_script_len
                f.response.text = html
