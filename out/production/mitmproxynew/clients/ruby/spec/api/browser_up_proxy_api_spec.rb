=begin
#BrowserUp Proxy

#___ This is the REST API for controlling the BrowserUp Proxy.  The BrowserUp Proxy is a swiss army knife for automated testing that captures HTTP traffic in HAR files. It is also useful for Selenium/Cypress tests. ___ 

The version of the OpenAPI document: 1.0.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 5.1.1

=end

require 'spec_helper'
require 'json'

# Unit tests for BrowserupProxy::BrowserUpProxyApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'BrowserUpProxyApi' do
  before do
    # run before each test
    @api_instance = BrowserupProxy::BrowserUpProxyApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of BrowserUpProxyApi' do
    it 'should create an instance of BrowserUpProxyApi' do
      expect(@api_instance).to be_instance_of(BrowserupProxy::BrowserUpProxyApi)
    end
  end

  # unit tests for add_custom_har_fields
  # Add custom fields to the current HAR.
  # @param [Hash] opts the optional parameters
  # @option opts [Object] :body 
  # @return [nil]
  describe 'add_custom_har_fields test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for get_har_log
  # Get the current HAR.
  # @param [Hash] opts the optional parameters
  # @return [Har]
  describe 'get_har_log test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for healthcheck
  # Get the healthcheck
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'healthcheck test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for reset_har_log
  # Starts a fresh HAR capture session.
  # @param [Hash] opts the optional parameters
  # @return [Har]
  describe 'reset_har_log test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for set_har_page
  # Starts a fresh HAR Page in the current active HAR
  # @param [Hash] opts the optional parameters
  # @return [Har]
  describe 'set_har_page test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for verify_not_present
  # Verify no matching items are present in the captured traffic
  # @param match_criteria Match criteria to select requests - response pairs for size tests
  # @param [Hash] opts the optional parameters
  # @return [Boolean]
  describe 'verify_not_present test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for verify_present
  # Verify at least one matching item is present in the captured traffic
  # @param match_criteria Match criteria to select requests - response pairs for size tests
  # @param [Hash] opts the optional parameters
  # @return [Boolean]
  describe 'verify_present test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for verify_size
  # Verify matching items in the captured traffic meet the size criteria
  # @param size The size used for comparison
  # @param match_criteria Match criteria to select requests - response pairs for size tests
  # @param [Hash] opts the optional parameters
  # @return [Boolean]
  describe 'verify_size test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for verify_sla
  # Verify each traffic item matching the criteria meets is below SLA time
  # @param time The time used for comparison
  # @param match_criteria Match criteria to select requests - response pairs for size tests
  # @param [Hash] opts the optional parameters
  # @return [Boolean]
  describe 'verify_sla test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
