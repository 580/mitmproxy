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
import com.browserup.proxy_client.HarLog;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Har
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Har {
  public static final String SERIALIZED_NAME_LOG = "log";
  @SerializedName(SERIALIZED_NAME_LOG)
  private HarLog log;


  public Har log(HarLog log) {
    
    this.log = log;
    return this;
  }

   /**
   * Get log
   * @return log
  **/
  @ApiModelProperty(required = true, value = "")

  public HarLog getLog() {
    return log;
  }


  public void setLog(HarLog log) {
    this.log = log;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Har har = (Har) o;
    return Objects.equals(this.log, har.log);
  }

  @Override
  public int hashCode() {
    return Objects.hash(log);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Har {\n");
    sb.append("    log: ").append(toIndentedString(log)).append("\n");
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

