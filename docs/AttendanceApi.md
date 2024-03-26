# AttendanceApi

All URIs are relative to *https://sandbox-api.kenjo.io/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createEntry**](AttendanceApi.md#createEntry) | **POST** /attendances |  |
| [**createTrackTime**](AttendanceApi.md#createTrackTime) | **POST** /attendances/track-time |  |
| [**getById**](AttendanceApi.md#getById) | **GET** /attendances/{attendanceId} |  |
| [**getCategories**](AttendanceApi.md#getCategories) | **GET** /attendances/categories |  |
| [**getExpectedTimeByUser**](AttendanceApi.md#getExpectedTimeByUser) | **GET** /attendances/expected-time |  |
| [**getList**](AttendanceApi.md#getList) | **GET** /attendances |  |
| [**removeById**](AttendanceApi.md#removeById) | **DELETE** /attendances/{attendanceId} |  |
| [**updateEntry**](AttendanceApi.md#updateEntry) | **PUT** /attendances/{attendanceId} |  |


<a name="createEntry"></a>
# **createEntry**
> AttendanceCreateEntryResponse createEntry(authorization, attendanceCreateEntryRequest).execute();



This endpoint creates an attendance entry for a one employee, so an user *identifier* is required to build this relationship. The following *identifiers* are the valid ones: **userId**, **email** or **externalId**. Also one **startTime** and one **date** are required.&lt;br&gt;The new entry will have an unique identifier **_id**. This value is returned in the body response.&lt;br&gt;&lt;br&gt; A day accepts many attendance entries per employee but they cannot be overlapped. It means that if, for example, *there is an entry the 2021-06-10 between 09:00 and 10:00 for the user E-111, then the creation of an new entry for E-111 in the 2021-06-10 whose startDate or endDate is between 09:00 and 10:00 will become a BAD REQUEST*.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Kenjo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AttendanceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox-api.kenjo.io/api/v1";
    Kenjo client = new Kenjo(configuration);
    String date = "date_example"; // The date of the entry. The valid format is *YYYY-MM-DD*. Required field.
    String startTime = "startTime_example"; // The start time of the entry. The valid format is *hh:mm:ss*. Required field.
    String authorization = "Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FwaS5rZW5qby5pbyIsInN1YiI6IjYwZjBhOTE2MjE0OTg3MjU2YmU5YzhmZiIsImF1ZCI6Imh0dHBzOi8vYXBpLmtlbmpvLmlvIiwiaWF0IjoxNjI2Mzg1MTE1LCJuYmYiOjE2MjYzODUxMTUsImV4cCI6MTYyNjU1NzkxNSwiYWNjZXNzVHlwZSI6IkFwaUFjY2VzcyIsInNfb3JnSWQiOiI2MGYwNGVhN2RmN2JhMjFlY2U0YmYzYzIifQ.cxG_7dIS-VbmDXdJuLkekoyuyCIzQG2fMcgc0nkfbWE8cihhcb5FnALbQkjU9b5-qVcEoMHZlSuUA-jMEBMMVQ"; // A valid bearer token.
    String userId = "userId_example"; // The Kenjo employee *_id*.
    String email = "email_example"; // The Kenjo *email* for an employee.
    String externalId = "externalId_example"; // The *external id* for an employee for integrations.
    String endTime = "endTime_example"; // The end time of the entry. It is not a required field but cannot be less or equal than the *startTime*. The valid format is *hh:mm:ss*
    List<AttendanceCreateEntryRequestBreaksInner> breaks = Arrays.asList(); // Array that contains the breaks in detail. Rules:<br> - A maximum of 10 breaks can be loaded via API.<br> - Breaks cannot be overlapped in the same day.<br> - 'start' field is required.
    String comment = "comment_example"; // Optional text to describe an attendance record (pair of startTime and endTime). The maximum number of characters is 150.
    try {
      AttendanceCreateEntryResponse result = client
              .attendance
              .createEntry(date, startTime, authorization)
              .userId(userId)
              .email(email)
              .externalId(externalId)
              .endTime(endTime)
              .breaks(breaks)
              .comment(comment)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getUserId());
      System.out.println(result.getEmail());
      System.out.println(result.getExternalId());
      System.out.println(result.getStartTime());
      System.out.println(result.getEndTime());
      System.out.println(result.getBreaks());
      System.out.println(result.getBreakTime());
      System.out.println(result.getComment());
    } catch (ApiException e) {
      System.err.println("Exception when calling AttendanceApi#createEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AttendanceCreateEntryResponse> response = client
              .attendance
              .createEntry(date, startTime, authorization)
              .userId(userId)
              .email(email)
              .externalId(externalId)
              .endTime(endTime)
              .breaks(breaks)
              .comment(comment)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AttendanceApi#createEntry");
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
| **attendanceCreateEntryRequest** | [**AttendanceCreateEntryRequest**](AttendanceCreateEntryRequest.md)|  | |

### Return type

[**AttendanceCreateEntryResponse**](AttendanceCreateEntryResponse.md)

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

<a name="createTrackTime"></a>
# **createTrackTime**
> AttendanceCreateTrackTimeResponse createTrackTime(authorization, attendanceCreateTrackTimeRequest).execute();



This endpoint tracks time only providing the following information: **employee identifier** and a **date time**. The following identifiers are the valid ones: **userId**, **email** or **externalId**, only one of them is required. This action abstracts and simplifies the entries tracking, ensuring internally the order and transforming each track action to a Kenjo user attendance format.&lt;br&gt;&lt;br&gt;Example: Three calls for the employee E-111 to the *_/track-time* endpoint contains the following data:&lt;br&gt;T1: 2021-01-01T08:00:00&lt;br&gt;T2: 2021-01-01T09:00:00&lt;br&gt;T3: 2021-01-01T10:00:00&lt;br&gt;The three calls order is T1, T2, T3.&lt;br&gt;&lt;br&gt;Then in Kenjo there will be 2 attendance pairs:&lt;br&gt;1: 08:00 / 09:00&lt;br&gt;2: 10:00 / --:--&lt;br&gt;The second pair is open, with no **endTime** info, until a new one comes. &lt;br&gt;&lt;br&gt;If there is a new track: 2021-01-01T12:00:00, then the result will be:&lt;br&gt;1: 08:00 / 09:00&lt;br&gt;2: 10:00 / 12:00&lt;br&gt;If the track is 2021-01-01T07:00:00 instead, then the previous tracks are reordered to be consistent with concept of attendance pairs:&lt;br&gt;1: 07:00 / 08:00&lt;br&gt;2: 09:00 / 10:00

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Kenjo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AttendanceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox-api.kenjo.io/api/v1";
    Kenjo client = new Kenjo(configuration);
    String dateTime = "dateTime_example"; // The date and the time of the Kenjo employee in format YYYY-MM-DDThh:mm:ss.
    String authorization = "Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FwaS5rZW5qby5pbyIsInN1YiI6IjYwZjBhOTE2MjE0OTg3MjU2YmU5YzhmZiIsImF1ZCI6Imh0dHBzOi8vYXBpLmtlbmpvLmlvIiwiaWF0IjoxNjI2Mzg1MTE1LCJuYmYiOjE2MjYzODUxMTUsImV4cCI6MTYyNjU1NzkxNSwiYWNjZXNzVHlwZSI6IkFwaUFjY2VzcyIsInNfb3JnSWQiOiI2MGYwNGVhN2RmN2JhMjFlY2U0YmYzYzIifQ.cxG_7dIS-VbmDXdJuLkekoyuyCIzQG2fMcgc0nkfbWE8cihhcb5FnALbQkjU9b5-qVcEoMHZlSuUA-jMEBMMVQ"; // A valid bearer token.
    String userId = "userId_example"; // The Kenjo employee *_id*.
    String email = "email_example"; // The Kenjo *email* for an employee.
    String externalId = "externalId_example"; // The *external id* for an employee for integrations.
    try {
      AttendanceCreateTrackTimeResponse result = client
              .attendance
              .createTrackTime(dateTime, authorization)
              .userId(userId)
              .email(email)
              .externalId(externalId)
              .execute();
      System.out.println(result);
      System.out.println(result.getUserId());
      System.out.println(result.getEmail());
      System.out.println(result.getExternalId());
      System.out.println(result.getDateTime());
    } catch (ApiException e) {
      System.err.println("Exception when calling AttendanceApi#createTrackTime");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AttendanceCreateTrackTimeResponse> response = client
              .attendance
              .createTrackTime(dateTime, authorization)
              .userId(userId)
              .email(email)
              .externalId(externalId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AttendanceApi#createTrackTime");
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
| **attendanceCreateTrackTimeRequest** | [**AttendanceCreateTrackTimeRequest**](AttendanceCreateTrackTimeRequest.md)|  | |

### Return type

[**AttendanceCreateTrackTimeResponse**](AttendanceCreateTrackTimeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | CREATED. The returned body matches with the input body. |  -  |
| **401** | UNAUTHORIZED. The Authorization header is incorrect, not provided or the token expired. |  -  |

<a name="getById"></a>
# **getById**
> AttendanceGetByIdResponse getById(attendanceId, authorization).execute();



This endpoint returns one attendance entry specified by  **attendanceId**.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Kenjo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AttendanceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox-api.kenjo.io/api/v1";
    Kenjo client = new Kenjo(configuration);
    String attendanceId = "60a2db290da29e126a18789a"; // The _id of the attendance entry to request.
    String authorization = "Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FwaS5rZW5qby5pbyIsInN1YiI6IjYwZjBhOTE2MjE0OTg3MjU2YmU5YzhmZiIsImF1ZCI6Imh0dHBzOi8vYXBpLmtlbmpvLmlvIiwiaWF0IjoxNjI2Mzg1MTE1LCJuYmYiOjE2MjYzODUxMTUsImV4cCI6MTYyNjU1NzkxNSwiYWNjZXNzVHlwZSI6IkFwaUFjY2VzcyIsInNfb3JnSWQiOiI2MGYwNGVhN2RmN2JhMjFlY2U0YmYzYzIifQ.cxG_7dIS-VbmDXdJuLkekoyuyCIzQG2fMcgc0nkfbWE8cihhcb5FnALbQkjU9b5-qVcEoMHZlSuUA-jMEBMMVQ"; // A valid bearer token.
    try {
      AttendanceGetByIdResponse result = client
              .attendance
              .getById(attendanceId, authorization)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getUserId());
      System.out.println(result.getEmail());
      System.out.println(result.getExternalId());
      System.out.println(result.getStartTime());
      System.out.println(result.getEndTime());
      System.out.println(result.getBreaks());
      System.out.println(result.getBreakTime());
      System.out.println(result.getAttendanceCategoryId());
      System.out.println(result.getAttendanceSubCategoryId());
      System.out.println(result.getComment());
    } catch (ApiException e) {
      System.err.println("Exception when calling AttendanceApi#getById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AttendanceGetByIdResponse> response = client
              .attendance
              .getById(attendanceId, authorization)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AttendanceApi#getById");
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
| **attendanceId** | **String**| The _id of the attendance entry to request. | |
| **authorization** | **String**| A valid bearer token. | |

### Return type

[**AttendanceGetByIdResponse**](AttendanceGetByIdResponse.md)

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

<a name="getCategories"></a>
# **getCategories**
> AttendanceGetCategoriesResponse getCategories(authorization).execute();



This endpoint returns an array of objects. Every object contains an attendance category.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Kenjo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AttendanceApi;
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
      AttendanceGetCategoriesResponse result = client
              .attendance
              .getCategories(authorization)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling AttendanceApi#getCategories");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AttendanceGetCategoriesResponse> response = client
              .attendance
              .getCategories(authorization)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AttendanceApi#getCategories");
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

[**AttendanceGetCategoriesResponse**](AttendanceGetCategoriesResponse.md)

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

<a name="getExpectedTimeByUser"></a>
# **getExpectedTimeByUser**
> AttendanceGetExpectedTimeByUserResponse getExpectedTimeByUser(from, to, authorization).companyId(companyId).officeId(officeId).departmentId(departmentId).userId(userId).offset(offset).limit(limit).execute();



This endpoint returns a paginated list of expected time by user for a given date range.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Kenjo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AttendanceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox-api.kenjo.io/api/v1";
    Kenjo client = new Kenjo(configuration);
    String from = "2020-01-01"; // A date in format YYYY-MM-DD to indicate the starting point.
    String to = "2020-01-10"; // A date in format YYYY-MM-DD to indicate the ending point.
    String authorization = "Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FwaS5rZW5qby5pbyIsInN1YiI6IjYwZjBhOTE2MjE0OTg3MjU2YmU5YzhmZiIsImF1ZCI6Imh0dHBzOi8vYXBpLmtlbmpvLmlvIiwiaWF0IjoxNjI2Mzg1MTE1LCJuYmYiOjE2MjYzODUxMTUsImV4cCI6MTYyNjU1NzkxNSwiYWNjZXNzVHlwZSI6IkFwaUFjY2VzcyIsInNfb3JnSWQiOiI2MGYwNGVhN2RmN2JhMjFlY2U0YmYzYzIifQ.cxG_7dIS-VbmDXdJuLkekoyuyCIzQG2fMcgc0nkfbWE8cihhcb5FnALbQkjU9b5-qVcEoMHZlSuUA-jMEBMMVQ"; // A valid bearer token.
    String companyId = "80a2db290da29e126a18789a"; // Optional filter. The company id of the Kenjo employee.
    String officeId = "80a2db290da29e126a18789d"; // Optional filter. The office id of the Kenjo employee.
    String departmentId = "80a2db290da29e126a18789c"; // Optional filter. The department id of the Kenjo employee.
    String userId = "80a2db290da29e126a18789c"; // Optional filter. The id of the Kenjo employee. It accepts 2 formats:<br><br> 1. An unique string with the Kenjo employee id. <br>Example: *userId=80a2db290da29e126a18789c* <br><br> 2. A string with more than one Kenjo employee ids separated by commas (until 15 ids as maximum). <br>Example: *userId=80a2db290da29e126a18789c,80a2db290da29e126a18789b,80a2db290da29e126a187891*
    Double offset = 1D; // Optional filter for pagination proposals. Determines the number of pages to skip when pagination is being used. If this value is not provided, by default the offset will be 1.
    Double limit = 25D; // Optional filter for pagination proposals. The maximum number of rows to retrieve which determines the size of the page. If this value is not provided then the limit will be 50 users. The maximum value of the limit is 100 users per page. Only are valid the following limit values: 25, 50 and 100.
    try {
      AttendanceGetExpectedTimeByUserResponse result = client
              .attendance
              .getExpectedTimeByUser(from, to, authorization)
              .companyId(companyId)
              .officeId(officeId)
              .departmentId(departmentId)
              .userId(userId)
              .offset(offset)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
      System.out.println(result.getMetadata());
    } catch (ApiException e) {
      System.err.println("Exception when calling AttendanceApi#getExpectedTimeByUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AttendanceGetExpectedTimeByUserResponse> response = client
              .attendance
              .getExpectedTimeByUser(from, to, authorization)
              .companyId(companyId)
              .officeId(officeId)
              .departmentId(departmentId)
              .userId(userId)
              .offset(offset)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AttendanceApi#getExpectedTimeByUser");
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
| **from** | **String**| A date in format YYYY-MM-DD to indicate the starting point. | |
| **to** | **String**| A date in format YYYY-MM-DD to indicate the ending point. | |
| **authorization** | **String**| A valid bearer token. | |
| **companyId** | **String**| Optional filter. The company id of the Kenjo employee. | [optional] |
| **officeId** | **String**| Optional filter. The office id of the Kenjo employee. | [optional] |
| **departmentId** | **String**| Optional filter. The department id of the Kenjo employee. | [optional] |
| **userId** | **String**| Optional filter. The id of the Kenjo employee. It accepts 2 formats:&lt;br&gt;&lt;br&gt; 1. An unique string with the Kenjo employee id. &lt;br&gt;Example: *userId&#x3D;80a2db290da29e126a18789c* &lt;br&gt;&lt;br&gt; 2. A string with more than one Kenjo employee ids separated by commas (until 15 ids as maximum). &lt;br&gt;Example: *userId&#x3D;80a2db290da29e126a18789c,80a2db290da29e126a18789b,80a2db290da29e126a187891* | [optional] |
| **offset** | **Double**| Optional filter for pagination proposals. Determines the number of pages to skip when pagination is being used. If this value is not provided, by default the offset will be 1. | [optional] |
| **limit** | **Double**| Optional filter for pagination proposals. The maximum number of rows to retrieve which determines the size of the page. If this value is not provided then the limit will be 50 users. The maximum value of the limit is 100 users per page. Only are valid the following limit values: 25, 50 and 100. | [optional] |

### Return type

[**AttendanceGetExpectedTimeByUserResponse**](AttendanceGetExpectedTimeByUserResponse.md)

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

<a name="getList"></a>
# **getList**
> List&lt;AttendanceGetListResponseInner&gt; getList(from, to, authorization).execute();



This endpoint returns an array of objects with all the existing attendance entries within Kenjo for a maximum of 31 days, defined by the required params **from** and **to**. Every object contains an attendance entry.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Kenjo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AttendanceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox-api.kenjo.io/api/v1";
    Kenjo client = new Kenjo(configuration);
    String from = "2021-02-01"; // A date in format YYYY-MM-DD to indicate the starting point.
    String to = "2021-02-04"; // A date in format YYYY-MM-DD to indicate the ending point.
    String authorization = "Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FwaS5rZW5qby5pbyIsInN1YiI6IjYwZjBhOTE2MjE0OTg3MjU2YmU5YzhmZiIsImF1ZCI6Imh0dHBzOi8vYXBpLmtlbmpvLmlvIiwiaWF0IjoxNjI2Mzg1MTE1LCJuYmYiOjE2MjYzODUxMTUsImV4cCI6MTYyNjU1NzkxNSwiYWNjZXNzVHlwZSI6IkFwaUFjY2VzcyIsInNfb3JnSWQiOiI2MGYwNGVhN2RmN2JhMjFlY2U0YmYzYzIifQ.cxG_7dIS-VbmDXdJuLkekoyuyCIzQG2fMcgc0nkfbWE8cihhcb5FnALbQkjU9b5-qVcEoMHZlSuUA-jMEBMMVQ"; // A valid bearer token.
    try {
      List<AttendanceGetListResponseInner> result = client
              .attendance
              .getList(from, to, authorization)
              .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AttendanceApi#getList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<List<AttendanceGetListResponseInner>> response = client
              .attendance
              .getList(from, to, authorization)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AttendanceApi#getList");
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
| **from** | **String**| A date in format YYYY-MM-DD to indicate the starting point. | |
| **to** | **String**| A date in format YYYY-MM-DD to indicate the ending point. | |
| **authorization** | **String**| A valid bearer token. | |

### Return type

[**List&lt;AttendanceGetListResponseInner&gt;**](AttendanceGetListResponseInner.md)

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
> removeById(attendanceId, authorization).execute();



This endpoint delete the attendance entry specified by **attendanceId**.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Kenjo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AttendanceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox-api.kenjo.io/api/v1";
    Kenjo client = new Kenjo(configuration);
    String attendanceId = "60a2db290da29e126a18789a"; // The Kenjo _id of the attendance entry to remove.
    String authorization = "Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FwaS5rZW5qby5pbyIsInN1YiI6IjYwZjBhOTE2MjE0OTg3MjU2YmU5YzhmZiIsImF1ZCI6Imh0dHBzOi8vYXBpLmtlbmpvLmlvIiwiaWF0IjoxNjI2Mzg1MTE1LCJuYmYiOjE2MjYzODUxMTUsImV4cCI6MTYyNjU1NzkxNSwiYWNjZXNzVHlwZSI6IkFwaUFjY2VzcyIsInNfb3JnSWQiOiI2MGYwNGVhN2RmN2JhMjFlY2U0YmYzYzIifQ.cxG_7dIS-VbmDXdJuLkekoyuyCIzQG2fMcgc0nkfbWE8cihhcb5FnALbQkjU9b5-qVcEoMHZlSuUA-jMEBMMVQ"; // A valid bearer token.
    try {
      client
              .attendance
              .removeById(attendanceId, authorization)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AttendanceApi#removeById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .attendance
              .removeById(attendanceId, authorization)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling AttendanceApi#removeById");
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
| **attendanceId** | **String**| The Kenjo _id of the attendance entry to remove. | |
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

<a name="updateEntry"></a>
# **updateEntry**
> AttendanceUpdateEntryResponse updateEntry(attendanceId, authorization, attendanceUpdateEntryRequest).execute();



This endpoint updates the attendance entry specified by **attendanceId**. Only the fields submitted in the body will be updated.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Kenjo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AttendanceApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox-api.kenjo.io/api/v1";
    Kenjo client = new Kenjo(configuration);
    String attendanceId = "60a2db290da29e126a18789a"; // The _id of the attendance entry to update.
    String authorization = "Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FwaS5rZW5qby5pbyIsInN1YiI6IjYwZjBhOTE2MjE0OTg3MjU2YmU5YzhmZiIsImF1ZCI6Imh0dHBzOi8vYXBpLmtlbmpvLmlvIiwiaWF0IjoxNjI2Mzg1MTE1LCJuYmYiOjE2MjYzODUxMTUsImV4cCI6MTYyNjU1NzkxNSwiYWNjZXNzVHlwZSI6IkFwaUFjY2VzcyIsInNfb3JnSWQiOiI2MGYwNGVhN2RmN2JhMjFlY2U0YmYzYzIifQ.cxG_7dIS-VbmDXdJuLkekoyuyCIzQG2fMcgc0nkfbWE8cihhcb5FnALbQkjU9b5-qVcEoMHZlSuUA-jMEBMMVQ"; // A valid bearer token.
    String startTime = "startTime_example"; // The new start time of the attendance entry to update. The valid format is *hh:mm:ss*
    String endTime = "endTime_example"; // The new end time of the attendance entry to update. The valid format is *hh:mm:ss*
    List<AttendanceUpdateEntryRequestBreaksInner> breaks = Arrays.asList(); // Array that contains the breaks in detail. Rules:<br> - A maximum of 10 breaks can be loaded via API.<br> - Breaks cannot be overlapped in the same day.<br> - 'start' field is required.<br> - There is no way to update specifically a break.<br> - To remove 'breaks', just send an empty array in the update, something like \\\"breaks\\\":[]
    String comment = "comment_example"; // Optional text to describe an attendance record (pair of startTime and endTime). The maximum number of characters is 150.
    try {
      AttendanceUpdateEntryResponse result = client
              .attendance
              .updateEntry(attendanceId, authorization)
              .startTime(startTime)
              .endTime(endTime)
              .breaks(breaks)
              .comment(comment)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getUserId());
      System.out.println(result.getEmail());
      System.out.println(result.getExternalId());
      System.out.println(result.getStartTime());
      System.out.println(result.getEndTime());
      System.out.println(result.getBreakTime());
      System.out.println(result.getComment());
    } catch (ApiException e) {
      System.err.println("Exception when calling AttendanceApi#updateEntry");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AttendanceUpdateEntryResponse> response = client
              .attendance
              .updateEntry(attendanceId, authorization)
              .startTime(startTime)
              .endTime(endTime)
              .breaks(breaks)
              .comment(comment)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AttendanceApi#updateEntry");
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
| **attendanceId** | **String**| The _id of the attendance entry to update. | |
| **authorization** | **String**| A valid bearer token. | |
| **attendanceUpdateEntryRequest** | [**AttendanceUpdateEntryRequest**](AttendanceUpdateEntryRequest.md)|  | |

### Return type

[**AttendanceUpdateEntryResponse**](AttendanceUpdateEntryResponse.md)

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

