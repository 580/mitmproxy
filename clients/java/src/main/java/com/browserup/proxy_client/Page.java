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
import com.browserup.proxy_client.Counter;
import com.browserup.proxy_client.Error;
import com.browserup.proxy_client.PagePageTimings;
import com.browserup.proxy_client.VerifyResult;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Page
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Page {
  public static final String SERIALIZED_NAME_STARTED_DATE_TIME = "startedDateTime";
  @SerializedName(SERIALIZED_NAME_STARTED_DATE_TIME)
  private OffsetDateTime startedDateTime;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_VERIFICATIONS = "_verifications";
  @SerializedName(SERIALIZED_NAME_VERIFICATIONS)
  private List<VerifyResult> verifications = new ArrayList<>();

  public static final String SERIALIZED_NAME_COUNTERS = "_counters";
  @SerializedName(SERIALIZED_NAME_COUNTERS)
  private List<Counter> counters = null;

  public static final String SERIALIZED_NAME_ERRORS = "_errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<Error> errors = null;

  public static final String SERIALIZED_NAME_PAGE_TIMINGS = "pageTimings";
  @SerializedName(SERIALIZED_NAME_PAGE_TIMINGS)
  private PagePageTimings pageTimings;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;


  public Page startedDateTime(OffsetDateTime startedDateTime) {
    
    this.startedDateTime = startedDateTime;
    return this;
  }

   /**
   * Get startedDateTime
   * @return startedDateTime
  **/
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getStartedDateTime() {
    return startedDateTime;
  }


  public void setStartedDateTime(OffsetDateTime startedDateTime) {
    this.startedDateTime = startedDateTime;
  }


  public Page id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Page title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(required = true, value = "")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public Page verifications(List<VerifyResult> verifications) {
    
    this.verifications = verifications;
    return this;
  }

  public Page addVerificationsItem(VerifyResult verificationsItem) {
    this.verifications.add(verificationsItem);
    return this;
  }

   /**
   * Get verifications
   * @return verifications
  **/
  @ApiModelProperty(required = true, value = "")

  public List<VerifyResult> getVerifications() {
    return verifications;
  }


  public void setVerifications(List<VerifyResult> verifications) {
    this.verifications = verifications;
  }


  public Page counters(List<Counter> counters) {
    
    this.counters = counters;
    return this;
  }

  public Page addCountersItem(Counter countersItem) {
    if (this.counters == null) {
      this.counters = new ArrayList<>();
    }
    this.counters.add(countersItem);
    return this;
  }

   /**
   * Get counters
   * @return counters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Counter> getCounters() {
    return counters;
  }


  public void setCounters(List<Counter> counters) {
    this.counters = counters;
  }


  public Page errors(List<Error> errors) {
    
    this.errors = errors;
    return this;
  }

  public Page addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Error> getErrors() {
    return errors;
  }


  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }


  public Page pageTimings(PagePageTimings pageTimings) {
    
    this.pageTimings = pageTimings;
    return this;
  }

   /**
   * Get pageTimings
   * @return pageTimings
  **/
  @ApiModelProperty(required = true, value = "")

  public PagePageTimings getPageTimings() {
    return pageTimings;
  }


  public void setPageTimings(PagePageTimings pageTimings) {
    this.pageTimings = pageTimings;
  }


  public Page comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
    Page page = (Page) o;
    return Objects.equals(this.startedDateTime, page.startedDateTime) &&
        Objects.equals(this.id, page.id) &&
        Objects.equals(this.title, page.title) &&
        Objects.equals(this.verifications, page.verifications) &&
        Objects.equals(this.counters, page.counters) &&
        Objects.equals(this.errors, page.errors) &&
        Objects.equals(this.pageTimings, page.pageTimings) &&
        Objects.equals(this.comment, page.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startedDateTime, id, title, verifications, counters, errors, pageTimings, comment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Page {\n");
    sb.append("    startedDateTime: ").append(toIndentedString(startedDateTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    verifications: ").append(toIndentedString(verifications)).append("\n");
    sb.append("    counters: ").append(toIndentedString(counters)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    pageTimings: ").append(toIndentedString(pageTimings)).append("\n");
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

}
