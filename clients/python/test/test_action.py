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


class TestAction(unittest.TestCase):
    """Action unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test Action
        include_option is a boolean, when False only required
        params are included, when True both required and
        optional params are included"""
        # uncomment below to create an instance of `Action`
        """
        model = BrowserUpMitmProxyClient.models.action.Action()  # noqa: E501
        if include_optional :
            return Action(
                name = '', 
                id = '', 
                class_name = '', 
                tag_name = '', 
                xpath = '', 
                data_attributes = '', 
                form_name = '', 
                content = ''
            )
        else :
            return Action(
        )
        """

    def testAction(self):
        """Test Action"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)


if __name__ == "__main__":
    unittest.main()
