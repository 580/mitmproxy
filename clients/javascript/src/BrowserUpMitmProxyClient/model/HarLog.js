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
import HarEntry from './HarEntry';
import HarLogCreator from './HarLogCreator';
import Page from './Page';

/**
 * The HarLog model module.
 * @module BrowserUpMitmProxyClient/model/HarLog
 * @version 1.0.0
 */
class HarLog {
    /**
     * Constructs a new <code>HarLog</code>.
     * @alias module:BrowserUpMitmProxyClient/model/HarLog
     * @param version {String} 
     * @param creator {module:BrowserUpMitmProxyClient/model/HarLogCreator} 
     * @param pages {Array.<module:BrowserUpMitmProxyClient/model/Page>} 
     * @param entries {Array.<module:BrowserUpMitmProxyClient/model/HarEntry>} 
     */
    constructor(version, creator, pages, entries) { 
        
        HarLog.initialize(this, version, creator, pages, entries);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, version, creator, pages, entries) { 
        obj['version'] = version;
        obj['creator'] = creator;
        obj['pages'] = pages;
        obj['entries'] = entries;
    }

    /**
     * Constructs a <code>HarLog</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:BrowserUpMitmProxyClient/model/HarLog} obj Optional instance to populate.
     * @return {module:BrowserUpMitmProxyClient/model/HarLog} The populated <code>HarLog</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new HarLog();

            if (data.hasOwnProperty('version')) {
                obj['version'] = ApiClient.convertToType(data['version'], 'String');
            }
            if (data.hasOwnProperty('creator')) {
                obj['creator'] = HarLogCreator.constructFromObject(data['creator']);
            }
            if (data.hasOwnProperty('browser')) {
                obj['browser'] = HarLogCreator.constructFromObject(data['browser']);
            }
            if (data.hasOwnProperty('pages')) {
                obj['pages'] = ApiClient.convertToType(data['pages'], [Page]);
            }
            if (data.hasOwnProperty('entries')) {
                obj['entries'] = ApiClient.convertToType(data['entries'], [HarEntry]);
            }
            if (data.hasOwnProperty('comment')) {
                obj['comment'] = ApiClient.convertToType(data['comment'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>HarLog</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>HarLog</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of HarLog.RequiredProperties) {
            if (!data[property]) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['version'] && !(typeof data['version'] === 'string' || data['version'] instanceof String)) {
            throw new Error("Expected the field `version` to be a primitive type in the JSON string but got " + data['version']);
        }
        // validate the optional field `creator`
        if (data['creator']) { // data not null
          HarLogCreator.validateJSON(data['creator']);
        }
        // validate the optional field `browser`
        if (data['browser']) { // data not null
          HarLogCreator.validateJSON(data['browser']);
        }
        // ensure the json data is an array
        if (!Array.isArray(data['pages'])) {
            throw new Error("Expected the field `pages` to be an array in the JSON data but got " + data['pages']);
        }
        if (data['entries']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['entries'])) {
                throw new Error("Expected the field `entries` to be an array in the JSON data but got " + data['entries']);
            }
            // validate the optional field `entries` (array)
            for (const item of data['entries']) {
                HarEntry.validateJSON(item);
            };
        }
        // ensure the json data is a string
        if (data['comment'] && !(typeof data['comment'] === 'string' || data['comment'] instanceof String)) {
            throw new Error("Expected the field `comment` to be a primitive type in the JSON string but got " + data['comment']);
        }

        return true;
    }


}

HarLog.RequiredProperties = ["version", "creator", "pages", "entries"];

/**
 * @member {String} version
 */
HarLog.prototype['version'] = undefined;

/**
 * @member {module:BrowserUpMitmProxyClient/model/HarLogCreator} creator
 */
HarLog.prototype['creator'] = undefined;

/**
 * @member {module:BrowserUpMitmProxyClient/model/HarLogCreator} browser
 */
HarLog.prototype['browser'] = undefined;

/**
 * @member {Array.<module:BrowserUpMitmProxyClient/model/Page>} pages
 */
HarLog.prototype['pages'] = undefined;

/**
 * @member {Array.<module:BrowserUpMitmProxyClient/model/HarEntry>} entries
 */
HarLog.prototype['entries'] = undefined;

/**
 * @member {String} comment
 */
HarLog.prototype['comment'] = undefined;






export default HarLog;

