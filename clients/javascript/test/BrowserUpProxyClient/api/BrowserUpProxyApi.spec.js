/**
 * BrowserUp Proxy
 * ___ This is the REST API for controlling the BrowserUp Proxy. The BrowserUp Proxy is a swiss army knife for automated testing that captures HTTP traffic in HAR files. It is also useful for Selenium/Cypress tests. ___ 
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
    define(['expect.js', process.cwd()+'/src/BrowserUpProxyClient/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require(process.cwd()+'/src/BrowserUpProxyClient/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.BrowserUpProxyClient);
  }
}(this, function(expect, BrowserUpProxyClient) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new BrowserUpProxyClient.BrowserUpProxyApi();
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

  describe('BrowserUpProxyApi', function() {
    describe('addCounter', function() {
      it('should call addCounter successfully', function(done) {
        //uncomment below and update the code to test addCounter
        //instance.addCounter(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('addError', function() {
      it('should call addError successfully', function(done) {
        //uncomment below and update the code to test addError
        //instance.addError(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getHarLog', function() {
      it('should call getHarLog successfully', function(done) {
        //uncomment below and update the code to test getHarLog
        //instance.getHarLog(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('healthcheck', function() {
      it('should call healthcheck successfully', function(done) {
        //uncomment below and update the code to test healthcheck
        //instance.healthcheck(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('resetHarLog', function() {
      it('should call resetHarLog successfully', function(done) {
        //uncomment below and update the code to test resetHarLog
        //instance.resetHarLog(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('setPage', function() {
      it('should call setPage successfully', function(done) {
        //uncomment below and update the code to test setPage
        //instance.setPage(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('verifyNotPresent', function() {
      it('should call verifyNotPresent successfully', function(done) {
        //uncomment below and update the code to test verifyNotPresent
        //instance.verifyNotPresent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('verifyPresent', function() {
      it('should call verifyPresent successfully', function(done) {
        //uncomment below and update the code to test verifyPresent
        //instance.verifyPresent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('verifySLA', function() {
      it('should call verifySLA successfully', function(done) {
        //uncomment below and update the code to test verifySLA
        //instance.verifySLA(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('verifySize', function() {
      it('should call verifySize successfully', function(done) {
        //uncomment below and update the code to test verifySize
        //instance.verifySize(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));
