=begin
#BrowserUp MitmProxy

#___ This is the REST API for controlling the BrowserUp MitmProxy. The BrowserUp MitmProxy is a swiss army knife for automated testing that captures HTTP traffic in HAR files. It is also useful for Selenium/Cypress tests. ___ 

The version of the OpenAPI document: 1.0.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.4.0

=end

# Common files
require 'browserup_mitmproxy_client/api_client'
require 'browserup_mitmproxy_client/api_error'
require 'browserup_mitmproxy_client/version'
require 'browserup_mitmproxy_client/configuration'

# Models
require 'browserup_mitmproxy_client/models/counter'
require 'browserup_mitmproxy_client/models/error'
require 'browserup_mitmproxy_client/models/har'
require 'browserup_mitmproxy_client/models/har_entry'
require 'browserup_mitmproxy_client/models/har_entry_cache'
require 'browserup_mitmproxy_client/models/har_entry_cache_before_request'
require 'browserup_mitmproxy_client/models/har_entry_cache_before_request_one_of'
require 'browserup_mitmproxy_client/models/har_entry_request'
require 'browserup_mitmproxy_client/models/har_entry_request_cookies_inner'
require 'browserup_mitmproxy_client/models/har_entry_request_post_data'
require 'browserup_mitmproxy_client/models/har_entry_request_post_data_params_inner'
require 'browserup_mitmproxy_client/models/har_entry_request_query_string_inner'
require 'browserup_mitmproxy_client/models/har_entry_response'
require 'browserup_mitmproxy_client/models/har_entry_response_content'
require 'browserup_mitmproxy_client/models/har_entry_timings'
require 'browserup_mitmproxy_client/models/har_log'
require 'browserup_mitmproxy_client/models/har_log_creator'
require 'browserup_mitmproxy_client/models/header'
require 'browserup_mitmproxy_client/models/largest_contentful_paint'
require 'browserup_mitmproxy_client/models/match_criteria'
require 'browserup_mitmproxy_client/models/match_criteria_request_header'
require 'browserup_mitmproxy_client/models/name_value_pair'
require 'browserup_mitmproxy_client/models/page'
require 'browserup_mitmproxy_client/models/page_timing'
require 'browserup_mitmproxy_client/models/page_timings'
require 'browserup_mitmproxy_client/models/verify_result'
require 'browserup_mitmproxy_client/models/web_socket_message'

# APIs
require 'browserup_mitmproxy_client/api/browser_up_proxy_api'

module BrowserupMitmProxy
  class << self
    # Customize default settings for the SDK using block.
    #   BrowserupMitmProxy.configure do |config|
    #     config.username = "xxx"
    #     config.password = "xxx"
    #   end
    # If no block given, return the default Configuration object.
    def configure
      if block_given?
        yield(Configuration.default)
      else
        Configuration.default
      end
    end
  end
end
