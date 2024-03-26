# TimeOffApi

All URIs are relative to *https://sandbox-api.kenjo.io/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getRequestsByDate**](TimeOffApi.md#getRequestsByDate) | **GET** /time-off/requests |  |


<a name="getRequestsByDate"></a>
# **getRequestsByDate**
> TimeOffGetRequestsByDateResponse getRequestsByDate(authorization, from, to).userId(userId).timeOffTypeId(timeOffTypeId).status(status).offset(offset).limit(limit).execute();



This endpoint returns a paginated list of time off requests for a given date range.The maximum number of time off requests to retrieve once is 92 days, so the URL params *from* and *to* are mandatory. The URL params help to return more accurate results.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Kenjo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TimeOffApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox-api.kenjo.io/api/v1";
    Kenjo client = new Kenjo(configuration);
    String authorization = "Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FwaS5rZW5qby5pbyIsInN1YiI6IjYwZjBhOTE2MjE0OTg3MjU2YmU5YzhmZiIsImF1ZCI6Imh0dHBzOi8vYXBpLmtlbmpvLmlvIiwiaWF0IjoxNjI2Mzg1MTE1LCJuYmYiOjE2MjYzODUxMTUsImV4cCI6MTYyNjU1NzkxNSwiYWNjZXNzVHlwZSI6IkFwaUFjY2VzcyIsInNfb3JnSWQiOiI2MGYwNGVhN2RmN2JhMjFlY2U0YmYzYzIifQ.cxG_7dIS-VbmDXdJuLkekoyuyCIzQG2fMcgc0nkfbWE8cihhcb5FnALbQkjU9b5-qVcEoMHZlSuUA-jMEBMMVQ"; // A valid bearer token.
    String from = "2020-01-01"; // A date in format YYYY-MM-DD to indicate the starting point. It needs to be equals or less than the *to* param.
    String to = "2020-01-10"; // A date in format YYYY-MM-DD to indicate the ending point. It needs to be equals or greater than the *from* param.
    String userId = "60a2db290da29e126a18789b"; // This field allows to return only the time off requests for a given *_userId*.
    String timeOffTypeId = "90a2db290da29e126a187891"; // This field allows to filter by time-off type Id.
    String status = "Approved"; // This field allows to filter by the time-off request status.
    Double offset = 1D; // Optional filter for pagination proposals. Determines the number of pages to skip when pagination is being used. If this value is not provided, by default the offset will be 1.
    Double limit = 25D; // Optional filter for pagination proposals. The maximum number of rows to retrieve which determines the size of the page. If this value is not provided then the limit will be 50 users. The maximum value of the limit is 100 users per page. Only are valid the following limit values: 25, 50 and 100.
    try {
      TimeOffGetRequestsByDateResponse result = client
              .timeOff
              .getRequestsByDate(authorization, from, to)
              .userId(userId)
              .timeOffTypeId(timeOffTypeId)
              .status(status)
              .offset(offset)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMetadata());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#getRequestsByDate");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<TimeOffGetRequestsByDateResponse> response = client
              .timeOff
              .getRequestsByDate(authorization, from, to)
              .userId(userId)
              .timeOffTypeId(timeOffTypeId)
              .status(status)
              .offset(offset)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TimeOffApi#getRequestsByDate");
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
| **from** | **String**| A date in format YYYY-MM-DD to indicate the starting point. It needs to be equals or less than the *to* param. | |
| **to** | **String**| A date in format YYYY-MM-DD to indicate the ending point. It needs to be equals or greater than the *from* param. | |
| **userId** | **String**| This field allows to return only the time off requests for a given *_userId*. | [optional] |
| **timeOffTypeId** | **String**| This field allows to filter by time-off type Id. | [optional] |
| **status** | **String**| This field allows to filter by the time-off request status. | [optional] [enum: Approved, Declined, Cancelled, Pending, Submitted, Processed, CancelledAfterProcessed, InApproval] |
| **offset** | **Double**| Optional filter for pagination proposals. Determines the number of pages to skip when pagination is being used. If this value is not provided, by default the offset will be 1. | [optional] |
| **limit** | **Double**| Optional filter for pagination proposals. The maximum number of rows to retrieve which determines the size of the page. If this value is not provided then the limit will be 50 users. The maximum value of the limit is 100 users per page. Only are valid the following limit values: 25, 50 and 100. | [optional] |

### Return type

[**TimeOffGetRequestsByDateResponse**](TimeOffGetRequestsByDateResponse.md)

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

