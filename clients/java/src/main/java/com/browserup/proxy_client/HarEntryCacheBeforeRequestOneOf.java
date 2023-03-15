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
 * HarEntryCacheBeforeRequestOneOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class HarEntryCacheBeforeRequestOneOf {
  public static final String SERIALIZED_NAME_EXPIRES = "expires";
  @SerializedName(SERIALIZED_NAME_EXPIRES)
  private String expires;

  public static final String SERIALIZED_NAME_LAST_ACCESS = "lastAccess";
  @SerializedName(SERIALIZED_NAME_LAST_ACCESS)
  private String lastAccess;

  public static final String SERIALIZED_NAME_E_TAG = "eTag";
  @SerializedName(SERIALIZED_NAME_E_TAG)
  private String eTag;

  public static final String SERIALIZED_NAME_HIT_COUNT = "hitCount";
  @SerializedName(SERIALIZED_NAME_HIT_COUNT)
  private Integer hitCount;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public HarEntryCacheBeforeRequestOneOf() {
  }

  public HarEntryCacheBeforeRequestOneOf expires(String expires) {
    
    this.expires = expires;
    return this;
  }

   /**
   * Get expires
   * @return expires
  **/
  @javax.annotation.Nullable

  public String getExpires() {
    return expires;
  }


  public void setExpires(String expires) {
    this.expires = expires;
  }


  public HarEntryCacheBeforeRequestOneOf lastAccess(String lastAccess) {
    
    this.lastAccess = lastAccess;
    return this;
  }

   /**
   * Get lastAccess
   * @return lastAccess
  **/
  @javax.annotation.Nonnull

  public String getLastAccess() {
    return lastAccess;
  }


  public void setLastAccess(String lastAccess) {
    this.lastAccess = lastAccess;
  }


  public HarEntryCacheBeforeRequestOneOf eTag(String eTag) {
    
    this.eTag = eTag;
    return this;
  }

   /**
   * Get eTag
   * @return eTag
  **/
  @javax.annotation.Nonnull

  public String geteTag() {
    return eTag;
  }


  public void seteTag(String eTag) {
    this.eTag = eTag;
  }


  public HarEntryCacheBeforeRequestOneOf hitCount(Integer hitCount) {
    
    this.hitCount = hitCount;
    return this;
  }

   /**
   * Get hitCount
   * @return hitCount
  **/
  @javax.annotation.Nonnull

  public Integer getHitCount() {
    return hitCount;
  }


  public void setHitCount(Integer hitCount) {
    this.hitCount = hitCount;
  }


  public HarEntryCacheBeforeRequestOneOf comment(String comment) {
    
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
    HarEntryCacheBeforeRequestOneOf harEntryCacheBeforeRequestOneOf = (HarEntryCacheBeforeRequestOneOf) o;
    return Objects.equals(this.expires, harEntryCacheBeforeRequestOneOf.expires) &&
        Objects.equals(this.lastAccess, harEntryCacheBeforeRequestOneOf.lastAccess) &&
        Objects.equals(this.eTag, harEntryCacheBeforeRequestOneOf.eTag) &&
        Objects.equals(this.hitCount, harEntryCacheBeforeRequestOneOf.hitCount) &&
        Objects.equals(this.comment, harEntryCacheBeforeRequestOneOf.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expires, lastAccess, eTag, hitCount, comment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HarEntryCacheBeforeRequestOneOf {\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    lastAccess: ").append(toIndentedString(lastAccess)).append("\n");
    sb.append("    eTag: ").append(toIndentedString(eTag)).append("\n");
    sb.append("    hitCount: ").append(toIndentedString(hitCount)).append("\n");
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
    openapiFields.add("expires");
    openapiFields.add("lastAccess");
    openapiFields.add("eTag");
    openapiFields.add("hitCount");
    openapiFields.add("comment");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("lastAccess");
    openapiRequiredFields.add("eTag");
    openapiRequiredFields.add("hitCount");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to HarEntryCacheBeforeRequestOneOf
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!HarEntryCacheBeforeRequestOneOf.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HarEntryCacheBeforeRequestOneOf is not found in the empty JSON string", HarEntryCacheBeforeRequestOneOf.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!HarEntryCacheBeforeRequestOneOf.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HarEntryCacheBeforeRequestOneOf` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : HarEntryCacheBeforeRequestOneOf.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("expires") != null && !jsonObj.get("expires").isJsonNull()) && !jsonObj.get("expires").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expires` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expires").toString()));
      }
      if (!jsonObj.get("lastAccess").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastAccess` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastAccess").toString()));
      }
      if (!jsonObj.get("eTag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eTag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eTag").toString()));
      }
      if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HarEntryCacheBeforeRequestOneOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HarEntryCacheBeforeRequestOneOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HarEntryCacheBeforeRequestOneOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HarEntryCacheBeforeRequestOneOf.class));

       return (TypeAdapter<T>) new TypeAdapter<HarEntryCacheBeforeRequestOneOf>() {
           @Override
           public void write(JsonWriter out, HarEntryCacheBeforeRequestOneOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HarEntryCacheBeforeRequestOneOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of HarEntryCacheBeforeRequestOneOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of HarEntryCacheBeforeRequestOneOf
  * @throws IOException if the JSON string is invalid with respect to HarEntryCacheBeforeRequestOneOf
  */
  public static HarEntryCacheBeforeRequestOneOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HarEntryCacheBeforeRequestOneOf.class);
  }

 /**
  * Convert an instance of HarEntryCacheBeforeRequestOneOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

