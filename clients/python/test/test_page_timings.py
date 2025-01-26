# coding: utf-8

"""
BrowserUp MitmProxy

___ This is the REST API for controlling the BrowserUp MitmProxy. The BrowserUp MitmProxy is a swiss army knife for automated testing that captures HTTP traffic in HAR files. It is also useful for Selenium/Cypress tests. ___

The version of the OpenAPI document: 1.0.0
Contact: developers@browserup.com
Generated by OpenAPI Generator (https://openapi-generator.tech)

Do not edit the class manually.
"""  # noqa: E501

import unittest


class TestPageTimings(unittest.TestCase):
    """PageTimings unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test PageTimings
        include_option is a boolean, when False only required
        params are included, when True both required and
        optional params are included"""
        # uncomment below to create an instance of `PageTimings`
        """
        model = BrowserUpMitmProxyClient.models.page_timings.PageTimings()  # noqa: E501
        if include_optional :
            return PageTimings(
                on_content_load = -1, 
                on_load = -1, 
                href = '', 
                dns = -1, 
                ssl = -1, 
                time_to_first_byte = -1, 
                cumulative_layout_shift = -1, 
                largest_contentful_paint = { }, 
                first_paint = -1, 
                first_input_delay = -1, 
                dom_interactive = -1, 
                first_contentful_paint = -1, 
                comment = ''
            )
        else :
            return PageTimings(
                on_content_load = -1,
                on_load = -1,
        )
        """

    def testPageTimings(self):
        """Test PageTimings"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)


if __name__ == "__main__":
    unittest.main()
