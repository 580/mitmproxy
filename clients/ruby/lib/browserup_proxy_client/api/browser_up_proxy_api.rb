=begin
#BrowserUp Proxy

#___ This is the REST API for controlling the BrowserUp Proxy. The BrowserUp Proxy is a swiss army knife for automated testing that captures HTTP traffic in HAR files. It is also useful for Selenium/Cypress tests. ___ 

The version of the OpenAPI document: 1.0.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 5.2.0

=end

require 'cgi'

module BrowserupProxy
  class BrowserUpProxyApi
    attr_accessor :api_client

    def initialize(api_client = ApiClient.default)
      @api_client = api_client
    end
    # Add Custom Counter to the captured traffic har
    # @param counter [Counter] Receives a new counter to add. The counter is stored, under the hood, in an array in the har under the _counters key
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def add_counter(counter, opts = {})
      add_counter_with_http_info(counter, opts)
      nil
    end

    # Add Custom Counter to the captured traffic har
    # @param counter [Counter] Receives a new counter to add. The counter is stored, under the hood, in an array in the har under the _counters key
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Integer, Hash)>] nil, response status code and response headers
    def add_counter_with_http_info(counter, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: BrowserUpProxyApi.add_counter ...'
      end
      # verify the required parameter 'counter' is set
      if @api_client.config.client_side_validation && counter.nil?
        fail ArgumentError, "Missing the required parameter 'counter' when calling BrowserUpProxyApi.add_counter"
      end
      # resource path
      local_var_path = '/har/counters'

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body] || @api_client.object_to_http_body(counter)

      # return_type
      return_type = opts[:debug_return_type]

      # auth_names
      auth_names = opts[:debug_auth_names] || []

      new_options = opts.merge(
        :operation => :"BrowserUpProxyApi.add_counter",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: BrowserUpProxyApi#add_counter\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Add custom fields to the current HAR.
    # @param [Hash] opts the optional parameters
    # @option opts [Object] :body 
    # @return [nil]
    def add_custom_har_fields(opts = {})
      add_custom_har_fields_with_http_info(opts)
      nil
    end

    # Add custom fields to the current HAR.
    # @param [Hash] opts the optional parameters
    # @option opts [Object] :body 
    # @return [Array<(nil, Integer, Hash)>] nil, response status code and response headers
    def add_custom_har_fields_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: BrowserUpProxyApi.add_custom_har_fields ...'
      end
      # resource path
      local_var_path = '/har/page'

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body] || @api_client.object_to_http_body(opts[:'body'])

      # return_type
      return_type = opts[:debug_return_type]

      # auth_names
      auth_names = opts[:debug_auth_names] || []

      new_options = opts.merge(
        :operation => :"BrowserUpProxyApi.add_custom_har_fields",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:PUT, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: BrowserUpProxyApi#add_custom_har_fields\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Add Custom Error to the captured traffic har
    # @param error [Error] Receives an error to track. Internally, the error is stored in an array in the har under the _errors key
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def add_error(error, opts = {})
      add_error_with_http_info(error, opts)
      nil
    end

    # Add Custom Error to the captured traffic har
    # @param error [Error] Receives an error to track. Internally, the error is stored in an array in the har under the _errors key
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Integer, Hash)>] nil, response status code and response headers
    def add_error_with_http_info(error, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: BrowserUpProxyApi.add_error ...'
      end
      # verify the required parameter 'error' is set
      if @api_client.config.client_side_validation && error.nil?
        fail ArgumentError, "Missing the required parameter 'error' when calling BrowserUpProxyApi.add_error"
      end
      # resource path
      local_var_path = '/har/errors'

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body] || @api_client.object_to_http_body(error)

      # return_type
      return_type = opts[:debug_return_type]

      # auth_names
      auth_names = opts[:debug_auth_names] || []

      new_options = opts.merge(
        :operation => :"BrowserUpProxyApi.add_error",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: BrowserUpProxyApi#add_error\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Get the current HAR.
    # @param [Hash] opts the optional parameters
    # @return [Har]
    def get_har_log(opts = {})
      data, _status_code, _headers = get_har_log_with_http_info(opts)
      data
    end

    # Get the current HAR.
    # @param [Hash] opts the optional parameters
    # @return [Array<(Har, Integer, Hash)>] Har data, response status code and response headers
    def get_har_log_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: BrowserUpProxyApi.get_har_log ...'
      end
      # resource path
      local_var_path = '/har'

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'Har'

      # auth_names
      auth_names = opts[:debug_auth_names] || []

      new_options = opts.merge(
        :operation => :"BrowserUpProxyApi.get_har_log",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: BrowserUpProxyApi#get_har_log\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Get the healthcheck
    # @param [Hash] opts the optional parameters
    # @return [nil]
    def healthcheck(opts = {})
      healthcheck_with_http_info(opts)
      nil
    end

    # Get the healthcheck
    # @param [Hash] opts the optional parameters
    # @return [Array<(nil, Integer, Hash)>] nil, response status code and response headers
    def healthcheck_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: BrowserUpProxyApi.healthcheck ...'
      end
      # resource path
      local_var_path = '/healthcheck'

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type]

      # auth_names
      auth_names = opts[:debug_auth_names] || []

      new_options = opts.merge(
        :operation => :"BrowserUpProxyApi.healthcheck",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:GET, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: BrowserUpProxyApi#healthcheck\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Starts a fresh HAR capture session.
    # @param [Hash] opts the optional parameters
    # @return [Har]
    def reset_har_log(opts = {})
      data, _status_code, _headers = reset_har_log_with_http_info(opts)
      data
    end

    # Starts a fresh HAR capture session.
    # @param [Hash] opts the optional parameters
    # @return [Array<(Har, Integer, Hash)>] Har data, response status code and response headers
    def reset_har_log_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: BrowserUpProxyApi.reset_har_log ...'
      end
      # resource path
      local_var_path = '/har'

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'Har'

      # auth_names
      auth_names = opts[:debug_auth_names] || []

      new_options = opts.merge(
        :operation => :"BrowserUpProxyApi.reset_har_log",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:PUT, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: BrowserUpProxyApi#reset_har_log\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Starts a fresh HAR Page in the current active HAR
    # @param [Hash] opts the optional parameters
    # @return [Har]
    def set_har_page(opts = {})
      data, _status_code, _headers = set_har_page_with_http_info(opts)
      data
    end

    # Starts a fresh HAR Page in the current active HAR
    # @param [Hash] opts the optional parameters
    # @return [Array<(Har, Integer, Hash)>] Har data, response status code and response headers
    def set_har_page_with_http_info(opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: BrowserUpProxyApi.set_har_page ...'
      end
      # resource path
      local_var_path = '/har/page'

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body]

      # return_type
      return_type = opts[:debug_return_type] || 'Har'

      # auth_names
      auth_names = opts[:debug_auth_names] || []

      new_options = opts.merge(
        :operation => :"BrowserUpProxyApi.set_har_page",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: BrowserUpProxyApi#set_har_page\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Verify no matching items are present in the captured traffic
    # @param name [String] The unique name for this verification operation
    # @param match_criteria [MatchCriteria] Match criteria to select requests - response pairs for size tests
    # @param [Hash] opts the optional parameters
    # @return [VerifyResult]
    def verify_not_present(name, match_criteria, opts = {})
      data, _status_code, _headers = verify_not_present_with_http_info(name, match_criteria, opts)
      data
    end

    # Verify no matching items are present in the captured traffic
    # @param name [String] The unique name for this verification operation
    # @param match_criteria [MatchCriteria] Match criteria to select requests - response pairs for size tests
    # @param [Hash] opts the optional parameters
    # @return [Array<(VerifyResult, Integer, Hash)>] VerifyResult data, response status code and response headers
    def verify_not_present_with_http_info(name, match_criteria, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: BrowserUpProxyApi.verify_not_present ...'
      end
      # verify the required parameter 'name' is set
      if @api_client.config.client_side_validation && name.nil?
        fail ArgumentError, "Missing the required parameter 'name' when calling BrowserUpProxyApi.verify_not_present"
      end
      pattern = Regexp.new(/[a-zA-Z0-9_]{4,16}/)
      if @api_client.config.client_side_validation && name !~ pattern
        fail ArgumentError, "invalid value for 'name' when calling BrowserUpProxyApi.verify_not_present, must conform to the pattern #{pattern}."
      end

      # verify the required parameter 'match_criteria' is set
      if @api_client.config.client_side_validation && match_criteria.nil?
        fail ArgumentError, "Missing the required parameter 'match_criteria' when calling BrowserUpProxyApi.verify_not_present"
      end
      # resource path
      local_var_path = '/verify/not_present/{name}'.sub('{' + 'name' + '}', CGI.escape(name.to_s))

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body] || @api_client.object_to_http_body(match_criteria)

      # return_type
      return_type = opts[:debug_return_type] || 'VerifyResult'

      # auth_names
      auth_names = opts[:debug_auth_names] || []

      new_options = opts.merge(
        :operation => :"BrowserUpProxyApi.verify_not_present",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: BrowserUpProxyApi#verify_not_present\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Verify at least one matching item is present in the captured traffic
    # @param name [String] The unique name for this verification operation
    # @param match_criteria [MatchCriteria] Match criteria to select requests - response pairs for size tests
    # @param [Hash] opts the optional parameters
    # @return [VerifyResult]
    def verify_present(name, match_criteria, opts = {})
      data, _status_code, _headers = verify_present_with_http_info(name, match_criteria, opts)
      data
    end

    # Verify at least one matching item is present in the captured traffic
    # @param name [String] The unique name for this verification operation
    # @param match_criteria [MatchCriteria] Match criteria to select requests - response pairs for size tests
    # @param [Hash] opts the optional parameters
    # @return [Array<(VerifyResult, Integer, Hash)>] VerifyResult data, response status code and response headers
    def verify_present_with_http_info(name, match_criteria, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: BrowserUpProxyApi.verify_present ...'
      end
      # verify the required parameter 'name' is set
      if @api_client.config.client_side_validation && name.nil?
        fail ArgumentError, "Missing the required parameter 'name' when calling BrowserUpProxyApi.verify_present"
      end
      pattern = Regexp.new(/[a-zA-Z0-9_]{4,16}/)
      if @api_client.config.client_side_validation && name !~ pattern
        fail ArgumentError, "invalid value for 'name' when calling BrowserUpProxyApi.verify_present, must conform to the pattern #{pattern}."
      end

      # verify the required parameter 'match_criteria' is set
      if @api_client.config.client_side_validation && match_criteria.nil?
        fail ArgumentError, "Missing the required parameter 'match_criteria' when calling BrowserUpProxyApi.verify_present"
      end
      # resource path
      local_var_path = '/verify/present/{name}'.sub('{' + 'name' + '}', CGI.escape(name.to_s))

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body] || @api_client.object_to_http_body(match_criteria)

      # return_type
      return_type = opts[:debug_return_type] || 'VerifyResult'

      # auth_names
      auth_names = opts[:debug_auth_names] || []

      new_options = opts.merge(
        :operation => :"BrowserUpProxyApi.verify_present",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: BrowserUpProxyApi#verify_present\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Verify matching items in the captured traffic meet the size criteria
    # @param size [Integer] The size used for comparison, in kilobytes
    # @param name [String] The unique name for this verification operation
    # @param match_criteria [MatchCriteria] Match criteria to select requests - response pairs for size tests
    # @param [Hash] opts the optional parameters
    # @return [VerifyResult]
    def verify_size(size, name, match_criteria, opts = {})
      data, _status_code, _headers = verify_size_with_http_info(size, name, match_criteria, opts)
      data
    end

    # Verify matching items in the captured traffic meet the size criteria
    # @param size [Integer] The size used for comparison, in kilobytes
    # @param name [String] The unique name for this verification operation
    # @param match_criteria [MatchCriteria] Match criteria to select requests - response pairs for size tests
    # @param [Hash] opts the optional parameters
    # @return [Array<(VerifyResult, Integer, Hash)>] VerifyResult data, response status code and response headers
    def verify_size_with_http_info(size, name, match_criteria, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: BrowserUpProxyApi.verify_size ...'
      end
      # verify the required parameter 'size' is set
      if @api_client.config.client_side_validation && size.nil?
        fail ArgumentError, "Missing the required parameter 'size' when calling BrowserUpProxyApi.verify_size"
      end
      if @api_client.config.client_side_validation && size < 0
        fail ArgumentError, 'invalid value for "size" when calling BrowserUpProxyApi.verify_size, must be greater than or equal to 0.'
      end

      # verify the required parameter 'name' is set
      if @api_client.config.client_side_validation && name.nil?
        fail ArgumentError, "Missing the required parameter 'name' when calling BrowserUpProxyApi.verify_size"
      end
      pattern = Regexp.new(/[a-zA-Z0-9_]{4,16}/)
      if @api_client.config.client_side_validation && name !~ pattern
        fail ArgumentError, "invalid value for 'name' when calling BrowserUpProxyApi.verify_size, must conform to the pattern #{pattern}."
      end

      # verify the required parameter 'match_criteria' is set
      if @api_client.config.client_side_validation && match_criteria.nil?
        fail ArgumentError, "Missing the required parameter 'match_criteria' when calling BrowserUpProxyApi.verify_size"
      end
      # resource path
      local_var_path = '/verify/size/{size}/{name}'.sub('{' + 'size' + '}', CGI.escape(size.to_s)).sub('{' + 'name' + '}', CGI.escape(name.to_s))

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body] || @api_client.object_to_http_body(match_criteria)

      # return_type
      return_type = opts[:debug_return_type] || 'VerifyResult'

      # auth_names
      auth_names = opts[:debug_auth_names] || []

      new_options = opts.merge(
        :operation => :"BrowserUpProxyApi.verify_size",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: BrowserUpProxyApi#verify_size\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end

    # Verify each traffic item matching the criteria meets is below SLA time
    # @param time [Integer] The time used for comparison
    # @param name [String] The unique name for this verification operation
    # @param match_criteria [MatchCriteria] Match criteria to select requests - response pairs for size tests
    # @param [Hash] opts the optional parameters
    # @return [VerifyResult]
    def verify_sla(time, name, match_criteria, opts = {})
      data, _status_code, _headers = verify_sla_with_http_info(time, name, match_criteria, opts)
      data
    end

    # Verify each traffic item matching the criteria meets is below SLA time
    # @param time [Integer] The time used for comparison
    # @param name [String] The unique name for this verification operation
    # @param match_criteria [MatchCriteria] Match criteria to select requests - response pairs for size tests
    # @param [Hash] opts the optional parameters
    # @return [Array<(VerifyResult, Integer, Hash)>] VerifyResult data, response status code and response headers
    def verify_sla_with_http_info(time, name, match_criteria, opts = {})
      if @api_client.config.debugging
        @api_client.config.logger.debug 'Calling API: BrowserUpProxyApi.verify_sla ...'
      end
      # verify the required parameter 'time' is set
      if @api_client.config.client_side_validation && time.nil?
        fail ArgumentError, "Missing the required parameter 'time' when calling BrowserUpProxyApi.verify_sla"
      end
      if @api_client.config.client_side_validation && time < 0
        fail ArgumentError, 'invalid value for "time" when calling BrowserUpProxyApi.verify_sla, must be greater than or equal to 0.'
      end

      # verify the required parameter 'name' is set
      if @api_client.config.client_side_validation && name.nil?
        fail ArgumentError, "Missing the required parameter 'name' when calling BrowserUpProxyApi.verify_sla"
      end
      pattern = Regexp.new(/[a-zA-Z0-9_]{4,16}/)
      if @api_client.config.client_side_validation && name !~ pattern
        fail ArgumentError, "invalid value for 'name' when calling BrowserUpProxyApi.verify_sla, must conform to the pattern #{pattern}."
      end

      # verify the required parameter 'match_criteria' is set
      if @api_client.config.client_side_validation && match_criteria.nil?
        fail ArgumentError, "Missing the required parameter 'match_criteria' when calling BrowserUpProxyApi.verify_sla"
      end
      # resource path
      local_var_path = '/verify/sla/{time}/{name}'.sub('{' + 'time' + '}', CGI.escape(time.to_s)).sub('{' + 'name' + '}', CGI.escape(name.to_s))

      # query parameters
      query_params = opts[:query_params] || {}

      # header parameters
      header_params = opts[:header_params] || {}
      # HTTP header 'Accept' (if needed)
      header_params['Accept'] = @api_client.select_header_accept(['application/json'])
      # HTTP header 'Content-Type'
      header_params['Content-Type'] = @api_client.select_header_content_type(['application/json'])

      # form parameters
      form_params = opts[:form_params] || {}

      # http body (model)
      post_body = opts[:debug_body] || @api_client.object_to_http_body(match_criteria)

      # return_type
      return_type = opts[:debug_return_type] || 'VerifyResult'

      # auth_names
      auth_names = opts[:debug_auth_names] || []

      new_options = opts.merge(
        :operation => :"BrowserUpProxyApi.verify_sla",
        :header_params => header_params,
        :query_params => query_params,
        :form_params => form_params,
        :body => post_body,
        :auth_names => auth_names,
        :return_type => return_type
      )

      data, status_code, headers = @api_client.call_api(:POST, local_var_path, new_options)
      if @api_client.config.debugging
        @api_client.config.logger.debug "API called: BrowserUpProxyApi#verify_sla\nData: #{data.inspect}\nStatus code: #{status_code}\nHeaders: #{headers}"
      end
      return data, status_code, headers
    end
  end
end
