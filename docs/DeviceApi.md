# DeviceApi

All URIs are relative to *https://api.fingoti.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteDeviceId**](DeviceApi.md#deleteDeviceId) | **DELETE** /v1/device/{id} | Unclaim a Fingoti device. |
| [**getDevice**](DeviceApi.md#getDevice) | **GET** /v1/device | Get all devices. |
| [**getDeviceId**](DeviceApi.md#getDeviceId) | **GET** /v1/device/{id} | Get specified device. |
| [**getDeviceIdNodes**](DeviceApi.md#getDeviceIdNodes) | **GET** /v1/device/{id}/nodes | Get all nodes latched to a gateway. |
| [**patchDeviceId**](DeviceApi.md#patchDeviceId) | **PATCH** /v1/device/{id} | Update your Fingoti device. |
| [**postDevice**](DeviceApi.md#postDevice) | **POST** /v1/device | Claim a new Fingoti device. |
| [**postDeviceSendrequest**](DeviceApi.md#postDeviceSendrequest) | **POST** /v1/device/sendrequest | Send a request to a Fingoti device. |
| [**postDeviceUpdate**](DeviceApi.md#postDeviceUpdate) | **POST** /v1/device/update | Initiate a device update. |


<a name="deleteDeviceId"></a>
# **deleteDeviceId**
> UpdateResponse deleteDeviceId(id)

Unclaim a Fingoti device.

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.DeviceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DeviceApi apiInstance = new DeviceApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      UpdateResponse result = apiInstance.deleteDeviceId(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#deleteDeviceId");
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
| **id** | **String**|  | |

### Return type

[**UpdateResponse**](UpdateResponse.md)

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

<a name="getDevice"></a>
# **getDevice**
> ClaimedDevicesDto getDevice(lastUpdated)

Get all devices.

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.DeviceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DeviceApi apiInstance = new DeviceApi(defaultClient);
    OffsetDateTime lastUpdated = OffsetDateTime.now(); // OffsetDateTime | 
    try {
      ClaimedDevicesDto result = apiInstance.getDevice(lastUpdated);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#getDevice");
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
| **lastUpdated** | **OffsetDateTime**|  | [optional] |

### Return type

[**ClaimedDevicesDto**](ClaimedDevicesDto.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getDeviceId"></a>
# **getDeviceId**
> ClaimedDeviceResponse getDeviceId(id)

Get specified device.

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.DeviceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DeviceApi apiInstance = new DeviceApi(defaultClient);
    String id = "id_example"; // String | Device ID to query.
    try {
      ClaimedDeviceResponse result = apiInstance.getDeviceId(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#getDeviceId");
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
| **id** | **String**| Device ID to query. | |

### Return type

[**ClaimedDeviceResponse**](ClaimedDeviceResponse.md)

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
| **403** | Forbidden |  -  |

<a name="getDeviceIdNodes"></a>
# **getDeviceIdNodes**
> DeviceNodesResponse getDeviceIdNodes(id)

Get all nodes latched to a gateway.

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.DeviceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DeviceApi apiInstance = new DeviceApi(defaultClient);
    String id = "id_example"; // String | Device ID to query.
    try {
      DeviceNodesResponse result = apiInstance.getDeviceIdNodes(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#getDeviceIdNodes");
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
| **id** | **String**| Device ID to query. | |

### Return type

[**DeviceNodesResponse**](DeviceNodesResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="patchDeviceId"></a>
# **patchDeviceId**
> ModelDefault patchDeviceId(id, patchGateway)

Update your Fingoti device.

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.DeviceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DeviceApi apiInstance = new DeviceApi(defaultClient);
    String id = "id_example"; // String | 
    PatchGateway patchGateway = new PatchGateway(); // PatchGateway | 
    try {
      ModelDefault result = apiInstance.patchDeviceId(id, patchGateway);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#patchDeviceId");
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
| **id** | **String**|  | |
| **patchGateway** | [**PatchGateway**](PatchGateway.md)|  | [optional] |

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
| **403** | Forbidden |  -  |

<a name="postDevice"></a>
# **postDevice**
> ClaimResult postDevice(claimRequest)

Claim a new Fingoti device.

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.DeviceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DeviceApi apiInstance = new DeviceApi(defaultClient);
    ClaimRequest claimRequest = new ClaimRequest(); // ClaimRequest | The claim object.
    try {
      ClaimResult result = apiInstance.postDevice(claimRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#postDevice");
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
| **claimRequest** | [**ClaimRequest**](ClaimRequest.md)| The claim object. | [optional] |

### Return type

[**ClaimResult**](ClaimResult.md)

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

<a name="postDeviceSendrequest"></a>
# **postDeviceSendrequest**
> MqttDeviceResponse postDeviceSendrequest(deviceRequest)

Send a request to a Fingoti device.

The payload object varies depending on the property used, please refer to our protocol documentation &lt;a href&#x3D;\&quot;https://help.fingoti.com\&quot;&gt;here&lt;/a&gt; for more infomation. &lt;br /&gt;   Multiple objects can be sent in the request array and will be executed in order.

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.DeviceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DeviceApi apiInstance = new DeviceApi(defaultClient);
    DeviceRequest deviceRequest = new DeviceRequest(); // DeviceRequest | The command object.
    try {
      MqttDeviceResponse result = apiInstance.postDeviceSendrequest(deviceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#postDeviceSendrequest");
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
| **deviceRequest** | [**DeviceRequest**](DeviceRequest.md)| The command object. | [optional] |

### Return type

[**MqttDeviceResponse**](MqttDeviceResponse.md)

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
| **403** | Forbidden |  -  |

<a name="postDeviceUpdate"></a>
# **postDeviceUpdate**
> MqttDeviceResponse postDeviceUpdate(updateRequest)

Initiate a device update.

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.DeviceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    DeviceApi apiInstance = new DeviceApi(defaultClient);
    UpdateRequest updateRequest = new UpdateRequest(); // UpdateRequest | 
    try {
      MqttDeviceResponse result = apiInstance.postDeviceUpdate(updateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeviceApi#postDeviceUpdate");
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
| **updateRequest** | [**UpdateRequest**](UpdateRequest.md)|  | [optional] |

### Return type

[**MqttDeviceResponse**](MqttDeviceResponse.md)

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

