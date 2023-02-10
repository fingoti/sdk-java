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
import com.fingoti.sdk.models.WebhookAttempts;
import com.fingoti.sdk.models.WebhookHeaders;
import com.fingoti.sdk.models.WebhookStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
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
 * CallLogDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-16T16:45:33.786096900Z[Europe/London]")
public class CallLogDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_WEBHOOK_ID = "webhookId";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_ID)
  private UUID webhookId;

  public static final String SERIALIZED_NAME_WEBHOOK_NUMBER = "webhookNumber";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_NUMBER)
  private String webhookNumber;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private WebhookStatus status;

  public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public static final String SERIALIZED_NAME_REQUEST_URL = "requestUrl";
  @SerializedName(SERIALIZED_NAME_REQUEST_URL)
  private String requestUrl;

  public static final String SERIALIZED_NAME_REQUEST_HEADERS = "requestHeaders";
  @SerializedName(SERIALIZED_NAME_REQUEST_HEADERS)
  private List<WebhookHeaders> requestHeaders = null;

  public static final String SERIALIZED_NAME_REQUEST_BODY = "requestBody";
  @SerializedName(SERIALIZED_NAME_REQUEST_BODY)
  private Object requestBody = null;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public static final String SERIALIZED_NAME_ATTEMPTS = "attempts";
  @SerializedName(SERIALIZED_NAME_ATTEMPTS)
  private List<WebhookAttempts> attempts = null;

  public CallLogDto() {
  }

  
  public CallLogDto(
     Integer count
  ) {
    this();
    this.count = count;
  }

  public CallLogDto id(UUID id) {
    
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


  public CallLogDto webhookId(UUID webhookId) {
    
    this.webhookId = webhookId;
    return this;
  }

   /**
   * Get webhookId
   * @return webhookId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getWebhookId() {
    return webhookId;
  }


  public void setWebhookId(UUID webhookId) {
    this.webhookId = webhookId;
  }


  public CallLogDto webhookNumber(String webhookNumber) {
    
    this.webhookNumber = webhookNumber;
    return this;
  }

   /**
   * Get webhookNumber
   * @return webhookNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWebhookNumber() {
    return webhookNumber;
  }


  public void setWebhookNumber(String webhookNumber) {
    this.webhookNumber = webhookNumber;
  }


  public CallLogDto status(WebhookStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WebhookStatus getStatus() {
    return status;
  }


  public void setStatus(WebhookStatus status) {
    this.status = status;
  }


  public CallLogDto timestamp(OffsetDateTime timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  public CallLogDto requestUrl(String requestUrl) {
    
    this.requestUrl = requestUrl;
    return this;
  }

   /**
   * Get requestUrl
   * @return requestUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRequestUrl() {
    return requestUrl;
  }


  public void setRequestUrl(String requestUrl) {
    this.requestUrl = requestUrl;
  }


  public CallLogDto requestHeaders(List<WebhookHeaders> requestHeaders) {
    
    this.requestHeaders = requestHeaders;
    return this;
  }

  public CallLogDto addRequestHeadersItem(WebhookHeaders requestHeadersItem) {
    if (this.requestHeaders == null) {
      this.requestHeaders = new ArrayList<>();
    }
    this.requestHeaders.add(requestHeadersItem);
    return this;
  }

   /**
   * Get requestHeaders
   * @return requestHeaders
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<WebhookHeaders> getRequestHeaders() {
    return requestHeaders;
  }


  public void setRequestHeaders(List<WebhookHeaders> requestHeaders) {
    this.requestHeaders = requestHeaders;
  }


  public CallLogDto requestBody(Object requestBody) {
    
    this.requestBody = requestBody;
    return this;
  }

   /**
   * Get requestBody
   * @return requestBody
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getRequestBody() {
    return requestBody;
  }


  public void setRequestBody(Object requestBody) {
    this.requestBody = requestBody;
  }


   /**
   * Get count
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCount() {
    return count;
  }




  public CallLogDto attempts(List<WebhookAttempts> attempts) {
    
    this.attempts = attempts;
    return this;
  }

  public CallLogDto addAttemptsItem(WebhookAttempts attemptsItem) {
    if (this.attempts == null) {
      this.attempts = new ArrayList<>();
    }
    this.attempts.add(attemptsItem);
    return this;
  }

   /**
   * Get attempts
   * @return attempts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<WebhookAttempts> getAttempts() {
    return attempts;
  }


  public void setAttempts(List<WebhookAttempts> attempts) {
    this.attempts = attempts;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallLogDto callLogDto = (CallLogDto) o;
    return Objects.equals(this.id, callLogDto.id) &&
        Objects.equals(this.webhookId, callLogDto.webhookId) &&
        Objects.equals(this.webhookNumber, callLogDto.webhookNumber) &&
        Objects.equals(this.status, callLogDto.status) &&
        Objects.equals(this.timestamp, callLogDto.timestamp) &&
        Objects.equals(this.requestUrl, callLogDto.requestUrl) &&
        Objects.equals(this.requestHeaders, callLogDto.requestHeaders) &&
        Objects.equals(this.requestBody, callLogDto.requestBody) &&
        Objects.equals(this.count, callLogDto.count) &&
        Objects.equals(this.attempts, callLogDto.attempts);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, webhookId, webhookNumber, status, timestamp, requestUrl, requestHeaders, requestBody, count, attempts);
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
    sb.append("class CallLogDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    webhookId: ").append(toIndentedString(webhookId)).append("\n");
    sb.append("    webhookNumber: ").append(toIndentedString(webhookNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    requestUrl: ").append(toIndentedString(requestUrl)).append("\n");
    sb.append("    requestHeaders: ").append(toIndentedString(requestHeaders)).append("\n");
    sb.append("    requestBody: ").append(toIndentedString(requestBody)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    attempts: ").append(toIndentedString(attempts)).append("\n");
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
    openapiFields.add("webhookId");
    openapiFields.add("webhookNumber");
    openapiFields.add("status");
    openapiFields.add("timestamp");
    openapiFields.add("requestUrl");
    openapiFields.add("requestHeaders");
    openapiFields.add("requestBody");
    openapiFields.add("count");
    openapiFields.add("attempts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CallLogDto
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CallLogDto.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CallLogDto is not found in the empty JSON string", CallLogDto.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CallLogDto.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CallLogDto` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("webhookId") != null && !jsonObj.get("webhookId").isJsonNull()) && !jsonObj.get("webhookId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `webhookId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("webhookId").toString()));
      }
      if ((jsonObj.get("webhookNumber") != null && !jsonObj.get("webhookNumber").isJsonNull()) && !jsonObj.get("webhookNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `webhookNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("webhookNumber").toString()));
      }
      if ((jsonObj.get("requestUrl") != null && !jsonObj.get("requestUrl").isJsonNull()) && !jsonObj.get("requestUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestUrl").toString()));
      }
      if (jsonObj.get("requestHeaders") != null && !jsonObj.get("requestHeaders").isJsonNull()) {
        JsonArray jsonArrayrequestHeaders = jsonObj.getAsJsonArray("requestHeaders");
        if (jsonArrayrequestHeaders != null) {
          // ensure the json data is an array
          if (!jsonObj.get("requestHeaders").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `requestHeaders` to be an array in the JSON string but got `%s`", jsonObj.get("requestHeaders").toString()));
          }

          // validate the optional field `requestHeaders` (array)
          for (int i = 0; i < jsonArrayrequestHeaders.size(); i++) {
            WebhookHeaders.validateJsonObject(jsonArrayrequestHeaders.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("attempts") != null && !jsonObj.get("attempts").isJsonNull()) {
        JsonArray jsonArrayattempts = jsonObj.getAsJsonArray("attempts");
        if (jsonArrayattempts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("attempts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `attempts` to be an array in the JSON string but got `%s`", jsonObj.get("attempts").toString()));
          }

          // validate the optional field `attempts` (array)
          for (int i = 0; i < jsonArrayattempts.size(); i++) {
            WebhookAttempts.validateJsonObject(jsonArrayattempts.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CallLogDto.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CallLogDto' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CallLogDto> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CallLogDto.class));

       return (TypeAdapter<T>) new TypeAdapter<CallLogDto>() {
           @Override
           public void write(JsonWriter out, CallLogDto value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CallLogDto read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CallLogDto given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CallLogDto
  * @throws IOException if the JSON string is invalid with respect to CallLogDto
  */
  public static CallLogDto fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CallLogDto.class);
  }

 /**
  * Convert an instance of CallLogDto to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

