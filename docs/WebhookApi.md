# WebhookApi

All URIs are relative to *https://api.fingoti.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteWebhookId**](WebhookApi.md#deleteWebhookId) | **DELETE** /v1/webhook/{id} | Delete a Webhook. This is not recoverable. |
| [**getWebhook**](WebhookApi.md#getWebhook) | **GET** /v1/webhook | Get all registered webhooks. |
| [**getWebhookId**](WebhookApi.md#getWebhookId) | **GET** /v1/webhook/{id} | Get specified webhook. |
| [**getWebhookLogs**](WebhookApi.md#getWebhookLogs) | **GET** /v1/webhook/logs | Get all registered webhooks with call logs. |
| [**patchWebhookId**](WebhookApi.md#patchWebhookId) | **PATCH** /v1/webhook/{id} | Update Fingoti webhook. |
| [**postWebhook**](WebhookApi.md#postWebhook) | **POST** /v1/webhook | Register a new webhook. |
| [**postWebhookRetry**](WebhookApi.md#postWebhookRetry) | **POST** /v1/webhook/retry | Retry a webhook. |


<a name="deleteWebhookId"></a>
# **deleteWebhookId**
> ModelDefault deleteWebhookId(id)

Delete a Webhook. This is not recoverable.

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.WebhookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    WebhookApi apiInstance = new WebhookApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      ModelDefault result = apiInstance.deleteWebhookId(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#deleteWebhookId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |

### Return type

[**ModelDefault**](ModelDefault.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getWebhook"></a>
# **getWebhook**
> EngineWebhooksResponse getWebhook(pageNumber, itemsPerPage, webhookNumber, property)

Get all registered webhooks.

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.WebhookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    WebhookApi apiInstance = new WebhookApi(defaultClient);
    Integer pageNumber = 56; // Integer | 
    Integer itemsPerPage = 56; // Integer | 
    String webhookNumber = "webhookNumber_example"; // String | 
    String property = "property_example"; // String | 
    try {
      EngineWebhooksResponse result = apiInstance.getWebhook(pageNumber, itemsPerPage, webhookNumber, property);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#getWebhook");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageNumber** | **Integer**|  | [optional] |
| **itemsPerPage** | **Integer**|  | [optional] |
| **webhookNumber** | **String**|  | [optional] |
| **property** | **String**|  | [optional] |

### Return type

[**EngineWebhooksResponse**](EngineWebhooksResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |

<a name="getWebhookId"></a>
# **getWebhookId**
> EngineWebhookResponse getWebhookId(id, pageNumber, itemsPerPage, status)

Get specified webhook.

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.WebhookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    WebhookApi apiInstance = new WebhookApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    Integer pageNumber = 56; // Integer | 
    Integer itemsPerPage = 56; // Integer | 
    List<Integer> status = Arrays.asList(); // List<Integer> | 
    try {
      EngineWebhookResponse result = apiInstance.getWebhookId(id, pageNumber, itemsPerPage, status);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#getWebhookId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **pageNumber** | **Integer**|  | [optional] |
| **itemsPerPage** | **Integer**|  | [optional] |
| **status** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |

### Return type

[**EngineWebhookResponse**](EngineWebhookResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Not Found |  -  |

<a name="getWebhookLogs"></a>
# **getWebhookLogs**
> WebhookLogsResponse getWebhookLogs(pageNumber, itemsPerPage, status, webhookNumber)

Get all registered webhooks with call logs.

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.WebhookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    WebhookApi apiInstance = new WebhookApi(defaultClient);
    Integer pageNumber = 56; // Integer | 
    Integer itemsPerPage = 56; // Integer | 
    List<Integer> status = Arrays.asList(); // List<Integer> | 
    String webhookNumber = "webhookNumber_example"; // String | 
    try {
      WebhookLogsResponse result = apiInstance.getWebhookLogs(pageNumber, itemsPerPage, status, webhookNumber);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#getWebhookLogs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageNumber** | **Integer**|  | [optional] |
| **itemsPerPage** | **Integer**|  | [optional] |
| **status** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |
| **webhookNumber** | **String**|  | [optional] |

### Return type

[**WebhookLogsResponse**](WebhookLogsResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |

<a name="patchWebhookId"></a>
# **patchWebhookId**
> ModelDefault patchWebhookId(id, patchWebhookRequest)

Update Fingoti webhook.

Fields that do not require updating can be omitted

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.WebhookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    WebhookApi apiInstance = new WebhookApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    PatchWebhookRequest patchWebhookRequest = new PatchWebhookRequest(); // PatchWebhookRequest | 
    try {
      ModelDefault result = apiInstance.patchWebhookId(id, patchWebhookRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#patchWebhookId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**|  | |
| **patchWebhookRequest** | [**PatchWebhookRequest**](PatchWebhookRequest.md)|  | [optional] |

### Return type

[**ModelDefault**](ModelDefault.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |

<a name="postWebhook"></a>
# **postWebhook**
> AddWebhookResult postWebhook(addWebhookDto)

Register a new webhook.

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.WebhookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    WebhookApi apiInstance = new WebhookApi(defaultClient);
    AddWebhookDto addWebhookDto = new AddWebhookDto(); // AddWebhookDto | 
    try {
      AddWebhookResult result = apiInstance.postWebhook(addWebhookDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#postWebhook");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **addWebhookDto** | [**AddWebhookDto**](AddWebhookDto.md)|  | [optional] |

### Return type

[**AddWebhookResult**](AddWebhookResult.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |

<a name="postWebhookRetry"></a>
# **postWebhookRetry**
> ModelDefault postWebhookRetry(webhookRetryRequest)

Retry a webhook.

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.WebhookApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    WebhookApi apiInstance = new WebhookApi(defaultClient);
    WebhookRetryRequest webhookRetryRequest = new WebhookRetryRequest(); // WebhookRetryRequest | 
    try {
      ModelDefault result = apiInstance.postWebhookRetry(webhookRetryRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebhookApi#postWebhookRetry");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **webhookRetryRequest** | [**WebhookRetryRequest**](WebhookRetryRequest.md)|  | [optional] |

### Return type

[**ModelDefault**](ModelDefault.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Not Found |  -  |

