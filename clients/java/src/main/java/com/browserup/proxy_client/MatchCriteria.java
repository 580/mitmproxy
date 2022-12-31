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
import com.browserup.proxy_client.NameValuePair;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A set of criteria for filtering HTTP Requests and Responses.                          Criteria are AND based, and use python regular expressions for string comparison
 */
@ApiModel(description = "A set of criteria for filtering HTTP Requests and Responses.                          Criteria are AND based, and use python regular expressions for string comparison")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MatchCriteria {
  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private String page;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_CONTENT_TYPE = "content_type";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  private String contentType;

  public static final String SERIALIZED_NAME_WEBSOCKET_MESSAGE = "websocket_message";
  @SerializedName(SERIALIZED_NAME_WEBSOCKET_MESSAGE)
  private String websocketMessage;

  public static final String SERIALIZED_NAME_REQUEST_HEADER = "request_header";
  @SerializedName(SERIALIZED_NAME_REQUEST_HEADER)
  private NameValuePair requestHeader;

  public static final String SERIALIZED_NAME_REQUEST_COOKIE = "request_cookie";
  @SerializedName(SERIALIZED_NAME_REQUEST_COOKIE)
  private NameValuePair requestCookie;

  public static final String SERIALIZED_NAME_RESPONSE_HEADER = "response_header";
  @SerializedName(SERIALIZED_NAME_RESPONSE_HEADER)
  private NameValuePair responseHeader;

  public static final String SERIALIZED_NAME_RESPONSE_COOKIE = "response_cookie";
  @SerializedName(SERIALIZED_NAME_RESPONSE_COOKIE)
  private NameValuePair responseCookie;

  public static final String SERIALIZED_NAME_JSON_VALID = "json_valid";
  @SerializedName(SERIALIZED_NAME_JSON_VALID)
  private Boolean jsonValid;

  public static final String SERIALIZED_NAME_JSON_PATH = "json_path";
  @SerializedName(SERIALIZED_NAME_JSON_PATH)
  private String jsonPath;

  public static final String SERIALIZED_NAME_JSON_SCHEMA = "json_schema";
  @SerializedName(SERIALIZED_NAME_JSON_SCHEMA)
  private String jsonSchema;

  public static final String SERIALIZED_NAME_ERROR_IF_NO_TRAFFIC = "error_if_no_traffic";
  @SerializedName(SERIALIZED_NAME_ERROR_IF_NO_TRAFFIC)
  private Boolean errorIfNoTraffic;


  public MatchCriteria url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Request URL regexp to match
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Request URL regexp to match")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public MatchCriteria page(String page) {
    
    this.page = page;
    return this;
  }

   /**
   * current|all
   * @return page
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "current|all")

  public String getPage() {
    return page;
  }


  public void setPage(String page) {
    this.page = page;
  }


  public MatchCriteria status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * HTTP Status code to match.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "HTTP Status code to match.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public MatchCriteria content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * Body content regexp content to match
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Body content regexp content to match")

  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    this.content = content;
  }


  public MatchCriteria contentType(String contentType) {
    
    this.contentType = contentType;
    return this;
  }

   /**
   * Content type
   * @return contentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Content type")

  public String getContentType() {
    return contentType;
  }


  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  public MatchCriteria websocketMessage(String websocketMessage) {
    
    this.websocketMessage = websocketMessage;
    return this;
  }

   /**
   * Websocket message text to match
   * @return websocketMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Websocket message text to match")

  public String getWebsocketMessage() {
    return websocketMessage;
  }


  public void setWebsocketMessage(String websocketMessage) {
    this.websocketMessage = websocketMessage;
  }


  public MatchCriteria requestHeader(NameValuePair requestHeader) {
    
    this.requestHeader = requestHeader;
    return this;
  }

   /**
   * Get requestHeader
   * @return requestHeader
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NameValuePair getRequestHeader() {
    return requestHeader;
  }


  public void setRequestHeader(NameValuePair requestHeader) {
    this.requestHeader = requestHeader;
  }


  public MatchCriteria requestCookie(NameValuePair requestCookie) {
    
    this.requestCookie = requestCookie;
    return this;
  }

   /**
   * Get requestCookie
   * @return requestCookie
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NameValuePair getRequestCookie() {
    return requestCookie;
  }


  public void setRequestCookie(NameValuePair requestCookie) {
    this.requestCookie = requestCookie;
  }


  public MatchCriteria responseHeader(NameValuePair responseHeader) {
    
    this.responseHeader = responseHeader;
    return this;
  }

   /**
   * Get responseHeader
   * @return responseHeader
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NameValuePair getResponseHeader() {
    return responseHeader;
  }


  public void setResponseHeader(NameValuePair responseHeader) {
    this.responseHeader = responseHeader;
  }


  public MatchCriteria responseCookie(NameValuePair responseCookie) {
    
    this.responseCookie = responseCookie;
    return this;
  }

   /**
   * Get responseCookie
   * @return responseCookie
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NameValuePair getResponseCookie() {
    return responseCookie;
  }


  public void setResponseCookie(NameValuePair responseCookie) {
    this.responseCookie = responseCookie;
  }


  public MatchCriteria jsonValid(Boolean jsonValid) {
    
    this.jsonValid = jsonValid;
    return this;
  }

   /**
   * Is valid JSON
   * @return jsonValid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Is valid JSON")

  public Boolean getJsonValid() {
    return jsonValid;
  }


  public void setJsonValid(Boolean jsonValid) {
    this.jsonValid = jsonValid;
  }


  public MatchCriteria jsonPath(String jsonPath) {
    
    this.jsonPath = jsonPath;
    return this;
  }

   /**
   * Has JSON path
   * @return jsonPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Has JSON path")

  public String getJsonPath() {
    return jsonPath;
  }


  public void setJsonPath(String jsonPath) {
    this.jsonPath = jsonPath;
  }


  public MatchCriteria jsonSchema(String jsonSchema) {
    
    this.jsonSchema = jsonSchema;
    return this;
  }

   /**
   * Validates against passed JSON schema
   * @return jsonSchema
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Validates against passed JSON schema")

  public String getJsonSchema() {
    return jsonSchema;
  }


  public void setJsonSchema(String jsonSchema) {
    this.jsonSchema = jsonSchema;
  }


  public MatchCriteria errorIfNoTraffic(Boolean errorIfNoTraffic) {
    
    this.errorIfNoTraffic = errorIfNoTraffic;
    return this;
  }

   /**
   * If the proxy has NO traffic at all, return error
   * @return errorIfNoTraffic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the proxy has NO traffic at all, return error")

  public Boolean getErrorIfNoTraffic() {
    return errorIfNoTraffic;
  }


  public void setErrorIfNoTraffic(Boolean errorIfNoTraffic) {
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

  @Override
  public int hashCode() {
    return Objects.hash(url, page, status, content, contentType, websocketMessage, requestHeader, requestCookie, responseHeader, responseCookie, jsonValid, jsonPath, jsonSchema, errorIfNoTraffic);
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

}

