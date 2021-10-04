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

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', process.cwd()+'/src/BrowserUpMitmProxyClient/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require(process.cwd()+'/src/BrowserUpMitmProxyClient/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.BrowserUpMitmProxyClient);
  }
}(this, function(expect, BrowserUpMitmProxyClient) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new BrowserUpMitmProxyClient.MatchCriteria();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('MatchCriteria', function() {
    it('should create an instance of MatchCriteria', function() {
      // uncomment below and update the code to test MatchCriteria
      //var instane = new BrowserUpMitmProxyClient.MatchCriteria();
      //expect(instance).to.be.a(BrowserUpMitmProxyClient.MatchCriteria);
    });

    it('should have the property url (base name: "url")', function() {
      // uncomment below and update the code to test the property url
      //var instance = new BrowserUpMitmProxyClient.MatchCriteria();
      //expect(instance).to.be();
    });

    it('should have the property page (base name: "page")', function() {
      // uncomment below and update the code to test the property page
      //var instance = new BrowserUpMitmProxyClient.MatchCriteria();
      //expect(instance).to.be();
    });

    it('should have the property status (base name: "status")', function() {
      // uncomment below and update the code to test the property status
      //var instance = new BrowserUpMitmProxyClient.MatchCriteria();
      //expect(instance).to.be();
    });

    it('should have the property content (base name: "content")', function() {
      // uncomment below and update the code to test the property content
      //var instance = new BrowserUpMitmProxyClient.MatchCriteria();
      //expect(instance).to.be();
    });

    it('should have the property contentType (base name: "content_type")', function() {
      // uncomment below and update the code to test the property contentType
      //var instance = new BrowserUpMitmProxyClient.MatchCriteria();
      //expect(instance).to.be();
    });

    it('should have the property websocketMessage (base name: "websocket_message")', function() {
      // uncomment below and update the code to test the property websocketMessage
      //var instance = new BrowserUpMitmProxyClient.MatchCriteria();
      //expect(instance).to.be();
    });

    it('should have the property requestHeader (base name: "request_header")', function() {
      // uncomment below and update the code to test the property requestHeader
      //var instance = new BrowserUpMitmProxyClient.MatchCriteria();
      //expect(instance).to.be();
    });

    it('should have the property requestCookie (base name: "request_cookie")', function() {
      // uncomment below and update the code to test the property requestCookie
      //var instance = new BrowserUpMitmProxyClient.MatchCriteria();
      //expect(instance).to.be();
    });

    it('should have the property responseHeader (base name: "response_header")', function() {
      // uncomment below and update the code to test the property responseHeader
      //var instance = new BrowserUpMitmProxyClient.MatchCriteria();
      //expect(instance).to.be();
    });

    it('should have the property responseCookie (base name: "response_cookie")', function() {
      // uncomment below and update the code to test the property responseCookie
      //var instance = new BrowserUpMitmProxyClient.MatchCriteria();
      //expect(instance).to.be();
    });

    it('should have the property jsonValid (base name: "json_valid")', function() {
      // uncomment below and update the code to test the property jsonValid
      //var instance = new BrowserUpMitmProxyClient.MatchCriteria();
      //expect(instance).to.be();
    });

    it('should have the property jsonPath (base name: "json_path")', function() {
      // uncomment below and update the code to test the property jsonPath
      //var instance = new BrowserUpMitmProxyClient.MatchCriteria();
      //expect(instance).to.be();
    });

    it('should have the property jsonSchema (base name: "json_schema")', function() {
      // uncomment below and update the code to test the property jsonSchema
      //var instance = new BrowserUpMitmProxyClient.MatchCriteria();
      //expect(instance).to.be();
    });

    it('should have the property errorIfNoTraffic (base name: "error_if_no_traffic")', function() {
      // uncomment below and update the code to test the property errorIfNoTraffic
      //var instance = new BrowserUpMitmProxyClient.MatchCriteria();
      //expect(instance).to.be();
    });

  });

}));