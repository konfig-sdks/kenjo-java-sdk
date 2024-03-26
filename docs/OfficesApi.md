# OfficesApi

All URIs are relative to *https://sandbox-api.kenjo.io/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewOffice**](OfficesApi.md#createNewOffice) | **POST** /offices |  |
| [**getById**](OfficesApi.md#getById) | **GET** /offices/{id} |  |
| [**getList**](OfficesApi.md#getList) | **GET** /offices |  |
| [**removeById**](OfficesApi.md#removeById) | **DELETE** /offices/{id} |  |
| [**updateOfficeAttributes**](OfficesApi.md#updateOfficeAttributes) | **PUT** /offices/{id} |  |


<a name="createNewOffice"></a>
# **createNewOffice**
> OfficesCreateNewOfficeResponse createNewOffice(authorization, officesCreateNewOfficeRequest).execute();



Creates a new office.&lt;br&gt;&lt;br&gt;The required fields are *name*, *companyId*, *calendarId*.&lt;br&gt;Optional fields are *street*, *postalCode*, *city* and *country*. &lt;br&gt; The *country* field has to be a valid ISO country code.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Kenjo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OfficesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox-api.kenjo.io/api/v1";
    Kenjo client = new Kenjo(configuration);
    String authorization = "Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FwaS5rZW5qby5pbyIsInN1YiI6IjYwZjBhOTE2MjE0OTg3MjU2YmU5YzhmZiIsImF1ZCI6Imh0dHBzOi8vYXBpLmtlbmpvLmlvIiwiaWF0IjoxNjI2Mzg1MTE1LCJuYmYiOjE2MjYzODUxMTUsImV4cCI6MTYyNjU1NzkxNSwiYWNjZXNzVHlwZSI6IkFwaUFjY2VzcyIsInNfb3JnSWQiOiI2MGYwNGVhN2RmN2JhMjFlY2U0YmYzYzIifQ.cxG_7dIS-VbmDXdJuLkekoyuyCIzQG2fMcgc0nkfbWE8cihhcb5FnALbQkjU9b5-qVcEoMHZlSuUA-jMEBMMVQ"; // A valid bearer token.
    String name = "name_example"; // The new name of the office to create. Required field.
    String companyId = "companyId_example"; // The company id of the office to create. Required field.
    String calendarId = "calendarId_example"; // The calendar id of the office to create. Required field.
    String country = "country_example"; // The country of the office to create in ISO code.
    String postalCode = "postalCode_example"; // The postal code of the office to create.
    String city = "city_example"; // The city of the office to create.
    String street = "street_example"; // The street of the office to create.
    try {
      OfficesCreateNewOfficeResponse result = client
              .offices
              .createNewOffice(authorization)
              .name(name)
              .companyId(companyId)
              .calendarId(calendarId)
              .country(country)
              .postalCode(postalCode)
              .city(city)
              .street(street)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getCompanyId());
      System.out.println(result.getCalendarId());
      System.out.println(result.getCountry());
      System.out.println(result.getPostalCode());
      System.out.println(result.getCity());
      System.out.println(result.getStreet());
    } catch (ApiException e) {
      System.err.println("Exception when calling OfficesApi#createNewOffice");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OfficesCreateNewOfficeResponse> response = client
              .offices
              .createNewOffice(authorization)
              .name(name)
              .companyId(companyId)
              .calendarId(calendarId)
              .country(country)
              .postalCode(postalCode)
              .city(city)
              .street(street)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OfficesApi#createNewOffice");
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
| **officesCreateNewOfficeRequest** | [**OfficesCreateNewOfficeRequest**](OfficesCreateNewOfficeRequest.md)|  | |

### Return type

[**OfficesCreateNewOfficeResponse**](OfficesCreateNewOfficeResponse.md)

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
> OfficesGetByIdResponse getById(id, authorization).execute();



Returns the office referenced by *id*.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Kenjo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OfficesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox-api.kenjo.io/api/v1";
    Kenjo client = new Kenjo(configuration);
    String id = "60a2db290da29e126a18789a"; // The _id of the office entry to request.
    String authorization = "Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FwaS5rZW5qby5pbyIsInN1YiI6IjYwZjBhOTE2MjE0OTg3MjU2YmU5YzhmZiIsImF1ZCI6Imh0dHBzOi8vYXBpLmtlbmpvLmlvIiwiaWF0IjoxNjI2Mzg1MTE1LCJuYmYiOjE2MjYzODUxMTUsImV4cCI6MTYyNjU1NzkxNSwiYWNjZXNzVHlwZSI6IkFwaUFjY2VzcyIsInNfb3JnSWQiOiI2MGYwNGVhN2RmN2JhMjFlY2U0YmYzYzIifQ.cxG_7dIS-VbmDXdJuLkekoyuyCIzQG2fMcgc0nkfbWE8cihhcb5FnALbQkjU9b5-qVcEoMHZlSuUA-jMEBMMVQ"; // A valid bearer token.
    try {
      OfficesGetByIdResponse result = client
              .offices
              .getById(id, authorization)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
      System.out.println(result.getCompanyId());
      System.out.println(result.getCalendarId());
      System.out.println(result.getStreet());
      System.out.println(result.getPostalCode());
      System.out.println(result.getCity());
      System.out.println(result.getCountry());
    } catch (ApiException e) {
      System.err.println("Exception when calling OfficesApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OfficesGetByIdResponse> response = client
              .offices
              .getById(id, authorization)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OfficesApi#getById");
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
| **id** | **String**| The _id of the office entry to request. | |
| **authorization** | **String**| A valid bearer token. | |

### Return type

[**OfficesGetByIdResponse**](OfficesGetByIdResponse.md)

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
> List&lt;OfficesGetListResponseInner&gt; getList(authorization).name(name).companyId(companyId).calendarId(calendarId).street(street).postalCode(postalCode).city(city).country(country).execute();



Returns a list of the existing offices in Kenjo.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Kenjo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OfficesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox-api.kenjo.io/api/v1";
    Kenjo client = new Kenjo(configuration);
    String authorization = "Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FwaS5rZW5qby5pbyIsInN1YiI6IjYwZjBhOTE2MjE0OTg3MjU2YmU5YzhmZiIsImF1ZCI6Imh0dHBzOi8vYXBpLmtlbmpvLmlvIiwiaWF0IjoxNjI2Mzg1MTE1LCJuYmYiOjE2MjYzODUxMTUsImV4cCI6MTYyNjU1NzkxNSwiYWNjZXNzVHlwZSI6IkFwaUFjY2VzcyIsInNfb3JnSWQiOiI2MGYwNGVhN2RmN2JhMjFlY2U0YmYzYzIifQ.cxG_7dIS-VbmDXdJuLkekoyuyCIzQG2fMcgc0nkfbWE8cihhcb5FnALbQkjU9b5-qVcEoMHZlSuUA-jMEBMMVQ"; // A valid bearer token.
    String name = "Berlin office"; // The name of the office.
    String companyId = "40a2db290da29e126a187895"; // The Kenjo id of the company.
    String calendarId = "40a2db290da29e126a187895"; // The Kenjo id of the calendar.
    String street = "Urbanstrasse, 71"; // The street of the office.
    String postalCode = "34213"; // The postal code of the office.
    String city = "Berlin"; // The city of the office.
    String country = "DE"; // The country of the office in ISO code.
    try {
      List<OfficesGetListResponseInner> result = client
              .offices
              .getList(authorization)
              .name(name)
              .companyId(companyId)
              .calendarId(calendarId)
              .street(street)
              .postalCode(postalCode)
              .city(city)
              .country(country)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OfficesApi#getList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<OfficesGetListResponseInner>> response = client
              .offices
              .getList(authorization)
              .name(name)
              .companyId(companyId)
              .calendarId(calendarId)
              .street(street)
              .postalCode(postalCode)
              .city(city)
              .country(country)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OfficesApi#getList");
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
| **name** | **String**| The name of the office. | [optional] |
| **companyId** | **String**| The Kenjo id of the company. | [optional] |
| **calendarId** | **String**| The Kenjo id of the calendar. | [optional] |
| **street** | **String**| The street of the office. | [optional] |
| **postalCode** | **String**| The postal code of the office. | [optional] |
| **city** | **String**| The city of the office. | [optional] |
| **country** | **String**| The country of the office in ISO code. | [optional] |

### Return type

[**List&lt;OfficesGetListResponseInner&gt;**](OfficesGetListResponseInner.md)

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



Removes the office referenced by *id*.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Kenjo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OfficesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox-api.kenjo.io/api/v1";
    Kenjo client = new Kenjo(configuration);
    String id = "60a2db290da29e126a18789a"; // The _id of the office entry to request.
    String authorization = "Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FwaS5rZW5qby5pbyIsInN1YiI6IjYwZjBhOTE2MjE0OTg3MjU2YmU5YzhmZiIsImF1ZCI6Imh0dHBzOi8vYXBpLmtlbmpvLmlvIiwiaWF0IjoxNjI2Mzg1MTE1LCJuYmYiOjE2MjYzODUxMTUsImV4cCI6MTYyNjU1NzkxNSwiYWNjZXNzVHlwZSI6IkFwaUFjY2VzcyIsInNfb3JnSWQiOiI2MGYwNGVhN2RmN2JhMjFlY2U0YmYzYzIifQ.cxG_7dIS-VbmDXdJuLkekoyuyCIzQG2fMcgc0nkfbWE8cihhcb5FnALbQkjU9b5-qVcEoMHZlSuUA-jMEBMMVQ"; // A valid bearer token.
    try {
      client
              .offices
              .removeById(id, authorization)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling OfficesApi#removeById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .offices
              .removeById(id, authorization)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling OfficesApi#removeById");
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
| **id** | **String**| The _id of the office entry to request. | |
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

<a name="updateOfficeAttributes"></a>
# **updateOfficeAttributes**
> OfficesUpdateOfficeAttributesResponse updateOfficeAttributes(id, authorization, officesUpdateOfficeAttributesRequest).execute();



Updates an office referenced by *id*. Only the attributes submitted are modified.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Kenjo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.OfficesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox-api.kenjo.io/api/v1";
    Kenjo client = new Kenjo(configuration);
    String id = "60a2db290da29e126a18789a"; // The _id of the office entry to request.
    String authorization = "Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FwaS5rZW5qby5pbyIsInN1YiI6IjYwZjBhOTE2MjE0OTg3MjU2YmU5YzhmZiIsImF1ZCI6Imh0dHBzOi8vYXBpLmtlbmpvLmlvIiwiaWF0IjoxNjI2Mzg1MTE1LCJuYmYiOjE2MjYzODUxMTUsImV4cCI6MTYyNjU1NzkxNSwiYWNjZXNzVHlwZSI6IkFwaUFjY2VzcyIsInNfb3JnSWQiOiI2MGYwNGVhN2RmN2JhMjFlY2U0YmYzYzIifQ.cxG_7dIS-VbmDXdJuLkekoyuyCIzQG2fMcgc0nkfbWE8cihhcb5FnALbQkjU9b5-qVcEoMHZlSuUA-jMEBMMVQ"; // A valid bearer token.
    String name = "name_example"; // The new name of the office to update.
    try {
      OfficesUpdateOfficeAttributesResponse result = client
              .offices
              .updateOfficeAttributes(id, authorization)
              .name(name)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getName());
    } catch (ApiException e) {
      System.err.println("Exception when calling OfficesApi#updateOfficeAttributes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<OfficesUpdateOfficeAttributesResponse> response = client
              .offices
              .updateOfficeAttributes(id, authorization)
              .name(name)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling OfficesApi#updateOfficeAttributes");
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
| **id** | **String**| The _id of the office entry to request. | |
| **authorization** | **String**| A valid bearer token. | |
| **officesUpdateOfficeAttributesRequest** | [**OfficesUpdateOfficeAttributesRequest**](OfficesUpdateOfficeAttributesRequest.md)|  | |

### Return type

[**OfficesUpdateOfficeAttributesResponse**](OfficesUpdateOfficeAttributesResponse.md)

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

