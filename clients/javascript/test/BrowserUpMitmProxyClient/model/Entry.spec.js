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
    instance = new BrowserUpMitmProxyClient.Entry();
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

  describe('Entry', function() {
    it('should create an instance of Entry', function() {
      // uncomment below and update the code to test Entry
      //var instane = new BrowserUpMitmProxyClient.Entry();
      //expect(instance).to.be.a(BrowserUpMitmProxyClient.Entry);
    });

    it('should have the property pageref (base name: "pageref")', function() {
      // uncomment below and update the code to test the property pageref
      //var instance = new BrowserUpMitmProxyClient.Entry();
      //expect(instance).to.be();
    });

    it('should have the property startedDateTime (base name: "startedDateTime")', function() {
      // uncomment below and update the code to test the property startedDateTime
      //var instance = new BrowserUpMitmProxyClient.Entry();
      //expect(instance).to.be();
    });

    it('should have the property time (base name: "time")', function() {
      // uncomment below and update the code to test the property time
      //var instance = new BrowserUpMitmProxyClient.Entry();
      //expect(instance).to.be();
    });

    it('should have the property request (base name: "request")', function() {
      // uncomment below and update the code to test the property request
      //var instance = new BrowserUpMitmProxyClient.Entry();
      //expect(instance).to.be();
    });

    it('should have the property response (base name: "response")', function() {
      // uncomment below and update the code to test the property response
      //var instance = new BrowserUpMitmProxyClient.Entry();
      //expect(instance).to.be();
    });

    it('should have the property cache (base name: "cache")', function() {
      // uncomment below and update the code to test the property cache
      //var instance = new BrowserUpMitmProxyClient.Entry();
      //expect(instance).to.be();
    });

    it('should have the property timings (base name: "timings")', function() {
      // uncomment below and update the code to test the property timings
      //var instance = new BrowserUpMitmProxyClient.Entry();
      //expect(instance).to.be();
    });

    it('should have the property serverIPAddress (base name: "serverIPAddress")', function() {
      // uncomment below and update the code to test the property serverIPAddress
      //var instance = new BrowserUpMitmProxyClient.Entry();
      //expect(instance).to.be();
    });

    it('should have the property webSocketMessages (base name: "_webSocketMessages")', function() {
      // uncomment below and update the code to test the property webSocketMessages
      //var instance = new BrowserUpMitmProxyClient.Entry();
      //expect(instance).to.be();
    });

    it('should have the property connection (base name: "connection")', function() {
      // uncomment below and update the code to test the property connection
      //var instance = new BrowserUpMitmProxyClient.Entry();
      //expect(instance).to.be();
    });

    it('should have the property comment (base name: "comment")', function() {
      // uncomment below and update the code to test the property comment
      //var instance = new BrowserUpMitmProxyClient.Entry();
      //expect(instance).to.be();
    });

  });

}));
