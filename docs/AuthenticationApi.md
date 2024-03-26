# AuthenticationApi

All URIs are relative to *https://sandbox-api.kenjo.io/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBearerToken**](AuthenticationApi.md#createBearerToken) | **POST** /auth/login |  |
| [**invalidateToken**](AuthenticationApi.md#invalidateToken) | **POST** /auth/logout |  |


<a name="createBearerToken"></a>
# **createBearerToken**
> AuthenticationCreateBearerTokenResponse createBearerToken(authenticationCreateBearerTokenRequest).execute();



Create a bearer token to allow connecting the API.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Kenjo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthenticationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox-api.kenjo.io/api/v1";
    Kenjo client = new Kenjo(configuration);
    String apiKey = "apiKey_example"; // The API key generated in Settings.
    try {
      AuthenticationCreateBearerTokenResponse result = client
              .authentication
              .createBearerToken()
              .apiKey(apiKey)
              .execute();
      System.out.println(result);
      System.out.println(result.getToken());
      System.out.println(result.getxExpiresAfter());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#createBearerToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AuthenticationCreateBearerTokenResponse> response = client
              .authentication
              .createBearerToken()
              .apiKey(apiKey)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#createBearerToken");
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
| **authenticationCreateBearerTokenRequest** | [**AuthenticationCreateBearerTokenRequest**](AuthenticationCreateBearerTokenRequest.md)|  | |

### Return type

[**AuthenticationCreateBearerTokenResponse**](AuthenticationCreateBearerTokenResponse.md)

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

<a name="invalidateToken"></a>
# **invalidateToken**
> invalidateToken().execute();



Invalidates a Bearer token.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Kenjo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AuthenticationApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox-api.kenjo.io/api/v1";
    Kenjo client = new Kenjo(configuration);
    try {
      client
              .authentication
              .invalidateToken()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#invalidateToken");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .authentication
              .invalidateToken()
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#invalidateToken");
      System.err.println("Status code: " + e.getStatusCode());
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

