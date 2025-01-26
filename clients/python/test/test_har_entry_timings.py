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


class TestHarEntryTimings(unittest.TestCase):
    """HarEntryTimings unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test HarEntryTimings
        include_option is a boolean, when False only required
        params are included, when True both required and
        optional params are included"""
        # uncomment below to create an instance of `HarEntryTimings`
        """
        model = BrowserUpMitmProxyClient.models.har_entry_timings.HarEntryTimings()  # noqa: E501
        if include_optional :
            return HarEntryTimings(
                dns = -1, 
                connect = -1, 
                blocked = -1, 
                send = -1, 
                wait = -1, 
                receive = -1, 
                ssl = -1, 
                comment = ''
            )
        else :
            return HarEntryTimings(
                dns = -1,
                connect = -1,
                blocked = -1,
                send = -1,
                wait = -1,
                receive = -1,
                ssl = -1,
        )
        """

    def testHarEntryTimings(self):
        """Test HarEntryTimings"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)


if __name__ == "__main__":
    unittest.main()
