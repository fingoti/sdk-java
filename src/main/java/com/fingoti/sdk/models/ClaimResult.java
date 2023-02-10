/*
 * Fingoti API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.fingoti.sdk.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
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

import com.fingoti.sdk.JSON;

/**
 * ClaimResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-16T16:45:33.786096900Z[Europe/London]")
public class ClaimResult {
  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private Boolean success;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_CLAIM_CODE = "claimCode";
  @SerializedName(SERIALIZED_NAME_CLAIM_CODE)
  private String claimCode;

  public static final String SERIALIZED_NAME_CLAIM_EXPIRY = "claimExpiry";
  @SerializedName(SERIALIZED_NAME_CLAIM_EXPIRY)
  private OffsetDateTime claimExpiry;

  public static final String SERIALIZED_NAME_DEVICE_KEY = "deviceKey";
  @SerializedName(SERIALIZED_NAME_DEVICE_KEY)
  private String deviceKey;

  public ClaimResult() {
  }

  public ClaimResult success(Boolean success) {
    
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSuccess() {
    return success;
  }


  public void setSuccess(Boolean success) {
    this.success = success;
  }


  public ClaimResult message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public ClaimResult claimCode(String claimCode) {
    
    this.claimCode = claimCode;
    return this;
  }

   /**
   * Get claimCode
   * @return claimCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getClaimCode() {
    return claimCode;
  }


  public void setClaimCode(String claimCode) {
    this.claimCode = claimCode;
  }


  public ClaimResult claimExpiry(OffsetDateTime claimExpiry) {
    
    this.claimExpiry = claimExpiry;
    return this;
  }

   /**
   * Get claimExpiry
   * @return claimExpiry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getClaimExpiry() {
    return claimExpiry;
  }


  public void setClaimExpiry(OffsetDateTime claimExpiry) {
    this.claimExpiry = claimExpiry;
  }


  public ClaimResult deviceKey(String deviceKey) {
    
    this.deviceKey = deviceKey;
    return this;
  }

   /**
   * Get deviceKey
   * @return deviceKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDeviceKey() {
    return deviceKey;
  }


  public void setDeviceKey(String deviceKey) {
    this.deviceKey = deviceKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClaimResult claimResult = (ClaimResult) o;
    return Objects.equals(this.success, claimResult.success) &&
        Objects.equals(this.message, claimResult.message) &&
        Objects.equals(this.claimCode, claimResult.claimCode) &&
        Objects.equals(this.claimExpiry, claimResult.claimExpiry) &&
        Objects.equals(this.deviceKey, claimResult.deviceKey);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, message, claimCode, claimExpiry, deviceKey);
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
    sb.append("class ClaimResult {\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    claimCode: ").append(toIndentedString(claimCode)).append("\n");
    sb.append("    claimExpiry: ").append(toIndentedString(claimExpiry)).append("\n");
    sb.append("    deviceKey: ").append(toIndentedString(deviceKey)).append("\n");
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
    openapiFields.add("success");
    openapiFields.add("message");
    openapiFields.add("claimCode");
    openapiFields.add("claimExpiry");
    openapiFields.add("deviceKey");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ClaimResult
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ClaimResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ClaimResult is not found in the empty JSON string", ClaimResult.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ClaimResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ClaimResult` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
      if ((jsonObj.get("claimCode") != null && !jsonObj.get("claimCode").isJsonNull()) && !jsonObj.get("claimCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `claimCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("claimCode").toString()));
      }
      if ((jsonObj.get("deviceKey") != null && !jsonObj.get("deviceKey").isJsonNull()) && !jsonObj.get("deviceKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deviceKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deviceKey").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClaimResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClaimResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClaimResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClaimResult.class));

       return (TypeAdapter<T>) new TypeAdapter<ClaimResult>() {
           @Override
           public void write(JsonWriter out, ClaimResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClaimResult read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClaimResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClaimResult
  * @throws IOException if the JSON string is invalid with respect to ClaimResult
  */
  public static ClaimResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClaimResult.class);
  }

 /**
  * Convert an instance of ClaimResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
