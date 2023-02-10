# OrganisationApi

All URIs are relative to *https://api.fingoti.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteOrganisationAddressesId**](OrganisationApi.md#deleteOrganisationAddressesId) | **DELETE** /v1/organisation/addresses/{id} | Delete an address. This is not recoverable. |
| [**deleteOrganisationPresetsId**](OrganisationApi.md#deleteOrganisationPresetsId) | **DELETE** /v1/organisation/presets/{id} | Delete specified preset. |
| [**deleteOrganisationRolesId**](OrganisationApi.md#deleteOrganisationRolesId) | **DELETE** /v1/organisation/roles/{id} | Delete a role. Role must not be assigned to any users. This is not recoverable. |
| [**deleteOrganisationTokensId**](OrganisationApi.md#deleteOrganisationTokensId) | **DELETE** /v1/organisation/tokens/{id} | Delete a Token. Token will no longer authenticate API requests. This is not recoverable. |
| [**deleteOrganisationUsersId**](OrganisationApi.md#deleteOrganisationUsersId) | **DELETE** /v1/organisation/users/{id} | Remove a user from the organisation. |
| [**getOrganisation**](OrganisationApi.md#getOrganisation) | **GET** /v1/organisation | Get your Fingoti organisaiton information. |
| [**getOrganisationAddresses**](OrganisationApi.md#getOrganisationAddresses) | **GET** /v1/organisation/addresses | Get all addresses. |
| [**getOrganisationAddressesId**](OrganisationApi.md#getOrganisationAddressesId) | **GET** /v1/organisation/addresses/{id} | Get specified address. |
| [**getOrganisationPartner**](OrganisationApi.md#getOrganisationPartner) | **GET** /v1/organisation/partner | Get partner information. |
| [**getOrganisationPresets**](OrganisationApi.md#getOrganisationPresets) | **GET** /v1/organisation/presets | Get all presets. |
| [**getOrganisationPresetsId**](OrganisationApi.md#getOrganisationPresetsId) | **GET** /v1/organisation/presets/{id} | Get specified preset. |
| [**getOrganisationRoles**](OrganisationApi.md#getOrganisationRoles) | **GET** /v1/organisation/roles | Get all roles. |
| [**getOrganisationRolesId**](OrganisationApi.md#getOrganisationRolesId) | **GET** /v1/organisation/roles/{id} | Get specified role. |
| [**getOrganisationTenants**](OrganisationApi.md#getOrganisationTenants) | **GET** /v1/organisation/tenants | Get all tenants. |
| [**getOrganisationTokens**](OrganisationApi.md#getOrganisationTokens) | **GET** /v1/organisation/tokens | Get all API tokens. |
| [**getOrganisationTokensId**](OrganisationApi.md#getOrganisationTokensId) | **GET** /v1/organisation/tokens/{id} | Get specified token. |
| [**getOrganisationUsers**](OrganisationApi.md#getOrganisationUsers) | **GET** /v1/organisation/users | Get all users. |
| [**getOrganisationUsersId**](OrganisationApi.md#getOrganisationUsersId) | **GET** /v1/organisation/users/{id} | Get specidfied user. |
| [**patchOrganisation**](OrganisationApi.md#patchOrganisation) | **PATCH** /v1/organisation | Update your Fingoti organisation. |
| [**patchOrganisationAddressesId**](OrganisationApi.md#patchOrganisationAddressesId) | **PATCH** /v1/organisation/addresses/{id} | Update organisation address. |
| [**patchOrganisationPresetsId**](OrganisationApi.md#patchOrganisationPresetsId) | **PATCH** /v1/organisation/presets/{id} | Update organisation preset. |
| [**patchOrganisationRolesId**](OrganisationApi.md#patchOrganisationRolesId) | **PATCH** /v1/organisation/roles/{id} | Update organisation role. |
| [**patchOrganisationTokensId**](OrganisationApi.md#patchOrganisationTokensId) | **PATCH** /v1/organisation/tokens/{id} | Update API token. |
| [**patchOrganisationUsersId**](OrganisationApi.md#patchOrganisationUsersId) | **PATCH** /v1/organisation/users/{id} | Update organisation user. |
| [**postOrganisation**](OrganisationApi.md#postOrganisation) | **POST** /v1/organisation | Register a new Fingoti organisation. |
| [**postOrganisationAddresses**](OrganisationApi.md#postOrganisationAddresses) | **POST** /v1/organisation/addresses | Create a new address. |
| [**postOrganisationPresets**](OrganisationApi.md#postOrganisationPresets) | **POST** /v1/organisation/presets | Create a new preset. |
| [**postOrganisationRoles**](OrganisationApi.md#postOrganisationRoles) | **POST** /v1/organisation/roles | Create a new role. |
| [**postOrganisationTenants**](OrganisationApi.md#postOrganisationTenants) | **POST** /v1/organisation/tenants | Create new tenant. This is only available to partner organisations. |
| [**postOrganisationTokens**](OrganisationApi.md#postOrganisationTokens) | **POST** /v1/organisation/tokens | Generate new API token. |
| [**postOrganisationUsers**](OrganisationApi.md#postOrganisationUsers) | **POST** /v1/organisation/users | Invite a new user to the organisation. |


<a name="deleteOrganisationAddressesId"></a>
# **deleteOrganisationAddressesId**
> ModelDefault deleteOrganisationAddressesId(id)

Delete an address. This is not recoverable.

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.OrganisationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    OrganisationApi apiInstance = new OrganisationApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      ModelDefault result = apiInstance.deleteOrganisationAddressesId(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganisationApi#deleteOrganisationAddressesId");
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
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |

<a name="deleteOrganisationPresetsId"></a>
# **deleteOrganisationPresetsId**
> ModelDefault deleteOrganisationPresetsId(id)

Delete specified preset.

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.OrganisationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    OrganisationApi apiInstance = new OrganisationApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      ModelDefault result = apiInstance.deleteOrganisationPresetsId(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganisationApi#deleteOrganisationPresetsId");
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
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |

<a name="deleteOrganisationRolesId"></a>
# **deleteOrganisationRolesId**
> ModelDefault deleteOrganisationRolesId(id)

Delete a role. Role must not be assigned to any users. This is not recoverable.

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.OrganisationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    OrganisationApi apiInstance = new OrganisationApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Role ID to delete
    try {
      ModelDefault result = apiInstance.deleteOrganisationRolesId(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganisationApi#deleteOrganisationRolesId");
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
| **id** | **UUID**| Role ID to delete | |

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
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |

<a name="deleteOrganisationTokensId"></a>
# **deleteOrganisationTokensId**
> ModelDefault deleteOrganisationTokensId(id)

Delete a Token. Token will no longer authenticate API requests. This is not recoverable.

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.OrganisationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    OrganisationApi apiInstance = new OrganisationApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      ModelDefault result = apiInstance.deleteOrganisationTokensId(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganisationApi#deleteOrganisationTokensId");
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
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |

<a name="deleteOrganisationUsersId"></a>
# **deleteOrganisationUsersId**
> ModelDefault deleteOrganisationUsersId(id)

Remove a user from the organisation.

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.OrganisationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    OrganisationApi apiInstance = new OrganisationApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      ModelDefault result = apiInstance.deleteOrganisationUsersId(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganisationApi#deleteOrganisationUsersId");
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
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |

<a name="getOrganisation"></a>
# **getOrganisation**
> OrganisationResponse getOrganisation()

Get your Fingoti organisaiton information.

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.OrganisationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    OrganisationApi apiInstance = new OrganisationApi(defaultClient);
    try {
      OrganisationResponse result = apiInstance.getOrganisation();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganisationApi#getOrganisation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OrganisationResponse**](OrganisationResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getOrganisationAddresses"></a>
# **getOrganisationAddresses**
> OrganisationAddressResponse getOrganisationAddresses(pageNumber, itemsPerPage, address, postcode)

Get all addresses.

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.OrganisationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    OrganisationApi apiInstance = new OrganisationApi(defaultClient);
    Integer pageNumber = 56; // Integer | 
    Integer itemsPerPage = 56; // Integer | 
    String address = "address_example"; // String | 
    String postcode = "postcode_example"; // String | 
    try {
      OrganisationAddressResponse result = apiInstance.getOrganisationAddresses(pageNumber, itemsPerPage, address, postcode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganisationApi#getOrganisationAddresses");
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
| **address** | **String**|  | [optional] |
| **postcode** | **String**|  | [optional] |

### Return type

[**OrganisationAddressResponse**](OrganisationAddressResponse.md)

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

<a name="getOrganisationAddressesId"></a>
# **getOrganisationAddressesId**
> OrganisationAddressResponse getOrganisationAddressesId(id)

Get specified address.

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.OrganisationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    OrganisationApi apiInstance = new OrganisationApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      OrganisationAddressResponse result = apiInstance.getOrganisationAddressesId(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganisationApi#getOrganisationAddressesId");
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

[**OrganisationAddressResponse**](OrganisationAddressResponse.md)

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

<a name="getOrganisationPartner"></a>
# **getOrganisationPartner**
> OrganisationPartnerResponse getOrganisationPartner()

Get partner information.

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.OrganisationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    OrganisationApi apiInstance = new OrganisationApi(defaultClient);
    try {
      OrganisationPartnerResponse result = apiInstance.getOrganisationPartner();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganisationApi#getOrganisationPartner");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OrganisationPartnerResponse**](OrganisationPartnerResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

<a name="getOrganisationPresets"></a>
# **getOrganisationPresets**
> OrganisationPresetResponse getOrganisationPresets(pageNumber, itemsPerPage, presetNumber, presetName)

Get all presets.

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.OrganisationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    OrganisationApi apiInstance = new OrganisationApi(defaultClient);
    Integer pageNumber = 56; // Integer | 
    Integer itemsPerPage = 56; // Integer | 
    String presetNumber = "presetNumber_example"; // String | 
    String presetName = "presetName_example"; // String | 
    try {
      OrganisationPresetResponse result = apiInstance.getOrganisationPresets(pageNumber, itemsPerPage, presetNumber, presetName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganisationApi#getOrganisationPresets");
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
| **presetNumber** | **String**|  | [optional] |
| **presetName** | **String**|  | [optional] |

### Return type

[**OrganisationPresetResponse**](OrganisationPresetResponse.md)

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

<a name="getOrganisationPresetsId"></a>
# **getOrganisationPresetsId**
> OrganisationPresetResponse getOrganisationPresetsId(id)

Get specified preset.

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.OrganisationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    OrganisationApi apiInstance = new OrganisationApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      OrganisationPresetResponse result = apiInstance.getOrganisationPresetsId(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganisationApi#getOrganisationPresetsId");
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

[**OrganisationPresetResponse**](OrganisationPresetResponse.md)

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

<a name="getOrganisationRoles"></a>
# **getOrganisationRoles**
> OrganisationRoleResponse getOrganisationRoles(pageNumber, itemsPerPage, roleName)

Get all roles.

0 &#x3D; None, 1 &#x3D; Read, 2 &#x3D; Write

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.OrganisationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    OrganisationApi apiInstance = new OrganisationApi(defaultClient);
    Integer pageNumber = 56; // Integer | 
    Integer itemsPerPage = 56; // Integer | 
    String roleName = "roleName_example"; // String | 
    try {
      OrganisationRoleResponse result = apiInstance.getOrganisationRoles(pageNumber, itemsPerPage, roleName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganisationApi#getOrganisationRoles");
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
| **roleName** | **String**|  | [optional] |

### Return type

[**OrganisationRoleResponse**](OrganisationRoleResponse.md)

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

<a name="getOrganisationRolesId"></a>
# **getOrganisationRolesId**
> OrganisationRoleResponse getOrganisationRolesId(id)

Get specified role.

0 &#x3D; None, 1 &#x3D; Read, 2 &#x3D; Write

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.OrganisationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    OrganisationApi apiInstance = new OrganisationApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Role ID to get
    try {
      OrganisationRoleResponse result = apiInstance.getOrganisationRolesId(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganisationApi#getOrganisationRolesId");
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
| **id** | **UUID**| Role ID to get | |

### Return type

[**OrganisationRoleResponse**](OrganisationRoleResponse.md)

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

<a name="getOrganisationTenants"></a>
# **getOrganisationTenants**
> OrganisationTenantsResponse getOrganisationTenants(pageNumber, itemsPerPage, organisationNumber, organisationName)

Get all tenants.

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.OrganisationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    OrganisationApi apiInstance = new OrganisationApi(defaultClient);
    Integer pageNumber = 56; // Integer | 
    Integer itemsPerPage = 56; // Integer | 
    String organisationNumber = "organisationNumber_example"; // String | 
    String organisationName = "organisationName_example"; // String | 
    try {
      OrganisationTenantsResponse result = apiInstance.getOrganisationTenants(pageNumber, itemsPerPage, organisationNumber, organisationName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganisationApi#getOrganisationTenants");
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
| **organisationNumber** | **String**|  | [optional] |
| **organisationName** | **String**|  | [optional] |

### Return type

[**OrganisationTenantsResponse**](OrganisationTenantsResponse.md)

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

<a name="getOrganisationTokens"></a>
# **getOrganisationTokens**
> UserTokenResponse getOrganisationTokens(pageNumber, itemsPerPage, tokenName)

Get all API tokens.

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.OrganisationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    OrganisationApi apiInstance = new OrganisationApi(defaultClient);
    Integer pageNumber = 56; // Integer | 
    Integer itemsPerPage = 56; // Integer | 
    String tokenName = "tokenName_example"; // String | 
    try {
      UserTokenResponse result = apiInstance.getOrganisationTokens(pageNumber, itemsPerPage, tokenName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganisationApi#getOrganisationTokens");
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
| **tokenName** | **String**|  | [optional] |

### Return type

[**UserTokenResponse**](UserTokenResponse.md)

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

<a name="getOrganisationTokensId"></a>
# **getOrganisationTokensId**
> UserTokenResponse getOrganisationTokensId(id)

Get specified token.

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.OrganisationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    OrganisationApi apiInstance = new OrganisationApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      UserTokenResponse result = apiInstance.getOrganisationTokensId(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganisationApi#getOrganisationTokensId");
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

[**UserTokenResponse**](UserTokenResponse.md)

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

<a name="getOrganisationUsers"></a>
# **getOrganisationUsers**
> OrganisationUserResponse getOrganisationUsers(pageNumber, itemsPerPage, name, email)

Get all users.

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.OrganisationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    OrganisationApi apiInstance = new OrganisationApi(defaultClient);
    Integer pageNumber = 56; // Integer | 
    Integer itemsPerPage = 56; // Integer | 
    String name = "name_example"; // String | 
    String email = "email_example"; // String | 
    try {
      OrganisationUserResponse result = apiInstance.getOrganisationUsers(pageNumber, itemsPerPage, name, email);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganisationApi#getOrganisationUsers");
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
| **name** | **String**|  | [optional] |
| **email** | **String**|  | [optional] |

### Return type

[**OrganisationUserResponse**](OrganisationUserResponse.md)

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

<a name="getOrganisationUsersId"></a>
# **getOrganisationUsersId**
> OrganisationUserResponse getOrganisationUsersId(id)

Get specidfied user.

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.OrganisationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    OrganisationApi apiInstance = new OrganisationApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      OrganisationUserResponse result = apiInstance.getOrganisationUsersId(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganisationApi#getOrganisationUsersId");
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

[**OrganisationUserResponse**](OrganisationUserResponse.md)

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

<a name="patchOrganisation"></a>
# **patchOrganisation**
> ModelDefault patchOrganisation(patchOrganisationRequest)

Update your Fingoti organisation.

Fields that do not require updating can be omitted

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.OrganisationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    OrganisationApi apiInstance = new OrganisationApi(defaultClient);
    PatchOrganisationRequest patchOrganisationRequest = new PatchOrganisationRequest(); // PatchOrganisationRequest | 
    try {
      ModelDefault result = apiInstance.patchOrganisation(patchOrganisationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganisationApi#patchOrganisation");
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
| **patchOrganisationRequest** | [**PatchOrganisationRequest**](PatchOrganisationRequest.md)|  | [optional] |

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

<a name="patchOrganisationAddressesId"></a>
# **patchOrganisationAddressesId**
> ModelDefault patchOrganisationAddressesId(id, patchAddressRequest)

Update organisation address.

Fields that do not require updating can be omitted

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.OrganisationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    OrganisationApi apiInstance = new OrganisationApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    PatchAddressRequest patchAddressRequest = new PatchAddressRequest(); // PatchAddressRequest | 
    try {
      ModelDefault result = apiInstance.patchOrganisationAddressesId(id, patchAddressRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganisationApi#patchOrganisationAddressesId");
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
| **patchAddressRequest** | [**PatchAddressRequest**](PatchAddressRequest.md)|  | [optional] |

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

<a name="patchOrganisationPresetsId"></a>
# **patchOrganisationPresetsId**
> ModelDefault patchOrganisationPresetsId(id, patchPresetRequest)

Update organisation preset.

Fields that do not require updating can be omitted.

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.OrganisationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    OrganisationApi apiInstance = new OrganisationApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    PatchPresetRequest patchPresetRequest = new PatchPresetRequest(); // PatchPresetRequest | 
    try {
      ModelDefault result = apiInstance.patchOrganisationPresetsId(id, patchPresetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganisationApi#patchOrganisationPresetsId");
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
| **patchPresetRequest** | [**PatchPresetRequest**](PatchPresetRequest.md)|  | [optional] |

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

<a name="patchOrganisationRolesId"></a>
# **patchOrganisationRolesId**
> ModelDefault patchOrganisationRolesId(id, patchRoleRequest)

Update organisation role.

Fields that do not require updating can be omitted. 0 &#x3D; None, 1 &#x3D; Read, 2 &#x3D; Write

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.OrganisationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    OrganisationApi apiInstance = new OrganisationApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Role ID to update
    PatchRoleRequest patchRoleRequest = new PatchRoleRequest(); // PatchRoleRequest | 
    try {
      ModelDefault result = apiInstance.patchOrganisationRolesId(id, patchRoleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganisationApi#patchOrganisationRolesId");
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
| **id** | **UUID**| Role ID to update | |
| **patchRoleRequest** | [**PatchRoleRequest**](PatchRoleRequest.md)|  | [optional] |

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

<a name="patchOrganisationTokensId"></a>
# **patchOrganisationTokensId**
> ModelDefault patchOrganisationTokensId(id, patchOrganisationTokenRequest)

Update API token.

Fields that do not require updating can be omitted. AssignedUsers array must contain all users that are to be assigned to the token

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.OrganisationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    OrganisationApi apiInstance = new OrganisationApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    PatchOrganisationTokenRequest patchOrganisationTokenRequest = new PatchOrganisationTokenRequest(); // PatchOrganisationTokenRequest | 
    try {
      ModelDefault result = apiInstance.patchOrganisationTokensId(id, patchOrganisationTokenRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganisationApi#patchOrganisationTokensId");
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
| **patchOrganisationTokenRequest** | [**PatchOrganisationTokenRequest**](PatchOrganisationTokenRequest.md)|  | [optional] |

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

<a name="patchOrganisationUsersId"></a>
# **patchOrganisationUsersId**
> ModelDefault patchOrganisationUsersId(id, updateUserRole)

Update organisation user.

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.OrganisationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    OrganisationApi apiInstance = new OrganisationApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    UpdateUserRole updateUserRole = new UpdateUserRole(); // UpdateUserRole | 
    try {
      ModelDefault result = apiInstance.patchOrganisationUsersId(id, updateUserRole);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganisationApi#patchOrganisationUsersId");
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
| **updateUserRole** | [**UpdateUserRole**](UpdateUserRole.md)|  | [optional] |

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

<a name="postOrganisation"></a>
# **postOrganisation**
> ModelDefault postOrganisation(regiserOrganisationDto)

Register a new Fingoti organisation.

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.OrganisationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    OrganisationApi apiInstance = new OrganisationApi(defaultClient);
    RegiserOrganisationDto regiserOrganisationDto = new RegiserOrganisationDto(); // RegiserOrganisationDto | 
    try {
      ModelDefault result = apiInstance.postOrganisation(regiserOrganisationDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganisationApi#postOrganisation");
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
| **regiserOrganisationDto** | [**RegiserOrganisationDto**](RegiserOrganisationDto.md)|  | [optional] |

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

<a name="postOrganisationAddresses"></a>
# **postOrganisationAddresses**
> ModelDefault postOrganisationAddresses(addAddressRequest)

Create a new address.

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.OrganisationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    OrganisationApi apiInstance = new OrganisationApi(defaultClient);
    AddAddressRequest addAddressRequest = new AddAddressRequest(); // AddAddressRequest | 
    try {
      ModelDefault result = apiInstance.postOrganisationAddresses(addAddressRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganisationApi#postOrganisationAddresses");
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
| **addAddressRequest** | [**AddAddressRequest**](AddAddressRequest.md)|  | [optional] |

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

<a name="postOrganisationPresets"></a>
# **postOrganisationPresets**
> AddPresetResult postOrganisationPresets(addPresetRequest)

Create a new preset.

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.OrganisationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    OrganisationApi apiInstance = new OrganisationApi(defaultClient);
    AddPresetRequest addPresetRequest = new AddPresetRequest(); // AddPresetRequest | 
    try {
      AddPresetResult result = apiInstance.postOrganisationPresets(addPresetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganisationApi#postOrganisationPresets");
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
| **addPresetRequest** | [**AddPresetRequest**](AddPresetRequest.md)|  | [optional] |

### Return type

[**AddPresetResult**](AddPresetResult.md)

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

<a name="postOrganisationRoles"></a>
# **postOrganisationRoles**
> DefaultWithId postOrganisationRoles(addRoleRequest)

Create a new role.

0 &#x3D; None, 1 &#x3D; Read, 2 &#x3D; Write

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.OrganisationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    OrganisationApi apiInstance = new OrganisationApi(defaultClient);
    AddRoleRequest addRoleRequest = new AddRoleRequest(); // AddRoleRequest | 
    try {
      DefaultWithId result = apiInstance.postOrganisationRoles(addRoleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganisationApi#postOrganisationRoles");
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
| **addRoleRequest** | [**AddRoleRequest**](AddRoleRequest.md)|  | [optional] |

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

<a name="postOrganisationTenants"></a>
# **postOrganisationTenants**
> RegisterOrganisationResult postOrganisationTenants(regiserTenantDto)

Create new tenant. This is only available to partner organisations.

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.OrganisationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    OrganisationApi apiInstance = new OrganisationApi(defaultClient);
    RegiserTenantDto regiserTenantDto = new RegiserTenantDto(); // RegiserTenantDto | 
    try {
      RegisterOrganisationResult result = apiInstance.postOrganisationTenants(regiserTenantDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganisationApi#postOrganisationTenants");
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
| **regiserTenantDto** | [**RegiserTenantDto**](RegiserTenantDto.md)|  | [optional] |

### Return type

[**RegisterOrganisationResult**](RegisterOrganisationResult.md)

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

<a name="postOrganisationTokens"></a>
# **postOrganisationTokens**
> TokenSuccessResponse postOrganisationTokens(newOrganisationTokenDto)

Generate new API token.

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.OrganisationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    OrganisationApi apiInstance = new OrganisationApi(defaultClient);
    NewOrganisationTokenDto newOrganisationTokenDto = new NewOrganisationTokenDto(); // NewOrganisationTokenDto | User credentials. For a token to never expire, specify 0 for the expiry
    try {
      TokenSuccessResponse result = apiInstance.postOrganisationTokens(newOrganisationTokenDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganisationApi#postOrganisationTokens");
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
| **newOrganisationTokenDto** | [**NewOrganisationTokenDto**](NewOrganisationTokenDto.md)| User credentials. For a token to never expire, specify 0 for the expiry | [optional] |

### Return type

[**TokenSuccessResponse**](TokenSuccessResponse.md)

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
| **401** | Unauthorized |  -  |

<a name="postOrganisationUsers"></a>
# **postOrganisationUsers**
> ModelDefault postOrganisationUsers(inviteUserDto)

Invite a new user to the organisation.

### Example
```java
// Import classes:
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;
import com.fingoti.sdk.api.OrganisationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.fingoti.com");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    OrganisationApi apiInstance = new OrganisationApi(defaultClient);
    InviteUserDto inviteUserDto = new InviteUserDto(); // InviteUserDto | 
    try {
      ModelDefault result = apiInstance.postOrganisationUsers(inviteUserDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganisationApi#postOrganisationUsers");
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
| **inviteUserDto** | [**InviteUserDto**](InviteUserDto.md)|  | [optional] |

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

