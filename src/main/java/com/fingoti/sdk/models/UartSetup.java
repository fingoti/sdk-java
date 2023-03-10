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
 * UartSetup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-16T16:45:33.786096900Z[Europe/London]")
public class UartSetup {
  public static final String SERIALIZED_NAME_BAUDRATE = "baudrate";
  @SerializedName(SERIALIZED_NAME_BAUDRATE)
  private Integer baudrate;

  public static final String SERIALIZED_NAME_DATABITS = "databits";
  @SerializedName(SERIALIZED_NAME_DATABITS)
  private Integer databits;

  public static final String SERIALIZED_NAME_PARITY = "parity";
  @SerializedName(SERIALIZED_NAME_PARITY)
  private Integer parity;

  public static final String SERIALIZED_NAME_STOPBITS = "stopbits";
  @SerializedName(SERIALIZED_NAME_STOPBITS)
  private Integer stopbits;

  public UartSetup() {
  }

  public UartSetup baudrate(Integer baudrate) {
    
    this.baudrate = baudrate;
    return this;
  }

   /**
   * Get baudrate
   * @return baudrate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getBaudrate() {
    return baudrate;
  }


  public void setBaudrate(Integer baudrate) {
    this.baudrate = baudrate;
  }


  public UartSetup databits(Integer databits) {
    
    this.databits = databits;
    return this;
  }

   /**
   * Get databits
   * @return databits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDatabits() {
    return databits;
  }


  public void setDatabits(Integer databits) {
    this.databits = databits;
  }


  public UartSetup parity(Integer parity) {
    
    this.parity = parity;
    return this;
  }

   /**
   * Get parity
   * @return parity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getParity() {
    return parity;
  }


  public void setParity(Integer parity) {
    this.parity = parity;
  }


  public UartSetup stopbits(Integer stopbits) {
    
    this.stopbits = stopbits;
    return this;
  }

   /**
   * Get stopbits
   * @return stopbits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStopbits() {
    return stopbits;
  }


  public void setStopbits(Integer stopbits) {
    this.stopbits = stopbits;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UartSetup uartSetup = (UartSetup) o;
    return Objects.equals(this.baudrate, uartSetup.baudrate) &&
        Objects.equals(this.databits, uartSetup.databits) &&
        Objects.equals(this.parity, uartSetup.parity) &&
        Objects.equals(this.stopbits, uartSetup.stopbits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baudrate, databits, parity, stopbits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UartSetup {\n");
    sb.append("    baudrate: ").append(toIndentedString(baudrate)).append("\n");
    sb.append("    databits: ").append(toIndentedString(databits)).append("\n");
    sb.append("    parity: ").append(toIndentedString(parity)).append("\n");
    sb.append("    stopbits: ").append(toIndentedString(stopbits)).append("\n");
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
    openapiFields.add("baudrate");
    openapiFields.add("databits");
    openapiFields.add("parity");
    openapiFields.add("stopbits");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UartSetup
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UartSetup.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UartSetup is not found in the empty JSON string", UartSetup.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UartSetup.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UartSetup` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UartSetup.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UartSetup' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UartSetup> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UartSetup.class));

       return (TypeAdapter<T>) new TypeAdapter<UartSetup>() {
           @Override
           public void write(JsonWriter out, UartSetup value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UartSetup read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UartSetup given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UartSetup
  * @throws IOException if the JSON string is invalid with respect to UartSetup
  */
  public static UartSetup fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UartSetup.class);
  }

 /**
  * Convert an instance of UartSetup to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

