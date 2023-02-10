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
import com.fingoti.sdk.models.VyneGateway;
import com.fingoti.sdk.models.VyneNode;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * DeviceVyneDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-16T16:45:33.786096900Z[Europe/London]")
public class DeviceVyneDto {
  public static final String SERIALIZED_NAME_GATEWAY = "gateway";
  @SerializedName(SERIALIZED_NAME_GATEWAY)
  private List<VyneGateway> gateway = null;

  public static final String SERIALIZED_NAME_NODE = "node";
  @SerializedName(SERIALIZED_NAME_NODE)
  private List<VyneNode> node = null;

  public DeviceVyneDto() {
  }

  public DeviceVyneDto gateway(List<VyneGateway> gateway) {
    
    this.gateway = gateway;
    return this;
  }

  public DeviceVyneDto addGatewayItem(VyneGateway gatewayItem) {
    if (this.gateway == null) {
      this.gateway = new ArrayList<>();
    }
    this.gateway.add(gatewayItem);
    return this;
  }

   /**
   * Get gateway
   * @return gateway
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<VyneGateway> getGateway() {
    return gateway;
  }


  public void setGateway(List<VyneGateway> gateway) {
    this.gateway = gateway;
  }


  public DeviceVyneDto node(List<VyneNode> node) {
    
    this.node = node;
    return this;
  }

  public DeviceVyneDto addNodeItem(VyneNode nodeItem) {
    if (this.node == null) {
      this.node = new ArrayList<>();
    }
    this.node.add(nodeItem);
    return this;
  }

   /**
   * Get node
   * @return node
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<VyneNode> getNode() {
    return node;
  }


  public void setNode(List<VyneNode> node) {
    this.node = node;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceVyneDto deviceVyneDto = (DeviceVyneDto) o;
    return Objects.equals(this.gateway, deviceVyneDto.gateway) &&
        Objects.equals(this.node, deviceVyneDto.node);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(gateway, node);
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
    sb.append("class DeviceVyneDto {\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    node: ").append(toIndentedString(node)).append("\n");
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
    openapiFields.add("gateway");
    openapiFields.add("node");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DeviceVyneDto
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!DeviceVyneDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeviceVyneDto is not found in the empty JSON string", DeviceVyneDto.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DeviceVyneDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeviceVyneDto` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("gateway") != null && !jsonObj.get("gateway").isJsonNull()) {
        JsonArray jsonArraygateway = jsonObj.getAsJsonArray("gateway");
        if (jsonArraygateway != null) {
          // ensure the json data is an array
          if (!jsonObj.get("gateway").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `gateway` to be an array in the JSON string but got `%s`", jsonObj.get("gateway").toString()));
          }

          // validate the optional field `gateway` (array)
          for (int i = 0; i < jsonArraygateway.size(); i++) {
            VyneGateway.validateJsonObject(jsonArraygateway.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("node") != null && !jsonObj.get("node").isJsonNull()) {
        JsonArray jsonArraynode = jsonObj.getAsJsonArray("node");
        if (jsonArraynode != null) {
          // ensure the json data is an array
          if (!jsonObj.get("node").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `node` to be an array in the JSON string but got `%s`", jsonObj.get("node").toString()));
          }

          // validate the optional field `node` (array)
          for (int i = 0; i < jsonArraynode.size(); i++) {
            VyneNode.validateJsonObject(jsonArraynode.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeviceVyneDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeviceVyneDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeviceVyneDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeviceVyneDto.class));

       return (TypeAdapter<T>) new TypeAdapter<DeviceVyneDto>() {
           @Override
           public void write(JsonWriter out, DeviceVyneDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeviceVyneDto read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DeviceVyneDto given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeviceVyneDto
  * @throws IOException if the JSON string is invalid with respect to DeviceVyneDto
  */
  public static DeviceVyneDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeviceVyneDto.class);
  }

 /**
  * Convert an instance of DeviceVyneDto to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
