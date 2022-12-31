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
import EntryRequestCookies from './EntryRequestCookies';
import EntryResponseContent from './EntryResponseContent';
import Header from './Header';

/**
 * The EntryResponse model module.
 * @module BrowserUpMitmProxyClient/model/EntryResponse
 * @version 1.0.0
 */
class EntryResponse {
    /**
     * Constructs a new <code>EntryResponse</code>.
     * @alias module:BrowserUpMitmProxyClient/model/EntryResponse
     * @param status {Number} 
     * @param statusText {String} 
     * @param httpVersion {String} 
     * @param cookies {Array.<module:BrowserUpMitmProxyClient/model/EntryRequestCookies>} 
     * @param headers {Array.<module:BrowserUpMitmProxyClient/model/Header>} 
     * @param content {module:BrowserUpMitmProxyClient/model/EntryResponseContent} 
     * @param redirectURL {String} 
     * @param headersSize {Number} 
     * @param bodySize {Number} 
     */
    constructor(status, statusText, httpVersion, cookies, headers, content, redirectURL, headersSize, bodySize) { 
        
        EntryResponse.initialize(this, status, statusText, httpVersion, cookies, headers, content, redirectURL, headersSize, bodySize);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, status, statusText, httpVersion, cookies, headers, content, redirectURL, headersSize, bodySize) { 
        obj['status'] = status;
        obj['statusText'] = statusText;
        obj['httpVersion'] = httpVersion;
        obj['cookies'] = cookies;
        obj['headers'] = headers;
        obj['content'] = content;
        obj['redirectURL'] = redirectURL;
        obj['headersSize'] = headersSize;
        obj['bodySize'] = bodySize;
    }

    /**
     * Constructs a <code>EntryResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:BrowserUpMitmProxyClient/model/EntryResponse} obj Optional instance to populate.
     * @return {module:BrowserUpMitmProxyClient/model/EntryResponse} The populated <code>EntryResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new EntryResponse();

            if (data.hasOwnProperty('status')) {
                obj['status'] = ApiClient.convertToType(data['status'], 'Number');
            }
            if (data.hasOwnProperty('statusText')) {
                obj['statusText'] = ApiClient.convertToType(data['statusText'], 'String');
            }
            if (data.hasOwnProperty('httpVersion')) {
                obj['httpVersion'] = ApiClient.convertToType(data['httpVersion'], 'String');
            }
            if (data.hasOwnProperty('cookies')) {
                obj['cookies'] = ApiClient.convertToType(data['cookies'], [EntryRequestCookies]);
            }
            if (data.hasOwnProperty('headers')) {
                obj['headers'] = ApiClient.convertToType(data['headers'], [Header]);
            }
            if (data.hasOwnProperty('content')) {
                obj['content'] = EntryResponseContent.constructFromObject(data['content']);
            }
            if (data.hasOwnProperty('redirectURL')) {
                obj['redirectURL'] = ApiClient.convertToType(data['redirectURL'], 'String');
            }
            if (data.hasOwnProperty('headersSize')) {
                obj['headersSize'] = ApiClient.convertToType(data['headersSize'], 'Number');
            }
            if (data.hasOwnProperty('bodySize')) {
                obj['bodySize'] = ApiClient.convertToType(data['bodySize'], 'Number');
            }
            if (data.hasOwnProperty('comment')) {
                obj['comment'] = ApiClient.convertToType(data['comment'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {Number} status
 */
EntryResponse.prototype['status'] = undefined;

/**
 * @member {String} statusText
 */
EntryResponse.prototype['statusText'] = undefined;

/**
 * @member {String} httpVersion
 */
EntryResponse.prototype['httpVersion'] = undefined;

/**
 * @member {Array.<module:BrowserUpMitmProxyClient/model/EntryRequestCookies>} cookies
 */
EntryResponse.prototype['cookies'] = undefined;

/**
 * @member {Array.<module:BrowserUpMitmProxyClient/model/Header>} headers
 */
EntryResponse.prototype['headers'] = undefined;

/**
 * @member {module:BrowserUpMitmProxyClient/model/EntryResponseContent} content
 */
EntryResponse.prototype['content'] = undefined;

/**
 * @member {String} redirectURL
 */
EntryResponse.prototype['redirectURL'] = undefined;

/**
 * @member {Number} headersSize
 */
EntryResponse.prototype['headersSize'] = undefined;

/**
 * @member {Number} bodySize
 */
EntryResponse.prototype['bodySize'] = undefined;

/**
 * @member {String} comment
 */
EntryResponse.prototype['comment'] = undefined;






export default EntryResponse;

