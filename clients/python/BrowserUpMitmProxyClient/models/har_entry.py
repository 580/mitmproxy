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
import pprint
import re  # noqa: F401
import json

from datetime import datetime
from typing import List, Optional
from pydantic import BaseModel, Field, StrictStr, conint, conlist
from BrowserUpMitmProxyClient.models.har_entry_cache import HarEntryCache
from BrowserUpMitmProxyClient.models.har_entry_request import HarEntryRequest
from BrowserUpMitmProxyClient.models.har_entry_response import HarEntryResponse
from BrowserUpMitmProxyClient.models.har_entry_timings import HarEntryTimings
from BrowserUpMitmProxyClient.models.web_socket_message import WebSocketMessage

class HarEntry(BaseModel):
    """
    HarEntry
    """
    pageref: Optional[StrictStr] = None
    started_date_time: datetime = Field(..., alias="startedDateTime")
    time: conint(strict=True, ge=0) = Field(...)
    request: HarEntryRequest = Field(...)
    response: HarEntryResponse = Field(...)
    cache: HarEntryCache = Field(...)
    timings: HarEntryTimings = Field(...)
    server_ip_address: Optional[StrictStr] = Field(None, alias="serverIPAddress")
    web_socket_messages: Optional[conlist(WebSocketMessage)] = Field(None, alias="_webSocketMessages")
    connection: Optional[StrictStr] = None
    comment: Optional[StrictStr] = None
    __properties = ["pageref", "startedDateTime", "time", "request", "response", "cache", "timings", "serverIPAddress", "_webSocketMessages", "connection", "comment"]

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
    def from_json(cls, json_str: str) -> HarEntry:
        """Create an instance of HarEntry from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True,
                          exclude={
                          },
                          exclude_none=True)
        # override the default output from pydantic by calling `to_dict()` of request
        if self.request:
            _dict['request'] = self.request.to_dict()
        # override the default output from pydantic by calling `to_dict()` of response
        if self.response:
            _dict['response'] = self.response.to_dict()
        # override the default output from pydantic by calling `to_dict()` of cache
        if self.cache:
            _dict['cache'] = self.cache.to_dict()
        # override the default output from pydantic by calling `to_dict()` of timings
        if self.timings:
            _dict['timings'] = self.timings.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in web_socket_messages (list)
        _items = []
        if self.web_socket_messages:
            for _item in self.web_socket_messages:
                if _item:
                    _items.append(_item.to_dict())
            _dict['_webSocketMessages'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> HarEntry:
        """Create an instance of HarEntry from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return HarEntry.parse_obj(obj)

        _obj = HarEntry.parse_obj({
            "pageref": obj.get("pageref"),
            "started_date_time": obj.get("startedDateTime"),
            "time": obj.get("time"),
            "request": HarEntryRequest.from_dict(obj.get("request")) if obj.get("request") is not None else None,
            "response": HarEntryResponse.from_dict(obj.get("response")) if obj.get("response") is not None else None,
            "cache": HarEntryCache.from_dict(obj.get("cache")) if obj.get("cache") is not None else None,
            "timings": HarEntryTimings.from_dict(obj.get("timings")) if obj.get("timings") is not None else None,
            "server_ip_address": obj.get("serverIPAddress"),
            "web_socket_messages": [WebSocketMessage.from_dict(_item) for _item in obj.get("_webSocketMessages")] if obj.get("_webSocketMessages") is not None else None,
            "connection": obj.get("connection"),
            "comment": obj.get("comment")
        })
        return _obj

