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
from typing import Union

from pydantic import BaseModel
from pydantic import Field
from pydantic import StrictFloat
from pydantic import StrictInt
from pydantic import StrictStr


class WebSocketMessage(BaseModel):
    """
    WebSocketMessage
    """

    type: StrictStr = Field(...)
    opcode: Union[StrictFloat, StrictInt] = Field(...)
    data: StrictStr = Field(...)
    time: Union[StrictFloat, StrictInt] = Field(...)
    __properties = ["type", "opcode", "data", "time"]

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
    def from_json(cls, json_str: str) -> WebSocketMessage:
        """Create an instance of WebSocketMessage from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self):
        """Returns the dictionary representation of the model using alias"""
        _dict = self.dict(by_alias=True, exclude={}, exclude_none=True)
        return _dict

    @classmethod
    def from_dict(cls, obj: dict) -> WebSocketMessage:
        """Create an instance of WebSocketMessage from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return WebSocketMessage.parse_obj(obj)

        _obj = WebSocketMessage.parse_obj(
            {
                "type": obj.get("type"),
                "opcode": obj.get("opcode"),
                "data": obj.get("data"),
                "time": obj.get("time"),
            }
        )
        return _obj
