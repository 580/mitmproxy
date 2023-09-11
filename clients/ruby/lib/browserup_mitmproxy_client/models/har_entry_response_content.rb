=begin
#BrowserUp MitmProxy

#___ This is the REST API for controlling the BrowserUp MitmProxy. The BrowserUp MitmProxy is a swiss army knife for automated testing that captures HTTP traffic in HAR files. It is also useful for Selenium/Cypress tests. ___ 

The version of the OpenAPI document: 1.0.0

Generated by: https://openapi-generator.tech
OpenAPI Generator version: 7.0.0

=end

require 'date'
require 'time'

module BrowserupMitmProxy
  class HarEntryResponseContent
    attr_accessor :size

    attr_accessor :compression

    attr_accessor :mime_type

    attr_accessor :text

    attr_accessor :encoding

    attr_accessor :_video_buffered_percent

    attr_accessor :_video_stall_count

    attr_accessor :_video_decoded_byte_count

    attr_accessor :_video_waiting_count

    attr_accessor :_video_error_count

    attr_accessor :_video_dropped_frames

    attr_accessor :_video_total_frames

    attr_accessor :_video_audio_bytes_decoded

    attr_accessor :comment

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'size' => :'size',
        :'compression' => :'compression',
        :'mime_type' => :'mimeType',
        :'text' => :'text',
        :'encoding' => :'encoding',
        :'_video_buffered_percent' => :'_videoBufferedPercent',
        :'_video_stall_count' => :'_videoStallCount',
        :'_video_decoded_byte_count' => :'_videoDecodedByteCount',
        :'_video_waiting_count' => :'_videoWaitingCount',
        :'_video_error_count' => :'_videoErrorCount',
        :'_video_dropped_frames' => :'_videoDroppedFrames',
        :'_video_total_frames' => :'_videoTotalFrames',
        :'_video_audio_bytes_decoded' => :'_videoAudioBytesDecoded',
        :'comment' => :'comment'
      }
    end

    # Returns all the JSON keys this model knows about
    def self.acceptable_attributes
      attribute_map.values
    end

    # Attribute type mapping.
    def self.openapi_types
      {
        :'size' => :'Integer',
        :'compression' => :'Integer',
        :'mime_type' => :'String',
        :'text' => :'String',
        :'encoding' => :'String',
        :'_video_buffered_percent' => :'Integer',
        :'_video_stall_count' => :'Integer',
        :'_video_decoded_byte_count' => :'Integer',
        :'_video_waiting_count' => :'Integer',
        :'_video_error_count' => :'Integer',
        :'_video_dropped_frames' => :'Integer',
        :'_video_total_frames' => :'Integer',
        :'_video_audio_bytes_decoded' => :'Integer',
        :'comment' => :'String'
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
        fail ArgumentError, "The input argument (attributes) must be a hash in `BrowserupMitmProxy::HarEntryResponseContent` initialize method"
      end

      # check to see if the attribute exists and convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!self.class.attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `BrowserupMitmProxy::HarEntryResponseContent`. Please check the name to make sure it's valid. List of attributes: " + self.class.attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'size')
        self.size = attributes[:'size']
      else
        self.size = nil
      end

      if attributes.key?(:'compression')
        self.compression = attributes[:'compression']
      end

      if attributes.key?(:'mime_type')
        self.mime_type = attributes[:'mime_type']
      else
        self.mime_type = nil
      end

      if attributes.key?(:'text')
        self.text = attributes[:'text']
      end

      if attributes.key?(:'encoding')
        self.encoding = attributes[:'encoding']
      end

      if attributes.key?(:'_video_buffered_percent')
        self._video_buffered_percent = attributes[:'_video_buffered_percent']
      else
        self._video_buffered_percent = -1
      end

      if attributes.key?(:'_video_stall_count')
        self._video_stall_count = attributes[:'_video_stall_count']
      else
        self._video_stall_count = -1
      end

      if attributes.key?(:'_video_decoded_byte_count')
        self._video_decoded_byte_count = attributes[:'_video_decoded_byte_count']
      else
        self._video_decoded_byte_count = -1
      end

      if attributes.key?(:'_video_waiting_count')
        self._video_waiting_count = attributes[:'_video_waiting_count']
      else
        self._video_waiting_count = -1
      end

      if attributes.key?(:'_video_error_count')
        self._video_error_count = attributes[:'_video_error_count']
      else
        self._video_error_count = -1
      end

      if attributes.key?(:'_video_dropped_frames')
        self._video_dropped_frames = attributes[:'_video_dropped_frames']
      else
        self._video_dropped_frames = -1
      end

      if attributes.key?(:'_video_total_frames')
        self._video_total_frames = attributes[:'_video_total_frames']
      else
        self._video_total_frames = -1
      end

      if attributes.key?(:'_video_audio_bytes_decoded')
        self._video_audio_bytes_decoded = attributes[:'_video_audio_bytes_decoded']
      else
        self._video_audio_bytes_decoded = -1
      end

      if attributes.key?(:'comment')
        self.comment = attributes[:'comment']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      warn '[DEPRECATED] the `list_invalid_properties` method is obsolete'
      invalid_properties = Array.new
      if @size.nil?
        invalid_properties.push('invalid value for "size", size cannot be nil.')
      end

      if @mime_type.nil?
        invalid_properties.push('invalid value for "mime_type", mime_type cannot be nil.')
      end

      if !@_video_buffered_percent.nil? && @_video_buffered_percent < -1
        invalid_properties.push('invalid value for "_video_buffered_percent", must be greater than or equal to -1.')
      end

      if !@_video_stall_count.nil? && @_video_stall_count < -1
        invalid_properties.push('invalid value for "_video_stall_count", must be greater than or equal to -1.')
      end

      if !@_video_decoded_byte_count.nil? && @_video_decoded_byte_count < -1
        invalid_properties.push('invalid value for "_video_decoded_byte_count", must be greater than or equal to -1.')
      end

      if !@_video_waiting_count.nil? && @_video_waiting_count < -1
        invalid_properties.push('invalid value for "_video_waiting_count", must be greater than or equal to -1.')
      end

      if !@_video_error_count.nil? && @_video_error_count < -1
        invalid_properties.push('invalid value for "_video_error_count", must be greater than or equal to -1.')
      end

      if !@_video_dropped_frames.nil? && @_video_dropped_frames < -1
        invalid_properties.push('invalid value for "_video_dropped_frames", must be greater than or equal to -1.')
      end

      if !@_video_total_frames.nil? && @_video_total_frames < -1
        invalid_properties.push('invalid value for "_video_total_frames", must be greater than or equal to -1.')
      end

      if !@_video_audio_bytes_decoded.nil? && @_video_audio_bytes_decoded < -1
        invalid_properties.push('invalid value for "_video_audio_bytes_decoded", must be greater than or equal to -1.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      warn '[DEPRECATED] the `valid?` method is obsolete'
      return false if @size.nil?
      return false if @mime_type.nil?
      return false if !@_video_buffered_percent.nil? && @_video_buffered_percent < -1
      return false if !@_video_stall_count.nil? && @_video_stall_count < -1
      return false if !@_video_decoded_byte_count.nil? && @_video_decoded_byte_count < -1
      return false if !@_video_waiting_count.nil? && @_video_waiting_count < -1
      return false if !@_video_error_count.nil? && @_video_error_count < -1
      return false if !@_video_dropped_frames.nil? && @_video_dropped_frames < -1
      return false if !@_video_total_frames.nil? && @_video_total_frames < -1
      return false if !@_video_audio_bytes_decoded.nil? && @_video_audio_bytes_decoded < -1
      true
    end

    # Custom attribute writer method with validation
    # @param [Object] _video_buffered_percent Value to be assigned
    def _video_buffered_percent=(_video_buffered_percent)
      if _video_buffered_percent.nil?
        fail ArgumentError, '_video_buffered_percent cannot be nil'
      end

      if _video_buffered_percent < -1
        fail ArgumentError, 'invalid value for "_video_buffered_percent", must be greater than or equal to -1.'
      end

      @_video_buffered_percent = _video_buffered_percent
    end

    # Custom attribute writer method with validation
    # @param [Object] _video_stall_count Value to be assigned
    def _video_stall_count=(_video_stall_count)
      if _video_stall_count.nil?
        fail ArgumentError, '_video_stall_count cannot be nil'
      end

      if _video_stall_count < -1
        fail ArgumentError, 'invalid value for "_video_stall_count", must be greater than or equal to -1.'
      end

      @_video_stall_count = _video_stall_count
    end

    # Custom attribute writer method with validation
    # @param [Object] _video_decoded_byte_count Value to be assigned
    def _video_decoded_byte_count=(_video_decoded_byte_count)
      if _video_decoded_byte_count.nil?
        fail ArgumentError, '_video_decoded_byte_count cannot be nil'
      end

      if _video_decoded_byte_count < -1
        fail ArgumentError, 'invalid value for "_video_decoded_byte_count", must be greater than or equal to -1.'
      end

      @_video_decoded_byte_count = _video_decoded_byte_count
    end

    # Custom attribute writer method with validation
    # @param [Object] _video_waiting_count Value to be assigned
    def _video_waiting_count=(_video_waiting_count)
      if _video_waiting_count.nil?
        fail ArgumentError, '_video_waiting_count cannot be nil'
      end

      if _video_waiting_count < -1
        fail ArgumentError, 'invalid value for "_video_waiting_count", must be greater than or equal to -1.'
      end

      @_video_waiting_count = _video_waiting_count
    end

    # Custom attribute writer method with validation
    # @param [Object] _video_error_count Value to be assigned
    def _video_error_count=(_video_error_count)
      if _video_error_count.nil?
        fail ArgumentError, '_video_error_count cannot be nil'
      end

      if _video_error_count < -1
        fail ArgumentError, 'invalid value for "_video_error_count", must be greater than or equal to -1.'
      end

      @_video_error_count = _video_error_count
    end

    # Custom attribute writer method with validation
    # @param [Object] _video_dropped_frames Value to be assigned
    def _video_dropped_frames=(_video_dropped_frames)
      if _video_dropped_frames.nil?
        fail ArgumentError, '_video_dropped_frames cannot be nil'
      end

      if _video_dropped_frames < -1
        fail ArgumentError, 'invalid value for "_video_dropped_frames", must be greater than or equal to -1.'
      end

      @_video_dropped_frames = _video_dropped_frames
    end

    # Custom attribute writer method with validation
    # @param [Object] _video_total_frames Value to be assigned
    def _video_total_frames=(_video_total_frames)
      if _video_total_frames.nil?
        fail ArgumentError, '_video_total_frames cannot be nil'
      end

      if _video_total_frames < -1
        fail ArgumentError, 'invalid value for "_video_total_frames", must be greater than or equal to -1.'
      end

      @_video_total_frames = _video_total_frames
    end

    # Custom attribute writer method with validation
    # @param [Object] _video_audio_bytes_decoded Value to be assigned
    def _video_audio_bytes_decoded=(_video_audio_bytes_decoded)
      if _video_audio_bytes_decoded.nil?
        fail ArgumentError, '_video_audio_bytes_decoded cannot be nil'
      end

      if _video_audio_bytes_decoded < -1
        fail ArgumentError, 'invalid value for "_video_audio_bytes_decoded", must be greater than or equal to -1.'
      end

      @_video_audio_bytes_decoded = _video_audio_bytes_decoded
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          size == o.size &&
          compression == o.compression &&
          mime_type == o.mime_type &&
          text == o.text &&
          encoding == o.encoding &&
          _video_buffered_percent == o._video_buffered_percent &&
          _video_stall_count == o._video_stall_count &&
          _video_decoded_byte_count == o._video_decoded_byte_count &&
          _video_waiting_count == o._video_waiting_count &&
          _video_error_count == o._video_error_count &&
          _video_dropped_frames == o._video_dropped_frames &&
          _video_total_frames == o._video_total_frames &&
          _video_audio_bytes_decoded == o._video_audio_bytes_decoded &&
          comment == o.comment
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [size, compression, mime_type, text, encoding, _video_buffered_percent, _video_stall_count, _video_decoded_byte_count, _video_waiting_count, _video_error_count, _video_dropped_frames, _video_total_frames, _video_audio_bytes_decoded, comment].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def self.build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      attributes = attributes.transform_keys(&:to_sym)
      transformed_hash = {}
      openapi_types.each_pair do |key, type|
        if attributes.key?(attribute_map[key]) && attributes[attribute_map[key]].nil?
          transformed_hash["#{key}"] = nil
        elsif type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the attribute
          # is documented as an array but the input is not
          if attributes[attribute_map[key]].is_a?(Array)
            transformed_hash["#{key}"] = attributes[attribute_map[key]].map { |v| _deserialize($1, v) }
          end
        elsif !attributes[attribute_map[key]].nil?
          transformed_hash["#{key}"] = _deserialize(type, attributes[attribute_map[key]])
        end
      end
      new(transformed_hash)
    end

    # Deserializes the data based on type
    # @param string type Data type
    # @param string value Value to be deserialized
    # @return [Object] Deserialized data
    def self._deserialize(type, value)
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
