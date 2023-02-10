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
import com.fingoti.sdk.models.OrganisationPresetsDto;
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
 * OrganisationPresetResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-16T16:45:33.786096900Z[Europe/London]")
public class OrganisationPresetResponse {
  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private Boolean success;

  public static final String SERIALIZED_NAME_PAGE_NUMBER = "pageNumber";
  @SerializedName(SERIALIZED_NAME_PAGE_NUMBER)
  private Long pageNumber;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Long count;

  public static final String SERIALIZED_NAME_PRESETS = "presets";
  @SerializedName(SERIALIZED_NAME_PRESETS)
  private List<OrganisationPresetsDto> presets = null;

  public OrganisationPresetResponse() {
  }

  public OrganisationPresetResponse success(Boolean success) {
    
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


  public OrganisationPresetResponse pageNumber(Long pageNumber) {
    
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Get pageNumber
   * @return pageNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getPageNumber() {
    return pageNumber;
  }


  public void setPageNumber(Long pageNumber) {
    this.pageNumber = pageNumber;
  }


  public OrganisationPresetResponse count(Long count) {
    
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getCount() {
    return count;
  }


  public void setCount(Long count) {
    this.count = count;
  }


  public OrganisationPresetResponse presets(List<OrganisationPresetsDto> presets) {
    
    this.presets = presets;
    return this;
  }

  public OrganisationPresetResponse addPresetsItem(OrganisationPresetsDto presetsItem) {
    if (this.presets == null) {
      this.presets = new ArrayList<>();
    }
    this.presets.add(presetsItem);
    return this;
  }

   /**
   * Get presets
   * @return presets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<OrganisationPresetsDto> getPresets() {
    return presets;
  }


  public void setPresets(List<OrganisationPresetsDto> presets) {
    this.presets = presets;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganisationPresetResponse organisationPresetResponse = (OrganisationPresetResponse) o;
    return Objects.equals(this.success, organisationPresetResponse.success) &&
        Objects.equals(this.pageNumber, organisationPresetResponse.pageNumber) &&
        Objects.equals(this.count, organisationPresetResponse.count) &&
        Objects.equals(this.presets, organisationPresetResponse.presets);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, pageNumber, count, presets);
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
    sb.append("class OrganisationPresetResponse {\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    presets: ").append(toIndentedString(presets)).append("\n");
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
    openapiFields.add("pageNumber");
    openapiFields.add("count");
    openapiFields.add("presets");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrganisationPresetResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OrganisationPresetResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrganisationPresetResponse is not found in the empty JSON string", OrganisationPresetResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OrganisationPresetResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrganisationPresetResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("presets") != null && !jsonObj.get("presets").isJsonNull()) {
        JsonArray jsonArraypresets = jsonObj.getAsJsonArray("presets");
        if (jsonArraypresets != null) {
          // ensure the json data is an array
          if (!jsonObj.get("presets").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `presets` to be an array in the JSON string but got `%s`", jsonObj.get("presets").toString()));
          }

          // validate the optional field `presets` (array)
          for (int i = 0; i < jsonArraypresets.size(); i++) {
            OrganisationPresetsDto.validateJsonObject(jsonArraypresets.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrganisationPresetResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrganisationPresetResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrganisationPresetResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrganisationPresetResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<OrganisationPresetResponse>() {
           @Override
           public void write(JsonWriter out, OrganisationPresetResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrganisationPresetResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrganisationPresetResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrganisationPresetResponse
  * @throws IOException if the JSON string is invalid with respect to OrganisationPresetResponse
  */
  public static OrganisationPresetResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrganisationPresetResponse.class);
  }

 /**
  * Convert an instance of OrganisationPresetResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
