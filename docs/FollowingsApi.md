# FollowingsApi

All URIs are relative to *https://api.fingoti.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteFollowingsId**](FollowingsApi.md#deleteFollowingsId) | **DELETE** /v1/followings/{id} | Delete a Pin Following. This is not recoverable. |
| [**getFollowings**](FollowingsApi.md#getFollowings) | **GET** /v1/followings | Get all pin followings. |
| [**getFollowingsId**](FollowingsApi.md#getFollowingsId) | **GET** /v1/followings/{id} | Get specified pin following. |
| [**patchFollowingsId**](FollowingsApi.md#patchFollowingsId) | **PATCH** /v1/followings/{id} | Update pin following. |
| [**postFollowings**](FollowingsApi.md#postFollowings) | **POST** /v1/followings | Create a new pin following. |


<a name="deleteFollowingsId"></a>
# **deleteFollowingsId**
> ModelDefault deleteFollowingsId(id)

Delete a Pin Following. This is not recoverable.

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.FollowingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    FollowingsApi apiInstance = new FollowingsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      ModelDefault result = apiInstance.deleteFollowingsId(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FollowingsApi#deleteFollowingsId");
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
| **404** | Not Found |  -  |

<a name="getFollowings"></a>
# **getFollowings**
> OrganisationFollowingResponse getFollowings(pageNumber, itemsPerPage, followName, source, destination)

Get all pin followings.

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.FollowingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    FollowingsApi apiInstance = new FollowingsApi(defaultClient);
    Integer pageNumber = 56; // Integer | 
    Integer itemsPerPage = 56; // Integer | 
    String followName = "followName_example"; // String | 
    String source = "source_example"; // String | 
    String destination = "destination_example"; // String | 
    try {
      OrganisationFollowingResponse result = apiInstance.getFollowings(pageNumber, itemsPerPage, followName, source, destination);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FollowingsApi#getFollowings");
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
| **followName** | **String**|  | [optional] |
| **source** | **String**|  | [optional] |
| **destination** | **String**|  | [optional] |

### Return type

[**OrganisationFollowingResponse**](OrganisationFollowingResponse.md)

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

<a name="getFollowingsId"></a>
# **getFollowingsId**
> OrganisationFollowingResponse getFollowingsId(id)

Get specified pin following.

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.FollowingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    FollowingsApi apiInstance = new FollowingsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      OrganisationFollowingResponse result = apiInstance.getFollowingsId(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FollowingsApi#getFollowingsId");
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

[**OrganisationFollowingResponse**](OrganisationFollowingResponse.md)

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

<a name="patchFollowingsId"></a>
# **patchFollowingsId**
> ModelDefault patchFollowingsId(id, patchFollowRequest)

Update pin following.

Fields that do not require updating can be omitted

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.FollowingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    FollowingsApi apiInstance = new FollowingsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    PatchFollowRequest patchFollowRequest = new PatchFollowRequest(); // PatchFollowRequest | 
    try {
      ModelDefault result = apiInstance.patchFollowingsId(id, patchFollowRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FollowingsApi#patchFollowingsId");
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
| **patchFollowRequest** | [**PatchFollowRequest**](PatchFollowRequest.md)|  | [optional] |

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

<a name="postFollowings"></a>
# **postFollowings**
> DefaultWithId postFollowings(addFollowDto)

Create a new pin following.

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.FollowingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    FollowingsApi apiInstance = new FollowingsApi(defaultClient);
    AddFollowDto addFollowDto = new AddFollowDto(); // AddFollowDto | 
    try {
      DefaultWithId result = apiInstance.postFollowings(addFollowDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FollowingsApi#postFollowings");
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
| **addFollowDto** | [**AddFollowDto**](AddFollowDto.md)|  | [optional] |

### Return type

[**DefaultWithId**](DefaultWithId.md)

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

