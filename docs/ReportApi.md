# ReportApi

All URIs are relative to *https://api.fingoti.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getReportIdCommands**](ReportApi.md#getReportIdCommands) | **GET** /v1/report/{id}/commands | Retrieve command log |
| [**getReportUsage**](ReportApi.md#getReportUsage) | **GET** /v1/report/usage | Retrieve property usage statistics per day per device |


<a name="getReportIdCommands"></a>
# **getReportIdCommands**
> CommandLogResponse getReportIdCommands(id, start, end, direction)

Retrieve command log

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.ReportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ReportApi apiInstance = new ReportApi(defaultClient);
    String id = "id_example"; // String | 
    String start = "start_example"; // String | 
    String end = "end_example"; // String | 
    CommandDirection direction = CommandDirection.fromValue("0"); // CommandDirection | 
    try {
      CommandLogResponse result = apiInstance.getReportIdCommands(id, start, end, direction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportApi#getReportIdCommands");
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
| **start** | **String**|  | [optional] |
| **end** | **String**|  | [optional] |
| **direction** | [**CommandDirection**](.md)|  | [optional] [enum: 0, 1] |

### Return type

[**CommandLogResponse**](CommandLogResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getReportUsage"></a>
# **getReportUsage**
> UsageTrackingResponse getReportUsage(start, end)

Retrieve property usage statistics per day per device

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.ReportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    ReportApi apiInstance = new ReportApi(defaultClient);
    String start = "start_example"; // String | 
    String end = "end_example"; // String | 
    try {
      UsageTrackingResponse result = apiInstance.getReportUsage(start, end);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportApi#getReportUsage");
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
| **start** | **String**|  | [optional] |
| **end** | **String**|  | [optional] |

### Return type

[**UsageTrackingResponse**](UsageTrackingResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

