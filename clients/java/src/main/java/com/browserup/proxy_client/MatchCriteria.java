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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.browserup.proxy_client.JSON;

/**
 * A set of criteria for filtering HTTP Requests and Responses.                          Criteria are AND based, and use python regular expressions for string comparison
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MatchCriteria {
  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private Object url = null;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Object page = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Object status = null;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private Object content = null;

  public static final String SERIALIZED_NAME_CONTENT_TYPE = "content_type";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  private Object contentType = null;

  public static final String SERIALIZED_NAME_WEBSOCKET_MESSAGE = "websocket_message";
  @SerializedName(SERIALIZED_NAME_WEBSOCKET_MESSAGE)
  private Object websocketMessage = null;

  public static final String SERIALIZED_NAME_REQUEST_HEADER = "request_header";
  @SerializedName(SERIALIZED_NAME_REQUEST_HEADER)
  private Object requestHeader = null;

  public static final String SERIALIZED_NAME_REQUEST_COOKIE = "request_cookie";
  @SerializedName(SERIALIZED_NAME_REQUEST_COOKIE)
  private Object requestCookie = null;

  public static final String SERIALIZED_NAME_RESPONSE_HEADER = "response_header";
  @SerializedName(SERIALIZED_NAME_RESPONSE_HEADER)
  private Object responseHeader = null;

  public static final String SERIALIZED_NAME_RESPONSE_COOKIE = "response_cookie";
  @SerializedName(SERIALIZED_NAME_RESPONSE_COOKIE)
  private Object responseCookie = null;

  public static final String SERIALIZED_NAME_JSON_VALID = "json_valid";
  @SerializedName(SERIALIZED_NAME_JSON_VALID)
  private Object jsonValid = null;

  public static final String SERIALIZED_NAME_JSON_PATH = "json_path";
  @SerializedName(SERIALIZED_NAME_JSON_PATH)
  private Object jsonPath = null;

  public static final String SERIALIZED_NAME_JSON_SCHEMA = "json_schema";
  @SerializedName(SERIALIZED_NAME_JSON_SCHEMA)
  private Object jsonSchema = null;

  public static final String SERIALIZED_NAME_ERROR_IF_NO_TRAFFIC = "error_if_no_traffic";
  @SerializedName(SERIALIZED_NAME_ERROR_IF_NO_TRAFFIC)
  private Object errorIfNoTraffic = true;

  public MatchCriteria() {
  }

  public MatchCriteria url(Object url) {
    
    this.url = url;
    return this;
  }

   /**
   * Request URL regexp to match
   * @return url
  **/
  @javax.annotation.Nullable

  public Object getUrl() {
    return url;
  }


  public void setUrl(Object url) {
    this.url = url;
  }


  public MatchCriteria page(Object page) {
    
    this.page = page;
    return this;
  }

   /**
   * current|all
   * @return page
  **/
  @javax.annotation.Nullable

  public Object getPage() {
    return page;
  }


  public void setPage(Object page) {
    this.page = page;
  }


  public MatchCriteria status(Object status) {
    
    this.status = status;
    return this;
  }

   /**
   * HTTP Status code to match.
   * @return status
  **/
  @javax.annotation.Nullable

  public Object getStatus() {
    return status;
  }


  public void setStatus(Object status) {
    this.status = status;
  }


  public MatchCriteria content(Object content) {
    
    this.content = content;
    return this;
  }

   /**
   * Body content regexp content to match
   * @return content
  **/
  @javax.annotation.Nullable

  public Object getContent() {
    return content;
  }


  public void setContent(Object content) {
    this.content = content;
  }


  public MatchCriteria contentType(Object contentType) {
    
    this.contentType = contentType;
    return this;
  }

   /**
   * Content type
   * @return contentType
  **/
  @javax.annotation.Nullable

  public Object getContentType() {
    return contentType;
  }


  public void setContentType(Object contentType) {
    this.contentType = contentType;
  }


  public MatchCriteria websocketMessage(Object websocketMessage) {
    
    this.websocketMessage = websocketMessage;
    return this;
  }

   /**
   * Websocket message text to match
   * @return websocketMessage
  **/
  @javax.annotation.Nullable

  public Object getWebsocketMessage() {
    return websocketMessage;
  }


  public void setWebsocketMessage(Object websocketMessage) {
    this.websocketMessage = websocketMessage;
  }


  public MatchCriteria requestHeader(Object requestHeader) {
    
    this.requestHeader = requestHeader;
    return this;
  }

   /**
   * Get requestHeader
   * @return requestHeader
  **/
  @javax.annotation.Nullable

  public Object getRequestHeader() {
    return requestHeader;
  }


  public void setRequestHeader(Object requestHeader) {
    this.requestHeader = requestHeader;
  }


  public MatchCriteria requestCookie(Object requestCookie) {
    
    this.requestCookie = requestCookie;
    return this;
  }

   /**
   * Get requestCookie
   * @return requestCookie
  **/
  @javax.annotation.Nullable

  public Object getRequestCookie() {
    return requestCookie;
  }


  public void setRequestCookie(Object requestCookie) {
    this.requestCookie = requestCookie;
  }


  public MatchCriteria responseHeader(Object responseHeader) {
    
    this.responseHeader = responseHeader;
    return this;
  }

   /**
   * Get responseHeader
   * @return responseHeader
  **/
  @javax.annotation.Nullable

  public Object getResponseHeader() {
    return responseHeader;
  }


  public void setResponseHeader(Object responseHeader) {
    this.responseHeader = responseHeader;
  }


  public MatchCriteria responseCookie(Object responseCookie) {
    
    this.responseCookie = responseCookie;
    return this;
  }

   /**
   * Get responseCookie
   * @return responseCookie
  **/
  @javax.annotation.Nullable

  public Object getResponseCookie() {
    return responseCookie;
  }


  public void setResponseCookie(Object responseCookie) {
    this.responseCookie = responseCookie;
  }


  public MatchCriteria jsonValid(Object jsonValid) {
    
    this.jsonValid = jsonValid;
    return this;
  }

   /**
   * Is valid JSON
   * @return jsonValid
  **/
  @javax.annotation.Nullable

  public Object getJsonValid() {
    return jsonValid;
  }


  public void setJsonValid(Object jsonValid) {
    this.jsonValid = jsonValid;
  }


  public MatchCriteria jsonPath(Object jsonPath) {
    
    this.jsonPath = jsonPath;
    return this;
  }

   /**
   * Has JSON path
   * @return jsonPath
  **/
  @javax.annotation.Nullable

  public Object getJsonPath() {
    return jsonPath;
  }


  public void setJsonPath(Object jsonPath) {
    this.jsonPath = jsonPath;
  }


  public MatchCriteria jsonSchema(Object jsonSchema) {
    
    this.jsonSchema = jsonSchema;
    return this;
  }

   /**
   * Validates against passed JSON schema
   * @return jsonSchema
  **/
  @javax.annotation.Nullable

  public Object getJsonSchema() {
    return jsonSchema;
  }


  public void setJsonSchema(Object jsonSchema) {
    this.jsonSchema = jsonSchema;
  }


  public MatchCriteria errorIfNoTraffic(Object errorIfNoTraffic) {
    
    this.errorIfNoTraffic = errorIfNoTraffic;
    return this;
  }

   /**
   * If the proxy has NO traffic at all, return error
   * @return errorIfNoTraffic
  **/
  @javax.annotation.Nullable

  public Object getErrorIfNoTraffic() {
    return errorIfNoTraffic;
  }


  public void setErrorIfNoTraffic(Object errorIfNoTraffic) {
    this.errorIfNoTraffic = errorIfNoTraffic;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchCriteria matchCriteria = (MatchCriteria) o;
    return Objects.equals(this.url, matchCriteria.url) &&
        Objects.equals(this.page, matchCriteria.page) &&
        Objects.equals(this.status, matchCriteria.status) &&
        Objects.equals(this.content, matchCriteria.content) &&
        Objects.equals(this.contentType, matchCriteria.contentType) &&
        Objects.equals(this.websocketMessage, matchCriteria.websocketMessage) &&
        Objects.equals(this.requestHeader, matchCriteria.requestHeader) &&
        Objects.equals(this.requestCookie, matchCriteria.requestCookie) &&
        Objects.equals(this.responseHeader, matchCriteria.responseHeader) &&
        Objects.equals(this.responseCookie, matchCriteria.responseCookie) &&
        Objects.equals(this.jsonValid, matchCriteria.jsonValid) &&
        Objects.equals(this.jsonPath, matchCriteria.jsonPath) &&
        Objects.equals(this.jsonSchema, matchCriteria.jsonSchema) &&
        Objects.equals(this.errorIfNoTraffic, matchCriteria.errorIfNoTraffic);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, page, status, content, contentType, websocketMessage, requestHeader, requestCookie, responseHeader, responseCookie, jsonValid, jsonPath, jsonSchema, errorIfNoTraffic);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchCriteria {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    websocketMessage: ").append(toIndentedString(websocketMessage)).append("\n");
    sb.append("    requestHeader: ").append(toIndentedString(requestHeader)).append("\n");
    sb.append("    requestCookie: ").append(toIndentedString(requestCookie)).append("\n");
    sb.append("    responseHeader: ").append(toIndentedString(responseHeader)).append("\n");
    sb.append("    responseCookie: ").append(toIndentedString(responseCookie)).append("\n");
    sb.append("    jsonValid: ").append(toIndentedString(jsonValid)).append("\n");
    sb.append("    jsonPath: ").append(toIndentedString(jsonPath)).append("\n");
    sb.append("    jsonSchema: ").append(toIndentedString(jsonSchema)).append("\n");
    sb.append("    errorIfNoTraffic: ").append(toIndentedString(errorIfNoTraffic)).append("\n");
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
    openapiFields.add("url");
    openapiFields.add("page");
    openapiFields.add("status");
    openapiFields.add("content");
    openapiFields.add("content_type");
    openapiFields.add("websocket_message");
    openapiFields.add("request_header");
    openapiFields.add("request_cookie");
    openapiFields.add("response_header");
    openapiFields.add("response_cookie");
    openapiFields.add("json_valid");
    openapiFields.add("json_path");
    openapiFields.add("json_schema");
    openapiFields.add("error_if_no_traffic");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MatchCriteria
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MatchCriteria.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MatchCriteria is not found in the empty JSON string", MatchCriteria.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MatchCriteria.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MatchCriteria` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MatchCriteria.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MatchCriteria' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MatchCriteria> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MatchCriteria.class));

       return (TypeAdapter<T>) new TypeAdapter<MatchCriteria>() {
           @Override
           public void write(JsonWriter out, MatchCriteria value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MatchCriteria read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MatchCriteria given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MatchCriteria
  * @throws IOException if the JSON string is invalid with respect to MatchCriteria
  */
  public static MatchCriteria fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MatchCriteria.class);
  }

 /**
  * Convert an instance of MatchCriteria to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

