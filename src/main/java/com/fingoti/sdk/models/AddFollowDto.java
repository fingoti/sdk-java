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
 * AddFollowDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-16T16:45:33.786096900Z[Europe/London]")
public class AddFollowDto {
  public static final String SERIALIZED_NAME_DISABLED = "disabled";
  @SerializedName(SERIALIZED_NAME_DISABLED)
  private Boolean disabled;

  public static final String SERIALIZED_NAME_FOLLOW_NAME = "followName";
  @SerializedName(SERIALIZED_NAME_FOLLOW_NAME)
  private String followName;

  public static final String SERIALIZED_NAME_SOURCE_DEVICE = "sourceDevice";
  @SerializedName(SERIALIZED_NAME_SOURCE_DEVICE)
  private String sourceDevice;

  public static final String SERIALIZED_NAME_SOURCE_PIN = "sourcePin";
  @SerializedName(SERIALIZED_NAME_SOURCE_PIN)
  private Integer sourcePin;

  public static final String SERIALIZED_NAME_DESTINATION_DEVICE = "destinationDevice";
  @SerializedName(SERIALIZED_NAME_DESTINATION_DEVICE)
  private String destinationDevice;

  public static final String SERIALIZED_NAME_DESTINATION_PIN = "destinationPin";
  @SerializedName(SERIALIZED_NAME_DESTINATION_PIN)
  private Integer destinationPin;

  public static final String SERIALIZED_NAME_MIRROR = "mirror";
  @SerializedName(SERIALIZED_NAME_MIRROR)
  private Boolean mirror;

  public AddFollowDto() {
  }

  public AddFollowDto disabled(Boolean disabled) {
    
    this.disabled = disabled;
    return this;
  }

   /**
   * Get disabled
   * @return disabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDisabled() {
    return disabled;
  }


  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  public AddFollowDto followName(String followName) {
    
    this.followName = followName;
    return this;
  }

   /**
   * Get followName
   * @return followName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getFollowName() {
    return followName;
  }


  public void setFollowName(String followName) {
    this.followName = followName;
  }


  public AddFollowDto sourceDevice(String sourceDevice) {
    
    this.sourceDevice = sourceDevice;
    return this;
  }

   /**
   * Get sourceDevice
   * @return sourceDevice
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSourceDevice() {
    return sourceDevice;
  }


  public void setSourceDevice(String sourceDevice) {
    this.sourceDevice = sourceDevice;
  }


  public AddFollowDto sourcePin(Integer sourcePin) {
    
    this.sourcePin = sourcePin;
    return this;
  }

   /**
   * Get sourcePin
   * @return sourcePin
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getSourcePin() {
    return sourcePin;
  }


  public void setSourcePin(Integer sourcePin) {
    this.sourcePin = sourcePin;
  }


  public AddFollowDto destinationDevice(String destinationDevice) {
    
    this.destinationDevice = destinationDevice;
    return this;
  }

   /**
   * Get destinationDevice
   * @return destinationDevice
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDestinationDevice() {
    return destinationDevice;
  }


  public void setDestinationDevice(String destinationDevice) {
    this.destinationDevice = destinationDevice;
  }


  public AddFollowDto destinationPin(Integer destinationPin) {
    
    this.destinationPin = destinationPin;
    return this;
  }

   /**
   * Get destinationPin
   * @return destinationPin
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getDestinationPin() {
    return destinationPin;
  }


  public void setDestinationPin(Integer destinationPin) {
    this.destinationPin = destinationPin;
  }


  public AddFollowDto mirror(Boolean mirror) {
    
    this.mirror = mirror;
    return this;
  }

   /**
   * Get mirror
   * @return mirror
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMirror() {
    return mirror;
  }


  public void setMirror(Boolean mirror) {
    this.mirror = mirror;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddFollowDto addFollowDto = (AddFollowDto) o;
    return Objects.equals(this.disabled, addFollowDto.disabled) &&
        Objects.equals(this.followName, addFollowDto.followName) &&
        Objects.equals(this.sourceDevice, addFollowDto.sourceDevice) &&
        Objects.equals(this.sourcePin, addFollowDto.sourcePin) &&
        Objects.equals(this.destinationDevice, addFollowDto.destinationDevice) &&
        Objects.equals(this.destinationPin, addFollowDto.destinationPin) &&
        Objects.equals(this.mirror, addFollowDto.mirror);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disabled, followName, sourceDevice, sourcePin, destinationDevice, destinationPin, mirror);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddFollowDto {\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    followName: ").append(toIndentedString(followName)).append("\n");
    sb.append("    sourceDevice: ").append(toIndentedString(sourceDevice)).append("\n");
    sb.append("    sourcePin: ").append(toIndentedString(sourcePin)).append("\n");
    sb.append("    destinationDevice: ").append(toIndentedString(destinationDevice)).append("\n");
    sb.append("    destinationPin: ").append(toIndentedString(destinationPin)).append("\n");
    sb.append("    mirror: ").append(toIndentedString(mirror)).append("\n");
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
    openapiFields.add("disabled");
    openapiFields.add("followName");
    openapiFields.add("sourceDevice");
    openapiFields.add("sourcePin");
    openapiFields.add("destinationDevice");
    openapiFields.add("destinationPin");
    openapiFields.add("mirror");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("followName");
    openapiRequiredFields.add("sourceDevice");
    openapiRequiredFields.add("sourcePin");
    openapiRequiredFields.add("destinationDevice");
    openapiRequiredFields.add("destinationPin");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AddFollowDto
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AddFollowDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AddFollowDto is not found in the empty JSON string", AddFollowDto.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AddFollowDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AddFollowDto` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AddFollowDto.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("followName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `followName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("followName").toString()));
      }
      if (!jsonObj.get("sourceDevice").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceDevice` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sourceDevice").toString()));
      }
      if (!jsonObj.get("destinationDevice").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `destinationDevice` to be a primitive type in the JSON string but got `%s`", jsonObj.get("destinationDevice").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AddFollowDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AddFollowDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AddFollowDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AddFollowDto.class));

       return (TypeAdapter<T>) new TypeAdapter<AddFollowDto>() {
           @Override
           public void write(JsonWriter out, AddFollowDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AddFollowDto read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AddFollowDto given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AddFollowDto
  * @throws IOException if the JSON string is invalid with respect to AddFollowDto
  */
  public static AddFollowDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AddFollowDto.class);
  }

 /**
  * Convert an instance of AddFollowDto to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

