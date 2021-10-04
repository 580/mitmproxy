/**
 * BrowserUp Proxy
 * ___ This is the REST API for controlling the BrowserUp Proxy.  The BrowserUp Proxy is a swiss army knife for automated testing. It allows traffic capture in HAR files and manipulation.  It is also useful for Selenium/Cypress tests. ___ 
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
 * The Headers model module.
 * @module BrowserUpProxyClient/model/Headers
 * @version 1.0.0
 */
class Headers {
    /**
     * Constructs a new <code>Headers</code>.
     * @alias module:BrowserUpProxyClient/model/Headers
     * @param headers {Object} Header key-value pairs
     */
    constructor(headers) { 
        
        Headers.initialize(this, headers);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, headers) { 
        obj['headers'] = headers;
    }

    /**
     * Constructs a <code>Headers</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:BrowserUpProxyClient/model/Headers} obj Optional instance to populate.
     * @return {module:BrowserUpProxyClient/model/Headers} The populated <code>Headers</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Headers();

            if (data.hasOwnProperty('headers')) {
                obj['headers'] = ApiClient.convertToType(data['headers'], Object);
            }
        }
        return obj;
    }


}

/**
 * Header key-value pairs
 * @member {Object} headers
 */
Headers.prototype['headers'] = undefined;






export default Headers;
