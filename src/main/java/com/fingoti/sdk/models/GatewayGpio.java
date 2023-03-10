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
 * GatewayGpio
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-16T16:45:33.786096900Z[Europe/London]")
public class GatewayGpio {
  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private List<Integer> state = null;

  public static final String SERIALIZED_NAME_DIRECTION = "direction";
  @SerializedName(SERIALIZED_NAME_DIRECTION)
  private List<Integer> direction = null;

  public GatewayGpio() {
  }

  public GatewayGpio state(List<Integer> state) {
    
    this.state = state;
    return this;
  }

  public GatewayGpio addStateItem(Integer stateItem) {
    if (this.state == null) {
      this.state = new ArrayList<>();
    }
    this.state.add(stateItem);
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getState() {
    return state;
  }


  public void setState(List<Integer> state) {
    this.state = state;
  }


  public GatewayGpio direction(List<Integer> direction) {
    
    this.direction = direction;
    return this;
  }

  public GatewayGpio addDirectionItem(Integer directionItem) {
    if (this.direction == null) {
      this.direction = new ArrayList<>();
    }
    this.direction.add(directionItem);
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getDirection() {
    return direction;
  }


  public void setDirection(List<Integer> direction) {
    this.direction = direction;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GatewayGpio gatewayGpio = (GatewayGpio) o;
    return Objects.equals(this.state, gatewayGpio.state) &&
        Objects.equals(this.direction, gatewayGpio.direction);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, direction);
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
    sb.append("class GatewayGpio {\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
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
    openapiFields.add("state");
    openapiFields.add("direction");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GatewayGpio
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GatewayGpio.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GatewayGpio is not found in the empty JSON string", GatewayGpio.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GatewayGpio.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GatewayGpio` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("state") != null && !jsonObj.get("state").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be an array in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("direction") != null && !jsonObj.get("direction").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `direction` to be an array in the JSON string but got `%s`", jsonObj.get("direction").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GatewayGpio.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GatewayGpio' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GatewayGpio> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GatewayGpio.class));

       return (TypeAdapter<T>) new TypeAdapter<GatewayGpio>() {
           @Override
           public void write(JsonWriter out, GatewayGpio value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GatewayGpio read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GatewayGpio given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GatewayGpio
  * @throws IOException if the JSON string is invalid with respect to GatewayGpio
  */
  public static GatewayGpio fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GatewayGpio.class);
  }

 /**
  * Convert an instance of GatewayGpio to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

