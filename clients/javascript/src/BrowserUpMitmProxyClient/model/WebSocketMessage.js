/**
 * BrowserUp MitmProxy
 * ___ This is the REST API for controlling the BrowserUp MitmProxy. The BrowserUp MitmProxy is a swiss army knife for automated testing that captures HTTP traffic in HAR files. It is also useful for Selenium/Cypress tests. ___ 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The WebSocketMessage model module.
 * @module BrowserUpMitmProxyClient/model/WebSocketMessage
 * @version 1.0.0
 */
class WebSocketMessage {
    /**
     * Constructs a new <code>WebSocketMessage</code>.
     * @alias module:BrowserUpMitmProxyClient/model/WebSocketMessage
     * @param type {Object} 
     * @param opcode {Object} 
     * @param data {Object} 
     * @param time {Object} 
     */
    constructor(type, opcode, data, time) { 
        
        WebSocketMessage.initialize(this, type, opcode, data, time);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, type, opcode, data, time) { 
        obj['type'] = type;
        obj['opcode'] = opcode;
        obj['data'] = data;
        obj['time'] = time;
    }

    /**
     * Constructs a <code>WebSocketMessage</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:BrowserUpMitmProxyClient/model/WebSocketMessage} obj Optional instance to populate.
     * @return {module:BrowserUpMitmProxyClient/model/WebSocketMessage} The populated <code>WebSocketMessage</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new WebSocketMessage();

            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], Object);
            }
            if (data.hasOwnProperty('opcode')) {
                obj['opcode'] = ApiClient.convertToType(data['opcode'], Object);
            }
            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], Object);
            }
            if (data.hasOwnProperty('time')) {
                obj['time'] = ApiClient.convertToType(data['time'], Object);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>WebSocketMessage</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>WebSocketMessage</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of WebSocketMessage.RequiredProperties) {
            if (!data[property]) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }

        return true;
    }


}

WebSocketMessage.RequiredProperties = ["type", "opcode", "data", "time"];

/**
 * @member {Object} type
 */
WebSocketMessage.prototype['type'] = undefined;

/**
 * @member {Object} opcode
 */
WebSocketMessage.prototype['opcode'] = undefined;

/**
 * @member {Object} data
 */
WebSocketMessage.prototype['data'] = undefined;

/**
 * @member {Object} time
 */
WebSocketMessage.prototype['time'] = undefined;






export default WebSocketMessage;

