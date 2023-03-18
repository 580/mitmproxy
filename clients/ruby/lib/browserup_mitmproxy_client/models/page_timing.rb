=begin
#BrowserUp MitmProxy

#___ This is the REST API for controlling the BrowserUp MitmProxy. The BrowserUp MitmProxy is a swiss army knife for automated testing that captures HTTP traffic in HAR files. It is also useful for Selenium/Cypress tests. ___ 

The version of the OpenAPI document: 1.0.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.4.0

=end

require 'date'
require 'time'

module BrowserupMitmProxy
  class PageTiming
    # onContentLoad per the browser
    attr_accessor :on_content_load

    # onLoad per the browser
    attr_accessor :on_load

    # dns lookup time from the browser
    attr_accessor :_dns

    # Time to first byte of the page's first request per the browser
    attr_accessor :_ttfb

    # firstContentfulPaint from the browser
    attr_accessor :_first_contentful_paint

    # firstPaint from the browser
    attr_accessor :_first_paint

    # cumulativeLayoutShift metric from the browser
    attr_accessor :_cumulative_layout_shift

    # domInteractive from the browser
    attr_accessor :_dom_interactive

    # Top level href, including hashtag, etc per the browser
    attr_accessor :_href

    # firstInputDelay from the browser
    attr_accessor :_first_input_delay

    # Ssl connect time from the browser
    attr_accessor :_ssl

    # largestContentfulPaint from the browser
    attr_accessor :_largest_contentful_paint

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'on_content_load' => :'onContentLoad',
        :'on_load' => :'onLoad',
        :'_dns' => :'_dns',
        :'_ttfb' => :'_ttfb',
        :'_first_contentful_paint' => :'_firstContentfulPaint',
        :'_first_paint' => :'_firstPaint',
        :'_cumulative_layout_shift' => :'_cumulativeLayoutShift',
        :'_dom_interactive' => :'_domInteractive',
        :'_href' => :'_href',
        :'_first_input_delay' => :'_firstInputDelay',
        :'_ssl' => :'_ssl',
        :'_largest_contentful_paint' => :'_largestContentfulPaint'
      }
    end

    # Returns all the JSON keys this model knows about
    def self.acceptable_attributes
      attribute_map.values
    end

    # Attribute type mapping.
    def self.openapi_types
      {
        :'on_content_load' => :'Float',
        :'on_load' => :'Float',
        :'_dns' => :'Float',
        :'_ttfb' => :'Float',
        :'_first_contentful_paint' => :'Float',
        :'_first_paint' => :'Float',
        :'_cumulative_layout_shift' => :'Float',
        :'_dom_interactive' => :'Float',
        :'_href' => :'String',
        :'_first_input_delay' => :'Float',
        :'_ssl' => :'Float',
        :'_largest_contentful_paint' => :'Float'
      }
    end

    # List of attributes with nullable: true
    def self.openapi_nullable
      Set.new([
      ])
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `BrowserupMitmProxy::PageTiming` initialize method"
      end

      # check to see if the attribute exists and convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!self.class.attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `BrowserupMitmProxy::PageTiming`. Please check the name to make sure it's valid. List of attributes: " + self.class.attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'on_content_load')
        self.on_content_load = attributes[:'on_content_load']
      end

      if attributes.key?(:'on_load')
        self.on_load = attributes[:'on_load']
      end

      if attributes.key?(:'_dns')
        self._dns = attributes[:'_dns']
      end

      if attributes.key?(:'_ttfb')
        self._ttfb = attributes[:'_ttfb']
      end

      if attributes.key?(:'_first_contentful_paint')
        self._first_contentful_paint = attributes[:'_first_contentful_paint']
      end

      if attributes.key?(:'_first_paint')
        self._first_paint = attributes[:'_first_paint']
      end

      if attributes.key?(:'_cumulative_layout_shift')
        self._cumulative_layout_shift = attributes[:'_cumulative_layout_shift']
      end

      if attributes.key?(:'_dom_interactive')
        self._dom_interactive = attributes[:'_dom_interactive']
      end

      if attributes.key?(:'_href')
        self._href = attributes[:'_href']
      end

      if attributes.key?(:'_first_input_delay')
        self._first_input_delay = attributes[:'_first_input_delay']
      end

      if attributes.key?(:'_ssl')
        self._ssl = attributes[:'_ssl']
      end

      if attributes.key?(:'_largest_contentful_paint')
        self._largest_contentful_paint = attributes[:'_largest_contentful_paint']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      true
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          on_content_load == o.on_content_load &&
          on_load == o.on_load &&
          _dns == o._dns &&
          _ttfb == o._ttfb &&
          _first_contentful_paint == o._first_contentful_paint &&
          _first_paint == o._first_paint &&
          _cumulative_layout_shift == o._cumulative_layout_shift &&
          _dom_interactive == o._dom_interactive &&
          _href == o._href &&
          _first_input_delay == o._first_input_delay &&
          _ssl == o._ssl &&
          _largest_contentful_paint == o._largest_contentful_paint
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [on_content_load, on_load, _dns, _ttfb, _first_contentful_paint, _first_paint, _cumulative_layout_shift, _dom_interactive, _href, _first_input_delay, _ssl, _largest_contentful_paint].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def self.build_from_hash(attributes)
      new.build_from_hash(attributes)
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      attributes = attributes.transform_keys(&:to_sym)
      self.class.openapi_types.each_pair do |key, type|
        if attributes[self.class.attribute_map[key]].nil? && self.class.openapi_nullable.include?(key)
          self.send("#{key}=", nil)
        elsif type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the attribute
          # is documented as an array but the input is not
          if attributes[self.class.attribute_map[key]].is_a?(Array)
            self.send("#{key}=", attributes[self.class.attribute_map[key]].map { |v| _deserialize($1, v) })
          end
        elsif !attributes[self.class.attribute_map[key]].nil?
          self.send("#{key}=", _deserialize(type, attributes[self.class.attribute_map[key]]))
        end
      end

      self
    end

    # Deserializes the data based on type
    # @param string type Data type
    # @param string value Value to be deserialized
    # @return [Object] Deserialized data
    def _deserialize(type, value)
      case type.to_sym
      when :Time
        Time.parse(value)
      when :Date
        Date.parse(value)
      when :String
        value.to_s
      when :Integer
        value.to_i
      when :Float
        value.to_f
      when :Boolean
        if value.to_s =~ /\A(true|t|yes|y|1)\z/i
          true
        else
          false
        end
      when :Object
        # generic object (usually a Hash), return directly
        value
      when /\AArray<(?<inner_type>.+)>\z/
        inner_type = Regexp.last_match[:inner_type]
        value.map { |v| _deserialize(inner_type, v) }
      when /\AHash<(?<k_type>.+?), (?<v_type>.+)>\z/
        k_type = Regexp.last_match[:k_type]
        v_type = Regexp.last_match[:v_type]
        {}.tap do |hash|
          value.each do |k, v|
            hash[_deserialize(k_type, k)] = _deserialize(v_type, v)
          end
        end
      else # model
        # models (e.g. Pet) or oneOf
        klass = BrowserupMitmProxy.const_get(type)
        klass.respond_to?(:openapi_one_of) ? klass.build(value) : klass.build_from_hash(value)
      end
    end

    # Returns the string representation of the object
    # @return [String] String presentation of the object
    def to_s
      to_hash.to_s
    end

    # to_body is an alias to to_hash (backward compatibility)
    # @return [Hash] Returns the object in the form of hash
    def to_body
      to_hash
    end

    # Returns the object in the form of hash
    # @return [Hash] Returns the object in the form of hash
    def to_hash
      hash = {}
      self.class.attribute_map.each_pair do |attr, param|
        value = self.send(attr)
        if value.nil?
          is_nullable = self.class.openapi_nullable.include?(attr)
          next if !is_nullable || (is_nullable && !instance_variable_defined?(:"@#{attr}"))
        end

        hash[param] = _to_hash(value)
      end
      hash
    end

    # Outputs non-array value in the form of hash
    # For object, use to_hash. Otherwise, just return the value
    # @param [Object] value Any valid value
    # @return [Hash] Returns the value in the form of hash
    def _to_hash(value)
      if value.is_a?(Array)
        value.compact.map { |v| _to_hash(v) }
      elsif value.is_a?(Hash)
        {}.tap do |hash|
          value.each { |k, v| hash[k] = _to_hash(v) }
        end
      elsif value.respond_to? :to_hash
        value.to_hash
      else
        value
      end
    end

  end

end
