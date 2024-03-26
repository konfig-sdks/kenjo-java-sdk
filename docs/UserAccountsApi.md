# UserAccountsApi

All URIs are relative to *https://sandbox-api.kenjo.io/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listEmployees**](UserAccountsApi.md#listEmployees) | **GET** /user-accounts |  |


<a name="listEmployees"></a>
# **listEmployees**
> List&lt;UserAccountsListEmployeesResponseInner&gt; listEmployees(authorization).execute();



This endpoint returns an array of objects with the existing employees in Kenjo. Every object contains the basic employee information from **account**, **personal** and **work** sections per each existing employee.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Kenjo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserAccountsApi;
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
      List<UserAccountsListEmployeesResponseInner> result = client
              .userAccounts
              .listEmployees(authorization)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserAccountsApi#listEmployees");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<UserAccountsListEmployeesResponseInner>> response = client
              .userAccounts
              .listEmployees(authorization)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserAccountsApi#listEmployees");
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

[**List&lt;UserAccountsListEmployeesResponseInner&gt;**](UserAccountsListEmployeesResponseInner.md)

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

