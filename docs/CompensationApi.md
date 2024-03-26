# CompensationApi

All URIs are relative to *https://sandbox-api.kenjo.io/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getContracts**](CompensationApi.md#getContracts) | **GET** /compensation/contracts |  |
| [**getSalariesList**](CompensationApi.md#getSalariesList) | **GET** /compensation/salaries |  |
| [**listAdditionalPaymentTypes**](CompensationApi.md#listAdditionalPaymentTypes) | **GET** /compensation/additional-payment-types |  |
| [**listAdditionalPayments**](CompensationApi.md#listAdditionalPayments) | **GET** /compensation/additional-payments |  |
| [**listContractTypes**](CompensationApi.md#listContractTypes) | **GET** /compensation/contract-types |  |


<a name="getContracts"></a>
# **getContracts**
> CompensationGetContractsResponse getContracts(authorization).contractTypeId(contractTypeId).userId(userId).companyId(companyId).offset(offset).limit(limit).execute();



This endpoint returns a paginated list of employment contracts. The URL params help to return more accurate results.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Kenjo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompensationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox-api.kenjo.io/api/v1";
    Kenjo client = new Kenjo(configuration);
    String authorization = "Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FwaS5rZW5qby5pbyIsInN1YiI6IjYwZjBhOTE2MjE0OTg3MjU2YmU5YzhmZiIsImF1ZCI6Imh0dHBzOi8vYXBpLmtlbmpvLmlvIiwiaWF0IjoxNjI2Mzg1MTE1LCJuYmYiOjE2MjYzODUxMTUsImV4cCI6MTYyNjU1NzkxNSwiYWNjZXNzVHlwZSI6IkFwaUFjY2VzcyIsInNfb3JnSWQiOiI2MGYwNGVhN2RmN2JhMjFlY2U0YmYzYzIifQ.cxG_7dIS-VbmDXdJuLkekoyuyCIzQG2fMcgc0nkfbWE8cihhcb5FnALbQkjU9b5-qVcEoMHZlSuUA-jMEBMMVQ"; // A valid bearer token.
    String contractTypeId = "60a2db290da29e126a18789e"; // Optional filter. This field allows you to retrieve contracts based on their *contractTypeId*. It can accept two formats:<br><br> 1. A single *contractTypeId* as a unique string. <br>Example: *contractTypeId=80a2db290da29e126a18789c* <br><br> 2. Multiple *contractTypeId* values separated by commas (up to a maximum of 15 values). <br>Example: *contractTypeId=80a2db290da29e126a18789c,80a2db290da29e126a18789b,80a2db290da29e126a187891*. These options provide flexibility in filtering contracts by their type, making it easier to retrieve the specific data you need.
    String userId = "60a2db290da29e126a18789b"; // Optional filter. This field allows you to retrieve contracts based on their *_userId*. It can accept two formats:<br><br> 1. A single *_userId* as a unique string. <br>Example: *_userId=80a2db290da29e126a18789c* <br><br> 2. Multiple *_userId* values separated by commas (up to a maximum of 15 values). <br>Example: *_userId=80a2db290da29e126a18789c,80a2db290da29e126a18789b,80a2db290da29e126a187891*. These options provide flexibility in filtering contracts by their type, making it easier to retrieve the specific data you need.
    String companyId = "90a2db290da29e126a187891"; // Optional filter. This field allows you to retrieve contracts based on their *_companyId*. It can accept two formats:<br><br> 1. A single *_companyId* as a unique string. <br>Example: *_companyId=80a2db290da29e126a18789c* <br><br> 2. Multiple *_companyId* values separated by commas (up to a maximum of 15 values). <br>Example: *_companyId=80a2db290da29e126a18789c,80a2db290da29e126a18789b,80a2db290da29e126a187891*. These options provide flexibility in filtering contracts by their type, making it easier to retrieve the specific data you need.
    Double offset = 1D; // Optional filter for pagination proposals. Determines the number of pages to skip when pagination is being used. If this value is not provided, by default the offset will be 1.
    Double limit = 25D; // Optional filter for pagination proposals. The maximum number of rows to retrieve which determines the size of the page. If this value is not provided then the limit will be 50 users. The maximum value of the limit is 100 users per page. Only are valid the following limit values: 25, 50 and 100.
    try {
      CompensationGetContractsResponse result = client
              .compensation
              .getContracts(authorization)
              .contractTypeId(contractTypeId)
              .userId(userId)
              .companyId(companyId)
              .offset(offset)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMetadata());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompensationApi#getContracts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CompensationGetContractsResponse> response = client
              .compensation
              .getContracts(authorization)
              .contractTypeId(contractTypeId)
              .userId(userId)
              .companyId(companyId)
              .offset(offset)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompensationApi#getContracts");
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
| **contractTypeId** | **String**| Optional filter. This field allows you to retrieve contracts based on their *contractTypeId*. It can accept two formats:&lt;br&gt;&lt;br&gt; 1. A single *contractTypeId* as a unique string. &lt;br&gt;Example: *contractTypeId&#x3D;80a2db290da29e126a18789c* &lt;br&gt;&lt;br&gt; 2. Multiple *contractTypeId* values separated by commas (up to a maximum of 15 values). &lt;br&gt;Example: *contractTypeId&#x3D;80a2db290da29e126a18789c,80a2db290da29e126a18789b,80a2db290da29e126a187891*. These options provide flexibility in filtering contracts by their type, making it easier to retrieve the specific data you need. | [optional] |
| **userId** | **String**| Optional filter. This field allows you to retrieve contracts based on their *_userId*. It can accept two formats:&lt;br&gt;&lt;br&gt; 1. A single *_userId* as a unique string. &lt;br&gt;Example: *_userId&#x3D;80a2db290da29e126a18789c* &lt;br&gt;&lt;br&gt; 2. Multiple *_userId* values separated by commas (up to a maximum of 15 values). &lt;br&gt;Example: *_userId&#x3D;80a2db290da29e126a18789c,80a2db290da29e126a18789b,80a2db290da29e126a187891*. These options provide flexibility in filtering contracts by their type, making it easier to retrieve the specific data you need. | [optional] |
| **companyId** | **String**| Optional filter. This field allows you to retrieve contracts based on their *_companyId*. It can accept two formats:&lt;br&gt;&lt;br&gt; 1. A single *_companyId* as a unique string. &lt;br&gt;Example: *_companyId&#x3D;80a2db290da29e126a18789c* &lt;br&gt;&lt;br&gt; 2. Multiple *_companyId* values separated by commas (up to a maximum of 15 values). &lt;br&gt;Example: *_companyId&#x3D;80a2db290da29e126a18789c,80a2db290da29e126a18789b,80a2db290da29e126a187891*. These options provide flexibility in filtering contracts by their type, making it easier to retrieve the specific data you need. | [optional] |
| **offset** | **Double**| Optional filter for pagination proposals. Determines the number of pages to skip when pagination is being used. If this value is not provided, by default the offset will be 1. | [optional] |
| **limit** | **Double**| Optional filter for pagination proposals. The maximum number of rows to retrieve which determines the size of the page. If this value is not provided then the limit will be 50 users. The maximum value of the limit is 100 users per page. Only are valid the following limit values: 25, 50 and 100. | [optional] |

### Return type

[**CompensationGetContractsResponse**](CompensationGetContractsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK. |  -  |
| **401** | UNAUTHORIZED. The Authorization header is incorrect, not provided or the token expired. |  -  |

<a name="getSalariesList"></a>
# **getSalariesList**
> CompensationGetSalariesListResponse getSalariesList(authorization).userId(userId).companyId(companyId).paymentPeriod(paymentPeriod).currency(currency).offset(offset).limit(limit).execute();



This endpoint returns a paginated list of employment salaries. The URL params help to return more accurate results.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Kenjo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompensationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox-api.kenjo.io/api/v1";
    Kenjo client = new Kenjo(configuration);
    String authorization = "Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FwaS5rZW5qby5pbyIsInN1YiI6IjYwZjBhOTE2MjE0OTg3MjU2YmU5YzhmZiIsImF1ZCI6Imh0dHBzOi8vYXBpLmtlbmpvLmlvIiwiaWF0IjoxNjI2Mzg1MTE1LCJuYmYiOjE2MjYzODUxMTUsImV4cCI6MTYyNjU1NzkxNSwiYWNjZXNzVHlwZSI6IkFwaUFjY2VzcyIsInNfb3JnSWQiOiI2MGYwNGVhN2RmN2JhMjFlY2U0YmYzYzIifQ.cxG_7dIS-VbmDXdJuLkekoyuyCIzQG2fMcgc0nkfbWE8cihhcb5FnALbQkjU9b5-qVcEoMHZlSuUA-jMEBMMVQ"; // A valid bearer token.
    String userId = "60a2db290da29e126a18789b"; // Optional filter. This field allows you to retrieve contracts based on their *_userId*. It can accept two formats:<br><br> 1. A single *_userId* as a unique string. <br>Example: *_userId=80a2db290da29e126a18789c* <br><br> 2. Multiple *_userId* values separated by commas (up to a maximum of 15 values). <br>Example: *_userId=80a2db290da29e126a18789c,80a2db290da29e126a18789b,80a2db290da29e126a187891*. These options provide flexibility in filtering contracts by their type, making it easier to retrieve the specific data you need.
    String companyId = "90a2db290da29e126a187891"; // Optional filter. This field allows you to retrieve contracts based on their *_companyId*. It can accept two formats:<br><br> 1. A single *_companyId* as a unique string. <br>Example: *_companyId=80a2db290da29e126a18789c* <br><br> 2. Multiple *_companyId* values separated by commas (up to a maximum of 15 values). <br>Example: *_companyId=80a2db290da29e126a18789c,80a2db290da29e126a18789b,80a2db290da29e126a187891*. These options provide flexibility in filtering contracts by their type, making it easier to retrieve the specific data you need.
    String paymentPeriod = "Annual"; // Optional filter. This field allows you to retrieve contracts based on their *paymentPeriod*. Accepted values: 'Annual', 'Monthly' and 'Hourly'. It can accept two formats:<br><br> 1. A single *paymentPeriod* as a unique string. <br>Example: *paymentPeriod=Annual* <br><br> 2. Multiple *paymentPeriod* values separated by commas (up to a maximum of 15 values). <br>Example: *paymentPeriod=Annual,Monthly*. These options provide flexibility in filtering contracts by their type, making it easier to retrieve the specific data you need.
    String currency = "EUR"; // Optional filter. This field allows you to retrieve contracts based on their *currency* (ISO 4217). It can accept two formats:<br><br> 1. A single *currency* as a unique string. <br>Example: *currency=EUR* <br><br> 2. Multiple *currency* values separated by commas (up to a maximum of 15 values). <br>Example: *currency=EUR,USD*. These options provide flexibility in filtering contracts by their type, making it easier to retrieve the specific data you need.
    Double offset = 1D; // Optional filter for pagination proposals. Determines the number of pages to skip when pagination is being used. If this value is not provided, by default the offset will be 1.
    Double limit = 25D; // Optional filter for pagination proposals. The maximum number of rows to retrieve which determines the size of the page. If this value is not provided then the limit will be 50 users. The maximum value of the limit is 100 users per page. Only are valid the following limit values: 25, 50 and 100.
    try {
      CompensationGetSalariesListResponse result = client
              .compensation
              .getSalariesList(authorization)
              .userId(userId)
              .companyId(companyId)
              .paymentPeriod(paymentPeriod)
              .currency(currency)
              .offset(offset)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMetadata());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompensationApi#getSalariesList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CompensationGetSalariesListResponse> response = client
              .compensation
              .getSalariesList(authorization)
              .userId(userId)
              .companyId(companyId)
              .paymentPeriod(paymentPeriod)
              .currency(currency)
              .offset(offset)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompensationApi#getSalariesList");
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
| **userId** | **String**| Optional filter. This field allows you to retrieve contracts based on their *_userId*. It can accept two formats:&lt;br&gt;&lt;br&gt; 1. A single *_userId* as a unique string. &lt;br&gt;Example: *_userId&#x3D;80a2db290da29e126a18789c* &lt;br&gt;&lt;br&gt; 2. Multiple *_userId* values separated by commas (up to a maximum of 15 values). &lt;br&gt;Example: *_userId&#x3D;80a2db290da29e126a18789c,80a2db290da29e126a18789b,80a2db290da29e126a187891*. These options provide flexibility in filtering contracts by their type, making it easier to retrieve the specific data you need. | [optional] |
| **companyId** | **String**| Optional filter. This field allows you to retrieve contracts based on their *_companyId*. It can accept two formats:&lt;br&gt;&lt;br&gt; 1. A single *_companyId* as a unique string. &lt;br&gt;Example: *_companyId&#x3D;80a2db290da29e126a18789c* &lt;br&gt;&lt;br&gt; 2. Multiple *_companyId* values separated by commas (up to a maximum of 15 values). &lt;br&gt;Example: *_companyId&#x3D;80a2db290da29e126a18789c,80a2db290da29e126a18789b,80a2db290da29e126a187891*. These options provide flexibility in filtering contracts by their type, making it easier to retrieve the specific data you need. | [optional] |
| **paymentPeriod** | **String**| Optional filter. This field allows you to retrieve contracts based on their *paymentPeriod*. Accepted values: &#39;Annual&#39;, &#39;Monthly&#39; and &#39;Hourly&#39;. It can accept two formats:&lt;br&gt;&lt;br&gt; 1. A single *paymentPeriod* as a unique string. &lt;br&gt;Example: *paymentPeriod&#x3D;Annual* &lt;br&gt;&lt;br&gt; 2. Multiple *paymentPeriod* values separated by commas (up to a maximum of 15 values). &lt;br&gt;Example: *paymentPeriod&#x3D;Annual,Monthly*. These options provide flexibility in filtering contracts by their type, making it easier to retrieve the specific data you need. | [optional] [enum: Annual, Monthly, Hourly] |
| **currency** | **String**| Optional filter. This field allows you to retrieve contracts based on their *currency* (ISO 4217). It can accept two formats:&lt;br&gt;&lt;br&gt; 1. A single *currency* as a unique string. &lt;br&gt;Example: *currency&#x3D;EUR* &lt;br&gt;&lt;br&gt; 2. Multiple *currency* values separated by commas (up to a maximum of 15 values). &lt;br&gt;Example: *currency&#x3D;EUR,USD*. These options provide flexibility in filtering contracts by their type, making it easier to retrieve the specific data you need. | [optional] |
| **offset** | **Double**| Optional filter for pagination proposals. Determines the number of pages to skip when pagination is being used. If this value is not provided, by default the offset will be 1. | [optional] |
| **limit** | **Double**| Optional filter for pagination proposals. The maximum number of rows to retrieve which determines the size of the page. If this value is not provided then the limit will be 50 users. The maximum value of the limit is 100 users per page. Only are valid the following limit values: 25, 50 and 100. | [optional] |

### Return type

[**CompensationGetSalariesListResponse**](CompensationGetSalariesListResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK. |  -  |
| **401** | UNAUTHORIZED. The Authorization header is incorrect, not provided or the token expired. |  -  |

<a name="listAdditionalPaymentTypes"></a>
# **listAdditionalPaymentTypes**
> CompensationListAdditionalPaymentTypesResponse listAdditionalPaymentTypes(authorization).offset(offset).limit(limit).execute();



This endpoint returns a paginated list of additional payment types. The URL params help to return more accurate results.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Kenjo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompensationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox-api.kenjo.io/api/v1";
    Kenjo client = new Kenjo(configuration);
    String authorization = "Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FwaS5rZW5qby5pbyIsInN1YiI6IjYwZjBhOTE2MjE0OTg3MjU2YmU5YzhmZiIsImF1ZCI6Imh0dHBzOi8vYXBpLmtlbmpvLmlvIiwiaWF0IjoxNjI2Mzg1MTE1LCJuYmYiOjE2MjYzODUxMTUsImV4cCI6MTYyNjU1NzkxNSwiYWNjZXNzVHlwZSI6IkFwaUFjY2VzcyIsInNfb3JnSWQiOiI2MGYwNGVhN2RmN2JhMjFlY2U0YmYzYzIifQ.cxG_7dIS-VbmDXdJuLkekoyuyCIzQG2fMcgc0nkfbWE8cihhcb5FnALbQkjU9b5-qVcEoMHZlSuUA-jMEBMMVQ"; // A valid bearer token.
    Double offset = 1D; // Optional filter for pagination proposals. Determines the number of pages to skip when pagination is being used. If this value is not provided, by default the offset will be 1.
    Double limit = 25D; // Optional filter for pagination proposals. The maximum number of rows to retrieve which determines the size of the page. If this value is not provided then the limit will be 50 users. The maximum value of the limit is 100 users per page. Only are valid the following limit values: 25, 50 and 100.
    try {
      CompensationListAdditionalPaymentTypesResponse result = client
              .compensation
              .listAdditionalPaymentTypes(authorization)
              .offset(offset)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMetadata());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompensationApi#listAdditionalPaymentTypes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CompensationListAdditionalPaymentTypesResponse> response = client
              .compensation
              .listAdditionalPaymentTypes(authorization)
              .offset(offset)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompensationApi#listAdditionalPaymentTypes");
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
| **offset** | **Double**| Optional filter for pagination proposals. Determines the number of pages to skip when pagination is being used. If this value is not provided, by default the offset will be 1. | [optional] |
| **limit** | **Double**| Optional filter for pagination proposals. The maximum number of rows to retrieve which determines the size of the page. If this value is not provided then the limit will be 50 users. The maximum value of the limit is 100 users per page. Only are valid the following limit values: 25, 50 and 100. | [optional] |

### Return type

[**CompensationListAdditionalPaymentTypesResponse**](CompensationListAdditionalPaymentTypesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK. |  -  |
| **401** | UNAUTHORIZED. The Authorization header is incorrect, not provided or the token expired. |  -  |

<a name="listAdditionalPayments"></a>
# **listAdditionalPayments**
> CompensationListAdditionalPaymentsResponse listAdditionalPayments(authorization).userId(userId).companyId(companyId).currency(currency).offset(offset).limit(limit).execute();



This endpoint returns a paginated list of additional payments. The URL params help to return more accurate results.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Kenjo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompensationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox-api.kenjo.io/api/v1";
    Kenjo client = new Kenjo(configuration);
    String authorization = "Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FwaS5rZW5qby5pbyIsInN1YiI6IjYwZjBhOTE2MjE0OTg3MjU2YmU5YzhmZiIsImF1ZCI6Imh0dHBzOi8vYXBpLmtlbmpvLmlvIiwiaWF0IjoxNjI2Mzg1MTE1LCJuYmYiOjE2MjYzODUxMTUsImV4cCI6MTYyNjU1NzkxNSwiYWNjZXNzVHlwZSI6IkFwaUFjY2VzcyIsInNfb3JnSWQiOiI2MGYwNGVhN2RmN2JhMjFlY2U0YmYzYzIifQ.cxG_7dIS-VbmDXdJuLkekoyuyCIzQG2fMcgc0nkfbWE8cihhcb5FnALbQkjU9b5-qVcEoMHZlSuUA-jMEBMMVQ"; // A valid bearer token.
    String userId = "60a2db290da29e126a18789b"; // Optional filter. This field allows you to retrieve contracts based on their *_userId*. It can accept two formats:<br><br> 1. A single *_userId* as a unique string. <br>Example: *_userId=80a2db290da29e126a18789c* <br><br> 2. Multiple *_userId* values separated by commas (up to a maximum of 15 values). <br>Example: *_userId=80a2db290da29e126a18789c,80a2db290da29e126a18789b,80a2db290da29e126a187891*. These options provide flexibility in filtering contracts by their type, making it easier to retrieve the specific data you need.
    String companyId = "90a2db290da29e126a187891"; // Optional filter. This field allows you to retrieve contracts based on their *_companyId*. It can accept two formats:<br><br> 1. A single *_companyId* as a unique string. <br>Example: *_companyId=80a2db290da29e126a18789c* <br><br> 2. Multiple *_companyId* values separated by commas (up to a maximum of 15 values). <br>Example: *_companyId=80a2db290da29e126a18789c,80a2db290da29e126a18789b,80a2db290da29e126a187891*. These options provide flexibility in filtering contracts by their type, making it easier to retrieve the specific data you need.
    String currency = "EUR"; // Optional filter. This field allows you to retrieve contracts based on their *currency* (ISO 4217). It can accept two formats:<br><br> 1. A single *currency* as a unique string. <br>Example: *currency=EUR* <br><br> 2. Multiple *currency* values separated by commas (up to a maximum of 15 values). <br>Example: *currency=EUR,USD*. These options provide flexibility in filtering contracts by their type, making it easier to retrieve the specific data you need.
    Double offset = 1D; // Optional filter for pagination proposals. Determines the number of pages to skip when pagination is being used. If this value is not provided, by default the offset will be 1.
    Double limit = 25D; // Optional filter for pagination proposals. The maximum number of rows to retrieve which determines the size of the page. If this value is not provided then the limit will be 50 users. The maximum value of the limit is 100 users per page. Only are valid the following limit values: 25, 50 and 100.
    try {
      CompensationListAdditionalPaymentsResponse result = client
              .compensation
              .listAdditionalPayments(authorization)
              .userId(userId)
              .companyId(companyId)
              .currency(currency)
              .offset(offset)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMetadata());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompensationApi#listAdditionalPayments");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CompensationListAdditionalPaymentsResponse> response = client
              .compensation
              .listAdditionalPayments(authorization)
              .userId(userId)
              .companyId(companyId)
              .currency(currency)
              .offset(offset)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompensationApi#listAdditionalPayments");
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
| **userId** | **String**| Optional filter. This field allows you to retrieve contracts based on their *_userId*. It can accept two formats:&lt;br&gt;&lt;br&gt; 1. A single *_userId* as a unique string. &lt;br&gt;Example: *_userId&#x3D;80a2db290da29e126a18789c* &lt;br&gt;&lt;br&gt; 2. Multiple *_userId* values separated by commas (up to a maximum of 15 values). &lt;br&gt;Example: *_userId&#x3D;80a2db290da29e126a18789c,80a2db290da29e126a18789b,80a2db290da29e126a187891*. These options provide flexibility in filtering contracts by their type, making it easier to retrieve the specific data you need. | [optional] |
| **companyId** | **String**| Optional filter. This field allows you to retrieve contracts based on their *_companyId*. It can accept two formats:&lt;br&gt;&lt;br&gt; 1. A single *_companyId* as a unique string. &lt;br&gt;Example: *_companyId&#x3D;80a2db290da29e126a18789c* &lt;br&gt;&lt;br&gt; 2. Multiple *_companyId* values separated by commas (up to a maximum of 15 values). &lt;br&gt;Example: *_companyId&#x3D;80a2db290da29e126a18789c,80a2db290da29e126a18789b,80a2db290da29e126a187891*. These options provide flexibility in filtering contracts by their type, making it easier to retrieve the specific data you need. | [optional] |
| **currency** | **String**| Optional filter. This field allows you to retrieve contracts based on their *currency* (ISO 4217). It can accept two formats:&lt;br&gt;&lt;br&gt; 1. A single *currency* as a unique string. &lt;br&gt;Example: *currency&#x3D;EUR* &lt;br&gt;&lt;br&gt; 2. Multiple *currency* values separated by commas (up to a maximum of 15 values). &lt;br&gt;Example: *currency&#x3D;EUR,USD*. These options provide flexibility in filtering contracts by their type, making it easier to retrieve the specific data you need. | [optional] |
| **offset** | **Double**| Optional filter for pagination proposals. Determines the number of pages to skip when pagination is being used. If this value is not provided, by default the offset will be 1. | [optional] |
| **limit** | **Double**| Optional filter for pagination proposals. The maximum number of rows to retrieve which determines the size of the page. If this value is not provided then the limit will be 50 users. The maximum value of the limit is 100 users per page. Only are valid the following limit values: 25, 50 and 100. | [optional] |

### Return type

[**CompensationListAdditionalPaymentsResponse**](CompensationListAdditionalPaymentsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK. |  -  |
| **401** | UNAUTHORIZED. The Authorization header is incorrect, not provided or the token expired. |  -  |

<a name="listContractTypes"></a>
# **listContractTypes**
> CompensationListContractTypesResponse listContractTypes(authorization).isActive(isActive).execute();



This endpoint returns a paginated list of contract types. The URL params help to return more accurate results.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Kenjo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompensationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox-api.kenjo.io/api/v1";
    Kenjo client = new Kenjo(configuration);
    String authorization = "Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FwaS5rZW5qby5pbyIsInN1YiI6IjYwZjBhOTE2MjE0OTg3MjU2YmU5YzhmZiIsImF1ZCI6Imh0dHBzOi8vYXBpLmtlbmpvLmlvIiwiaWF0IjoxNjI2Mzg1MTE1LCJuYmYiOjE2MjYzODUxMTUsImV4cCI6MTYyNjU1NzkxNSwiYWNjZXNzVHlwZSI6IkFwaUFjY2VzcyIsInNfb3JnSWQiOiI2MGYwNGVhN2RmN2JhMjFlY2U0YmYzYzIifQ.cxG_7dIS-VbmDXdJuLkekoyuyCIzQG2fMcgc0nkfbWE8cihhcb5FnALbQkjU9b5-qVcEoMHZlSuUA-jMEBMMVQ"; // A valid bearer token.
    Boolean isActive = true; // This field allows to return only the active contract types.
    try {
      CompensationListContractTypesResponse result = client
              .compensation
              .listContractTypes(authorization)
              .isActive(isActive)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMetadata());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompensationApi#listContractTypes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CompensationListContractTypesResponse> response = client
              .compensation
              .listContractTypes(authorization)
              .isActive(isActive)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompensationApi#listContractTypes");
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
| **isActive** | **Boolean**| This field allows to return only the active contract types. | [optional] |

### Return type

[**CompensationListContractTypesResponse**](CompensationListContractTypesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK. |  -  |
| **401** | UNAUTHORIZED. The Authorization header is incorrect, not provided or the token expired. |  -  |

