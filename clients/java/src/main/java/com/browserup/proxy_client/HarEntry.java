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


package com.browserup.proxy_client;

import java.util.Objects;
import com.browserup.proxy_client.HarEntryCache;
import com.browserup.proxy_client.HarEntryRequest;
import com.browserup.proxy_client.HarEntryResponse;
import com.browserup.proxy_client.HarEntryTimings;
import com.browserup.proxy_client.WebSocketMessage;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.browserup.proxy_client.JSON;

/**
 * HarEntry
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class HarEntry {
  public static final String SERIALIZED_NAME_PAGEREF = "pageref";
  @SerializedName(SERIALIZED_NAME_PAGEREF)
  private String pageref;

  public static final String SERIALIZED_NAME_STARTED_DATE_TIME = "startedDateTime";
  @SerializedName(SERIALIZED_NAME_STARTED_DATE_TIME)
  private OffsetDateTime startedDateTime;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private Long time;

  public static final String SERIALIZED_NAME_REQUEST = "request";
  @SerializedName(SERIALIZED_NAME_REQUEST)
  private HarEntryRequest request;

  public static final String SERIALIZED_NAME_RESPONSE = "response";
  @SerializedName(SERIALIZED_NAME_RESPONSE)
  private HarEntryResponse response;

  public static final String SERIALIZED_NAME_CACHE = "cache";
  @SerializedName(SERIALIZED_NAME_CACHE)
  private HarEntryCache cache;

  public static final String SERIALIZED_NAME_TIMINGS = "timings";
  @SerializedName(SERIALIZED_NAME_TIMINGS)
  private HarEntryTimings timings;

  public static final String SERIALIZED_NAME_SERVER_I_P_ADDRESS = "serverIPAddress";
  @SerializedName(SERIALIZED_NAME_SERVER_I_P_ADDRESS)
  private String serverIPAddress;

  public static final String SERIALIZED_NAME_WEB_SOCKET_MESSAGES = "_webSocketMessages";
  @SerializedName(SERIALIZED_NAME_WEB_SOCKET_MESSAGES)
  private List<WebSocketMessage> webSocketMessages;

  public static final String SERIALIZED_NAME_CONNECTION = "connection";
  @SerializedName(SERIALIZED_NAME_CONNECTION)
  private String connection;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public HarEntry() {
  }

  public HarEntry pageref(String pageref) {
    
    this.pageref = pageref;
    return this;
  }

   /**
   * Get pageref
   * @return pageref
  **/
  @javax.annotation.Nullable
  public String getPageref() {
    return pageref;
  }


  public void setPageref(String pageref) {
    this.pageref = pageref;
  }


  public HarEntry startedDateTime(OffsetDateTime startedDateTime) {
    
    this.startedDateTime = startedDateTime;
    return this;
  }

   /**
   * Get startedDateTime
   * @return startedDateTime
  **/
  @javax.annotation.Nonnull
  public OffsetDateTime getStartedDateTime() {
    return startedDateTime;
  }


  public void setStartedDateTime(OffsetDateTime startedDateTime) {
    this.startedDateTime = startedDateTime;
  }


  public HarEntry time(Long time) {
    
    this.time = time;
    return this;
  }

   /**
   * Get time
   * minimum: 0
   * @return time
  **/
  @javax.annotation.Nonnull
  public Long getTime() {
    return time;
  }


  public void setTime(Long time) {
    this.time = time;
  }


  public HarEntry request(HarEntryRequest request) {
    
    this.request = request;
    return this;
  }

   /**
   * Get request
   * @return request
  **/
  @javax.annotation.Nonnull
  public HarEntryRequest getRequest() {
    return request;
  }


  public void setRequest(HarEntryRequest request) {
    this.request = request;
  }


  public HarEntry response(HarEntryResponse response) {
    
    this.response = response;
    return this;
  }

   /**
   * Get response
   * @return response
  **/
  @javax.annotation.Nonnull
  public HarEntryResponse getResponse() {
    return response;
  }


  public void setResponse(HarEntryResponse response) {
    this.response = response;
  }


  public HarEntry cache(HarEntryCache cache) {
    
    this.cache = cache;
    return this;
  }

   /**
   * Get cache
   * @return cache
  **/
  @javax.annotation.Nonnull
  public HarEntryCache getCache() {
    return cache;
  }


  public void setCache(HarEntryCache cache) {
    this.cache = cache;
  }


  public HarEntry timings(HarEntryTimings timings) {
    
    this.timings = timings;
    return this;
  }

   /**
   * Get timings
   * @return timings
  **/
  @javax.annotation.Nonnull
  public HarEntryTimings getTimings() {
    return timings;
  }


  public void setTimings(HarEntryTimings timings) {
    this.timings = timings;
  }


  public HarEntry serverIPAddress(String serverIPAddress) {
    
    this.serverIPAddress = serverIPAddress;
    return this;
  }

   /**
   * Get serverIPAddress
   * @return serverIPAddress
  **/
  @javax.annotation.Nullable
  public String getServerIPAddress() {
    return serverIPAddress;
  }


  public void setServerIPAddress(String serverIPAddress) {
    this.serverIPAddress = serverIPAddress;
  }


  public HarEntry webSocketMessages(List<WebSocketMessage> webSocketMessages) {
    
    this.webSocketMessages = webSocketMessages;
    return this;
  }

  public HarEntry addWebSocketMessagesItem(WebSocketMessage webSocketMessagesItem) {
    if (this.webSocketMessages == null) {
      this.webSocketMessages = new ArrayList<>();
    }
    this.webSocketMessages.add(webSocketMessagesItem);
    return this;
  }

   /**
   * Get webSocketMessages
   * @return webSocketMessages
  **/
  @javax.annotation.Nullable
  public List<WebSocketMessage> getWebSocketMessages() {
    return webSocketMessages;
  }


  public void setWebSocketMessages(List<WebSocketMessage> webSocketMessages) {
    this.webSocketMessages = webSocketMessages;
  }


  public HarEntry connection(String connection) {
    
    this.connection = connection;
    return this;
  }

   /**
   * Get connection
   * @return connection
  **/
  @javax.annotation.Nullable
  public String getConnection() {
    return connection;
  }


  public void setConnection(String connection) {
    this.connection = connection;
  }


  public HarEntry comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @javax.annotation.Nullable
  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    this.comment = comment;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HarEntry harEntry = (HarEntry) o;
    return Objects.equals(this.pageref, harEntry.pageref) &&
        Objects.equals(this.startedDateTime, harEntry.startedDateTime) &&
        Objects.equals(this.time, harEntry.time) &&
        Objects.equals(this.request, harEntry.request) &&
        Objects.equals(this.response, harEntry.response) &&
        Objects.equals(this.cache, harEntry.cache) &&
        Objects.equals(this.timings, harEntry.timings) &&
        Objects.equals(this.serverIPAddress, harEntry.serverIPAddress) &&
        Objects.equals(this.webSocketMessages, harEntry.webSocketMessages) &&
        Objects.equals(this.connection, harEntry.connection) &&
        Objects.equals(this.comment, harEntry.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageref, startedDateTime, time, request, response, cache, timings, serverIPAddress, webSocketMessages, connection, comment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HarEntry {\n");
    sb.append("    pageref: ").append(toIndentedString(pageref)).append("\n");
    sb.append("    startedDateTime: ").append(toIndentedString(startedDateTime)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    cache: ").append(toIndentedString(cache)).append("\n");
    sb.append("    timings: ").append(toIndentedString(timings)).append("\n");
    sb.append("    serverIPAddress: ").append(toIndentedString(serverIPAddress)).append("\n");
    sb.append("    webSocketMessages: ").append(toIndentedString(webSocketMessages)).append("\n");
    sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("pageref");
    openapiFields.add("startedDateTime");
    openapiFields.add("time");
    openapiFields.add("request");
    openapiFields.add("response");
    openapiFields.add("cache");
    openapiFields.add("timings");
    openapiFields.add("serverIPAddress");
    openapiFields.add("_webSocketMessages");
    openapiFields.add("connection");
    openapiFields.add("comment");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("startedDateTime");
    openapiRequiredFields.add("time");
    openapiRequiredFields.add("request");
    openapiRequiredFields.add("response");
    openapiRequiredFields.add("cache");
    openapiRequiredFields.add("timings");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to HarEntry
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!HarEntry.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HarEntry is not found in the empty JSON string", HarEntry.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!HarEntry.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HarEntry` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : HarEntry.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("pageref") != null && !jsonObj.get("pageref").isJsonNull()) && !jsonObj.get("pageref").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pageref` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pageref").toString()));
      }
      // validate the required field `cache`
      HarEntryCache.validateJsonElement(jsonObj.get("cache"));
      // validate the required field `timings`
      HarEntryTimings.validateJsonElement(jsonObj.get("timings"));
      if ((jsonObj.get("serverIPAddress") != null && !jsonObj.get("serverIPAddress").isJsonNull()) && !jsonObj.get("serverIPAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serverIPAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serverIPAddress").toString()));
      }
      if (jsonObj.get("_webSocketMessages") != null && !jsonObj.get("_webSocketMessages").isJsonNull()) {
        JsonArray jsonArraywebSocketMessages = jsonObj.getAsJsonArray("_webSocketMessages");
        if (jsonArraywebSocketMessages != null) {
          // ensure the json data is an array
          if (!jsonObj.get("_webSocketMessages").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `_webSocketMessages` to be an array in the JSON string but got `%s`", jsonObj.get("_webSocketMessages").toString()));
          }

          // validate the optional field `_webSocketMessages` (array)
          for (int i = 0; i < jsonArraywebSocketMessages.size(); i++) {
            WebSocketMessage.validateJsonElement(jsonArraywebSocketMessages.get(i));
          };
        }
      }
      if ((jsonObj.get("connection") != null && !jsonObj.get("connection").isJsonNull()) && !jsonObj.get("connection").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `connection` to be a primitive type in the JSON string but got `%s`", jsonObj.get("connection").toString()));
      }
      if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HarEntry.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HarEntry' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HarEntry> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HarEntry.class));

       return (TypeAdapter<T>) new TypeAdapter<HarEntry>() {
           @Override
           public void write(JsonWriter out, HarEntry value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HarEntry read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of HarEntry given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of HarEntry
  * @throws IOException if the JSON string is invalid with respect to HarEntry
  */
  public static HarEntry fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HarEntry.class);
  }

 /**
  * Convert an instance of HarEntry to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

