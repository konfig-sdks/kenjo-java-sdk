# AreasApi

All URIs are relative to *https://sandbox-api.kenjo.io/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewArea**](AreasApi.md#createNewArea) | **POST** /areas |  |
| [**getById**](AreasApi.md#getById) | **GET** /areas/{id} |  |
| [**getList**](AreasApi.md#getList) | **GET** /areas |  |
| [**removeById**](AreasApi.md#removeById) | **DELETE** /areas/{id} |  |
| [**updateAreaById**](AreasApi.md#updateAreaById) | **PUT** /areas/{id} |  |


<a name="createNewArea"></a>
# **createNewArea**
> AreasCreateNewAreaResponse createNewArea(authorization, areasCreateNewAreaRequest).execute();



Creates a new area.&lt;br&gt;The *name* is the only required field.&lt;br&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Kenjo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AreasApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox-api.kenjo.io/api/v1";
    Kenjo client = new Kenjo(configuration);
    String authorization = "Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FwaS5rZW5qby5pbyIsInN1YiI6IjYwZjBhOTE2MjE0OTg3MjU2YmU5YzhmZiIsImF1ZCI6Imh0dHBzOi8vYXBpLmtlbmpvLmlvIiwiaWF0IjoxNjI2Mzg1MTE1LCJuYmYiOjE2MjYzODUxMTUsImV4cCI6MTYyNjU1NzkxNSwiYWNjZXNzVHlwZSI6IkFwaUFjY2VzcyIsInNfb3JnSWQiOiI2MGYwNGVhN2RmN2JhMjFlY2U0YmYzYzIifQ.cxG_7dIS-VbmDXdJuLkekoyuyCIzQG2fMcgc0nkfbWE8cihhcb5FnALbQkjU9b5-qVcEoMHZlSuUA-jMEBMMVQ"; // A valid bearer token.
    String name = "name_example"; // The new name of the area to update.
    try {
      AreasCreateNewAreaResponse result = client
              .areas
              .createNewArea(authorization)
              .name(name)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
    } catch (ApiException e) {
      System.err.println("Exception when calling AreasApi#createNewArea");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AreasCreateNewAreaResponse> response = client
              .areas
              .createNewArea(authorization)
              .name(name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AreasApi#createNewArea");
      System.err.println("Status code: " + e.getStatusCode());
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
| **authorization** | **String**| A valid bearer token. | |
| **areasCreateNewAreaRequest** | [**AreasCreateNewAreaRequest**](AreasCreateNewAreaRequest.md)|  | |

### Return type

[**AreasCreateNewAreaResponse**](AreasCreateNewAreaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | CREATED |  -  |
| **401** | UNAUTHORIZED. The Authorization header is incorrect, not provided or the token expired. |  -  |

<a name="getById"></a>
# **getById**
> AreasGetByIdResponse getById(id, authorization).execute();



Returns the area referenced by *id*.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Kenjo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AreasApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox-api.kenjo.io/api/v1";
    Kenjo client = new Kenjo(configuration);
    String id = "60a2db290da29e126a18789a"; // The _id of the area entry to request.
    String authorization = "Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FwaS5rZW5qby5pbyIsInN1YiI6IjYwZjBhOTE2MjE0OTg3MjU2YmU5YzhmZiIsImF1ZCI6Imh0dHBzOi8vYXBpLmtlbmpvLmlvIiwiaWF0IjoxNjI2Mzg1MTE1LCJuYmYiOjE2MjYzODUxMTUsImV4cCI6MTYyNjU1NzkxNSwiYWNjZXNzVHlwZSI6IkFwaUFjY2VzcyIsInNfb3JnSWQiOiI2MGYwNGVhN2RmN2JhMjFlY2U0YmYzYzIifQ.cxG_7dIS-VbmDXdJuLkekoyuyCIzQG2fMcgc0nkfbWE8cihhcb5FnALbQkjU9b5-qVcEoMHZlSuUA-jMEBMMVQ"; // A valid bearer token.
    try {
      AreasGetByIdResponse result = client
              .areas
              .getById(id, authorization)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
    } catch (ApiException e) {
      System.err.println("Exception when calling AreasApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AreasGetByIdResponse> response = client
              .areas
              .getById(id, authorization)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AreasApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
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
| **id** | **String**| The _id of the area entry to request. | |
| **authorization** | **String**| A valid bearer token. | |

### Return type

[**AreasGetByIdResponse**](AreasGetByIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | UNAUTHORIZED. The Authorization header is incorrect, not provided or the token expired. |  -  |

<a name="getList"></a>
# **getList**
> List&lt;AreasGetListResponseInner&gt; getList(authorization).execute();



Returns a list of the existing areas in Kenjo.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Kenjo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AreasApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox-api.kenjo.io/api/v1";
    Kenjo client = new Kenjo(configuration);
    String authorization = "Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FwaS5rZW5qby5pbyIsInN1YiI6IjYwZjBhOTE2MjE0OTg3MjU2YmU5YzhmZiIsImF1ZCI6Imh0dHBzOi8vYXBpLmtlbmpvLmlvIiwiaWF0IjoxNjI2Mzg1MTE1LCJuYmYiOjE2MjYzODUxMTUsImV4cCI6MTYyNjU1NzkxNSwiYWNjZXNzVHlwZSI6IkFwaUFjY2VzcyIsInNfb3JnSWQiOiI2MGYwNGVhN2RmN2JhMjFlY2U0YmYzYzIifQ.cxG_7dIS-VbmDXdJuLkekoyuyCIzQG2fMcgc0nkfbWE8cihhcb5FnALbQkjU9b5-qVcEoMHZlSuUA-jMEBMMVQ"; // A valid bearer token.
    try {
      List<AreasGetListResponseInner> result = client
              .areas
              .getList(authorization)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AreasApi#getList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<AreasGetListResponseInner>> response = client
              .areas
              .getList(authorization)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AreasApi#getList");
      System.err.println("Status code: " + e.getStatusCode());
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
| **authorization** | **String**| A valid bearer token. | |

### Return type

[**List&lt;AreasGetListResponseInner&gt;**](AreasGetListResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | UNAUTHORIZED. The Authorization header is incorrect, not provided or the token expired. |  -  |

<a name="removeById"></a>
# **removeById**
> removeById(id, authorization).execute();



Removes the area referenced by *id*.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Kenjo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AreasApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox-api.kenjo.io/api/v1";
    Kenjo client = new Kenjo(configuration);
    String id = "60a2db290da29e126a18789a"; // The _id of the area entry to request.
    String authorization = "Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FwaS5rZW5qby5pbyIsInN1YiI6IjYwZjBhOTE2MjE0OTg3MjU2YmU5YzhmZiIsImF1ZCI6Imh0dHBzOi8vYXBpLmtlbmpvLmlvIiwiaWF0IjoxNjI2Mzg1MTE1LCJuYmYiOjE2MjYzODUxMTUsImV4cCI6MTYyNjU1NzkxNSwiYWNjZXNzVHlwZSI6IkFwaUFjY2VzcyIsInNfb3JnSWQiOiI2MGYwNGVhN2RmN2JhMjFlY2U0YmYzYzIifQ.cxG_7dIS-VbmDXdJuLkekoyuyCIzQG2fMcgc0nkfbWE8cihhcb5FnALbQkjU9b5-qVcEoMHZlSuUA-jMEBMMVQ"; // A valid bearer token.
    try {
      client
              .areas
              .removeById(id, authorization)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AreasApi#removeById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .areas
              .removeById(id, authorization)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AreasApi#removeById");
      System.err.println("Status code: " + e.getStatusCode());
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
| **id** | **String**| The _id of the area entry to request. | |
| **authorization** | **String**| A valid bearer token. | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | NO CONTENT |  -  |
| **401** | UNAUTHORIZED. The Authorization header is incorrect, not provided or the token expired. |  -  |

<a name="updateAreaById"></a>
# **updateAreaById**
> AreasUpdateAreaByIdResponse updateAreaById(id, authorization, areasUpdateAreaByIdRequest).execute();



Updates a area referenced by *id*. Only the attributes submitted are modified.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Kenjo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AreasApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox-api.kenjo.io/api/v1";
    Kenjo client = new Kenjo(configuration);
    String id = "60a2db290da29e126a18789a"; // The _id of the area entry to request.
    String authorization = "Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FwaS5rZW5qby5pbyIsInN1YiI6IjYwZjBhOTE2MjE0OTg3MjU2YmU5YzhmZiIsImF1ZCI6Imh0dHBzOi8vYXBpLmtlbmpvLmlvIiwiaWF0IjoxNjI2Mzg1MTE1LCJuYmYiOjE2MjYzODUxMTUsImV4cCI6MTYyNjU1NzkxNSwiYWNjZXNzVHlwZSI6IkFwaUFjY2VzcyIsInNfb3JnSWQiOiI2MGYwNGVhN2RmN2JhMjFlY2U0YmYzYzIifQ.cxG_7dIS-VbmDXdJuLkekoyuyCIzQG2fMcgc0nkfbWE8cihhcb5FnALbQkjU9b5-qVcEoMHZlSuUA-jMEBMMVQ"; // A valid bearer token.
    String name = "name_example"; // The new name of the area to update.
    try {
      AreasUpdateAreaByIdResponse result = client
              .areas
              .updateAreaById(id, authorization)
              .name(name)
              .execute();
      System.out.println(result);
      System.out.println(result.getName());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling AreasApi#updateAreaById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AreasUpdateAreaByIdResponse> response = client
              .areas
              .updateAreaById(id, authorization)
              .name(name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AreasApi#updateAreaById");
      System.err.println("Status code: " + e.getStatusCode());
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
| **id** | **String**| The _id of the area entry to request. | |
| **authorization** | **String**| A valid bearer token. | |
| **areasUpdateAreaByIdRequest** | [**AreasUpdateAreaByIdRequest**](AreasUpdateAreaByIdRequest.md)|  | |

### Return type

[**AreasUpdateAreaByIdResponse**](AreasUpdateAreaByIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | UNAUTHORIZED. The Authorization header is incorrect, not provided or the token expired. |  -  |

