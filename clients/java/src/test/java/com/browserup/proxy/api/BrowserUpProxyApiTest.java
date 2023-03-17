/*
 * BrowserUp MitmProxy
 * ___ This is the REST API for controlling the BrowserUp MitmProxy. The BrowserUp MitmProxy is a swiss army knife for automated testing that captures HTTP traffic in HAR files. It is also useful for Selenium/Cypress tests. ___ 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.browserup.proxy.api;

import com.browserup.proxy_client.ApiException;
import com.browserup.proxy_client.Counter;
import com.browserup.proxy_client.Error;
import com.browserup.proxy_client.Har;
import com.browserup.proxy_client.MatchCriteria;
import com.browserup.proxy_client.VerifyResult;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BrowserUpProxyApi
 */
@Disabled
public class BrowserUpProxyApiTest {

    private final BrowserUpProxyApi api = new BrowserUpProxyApi();

    /**
     * Add Custom Counter to the captured traffic har
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addCounterTest() throws ApiException {
        Counter counter = null;
        api.addCounter(counter);
        // TODO: test validations
    }

    /**
     * Add Custom Error to the captured traffic har
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addErrorTest() throws ApiException {
        Error error = null;
        api.addError(error);
        // TODO: test validations
    }

    /**
     * Get the current HAR.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getHarLogTest() throws ApiException {
        Har response = api.getHarLog();
        // TODO: test validations
    }

    /**
     * Get the healthcheck
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void healthcheckTest() throws ApiException {
        api.healthcheck();
        // TODO: test validations
    }

    /**
     * Starts a fresh HAR Page (Step) in the current active HAR to group requests.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void newPageTest() throws ApiException {
        Object title = null;
        Har response = api.newPage(title);
        // TODO: test validations
    }

    /**
     * Starts a fresh HAR capture session.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void resetHarLogTest() throws ApiException {
        Har response = api.resetHarLog();
        // TODO: test validations
    }

    /**
     * Verify no matching items are present in the captured traffic
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void verifyNotPresentTest() throws ApiException {
        Object name = null;
        MatchCriteria matchCriteria = null;
        VerifyResult response = api.verifyNotPresent(name, matchCriteria);
        // TODO: test validations
    }

    /**
     * Verify at least one matching item is present in the captured traffic
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void verifyPresentTest() throws ApiException {
        Object name = null;
        MatchCriteria matchCriteria = null;
        VerifyResult response = api.verifyPresent(name, matchCriteria);
        // TODO: test validations
    }

    /**
     * Verify each traffic item matching the criteria meets is below SLA time
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void verifySLATest() throws ApiException {
        Object time = null;
        Object name = null;
        MatchCriteria matchCriteria = null;
        VerifyResult response = api.verifySLA(time, name, matchCriteria);
        // TODO: test validations
    }

    /**
     * Verify matching items in the captured traffic meet the size criteria
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void verifySizeTest() throws ApiException {
        Object size = null;
        Object name = null;
        MatchCriteria matchCriteria = null;
        VerifyResult response = api.verifySize(size, name, matchCriteria);
        // TODO: test validations
    }

}
