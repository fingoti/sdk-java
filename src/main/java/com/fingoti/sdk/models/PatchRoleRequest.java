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
 * PatchRoleRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-16T16:45:33.786096900Z[Europe/London]")
public class PatchRoleRequest {
  public static final String SERIALIZED_NAME_ROLE_NAME = "roleName";
  @SerializedName(SERIALIZED_NAME_ROLE_NAME)
  private String roleName;

  public static final String SERIALIZED_NAME_DEVICE = "device";
  @SerializedName(SERIALIZED_NAME_DEVICE)
  private Integer device;

  public static final String SERIALIZED_NAME_ORGANISATION = "organisation";
  @SerializedName(SERIALIZED_NAME_ORGANISATION)
  private Integer organisation;

  public static final String SERIALIZED_NAME_FOLLOW = "follow";
  @SerializedName(SERIALIZED_NAME_FOLLOW)
  private Integer follow;

  public static final String SERIALIZED_NAME_RULE = "rule";
  @SerializedName(SERIALIZED_NAME_RULE)
  private Integer rule;

  public static final String SERIALIZED_NAME_SCHEDULE = "schedule";
  @SerializedName(SERIALIZED_NAME_SCHEDULE)
  private Integer schedule;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private Integer user;

  public static final String SERIALIZED_NAME_WEBHOOK = "webhook";
  @SerializedName(SERIALIZED_NAME_WEBHOOK)
  private Integer webhook;

  public static final String SERIALIZED_NAME_PARTNER = "partner";
  @SerializedName(SERIALIZED_NAME_PARTNER)
  private Integer partner;

  public static final String SERIALIZED_NAME_BILLING = "billing";
  @SerializedName(SERIALIZED_NAME_BILLING)
  private Integer billing;

  public PatchRoleRequest() {
  }

  public PatchRoleRequest roleName(String roleName) {
    
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


  public PatchRoleRequest device(Integer device) {
    
    this.device = device;
    return this;
  }

   /**
   * Get device
   * @return device
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDevice() {
    return device;
  }


  public void setDevice(Integer device) {
    this.device = device;
  }


  public PatchRoleRequest organisation(Integer organisation) {
    
    this.organisation = organisation;
    return this;
  }

   /**
   * Get organisation
   * @return organisation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getOrganisation() {
    return organisation;
  }


  public void setOrganisation(Integer organisation) {
    this.organisation = organisation;
  }


  public PatchRoleRequest follow(Integer follow) {
    
    this.follow = follow;
    return this;
  }

   /**
   * Get follow
   * @return follow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getFollow() {
    return follow;
  }


  public void setFollow(Integer follow) {
    this.follow = follow;
  }


  public PatchRoleRequest rule(Integer rule) {
    
    this.rule = rule;
    return this;
  }

   /**
   * Get rule
   * @return rule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRule() {
    return rule;
  }


  public void setRule(Integer rule) {
    this.rule = rule;
  }


  public PatchRoleRequest schedule(Integer schedule) {
    
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSchedule() {
    return schedule;
  }


  public void setSchedule(Integer schedule) {
    this.schedule = schedule;
  }


  public PatchRoleRequest user(Integer user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getUser() {
    return user;
  }


  public void setUser(Integer user) {
    this.user = user;
  }


  public PatchRoleRequest webhook(Integer webhook) {
    
    this.webhook = webhook;
    return this;
  }

   /**
   * Get webhook
   * @return webhook
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getWebhook() {
    return webhook;
  }


  public void setWebhook(Integer webhook) {
    this.webhook = webhook;
  }


  public PatchRoleRequest partner(Integer partner) {
    
    this.partner = partner;
    return this;
  }

   /**
   * Get partner
   * @return partner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPartner() {
    return partner;
  }


  public void setPartner(Integer partner) {
    this.partner = partner;
  }


  public PatchRoleRequest billing(Integer billing) {
    
    this.billing = billing;
    return this;
  }

   /**
   * Get billing
   * @return billing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getBilling() {
    return billing;
  }


  public void setBilling(Integer billing) {
    this.billing = billing;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchRoleRequest patchRoleRequest = (PatchRoleRequest) o;
    return Objects.equals(this.roleName, patchRoleRequest.roleName) &&
        Objects.equals(this.device, patchRoleRequest.device) &&
        Objects.equals(this.organisation, patchRoleRequest.organisation) &&
        Objects.equals(this.follow, patchRoleRequest.follow) &&
        Objects.equals(this.rule, patchRoleRequest.rule) &&
        Objects.equals(this.schedule, patchRoleRequest.schedule) &&
        Objects.equals(this.user, patchRoleRequest.user) &&
        Objects.equals(this.webhook, patchRoleRequest.webhook) &&
        Objects.equals(this.partner, patchRoleRequest.partner) &&
        Objects.equals(this.billing, patchRoleRequest.billing);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleName, device, organisation, follow, rule, schedule, user, webhook, partner, billing);
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
    sb.append("class PatchRoleRequest {\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    organisation: ").append(toIndentedString(organisation)).append("\n");
    sb.append("    follow: ").append(toIndentedString(follow)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
    sb.append("    partner: ").append(toIndentedString(partner)).append("\n");
    sb.append("    billing: ").append(toIndentedString(billing)).append("\n");
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
    openapiFields.add("roleName");
    openapiFields.add("device");
    openapiFields.add("organisation");
    openapiFields.add("follow");
    openapiFields.add("rule");
    openapiFields.add("schedule");
    openapiFields.add("user");
    openapiFields.add("webhook");
    openapiFields.add("partner");
    openapiFields.add("billing");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PatchRoleRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PatchRoleRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PatchRoleRequest is not found in the empty JSON string", PatchRoleRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PatchRoleRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PatchRoleRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("roleName") != null && !jsonObj.get("roleName").isJsonNull()) && !jsonObj.get("roleName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `roleName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("roleName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PatchRoleRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PatchRoleRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PatchRoleRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PatchRoleRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PatchRoleRequest>() {
           @Override
           public void write(JsonWriter out, PatchRoleRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PatchRoleRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PatchRoleRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PatchRoleRequest
  * @throws IOException if the JSON string is invalid with respect to PatchRoleRequest
  */
  public static PatchRoleRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PatchRoleRequest.class);
  }

 /**
  * Convert an instance of PatchRoleRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

