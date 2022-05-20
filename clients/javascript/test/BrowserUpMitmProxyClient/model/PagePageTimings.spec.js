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
    instance = new BrowserUpMitmProxyClient.PagePageTimings();
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

  describe('PagePageTimings', function() {
    it('should create an instance of PagePageTimings', function() {
      // uncomment below and update the code to test PagePageTimings
      //var instane = new BrowserUpMitmProxyClient.PagePageTimings();
      //expect(instance).to.be.a(BrowserUpMitmProxyClient.PagePageTimings);
    });

    it('should have the property onContentLoad (base name: "onContentLoad")', function() {
      // uncomment below and update the code to test the property onContentLoad
      //var instance = new BrowserUpMitmProxyClient.PagePageTimings();
      //expect(instance).to.be();
    });

    it('should have the property onLoad (base name: "onLoad")', function() {
      // uncomment below and update the code to test the property onLoad
      //var instance = new BrowserUpMitmProxyClient.PagePageTimings();
      //expect(instance).to.be();
    });

    it('should have the property comment (base name: "comment")', function() {
      // uncomment below and update the code to test the property comment
      //var instance = new BrowserUpMitmProxyClient.PagePageTimings();
      //expect(instance).to.be();
    });

  });

}));
