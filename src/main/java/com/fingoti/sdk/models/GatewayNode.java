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
import com.fingoti.sdk.models.NodeDetect;
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
 * GatewayNode
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-16T16:45:33.786096900Z[Europe/London]")
public class GatewayNode {
  public static final String SERIALIZED_NAME_DETECT = "detect";
  @SerializedName(SERIALIZED_NAME_DETECT)
  private List<NodeDetect> detect = null;

  public GatewayNode() {
  }

  public GatewayNode detect(List<NodeDetect> detect) {
    
    this.detect = detect;
    return this;
  }

  public GatewayNode addDetectItem(NodeDetect detectItem) {
    if (this.detect == null) {
      this.detect = new ArrayList<>();
    }
    this.detect.add(detectItem);
    return this;
  }

   /**
   * Get detect
   * @return detect
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<NodeDetect> getDetect() {
    return detect;
  }


  public void setDetect(List<NodeDetect> detect) {
    this.detect = detect;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GatewayNode gatewayNode = (GatewayNode) o;
    return Objects.equals(this.detect, gatewayNode.detect);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(detect);
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
    sb.append("class GatewayNode {\n");
    sb.append("    detect: ").append(toIndentedString(detect)).append("\n");
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
    openapiFields.add("detect");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GatewayNode
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GatewayNode.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GatewayNode is not found in the empty JSON string", GatewayNode.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GatewayNode.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GatewayNode` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("detect") != null && !jsonObj.get("detect").isJsonNull()) {
        JsonArray jsonArraydetect = jsonObj.getAsJsonArray("detect");
        if (jsonArraydetect != null) {
          // ensure the json data is an array
          if (!jsonObj.get("detect").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `detect` to be an array in the JSON string but got `%s`", jsonObj.get("detect").toString()));
          }

          // validate the optional field `detect` (array)
          for (int i = 0; i < jsonArraydetect.size(); i++) {
            NodeDetect.validateJsonObject(jsonArraydetect.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GatewayNode.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GatewayNode' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GatewayNode> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GatewayNode.class));

       return (TypeAdapter<T>) new TypeAdapter<GatewayNode>() {
           @Override
           public void write(JsonWriter out, GatewayNode value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GatewayNode read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GatewayNode given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GatewayNode
  * @throws IOException if the JSON string is invalid with respect to GatewayNode
  */
  public static GatewayNode fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GatewayNode.class);
  }

 /**
  * Convert an instance of GatewayNode to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

