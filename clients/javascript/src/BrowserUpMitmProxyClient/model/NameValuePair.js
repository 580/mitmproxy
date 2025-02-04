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
 * The NameValuePair model module.
 * @module BrowserUpMitmProxyClient/model/NameValuePair
 * @version 1.0.0
 */
class NameValuePair {
    /**
     * Constructs a new <code>NameValuePair</code>.
     * @alias module:BrowserUpMitmProxyClient/model/NameValuePair
     */
    constructor() { 
        
        NameValuePair.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>NameValuePair</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:BrowserUpMitmProxyClient/model/NameValuePair} obj Optional instance to populate.
     * @return {module:BrowserUpMitmProxyClient/model/NameValuePair} The populated <code>NameValuePair</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new NameValuePair();

            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
        }
        return obj;
    }


}

/**
 * Value to match
 * @member {String} value
 */
NameValuePair.prototype['value'] = undefined;

/**
 * Name to match
 * @member {String} name
 */
NameValuePair.prototype['name'] = undefined;






export default NameValuePair;

