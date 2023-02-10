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
import com.fingoti.sdk.models.PatchDevice;
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
 * PatchGateway
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-16T16:45:33.786096900Z[Europe/London]")
public class PatchGateway {
  public static final String SERIALIZED_NAME_DEVICE = "device";
  @SerializedName(SERIALIZED_NAME_DEVICE)
  private PatchDevice device;

  public PatchGateway() {
  }

  public PatchGateway device(PatchDevice device) {
    
    this.device = device;
    return this;
  }

   /**
   * Get device
   * @return device
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PatchDevice getDevice() {
    return device;
  }


  public void setDevice(PatchDevice device) {
    this.device = device;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchGateway patchGateway = (PatchGateway) o;
    return Objects.equals(this.device, patchGateway.device);
  }

  @Override
  public int hashCode() {
    return Objects.hash(device);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchGateway {\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
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
    openapiFields.add("device");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PatchGateway
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PatchGateway.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PatchGateway is not found in the empty JSON string", PatchGateway.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PatchGateway.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PatchGateway` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `device`
      if (jsonObj.get("device") != null && !jsonObj.get("device").isJsonNull()) {
        PatchDevice.validateJsonObject(jsonObj.getAsJsonObject("device"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PatchGateway.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PatchGateway' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PatchGateway> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PatchGateway.class));

       return (TypeAdapter<T>) new TypeAdapter<PatchGateway>() {
           @Override
           public void write(JsonWriter out, PatchGateway value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PatchGateway read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PatchGateway given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PatchGateway
  * @throws IOException if the JSON string is invalid with respect to PatchGateway
  */
  public static PatchGateway fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PatchGateway.class);
  }

 /**
  * Convert an instance of PatchGateway to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

