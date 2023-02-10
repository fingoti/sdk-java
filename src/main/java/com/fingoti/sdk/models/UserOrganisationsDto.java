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
import java.util.UUID;
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
 * UserOrganisationsDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-16T16:45:33.786096900Z[Europe/London]")
public class UserOrganisationsDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_ORGANISATION_NUMBER = "organisationNumber";
  @SerializedName(SERIALIZED_NAME_ORGANISATION_NUMBER)
  private String organisationNumber;

  public static final String SERIALIZED_NAME_ORGANISATION_NAME = "organisationName";
  @SerializedName(SERIALIZED_NAME_ORGANISATION_NAME)
  private String organisationName;

  public static final String SERIALIZED_NAME_ROLE_ID = "roleId";
  @SerializedName(SERIALIZED_NAME_ROLE_ID)
  private UUID roleId;

  public static final String SERIALIZED_NAME_ROLE_NAME = "roleName";
  @SerializedName(SERIALIZED_NAME_ROLE_NAME)
  private String roleName;

  public static final String SERIALIZED_NAME_DISABLED = "disabled";
  @SerializedName(SERIALIZED_NAME_DISABLED)
  private Boolean disabled;

  public UserOrganisationsDto() {
  }

  public UserOrganisationsDto id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public UserOrganisationsDto organisationNumber(String organisationNumber) {
    
    this.organisationNumber = organisationNumber;
    return this;
  }

   /**
   * Get organisationNumber
   * @return organisationNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOrganisationNumber() {
    return organisationNumber;
  }


  public void setOrganisationNumber(String organisationNumber) {
    this.organisationNumber = organisationNumber;
  }


  public UserOrganisationsDto organisationName(String organisationName) {
    
    this.organisationName = organisationName;
    return this;
  }

   /**
   * Get organisationName
   * @return organisationName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOrganisationName() {
    return organisationName;
  }


  public void setOrganisationName(String organisationName) {
    this.organisationName = organisationName;
  }


  public UserOrganisationsDto roleId(UUID roleId) {
    
    this.roleId = roleId;
    return this;
  }

   /**
   * Get roleId
   * @return roleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getRoleId() {
    return roleId;
  }


  public void setRoleId(UUID roleId) {
    this.roleId = roleId;
  }


  public UserOrganisationsDto roleName(String roleName) {
    
    this.roleName = roleName;
    return this;
  }

   /**
   * Get roleName
   * @return roleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRoleName() {
    return roleName;
  }


  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }


  public UserOrganisationsDto disabled(Boolean disabled) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserOrganisationsDto userOrganisationsDto = (UserOrganisationsDto) o;
    return Objects.equals(this.id, userOrganisationsDto.id) &&
        Objects.equals(this.organisationNumber, userOrganisationsDto.organisationNumber) &&
        Objects.equals(this.organisationName, userOrganisationsDto.organisationName) &&
        Objects.equals(this.roleId, userOrganisationsDto.roleId) &&
        Objects.equals(this.roleName, userOrganisationsDto.roleName) &&
        Objects.equals(this.disabled, userOrganisationsDto.disabled);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, organisationNumber, organisationName, roleId, roleName, disabled);
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
    sb.append("class UserOrganisationsDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    organisationNumber: ").append(toIndentedString(organisationNumber)).append("\n");
    sb.append("    organisationName: ").append(toIndentedString(organisationName)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("organisationNumber");
    openapiFields.add("organisationName");
    openapiFields.add("roleId");
    openapiFields.add("roleName");
    openapiFields.add("disabled");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UserOrganisationsDto
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UserOrganisationsDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserOrganisationsDto is not found in the empty JSON string", UserOrganisationsDto.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UserOrganisationsDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserOrganisationsDto` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("organisationNumber") != null && !jsonObj.get("organisationNumber").isJsonNull()) && !jsonObj.get("organisationNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organisationNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organisationNumber").toString()));
      }
      if ((jsonObj.get("organisationName") != null && !jsonObj.get("organisationName").isJsonNull()) && !jsonObj.get("organisationName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `organisationName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("organisationName").toString()));
      }
      if ((jsonObj.get("roleId") != null && !jsonObj.get("roleId").isJsonNull()) && !jsonObj.get("roleId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `roleId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("roleId").toString()));
      }
      if ((jsonObj.get("roleName") != null && !jsonObj.get("roleName").isJsonNull()) && !jsonObj.get("roleName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `roleName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("roleName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserOrganisationsDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserOrganisationsDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserOrganisationsDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserOrganisationsDto.class));

       return (TypeAdapter<T>) new TypeAdapter<UserOrganisationsDto>() {
           @Override
           public void write(JsonWriter out, UserOrganisationsDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserOrganisationsDto read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UserOrganisationsDto given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserOrganisationsDto
  * @throws IOException if the JSON string is invalid with respect to UserOrganisationsDto
  */
  public static UserOrganisationsDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserOrganisationsDto.class);
  }

 /**
  * Convert an instance of UserOrganisationsDto to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
