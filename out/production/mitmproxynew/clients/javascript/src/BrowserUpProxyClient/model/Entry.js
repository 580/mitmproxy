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
import EntryRequest from './EntryRequest';
import EntryResponse from './EntryResponse';
import OneOfAnyTypeAnyType from './OneOfAnyTypeAnyType';

/**
 * The Entry model module.
 * @module BrowserUpProxyClient/model/Entry
 * @version 1.0.0
 */
class Entry {
    /**
     * Constructs a new <code>Entry</code>.
     * @alias module:BrowserUpProxyClient/model/Entry
     * @param startedDateTime {Date} 
     * @param time {Number} 
     * @param request {module:BrowserUpProxyClient/model/EntryRequest} 
     * @param response {module:BrowserUpProxyClient/model/EntryResponse} 
     * @param cache {Object} 
     * @param timings {Object} 
     */
    constructor(startedDateTime, time, request, response, cache, timings) { 
        
        Entry.initialize(this, startedDateTime, time, request, response, cache, timings);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, startedDateTime, time, request, response, cache, timings) { 
        obj['startedDateTime'] = startedDateTime;
        obj['time'] = time;
        obj['request'] = request;
        obj['response'] = response;
        obj['cache'] = cache;
        obj['timings'] = timings;
    }

    /**
     * Constructs a <code>Entry</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:BrowserUpProxyClient/model/Entry} obj Optional instance to populate.
     * @return {module:BrowserUpProxyClient/model/Entry} The populated <code>Entry</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Entry();

            if (data.hasOwnProperty('pageref')) {
                obj['pageref'] = ApiClient.convertToType(data['pageref'], 'String');
            }
            if (data.hasOwnProperty('startedDateTime')) {
                obj['startedDateTime'] = ApiClient.convertToType(data['startedDateTime'], 'Date');
            }
            if (data.hasOwnProperty('time')) {
                obj['time'] = ApiClient.convertToType(data['time'], 'Number');
            }
            if (data.hasOwnProperty('request')) {
                obj['request'] = EntryRequest.constructFromObject(data['request']);
            }
            if (data.hasOwnProperty('response')) {
                obj['response'] = EntryResponse.constructFromObject(data['response']);
            }
            if (data.hasOwnProperty('cache')) {
                obj['cache'] = ApiClient.convertToType(data['cache'], Object);
            }
            if (data.hasOwnProperty('timings')) {
                obj['timings'] = ApiClient.convertToType(data['timings'], Object);
            }
            if (data.hasOwnProperty('serverIPAddress')) {
                obj['serverIPAddress'] = ApiClient.convertToType(data['serverIPAddress'], OneOfAnyTypeAnyType);
            }
            if (data.hasOwnProperty('connection')) {
                obj['connection'] = ApiClient.convertToType(data['connection'], 'String');
            }
            if (data.hasOwnProperty('comment')) {
                obj['comment'] = ApiClient.convertToType(data['comment'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} pageref
 */
Entry.prototype['pageref'] = undefined;

/**
 * @member {Date} startedDateTime
 */
Entry.prototype['startedDateTime'] = undefined;

/**
 * @member {Number} time
 */
Entry.prototype['time'] = undefined;

/**
 * @member {module:BrowserUpProxyClient/model/EntryRequest} request
 */
Entry.prototype['request'] = undefined;

/**
 * @member {module:BrowserUpProxyClient/model/EntryResponse} response
 */
Entry.prototype['response'] = undefined;

/**
 * @member {Object} cache
 */
Entry.prototype['cache'] = undefined;

/**
 * @member {Object} timings
 */
Entry.prototype['timings'] = undefined;

/**
 * @member {module:BrowserUpProxyClient/model/OneOfAnyTypeAnyType} serverIPAddress
 */
Entry.prototype['serverIPAddress'] = undefined;

/**
 * @member {String} connection
 */
Entry.prototype['connection'] = undefined;

/**
 * @member {String} comment
 */
Entry.prototype['comment'] = undefined;






export default Entry;

