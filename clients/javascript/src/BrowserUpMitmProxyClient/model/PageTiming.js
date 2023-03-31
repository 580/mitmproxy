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
 * The PageTiming model module.
 * @module BrowserUpMitmProxyClient/model/PageTiming
 * @version 1.0.0
 */
class PageTiming {
    /**
     * Constructs a new <code>PageTiming</code>.
     * @alias module:BrowserUpMitmProxyClient/model/PageTiming
     */
    constructor() { 
        
        PageTiming.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PageTiming</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:BrowserUpMitmProxyClient/model/PageTiming} obj Optional instance to populate.
     * @return {module:BrowserUpMitmProxyClient/model/PageTiming} The populated <code>PageTiming</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PageTiming();

            if (data.hasOwnProperty('_timeToFirstByte')) {
                obj['_timeToFirstByte'] = ApiClient.convertToType(data['_timeToFirstByte'], 'Number');
            }
            if (data.hasOwnProperty('_domInteractive')) {
                obj['_domInteractive'] = ApiClient.convertToType(data['_domInteractive'], 'Number');
            }
            if (data.hasOwnProperty('_firstContentfulPaint')) {
                obj['_firstContentfulPaint'] = ApiClient.convertToType(data['_firstContentfulPaint'], 'Number');
            }
            if (data.hasOwnProperty('_ssl')) {
                obj['_ssl'] = ApiClient.convertToType(data['_ssl'], 'Number');
            }
            if (data.hasOwnProperty('_dns')) {
                obj['_dns'] = ApiClient.convertToType(data['_dns'], 'Number');
            }
            if (data.hasOwnProperty('_href')) {
                obj['_href'] = ApiClient.convertToType(data['_href'], 'String');
            }
            if (data.hasOwnProperty('_firstInputDelay')) {
                obj['_firstInputDelay'] = ApiClient.convertToType(data['_firstInputDelay'], 'Number');
            }
            if (data.hasOwnProperty('onContentLoad')) {
                obj['onContentLoad'] = ApiClient.convertToType(data['onContentLoad'], 'Number');
            }
            if (data.hasOwnProperty('_cumulativeLayoutShift')) {
                obj['_cumulativeLayoutShift'] = ApiClient.convertToType(data['_cumulativeLayoutShift'], 'Number');
            }
            if (data.hasOwnProperty('_firstPaint')) {
                obj['_firstPaint'] = ApiClient.convertToType(data['_firstPaint'], 'Number');
            }
            if (data.hasOwnProperty('_largestContentfulPaint')) {
                obj['_largestContentfulPaint'] = ApiClient.convertToType(data['_largestContentfulPaint'], 'Number');
            }
            if (data.hasOwnProperty('onLoad')) {
                obj['onLoad'] = ApiClient.convertToType(data['onLoad'], 'Number');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>PageTiming</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>PageTiming</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['_href'] && !(typeof data['_href'] === 'string' || data['_href'] instanceof String)) {
            throw new Error("Expected the field `_href` to be a primitive type in the JSON string but got " + data['_href']);
        }

        return true;
    }


}



/**
 * Time to first byte of the page's first request per the browser
 * @member {Number} _timeToFirstByte
 */
PageTiming.prototype['_timeToFirstByte'] = undefined;

/**
 * domInteractive from the browser
 * @member {Number} _domInteractive
 */
PageTiming.prototype['_domInteractive'] = undefined;

/**
 * firstContentfulPaint from the browser
 * @member {Number} _firstContentfulPaint
 */
PageTiming.prototype['_firstContentfulPaint'] = undefined;

/**
 * Ssl connect time from the browser
 * @member {Number} _ssl
 */
PageTiming.prototype['_ssl'] = undefined;

/**
 * dns lookup time from the browser
 * @member {Number} _dns
 */
PageTiming.prototype['_dns'] = undefined;

/**
 * Top level href, including hashtag, etc per the browser
 * @member {String} _href
 */
PageTiming.prototype['_href'] = undefined;

/**
 * firstInputDelay from the browser
 * @member {Number} _firstInputDelay
 */
PageTiming.prototype['_firstInputDelay'] = undefined;

/**
 * onContentLoad per the browser
 * @member {Number} onContentLoad
 */
PageTiming.prototype['onContentLoad'] = undefined;

/**
 * cumulativeLayoutShift metric from the browser
 * @member {Number} _cumulativeLayoutShift
 */
PageTiming.prototype['_cumulativeLayoutShift'] = undefined;

/**
 * firstPaint from the browser
 * @member {Number} _firstPaint
 */
PageTiming.prototype['_firstPaint'] = undefined;

/**
 * largestContentfulPaint from the browser
 * @member {Number} _largestContentfulPaint
 */
PageTiming.prototype['_largestContentfulPaint'] = undefined;

/**
 * onLoad per the browser
 * @member {Number} onLoad
 */
PageTiming.prototype['onLoad'] = undefined;






export default PageTiming;

