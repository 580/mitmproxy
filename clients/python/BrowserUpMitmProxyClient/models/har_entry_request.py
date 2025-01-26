# coding: utf-8

"""
BrowserUp MitmProxy

___ This is the REST API for controlling the BrowserUp MitmProxy. The BrowserUp MitmProxy is a swiss army knife for automated testing that captures HTTP traffic in HAR files. It is also useful for Selenium/Cypress tests. ___

The version of the OpenAPI document: 1.0.0
Contact: developers@browserup.com
Generated by OpenAPI Generator (https://openapi-generator.tech)

Do not edit the class manually.
"""  # noqa: E501

from __future__ import annotations

import json
import pprint
import re  # noqa: F401
from typing import Optional, Any

from pydantic import BaseModel
from pydantic import conlist
from pydantic import Field
from pydantic import StrictInt
from pydantic import StrictStr

from BrowserUpMitmProxyClient.models.har_entry_request_cookies_inner import (
    HarEntryRequestCookiesInner,
)
from BrowserUpMitmProxyClient.models.har_entry_request_post_data import (
    HarEntryRequestPostData,
)
from BrowserUpMitmProxyClient.models.har_entry_request_query_string_inner import (
    HarEntryRequestQueryStringInner,
)
from BrowserUpMitmProxyClient.models.header import Header


class HarEntryRequest(BaseModel):
    """
    HarEntryRequest
    """

    method: StrictStr = Field(...)
    url: StrictStr = Field(...)
    http_version: StrictStr = Field(..., alias="httpVersion")
    cookies: conlist(HarEntryRequestCookiesInner) = Field(...)
    headers: conlist(Header) = Field(...)
    query_string: conlist(HarEntryRequestQueryStringInner) = Field(
        ..., alias="queryString"
    )
    post_data: Optional[HarEntryRequestPostData] = Field(None, alias="postData")
    headers_size: StrictInt = Field(..., alias="headersSize")
    body_size: StrictInt = Field(..., alias="bodySize")
    comment: Optional[StrictStr] = None
    additional_properties: dict[str, Any] = {}
    __properties = [
        "method",
        "url",
        "httpVersion",
        "cookies",
        "headers",
        "queryString",
        "postData",
        "headersSize",
        "bodySize",
        "comment",
    ]

    class Config:
        """Pydantic configuration"""

        allow_population_by_field_name = True
        validate_assignment = True

    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.dict(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> HarEntryRequest:
        """Create an instance of HarEntryRequest from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(
            by_alias=True, exclude={"additional_properties"}, exclude_none=True
        )
        # override the default output from pydantic by calling `to_dict()` of each item in cookies (list)
        _items = []
        if self.cookies:
            for _item in self.cookies:
                if _item:
                    _items.append(_item.to_dict())
            _dict["cookies"] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in headers (list)
        _items = []
        if self.headers:
            for _item in self.headers:
                if _item:
                    _items.append(_item.to_dict())
            _dict["headers"] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in query_string (list)
        _items = []
        if self.query_string:
            for _item in self.query_string:
                if _item:
                    _items.append(_item.to_dict())
            _dict["queryString"] = _items
        # override the default output from pydantic by calling `to_dict()` of post_data
        if self.post_data:
            _dict["postData"] = self.post_data.to_dict()
        # puts key-value pairs in additional_properties in the top level
        if self.additional_properties is not None:
            for _key, _value in self.additional_properties.items():
                _dict[_key] = _value

        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> HarEntryRequest:
        """Create an instance of HarEntryRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return HarEntryRequest.parse_obj(obj)

        _obj = HarEntryRequest.parse_obj(
            {
                "method": obj.get("method"),
                "url": obj.get("url"),
                "http_version": obj.get("httpVersion"),
                "cookies": [
                    HarEntryRequestCookiesInner.from_dict(_item)
                    for _item in obj.get("cookies")
                ]
                if obj.get("cookies") is not None
                else None,
                "headers": [Header.from_dict(_item) for _item in obj.get("headers")]
                if obj.get("headers") is not None
                else None,
                "query_string": [
                    HarEntryRequestQueryStringInner.from_dict(_item)
                    for _item in obj.get("queryString")
                ]
                if obj.get("queryString") is not None
                else None,
                "post_data": HarEntryRequestPostData.from_dict(obj.get("postData"))
                if obj.get("postData") is not None
                else None,
                "headers_size": obj.get("headersSize"),
                "body_size": obj.get("bodySize"),
                "comment": obj.get("comment"),
            }
        )
        # store additional fields in additional_properties
        for _key in obj.keys():
            if _key not in cls.__properties:
                _obj.additional_properties[_key] = obj.get(_key)

        return _obj
