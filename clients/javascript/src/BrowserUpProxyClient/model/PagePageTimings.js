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
 * The PagePageTimings model module.
 * @module BrowserUpProxyClient/model/PagePageTimings
 * @version 1.0.0
 */
class PagePageTimings {
    /**
     * Constructs a new <code>PagePageTimings</code>.
     * @alias module:BrowserUpProxyClient/model/PagePageTimings
     */
    constructor() { 
        
        PagePageTimings.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PagePageTimings</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:BrowserUpProxyClient/model/PagePageTimings} obj Optional instance to populate.
     * @return {module:BrowserUpProxyClient/model/PagePageTimings} The populated <code>PagePageTimings</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PagePageTimings();

            if (data.hasOwnProperty('onContentLoad')) {
                obj['onContentLoad'] = ApiClient.convertToType(data['onContentLoad'], 'Number');
            }
            if (data.hasOwnProperty('onLoad')) {
                obj['onLoad'] = ApiClient.convertToType(data['onLoad'], 'Number');
            }
            if (data.hasOwnProperty('comment')) {
                obj['comment'] = ApiClient.convertToType(data['comment'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {Number} onContentLoad
 */
PagePageTimings.prototype['onContentLoad'] = undefined;

/**
 * @member {Number} onLoad
 */
PagePageTimings.prototype['onLoad'] = undefined;

/**
 * @member {String} comment
 */
PagePageTimings.prototype['comment'] = undefined;






export default PagePageTimings;

