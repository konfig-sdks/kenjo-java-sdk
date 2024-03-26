# EmployeesApi

All URIs are relative to *https://sandbox-api.kenjo.io/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**activateEmployee**](EmployeesApi.md#activateEmployee) | **PUT** /employees/{employeeId}/activate |  |
| [**createInactiveEmployee**](EmployeesApi.md#createInactiveEmployee) | **POST** /employees |  |
| [**deactivateEmployeeById**](EmployeesApi.md#deactivateEmployeeById) | **PUT** /employees/{employeeId}/deactivate |  |
| [**getAccounts**](EmployeesApi.md#getAccounts) | **GET** /employees/accounts |  |
| [**getEmployeeInformation**](EmployeesApi.md#getEmployeeInformation) | **GET** /employees/{employeeId} |  |
| [**getList**](EmployeesApi.md#getList) | **GET** /employees |  |
| [**getWorkSchedules**](EmployeesApi.md#getWorkSchedules) | **GET** /employees/work-schedules |  |
| [**listAddresses**](EmployeesApi.md#listAddresses) | **GET** /employees/addresses |  |
| [**listFinancials**](EmployeesApi.md#listFinancials) | **GET** /employees/financials |  |
| [**listHomes**](EmployeesApi.md#listHomes) | **GET** /employees/homes |  |
| [**listPersonals**](EmployeesApi.md#listPersonals) | **GET** /employees/personals |  |
| [**listWorks**](EmployeesApi.md#listWorks) | **GET** /employees/works |  |
| [**updateAddress**](EmployeesApi.md#updateAddress) | **PUT** /employees/{employeeId}/addresses |  |
| [**updateEmployeeAccounts**](EmployeesApi.md#updateEmployeeAccounts) | **PUT** /employees/{employeeId}/accounts |  |
| [**updateFinancials**](EmployeesApi.md#updateFinancials) | **PUT** /employees/{employeeId}/financials |  |
| [**updateHome**](EmployeesApi.md#updateHome) | **PUT** /employees/{employeeId}/homes |  |
| [**updatePersonals**](EmployeesApi.md#updatePersonals) | **PUT** /employees/{employeeId}/personals |  |
| [**updateWorkSchedule**](EmployeesApi.md#updateWorkSchedule) | **PUT** /employees/{employeeId}/work-schedules |  |
| [**updateWorks**](EmployeesApi.md#updateWorks) | **PUT** /employees/{employeeId}/works |  |


<a name="activateEmployee"></a>
# **activateEmployee**
> String activateEmployee(employeeId, authorization).execute();



This endpoint activates a Kenjo employee given by the employeeId. It sends an email to the recipient of the employee email to start the onboarding process. Once the password is filled, the employee changes to &#39;active&#39; (&#39;isActive&#39; &#x3D; TRUE). While the employee is not active it is possible to send activation emails.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Kenjo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox-api.kenjo.io/api/v1";
    Kenjo client = new Kenjo(configuration);
    String employeeId = "60a2db290da29e126a18789a"; // The _id of the employee to send the activation email.
    String authorization = "Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FwaS5rZW5qby5pbyIsInN1YiI6IjYwZjBhOTE2MjE0OTg3MjU2YmU5YzhmZiIsImF1ZCI6Imh0dHBzOi8vYXBpLmtlbmpvLmlvIiwiaWF0IjoxNjI2Mzg1MTE1LCJuYmYiOjE2MjYzODUxMTUsImV4cCI6MTYyNjU1NzkxNSwiYWNjZXNzVHlwZSI6IkFwaUFjY2VzcyIsInNfb3JnSWQiOiI2MGYwNGVhN2RmN2JhMjFlY2U0YmYzYzIifQ.cxG_7dIS-VbmDXdJuLkekoyuyCIzQG2fMcgc0nkfbWE8cihhcb5FnALbQkjU9b5-qVcEoMHZlSuUA-jMEBMMVQ"; // A valid bearer token.
    try {
      String result = client
              .employees
              .activateEmployee(employeeId, authorization)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#activateEmployee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .employees
              .activateEmployee(employeeId, authorization)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#activateEmployee");
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
| **employeeId** | **String**| The _id of the employee to send the activation email. | |
| **authorization** | **String**| A valid bearer token. | |

### Return type

**String**

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

<a name="createInactiveEmployee"></a>
# **createInactiveEmployee**
> EmployeesCreateInactiveEmployeeResponse createInactiveEmployee(authorization, employeesCreateInactiveEmployeeRequest).execute();



This endpoint creates a deactivated employee in Kenjo, the &#39;isActive&#39; field set to false. To activate an employee use the put /activate method. This method will send an activation message to the employee email to complete the activation through the onboarding wizard. &lt;br&gt;&lt;br&gt;The field *email* is required and must be unique. Also *firstName*, *lastName* and *companyId* are required fields. If the work schedule is not provided then all the days of the week except Saturdays and Sundays are set to true. If the *language* is not specified, the assigned company language will be set by default. &lt;br&gt;&lt;br&gt;**Custom fields** information can be provided in this operation for the **personal**, **work**, **address**, **financial** and **home** sections. The *API name* of the custom field is required and the data format has to match with the type defined for the custom field in Kenjo. API names start with &#39;c_&#39; and the rest is composed by the trimmed name (spaces are removed). &lt;br&gt;&lt;br&gt; Example: &lt;br&gt; *The custom field &#39;Activity type&#39; belongs to the section &#39;work&#39;*:   &#x60;&#x60;&#x60; ... {   ...     \&quot;work\&quot;: {       \&quot;c_Activitytype\&quot;: \&quot;1\&quot;,       ...     },   ... } &#x60;&#x60;&#x60; *&#39;Activity type&#39; is a field type &#39;List&#39; (Strings list) with the possible values: \&quot;1\&quot;, \&quot;2\&quot; and \&quot;3\&quot;. It means that if a different value or type is provided then the request will return an error.* &lt;br&gt;&lt;br&gt;If the operation get success then an inactive employee is created and the response will include the provided information and the Kenjo id for the new employee. 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Kenjo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox-api.kenjo.io/api/v1";
    Kenjo client = new Kenjo(configuration);
    String authorization = "Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FwaS5rZW5qby5pbyIsInN1YiI6IjYwZjBhOTE2MjE0OTg3MjU2YmU5YzhmZiIsImF1ZCI6Imh0dHBzOi8vYXBpLmtlbmpvLmlvIiwiaWF0IjoxNjI2Mzg1MTE1LCJuYmYiOjE2MjYzODUxMTUsImV4cCI6MTYyNjU1NzkxNSwiYWNjZXNzVHlwZSI6IkFwaUFjY2VzcyIsInNfb3JnSWQiOiI2MGYwNGVhN2RmN2JhMjFlY2U0YmYzYzIifQ.cxG_7dIS-VbmDXdJuLkekoyuyCIzQG2fMcgc0nkfbWE8cihhcb5FnALbQkjU9b5-qVcEoMHZlSuUA-jMEBMMVQ"; // A valid bearer token.
    EmployeesCreateInactiveEmployeeRequestAccount account = new EmployeesCreateInactiveEmployeeRequestAccount();
    EmployeesCreateInactiveEmployeeRequestPersonal personal = new EmployeesCreateInactiveEmployeeRequestPersonal();
    EmployeesCreateInactiveEmployeeRequestWork work = new EmployeesCreateInactiveEmployeeRequestWork();
    EmployeesCreateInactiveEmployeeRequestWorkSchedule workSchedule = new EmployeesCreateInactiveEmployeeRequestWorkSchedule();
    EmployeesCreateInactiveEmployeeRequestAddress address = new EmployeesCreateInactiveEmployeeRequestAddress();
    EmployeesCreateInactiveEmployeeRequestFinancial financial = new EmployeesCreateInactiveEmployeeRequestFinancial();
    EmployeesCreateInactiveEmployeeRequestHome home = new EmployeesCreateInactiveEmployeeRequestHome();
    try {
      EmployeesCreateInactiveEmployeeResponse result = client
              .employees
              .createInactiveEmployee(authorization)
              .account(account)
              .personal(personal)
              .work(work)
              .workSchedule(workSchedule)
              .address(address)
              .financial(financial)
              .home(home)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccount());
      System.out.println(result.getPersonal());
      System.out.println(result.getWork());
      System.out.println(result.getWorkSchedule());
      System.out.println(result.getAddress());
      System.out.println(result.getFinancial());
      System.out.println(result.getHome());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#createInactiveEmployee");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeesCreateInactiveEmployeeResponse> response = client
              .employees
              .createInactiveEmployee(authorization)
              .account(account)
              .personal(personal)
              .work(work)
              .workSchedule(workSchedule)
              .address(address)
              .financial(financial)
              .home(home)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#createInactiveEmployee");
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
| **employeesCreateInactiveEmployeeRequest** | [**EmployeesCreateInactiveEmployeeRequest**](EmployeesCreateInactiveEmployeeRequest.md)|  | |

### Return type

[**EmployeesCreateInactiveEmployeeResponse**](EmployeesCreateInactiveEmployeeResponse.md)

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

<a name="deactivateEmployeeById"></a>
# **deactivateEmployeeById**
> String deactivateEmployeeById(employeeId, authorization).execute();



This endpoint deactivates a Kenjo employee given by the employeeId. It sets the isActive field to FALSE and invalidate the access Kenjo for the employee. While the employee is not active it is possible to send activation emails.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Kenjo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox-api.kenjo.io/api/v1";
    Kenjo client = new Kenjo(configuration);
    String employeeId = "60a2db290da29e126a18789a"; // The _id of the employee to update.
    String authorization = "Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FwaS5rZW5qby5pbyIsInN1YiI6IjYwZjBhOTE2MjE0OTg3MjU2YmU5YzhmZiIsImF1ZCI6Imh0dHBzOi8vYXBpLmtlbmpvLmlvIiwiaWF0IjoxNjI2Mzg1MTE1LCJuYmYiOjE2MjYzODUxMTUsImV4cCI6MTYyNjU1NzkxNSwiYWNjZXNzVHlwZSI6IkFwaUFjY2VzcyIsInNfb3JnSWQiOiI2MGYwNGVhN2RmN2JhMjFlY2U0YmYzYzIifQ.cxG_7dIS-VbmDXdJuLkekoyuyCIzQG2fMcgc0nkfbWE8cihhcb5FnALbQkjU9b5-qVcEoMHZlSuUA-jMEBMMVQ"; // A valid bearer token.
    try {
      String result = client
              .employees
              .deactivateEmployeeById(employeeId, authorization)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#deactivateEmployeeById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<String> response = client
              .employees
              .deactivateEmployeeById(employeeId, authorization)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#deactivateEmployeeById");
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
| **employeeId** | **String**| The _id of the employee to update. | |
| **authorization** | **String**| A valid bearer token. | |

### Return type

**String**

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

<a name="getAccounts"></a>
# **getAccounts**
> EmployeesGetAccountsResponse getAccounts(authorization).email(email).language(language).externalId(externalId).isActive(isActive).execute();



This endpoint returns a list with the **account** sections of the existing employees. The account section contains information such as *email*, *external Id*, *language* and *activation status*.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Kenjo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox-api.kenjo.io/api/v1";
    Kenjo client = new Kenjo(configuration);
    String authorization = "Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FwaS5rZW5qby5pbyIsInN1YiI6IjYwZjBhOTE2MjE0OTg3MjU2YmU5YzhmZiIsImF1ZCI6Imh0dHBzOi8vYXBpLmtlbmpvLmlvIiwiaWF0IjoxNjI2Mzg1MTE1LCJuYmYiOjE2MjYzODUxMTUsImV4cCI6MTYyNjU1NzkxNSwiYWNjZXNzVHlwZSI6IkFwaUFjY2VzcyIsInNfb3JnSWQiOiI2MGYwNGVhN2RmN2JhMjFlY2U0YmYzYzIifQ.cxG_7dIS-VbmDXdJuLkekoyuyCIzQG2fMcgc0nkfbWE8cihhcb5FnALbQkjU9b5-qVcEoMHZlSuUA-jMEBMMVQ"; // A valid bearer token.
    String email = "john.doe@acme.com"; // The Kenjo email of the employee.
    String language = "en"; // The employee language.
    String externalId = "USER-123456"; // The external id of the employee.
    Boolean isActive = true; // The employee activation status.
    try {
      EmployeesGetAccountsResponse result = client
              .employees
              .getAccounts(authorization)
              .email(email)
              .language(language)
              .externalId(externalId)
              .isActive(isActive)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#getAccounts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeesGetAccountsResponse> response = client
              .employees
              .getAccounts(authorization)
              .email(email)
              .language(language)
              .externalId(externalId)
              .isActive(isActive)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#getAccounts");
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
| **email** | **String**| The Kenjo email of the employee. | [optional] |
| **language** | **String**| The employee language. | [optional] [enum: en, de, es] |
| **externalId** | **String**| The external id of the employee. | [optional] |
| **isActive** | **Boolean**| The employee activation status. | [optional] |

### Return type

[**EmployeesGetAccountsResponse**](EmployeesGetAccountsResponse.md)

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

<a name="getEmployeeInformation"></a>
# **getEmployeeInformation**
> EmployeesGetEmployeeInformationResponse getEmployeeInformation(authorization, employeeId).execute();



This endpoint returns information about the **account**, **personal**, **work**, **work schedule**, **address**, **financial** and **home** sections for a given employee id. The *employeeId* param represents a Kenjo employee id.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Kenjo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox-api.kenjo.io/api/v1";
    Kenjo client = new Kenjo(configuration);
    String authorization = "Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FwaS5rZW5qby5pbyIsInN1YiI6IjYwZjBhOTE2MjE0OTg3MjU2YmU5YzhmZiIsImF1ZCI6Imh0dHBzOi8vYXBpLmtlbmpvLmlvIiwiaWF0IjoxNjI2Mzg1MTE1LCJuYmYiOjE2MjYzODUxMTUsImV4cCI6MTYyNjU1NzkxNSwiYWNjZXNzVHlwZSI6IkFwaUFjY2VzcyIsInNfb3JnSWQiOiI2MGYwNGVhN2RmN2JhMjFlY2U0YmYzYzIifQ.cxG_7dIS-VbmDXdJuLkekoyuyCIzQG2fMcgc0nkfbWE8cihhcb5FnALbQkjU9b5-qVcEoMHZlSuUA-jMEBMMVQ"; // A valid bearer token.
    String employeeId = "50a2db290da29e126a187843"; // The _id of the employee to request.
    try {
      EmployeesGetEmployeeInformationResponse result = client
              .employees
              .getEmployeeInformation(authorization, employeeId)
              .execute();
      System.out.println(result);
      System.out.println(result.getAccount());
      System.out.println(result.getPersonal());
      System.out.println(result.getWork());
      System.out.println(result.getWorkSchedule());
      System.out.println(result.getAddress());
      System.out.println(result.getFinancial());
      System.out.println(result.getHome());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#getEmployeeInformation");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeesGetEmployeeInformationResponse> response = client
              .employees
              .getEmployeeInformation(authorization, employeeId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#getEmployeeInformation");
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
| **employeeId** | **String**| The _id of the employee to request. | |

### Return type

[**EmployeesGetEmployeeInformationResponse**](EmployeesGetEmployeeInformationResponse.md)

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
> EmployeesGetListResponse getList(authorization).execute();



This endpoint returns the list of employee accounts existing in Kenjo. It is similar to the *_/employees/accounts* endpoint.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Kenjo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeesApi;
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
      EmployeesGetListResponse result = client
              .employees
              .getList(authorization)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#getList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeesGetListResponse> response = client
              .employees
              .getList(authorization)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#getList");
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

[**EmployeesGetListResponse**](EmployeesGetListResponse.md)

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

<a name="getWorkSchedules"></a>
# **getWorkSchedules**
> EmployeesGetWorkSchedulesResponse getWorkSchedules(authorization).trackAttendance(trackAttendance).execute();



This endpoint returns a list with the **work schedule** sections of the existing employees.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Kenjo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox-api.kenjo.io/api/v1";
    Kenjo client = new Kenjo(configuration);
    String authorization = "Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FwaS5rZW5qby5pbyIsInN1YiI6IjYwZjBhOTE2MjE0OTg3MjU2YmU5YzhmZiIsImF1ZCI6Imh0dHBzOi8vYXBpLmtlbmpvLmlvIiwiaWF0IjoxNjI2Mzg1MTE1LCJuYmYiOjE2MjYzODUxMTUsImV4cCI6MTYyNjU1NzkxNSwiYWNjZXNzVHlwZSI6IkFwaUFjY2VzcyIsInNfb3JnSWQiOiI2MGYwNGVhN2RmN2JhMjFlY2U0YmYzYzIifQ.cxG_7dIS-VbmDXdJuLkekoyuyCIzQG2fMcgc0nkfbWE8cihhcb5FnALbQkjU9b5-qVcEoMHZlSuUA-jMEBMMVQ"; // A valid bearer token.
    Boolean trackAttendance = false; // The activation status of attendance tracking for the employee.
    try {
      EmployeesGetWorkSchedulesResponse result = client
              .employees
              .getWorkSchedules(authorization)
              .trackAttendance(trackAttendance)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#getWorkSchedules");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeesGetWorkSchedulesResponse> response = client
              .employees
              .getWorkSchedules(authorization)
              .trackAttendance(trackAttendance)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#getWorkSchedules");
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
| **trackAttendance** | **Boolean**| The activation status of attendance tracking for the employee. | [optional] |

### Return type

[**EmployeesGetWorkSchedulesResponse**](EmployeesGetWorkSchedulesResponse.md)

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

<a name="listAddresses"></a>
# **listAddresses**
> EmployeesListAddressesResponse listAddresses(authorization).street(street).postalCode(postalCode).city(city).country(country).execute();



This endpoint returns a list with the **address** sections of the existing employees.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Kenjo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox-api.kenjo.io/api/v1";
    Kenjo client = new Kenjo(configuration);
    String authorization = "Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FwaS5rZW5qby5pbyIsInN1YiI6IjYwZjBhOTE2MjE0OTg3MjU2YmU5YzhmZiIsImF1ZCI6Imh0dHBzOi8vYXBpLmtlbmpvLmlvIiwiaWF0IjoxNjI2Mzg1MTE1LCJuYmYiOjE2MjYzODUxMTUsImV4cCI6MTYyNjU1NzkxNSwiYWNjZXNzVHlwZSI6IkFwaUFjY2VzcyIsInNfb3JnSWQiOiI2MGYwNGVhN2RmN2JhMjFlY2U0YmYzYzIifQ.cxG_7dIS-VbmDXdJuLkekoyuyCIzQG2fMcgc0nkfbWE8cihhcb5FnALbQkjU9b5-qVcEoMHZlSuUA-jMEBMMVQ"; // A valid bearer token.
    String street = " Calle Enrique San Francisco 13"; // The name of the street.
    String postalCode = "28080"; // The postal code.
    String city = "Madrid"; // The city.
    String country = "ES"; // The country code in ISO 3166-1 alpha-2.
    try {
      EmployeesListAddressesResponse result = client
              .employees
              .listAddresses(authorization)
              .street(street)
              .postalCode(postalCode)
              .city(city)
              .country(country)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#listAddresses");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeesListAddressesResponse> response = client
              .employees
              .listAddresses(authorization)
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
      System.err.println("Exception when calling EmployeesApi#listAddresses");
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
| **street** | **String**| The name of the street. | [optional] |
| **postalCode** | **String**| The postal code. | [optional] |
| **city** | **String**| The city. | [optional] |
| **country** | **String**| The country code in ISO 3166-1 alpha-2. | [optional] |

### Return type

[**EmployeesListAddressesResponse**](EmployeesListAddressesResponse.md)

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

<a name="listFinancials"></a>
# **listFinancials**
> EmployeesListFinancialsResponse listFinancials(authorization).accountHolderName(accountHolderName).bankName(bankName).accountNumber(accountNumber).iban(iban).swiftCode(swiftCode).nationalId(nationalId).passport(passport).nationalInsuranceNumber(nationalInsuranceNumber).taxCode(taxCode).taxIdentificationNumber(taxIdentificationNumber).execute();



This endpoint returns a list with the **financial** sections of the existing employees.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Kenjo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox-api.kenjo.io/api/v1";
    Kenjo client = new Kenjo(configuration);
    String authorization = "Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FwaS5rZW5qby5pbyIsInN1YiI6IjYwZjBhOTE2MjE0OTg3MjU2YmU5YzhmZiIsImF1ZCI6Imh0dHBzOi8vYXBpLmtlbmpvLmlvIiwiaWF0IjoxNjI2Mzg1MTE1LCJuYmYiOjE2MjYzODUxMTUsImV4cCI6MTYyNjU1NzkxNSwiYWNjZXNzVHlwZSI6IkFwaUFjY2VzcyIsInNfb3JnSWQiOiI2MGYwNGVhN2RmN2JhMjFlY2U0YmYzYzIifQ.cxG_7dIS-VbmDXdJuLkekoyuyCIzQG2fMcgc0nkfbWE8cihhcb5FnALbQkjU9b5-qVcEoMHZlSuUA-jMEBMMVQ"; // A valid bearer token.
    String accountHolderName = "Michael Corleone"; // The accounts holder's name.
    String bankName = "Bank of Sicily"; // The bank name.
    String accountNumber = "0093 344 2132221 3304 00"; // The account number.
    String iban = "DE32120222391919191911"; // The IBAN.
    String swiftCode = "12321234"; // The SWIFT code.
    String nationalId = "04123547X"; // The national id document
    String passport = "FA1234098"; // The passport number.
    String nationalInsuranceNumber = "23123312321"; // The national insurance number.
    String taxCode = "323451R"; // The tax number.
    String taxIdentificationNumber = "T4312345"; // The tax identification number.
    try {
      EmployeesListFinancialsResponse result = client
              .employees
              .listFinancials(authorization)
              .accountHolderName(accountHolderName)
              .bankName(bankName)
              .accountNumber(accountNumber)
              .iban(iban)
              .swiftCode(swiftCode)
              .nationalId(nationalId)
              .passport(passport)
              .nationalInsuranceNumber(nationalInsuranceNumber)
              .taxCode(taxCode)
              .taxIdentificationNumber(taxIdentificationNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#listFinancials");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeesListFinancialsResponse> response = client
              .employees
              .listFinancials(authorization)
              .accountHolderName(accountHolderName)
              .bankName(bankName)
              .accountNumber(accountNumber)
              .iban(iban)
              .swiftCode(swiftCode)
              .nationalId(nationalId)
              .passport(passport)
              .nationalInsuranceNumber(nationalInsuranceNumber)
              .taxCode(taxCode)
              .taxIdentificationNumber(taxIdentificationNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#listFinancials");
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
| **accountHolderName** | **String**| The accounts holder&#39;s name. | [optional] |
| **bankName** | **String**| The bank name. | [optional] |
| **accountNumber** | **String**| The account number. | [optional] |
| **iban** | **String**| The IBAN. | [optional] |
| **swiftCode** | **String**| The SWIFT code. | [optional] |
| **nationalId** | **String**| The national id document | [optional] |
| **passport** | **String**| The passport number. | [optional] |
| **nationalInsuranceNumber** | **String**| The national insurance number. | [optional] |
| **taxCode** | **String**| The tax number. | [optional] |
| **taxIdentificationNumber** | **String**| The tax identification number. | [optional] |

### Return type

[**EmployeesListFinancialsResponse**](EmployeesListFinancialsResponse.md)

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

<a name="listHomes"></a>
# **listHomes**
> EmployeesListHomesResponse listHomes(authorization).maritalStatus(maritalStatus).spouseFirstName(spouseFirstName).spouseLastName(spouseLastName).spouseBirthdate(spouseBirthdate).spouseGender(spouseGender).personalEmail(personalEmail).personalPhone(personalPhone).personalMobile(personalMobile).execute();



This endpoint returns a list with the **home** sections of the existing employees.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Kenjo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox-api.kenjo.io/api/v1";
    Kenjo client = new Kenjo(configuration);
    String authorization = "Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FwaS5rZW5qby5pbyIsInN1YiI6IjYwZjBhOTE2MjE0OTg3MjU2YmU5YzhmZiIsImF1ZCI6Imh0dHBzOi8vYXBpLmtlbmpvLmlvIiwiaWF0IjoxNjI2Mzg1MTE1LCJuYmYiOjE2MjYzODUxMTUsImV4cCI6MTYyNjU1NzkxNSwiYWNjZXNzVHlwZSI6IkFwaUFjY2VzcyIsInNfb3JnSWQiOiI2MGYwNGVhN2RmN2JhMjFlY2U0YmYzYzIifQ.cxG_7dIS-VbmDXdJuLkekoyuyCIzQG2fMcgc0nkfbWE8cihhcb5FnALbQkjU9b5-qVcEoMHZlSuUA-jMEBMMVQ"; // A valid bearer token.
    String maritalStatus = "Divorced"; // The marital status. Only is valid one of the following values \"Divorced\", \"Domestic Partnership\", \"Married\", \"Separated\", \"Single\", \"Widowed\".
    String spouseFirstName = "Catherine"; // The first name of the employee's spouse.
    String spouseLastName = "Tramell"; // The last name of the employee's spouse.
    String spouseBirthdate = "2060-01-26T00:00:00.000Z"; // The birth date of the employee's spouse. Format YYYY-MM-DDThh:mm:ss.000Z.
    String spouseGender = "Male"; // The employee's spouse gender. Only is valid one of the following values 'Male' (male), 'Female' (female) or 'Other' (other).
    String personalEmail = "john.doe@acme.com"; // The employee personal email.
    String personalPhone = "4567092323"; // The employee personal phone.
    String personalMobile = "3567092310"; // The employee personal mobile.
    try {
      EmployeesListHomesResponse result = client
              .employees
              .listHomes(authorization)
              .maritalStatus(maritalStatus)
              .spouseFirstName(spouseFirstName)
              .spouseLastName(spouseLastName)
              .spouseBirthdate(spouseBirthdate)
              .spouseGender(spouseGender)
              .personalEmail(personalEmail)
              .personalPhone(personalPhone)
              .personalMobile(personalMobile)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#listHomes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeesListHomesResponse> response = client
              .employees
              .listHomes(authorization)
              .maritalStatus(maritalStatus)
              .spouseFirstName(spouseFirstName)
              .spouseLastName(spouseLastName)
              .spouseBirthdate(spouseBirthdate)
              .spouseGender(spouseGender)
              .personalEmail(personalEmail)
              .personalPhone(personalPhone)
              .personalMobile(personalMobile)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#listHomes");
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
| **maritalStatus** | **String**| The marital status. Only is valid one of the following values \&quot;Divorced\&quot;, \&quot;Domestic Partnership\&quot;, \&quot;Married\&quot;, \&quot;Separated\&quot;, \&quot;Single\&quot;, \&quot;Widowed\&quot;. | [optional] [enum: Divorced, Domestic Partnership, Married, Separated, Single, Widowed] |
| **spouseFirstName** | **String**| The first name of the employee&#39;s spouse. | [optional] |
| **spouseLastName** | **String**| The last name of the employee&#39;s spouse. | [optional] |
| **spouseBirthdate** | **String**| The birth date of the employee&#39;s spouse. Format YYYY-MM-DDThh:mm:ss.000Z. | [optional] |
| **spouseGender** | **String**| The employee&#39;s spouse gender. Only is valid one of the following values &#39;Male&#39; (male), &#39;Female&#39; (female) or &#39;Other&#39; (other). | [optional] [enum: Male, Female, Other] |
| **personalEmail** | **String**| The employee personal email. | [optional] |
| **personalPhone** | **String**| The employee personal phone. | [optional] |
| **personalMobile** | **String**| The employee personal mobile. | [optional] |

### Return type

[**EmployeesListHomesResponse**](EmployeesListHomesResponse.md)

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

<a name="listPersonals"></a>
# **listPersonals**
> EmployeesListPersonalsResponse listPersonals(authorization).firstName(firstName).lastName(lastName).displayName(displayName).gender(gender).birthdate(birthdate).execute();



This endpoint returns a list with the **personal** sections of the existing employees.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Kenjo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox-api.kenjo.io/api/v1";
    Kenjo client = new Kenjo(configuration);
    String authorization = "Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FwaS5rZW5qby5pbyIsInN1YiI6IjYwZjBhOTE2MjE0OTg3MjU2YmU5YzhmZiIsImF1ZCI6Imh0dHBzOi8vYXBpLmtlbmpvLmlvIiwiaWF0IjoxNjI2Mzg1MTE1LCJuYmYiOjE2MjYzODUxMTUsImV4cCI6MTYyNjU1NzkxNSwiYWNjZXNzVHlwZSI6IkFwaUFjY2VzcyIsInNfb3JnSWQiOiI2MGYwNGVhN2RmN2JhMjFlY2U0YmYzYzIifQ.cxG_7dIS-VbmDXdJuLkekoyuyCIzQG2fMcgc0nkfbWE8cihhcb5FnALbQkjU9b5-qVcEoMHZlSuUA-jMEBMMVQ"; // A valid bearer token.
    String firstName = "John"; // The name of the Kenjo employee. This field is required.
    String lastName = "Doe"; // The surname of the Kenjo employee. This field is required.
    String displayName = "John Doe"; // The composition of firstName and lastName of the Kenjo employee.
    String gender = "Male"; // The employee gender. Only is valid one of the following values 'Male' (male), 'Female' (female) or 'Other' (other).
    String birthdate = "1980-01-28T00:00:00.000Z"; // The employee birth date. Format YYYY-MM-DDThh:00:00.000Z.
    try {
      EmployeesListPersonalsResponse result = client
              .employees
              .listPersonals(authorization)
              .firstName(firstName)
              .lastName(lastName)
              .displayName(displayName)
              .gender(gender)
              .birthdate(birthdate)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#listPersonals");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeesListPersonalsResponse> response = client
              .employees
              .listPersonals(authorization)
              .firstName(firstName)
              .lastName(lastName)
              .displayName(displayName)
              .gender(gender)
              .birthdate(birthdate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#listPersonals");
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
| **firstName** | **String**| The name of the Kenjo employee. This field is required. | [optional] |
| **lastName** | **String**| The surname of the Kenjo employee. This field is required. | [optional] |
| **displayName** | **String**| The composition of firstName and lastName of the Kenjo employee. | [optional] |
| **gender** | **String**| The employee gender. Only is valid one of the following values &#39;Male&#39; (male), &#39;Female&#39; (female) or &#39;Other&#39; (other). | [optional] [enum: Male, Female, Other] |
| **birthdate** | **String**| The employee birth date. Format YYYY-MM-DDThh:00:00.000Z. | [optional] |

### Return type

[**EmployeesListPersonalsResponse**](EmployeesListPersonalsResponse.md)

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

<a name="listWorks"></a>
# **listWorks**
> EmployeesListWorksResponse listWorks(authorization).companyId(companyId).officeId(officeId).departmentId(departmentId).startDate(startDate).jobTitle(jobTitle).workPhone(workPhone).workMobile(workMobile).isAssistant(isAssistant).probationPeriodEnd(probationPeriodEnd).reportsToId(reportsToId).execute();



This endpoint returns a list with the **work** sections of the existing employees.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Kenjo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox-api.kenjo.io/api/v1";
    Kenjo client = new Kenjo(configuration);
    String authorization = "Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FwaS5rZW5qby5pbyIsInN1YiI6IjYwZjBhOTE2MjE0OTg3MjU2YmU5YzhmZiIsImF1ZCI6Imh0dHBzOi8vYXBpLmtlbmpvLmlvIiwiaWF0IjoxNjI2Mzg1MTE1LCJuYmYiOjE2MjYzODUxMTUsImV4cCI6MTYyNjU1NzkxNSwiYWNjZXNzVHlwZSI6IkFwaUFjY2VzcyIsInNfb3JnSWQiOiI2MGYwNGVhN2RmN2JhMjFlY2U0YmYzYzIifQ.cxG_7dIS-VbmDXdJuLkekoyuyCIzQG2fMcgc0nkfbWE8cihhcb5FnALbQkjU9b5-qVcEoMHZlSuUA-jMEBMMVQ"; // A valid bearer token.
    String companyId = "80a2db290da29e126a18789a"; // The company id of the Kenjo employee.
    String officeId = "80a2db290da29e126a18789d"; // The office id of the Kenjo employee.
    String departmentId = "80a2db290da29e126a18789c"; // The department id of the Kenjo employee.
    String startDate = "2022-06-01T00:00:00.000Z"; // The starting date of the Kenjo employee in format YYYY-MM-DDThh:mm:ss.
    String jobTitle = "Actor"; // The job title of the employee.
    String workPhone = "34 666 70 90 32"; // The work phone of the employee.
    String workMobile = "34 680 70 90 32"; // The work mobile of the employee.
    Boolean isAssistant = true; // Allow to indicate if the employee has or not the assistant role.
    String probationPeriodEnd = "2022-06-01T00:00:00.000Z"; // The probation period of the employee. Format YYYY-MM-DDThh:mm:ss.000Z.
    String reportsToId = "80a2db290da29e126a187891"; // The Kenjo employee id of the user to whom the employee reports. The employee id to assign can be an active or inactive user. Trying to assign the own employee id or the id of someone who is already reporting will arise an error.
    try {
      EmployeesListWorksResponse result = client
              .employees
              .listWorks(authorization)
              .companyId(companyId)
              .officeId(officeId)
              .departmentId(departmentId)
              .startDate(startDate)
              .jobTitle(jobTitle)
              .workPhone(workPhone)
              .workMobile(workMobile)
              .isAssistant(isAssistant)
              .probationPeriodEnd(probationPeriodEnd)
              .reportsToId(reportsToId)
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#listWorks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeesListWorksResponse> response = client
              .employees
              .listWorks(authorization)
              .companyId(companyId)
              .officeId(officeId)
              .departmentId(departmentId)
              .startDate(startDate)
              .jobTitle(jobTitle)
              .workPhone(workPhone)
              .workMobile(workMobile)
              .isAssistant(isAssistant)
              .probationPeriodEnd(probationPeriodEnd)
              .reportsToId(reportsToId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#listWorks");
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
| **companyId** | **String**| The company id of the Kenjo employee. | [optional] |
| **officeId** | **String**| The office id of the Kenjo employee. | [optional] |
| **departmentId** | **String**| The department id of the Kenjo employee. | [optional] |
| **startDate** | **String**| The starting date of the Kenjo employee in format YYYY-MM-DDThh:mm:ss. | [optional] |
| **jobTitle** | **String**| The job title of the employee. | [optional] |
| **workPhone** | **String**| The work phone of the employee. | [optional] |
| **workMobile** | **String**| The work mobile of the employee. | [optional] |
| **isAssistant** | **Boolean**| Allow to indicate if the employee has or not the assistant role. | [optional] |
| **probationPeriodEnd** | **String**| The probation period of the employee. Format YYYY-MM-DDThh:mm:ss.000Z. | [optional] |
| **reportsToId** | **String**| The Kenjo employee id of the user to whom the employee reports. The employee id to assign can be an active or inactive user. Trying to assign the own employee id or the id of someone who is already reporting will arise an error. | [optional] |

### Return type

[**EmployeesListWorksResponse**](EmployeesListWorksResponse.md)

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

<a name="updateAddress"></a>
# **updateAddress**
> EmployeesUpdateAddressResponse updateAddress(employeeId, authorization, employeesUpdateAddressRequest).execute();



This endpoint updates the employee **address** section for a given employee id. The operation only updates the fields provided in the body. &lt;br&gt;&lt;br&gt;**Custom fields** information can be provided in this operation. The *API name* of the custom field is required and the data format has to match with the type defined for the custom field in Kenjo. API names start with &#39;c_&#39; and the rest is composed by the trimmed name (spaces are removed). &lt;br&gt;&lt;br&gt; Example: &lt;br&gt; *The custom field &#39;province&#39; belongs to the &#39;address&#39; section*:   &#x60;&#x60;&#x60;   {     ...,     \&quot;country\&quot;: \&quot;ES\&quot;,     \&quot;c_province\&quot;: \&quot;MD\&quot;,     ...   } &#x60;&#x60;&#x60; *&#39;province&#39; is a field type &#39;String&#39;. It means that if a different type of data (number or boolean) is provided then the request will return an error.* 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Kenjo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox-api.kenjo.io/api/v1";
    Kenjo client = new Kenjo(configuration);
    String employeeId = "60a2db290da29e126a18789a"; // The _id of the employee to update.
    String authorization = "Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FwaS5rZW5qby5pbyIsInN1YiI6IjYwZjBhOTE2MjE0OTg3MjU2YmU5YzhmZiIsImF1ZCI6Imh0dHBzOi8vYXBpLmtlbmpvLmlvIiwiaWF0IjoxNjI2Mzg1MTE1LCJuYmYiOjE2MjYzODUxMTUsImV4cCI6MTYyNjU1NzkxNSwiYWNjZXNzVHlwZSI6IkFwaUFjY2VzcyIsInNfb3JnSWQiOiI2MGYwNGVhN2RmN2JhMjFlY2U0YmYzYzIifQ.cxG_7dIS-VbmDXdJuLkekoyuyCIzQG2fMcgc0nkfbWE8cihhcb5FnALbQkjU9b5-qVcEoMHZlSuUA-jMEBMMVQ"; // A valid bearer token.
    String street = "street_example"; // The name of the street.
    String postalCode = "postalCode_example"; // The postal code.
    String city = "city_example"; // The city.
    String country = "country_example"; // The country code in ISO 3166-1 alpha-2.
    try {
      EmployeesUpdateAddressResponse result = client
              .employees
              .updateAddress(employeeId, authorization)
              .street(street)
              .postalCode(postalCode)
              .city(city)
              .country(country)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getStreet());
      System.out.println(result.getPostalCode());
      System.out.println(result.getCity());
      System.out.println(result.getCountry());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#updateAddress");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeesUpdateAddressResponse> response = client
              .employees
              .updateAddress(employeeId, authorization)
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
      System.err.println("Exception when calling EmployeesApi#updateAddress");
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
| **employeeId** | **String**| The _id of the employee to update. | |
| **authorization** | **String**| A valid bearer token. | |
| **employeesUpdateAddressRequest** | [**EmployeesUpdateAddressRequest**](EmployeesUpdateAddressRequest.md)|  | |

### Return type

[**EmployeesUpdateAddressResponse**](EmployeesUpdateAddressResponse.md)

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

<a name="updateEmployeeAccounts"></a>
# **updateEmployeeAccounts**
> EmployeesUpdateEmployeeAccountsResponse updateEmployeeAccounts(employeeId, authorization, employeesUpdateEmployeeAccountsRequest).execute();



This endpoint updates the employee **account** section for a given employee id. The operation only updates the fields provided in the body.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Kenjo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox-api.kenjo.io/api/v1";
    Kenjo client = new Kenjo(configuration);
    String employeeId = "60a2db290da29e126a18789a"; // The _id of the employee to update.
    String authorization = "Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FwaS5rZW5qby5pbyIsInN1YiI6IjYwZjBhOTE2MjE0OTg3MjU2YmU5YzhmZiIsImF1ZCI6Imh0dHBzOi8vYXBpLmtlbmpvLmlvIiwiaWF0IjoxNjI2Mzg1MTE1LCJuYmYiOjE2MjYzODUxMTUsImV4cCI6MTYyNjU1NzkxNSwiYWNjZXNzVHlwZSI6IkFwaUFjY2VzcyIsInNfb3JnSWQiOiI2MGYwNGVhN2RmN2JhMjFlY2U0YmYzYzIifQ.cxG_7dIS-VbmDXdJuLkekoyuyCIzQG2fMcgc0nkfbWE8cihhcb5FnALbQkjU9b5-qVcEoMHZlSuUA-jMEBMMVQ"; // A valid bearer token.
    String email = "email_example"; // The employee email in Kenjo. This is an unique identifier and required.
    String externalId = "externalId_example"; // The employee external id for integration proposals. This value must be unique.
    String language = "language_example"; // The employee language. Only is valid one of the following values 'en' (english), 'es' (spanish) or 'de' (german).
    try {
      EmployeesUpdateEmployeeAccountsResponse result = client
              .employees
              .updateEmployeeAccounts(employeeId, authorization)
              .email(email)
              .externalId(externalId)
              .language(language)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getEmail());
      System.out.println(result.getExternalId());
      System.out.println(result.getLanguage());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#updateEmployeeAccounts");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeesUpdateEmployeeAccountsResponse> response = client
              .employees
              .updateEmployeeAccounts(employeeId, authorization)
              .email(email)
              .externalId(externalId)
              .language(language)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#updateEmployeeAccounts");
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
| **employeeId** | **String**| The _id of the employee to update. | |
| **authorization** | **String**| A valid bearer token. | |
| **employeesUpdateEmployeeAccountsRequest** | [**EmployeesUpdateEmployeeAccountsRequest**](EmployeesUpdateEmployeeAccountsRequest.md)|  | |

### Return type

[**EmployeesUpdateEmployeeAccountsResponse**](EmployeesUpdateEmployeeAccountsResponse.md)

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

<a name="updateFinancials"></a>
# **updateFinancials**
> EmployeesUpdateFinancialsResponse updateFinancials(employeeId, authorization, employeesUpdateFinancialsRequest).execute();



This endpoint updates the employee **financial** section for a given employee id. The operation only updates the fields provided in the body. &lt;br&gt;&lt;br&gt;**Custom fields** information can be provided in this operation. The *API name* of the custom field is required and the data format has to match with the type defined for the custom field in Kenjo. API names start with &#39;c_&#39; and the rest is composed by the trimmed name (spaces are removed). &lt;br&gt;&lt;br&gt; Example: &lt;br&gt; *The custom field &#39;special tax&#39; belongs to the &#39;financial&#39; section*:   &#x60;&#x60;&#x60;   {     ...,     \&quot;iban\&quot;: \&quot;ES2345123456789077\&quot;,     \&quot;c_specialtax\&quot;: 1500,     ...   } &#x60;&#x60;&#x60; *&#39;special tax&#39; is a field type &#39;Number&#39;. It means that if a different type of data (string or boolean) is provided then the request will return an error.* 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Kenjo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox-api.kenjo.io/api/v1";
    Kenjo client = new Kenjo(configuration);
    String employeeId = "60a2db290da29e126a18789a"; // The _id of the employee to update.
    String authorization = "Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FwaS5rZW5qby5pbyIsInN1YiI6IjYwZjBhOTE2MjE0OTg3MjU2YmU5YzhmZiIsImF1ZCI6Imh0dHBzOi8vYXBpLmtlbmpvLmlvIiwiaWF0IjoxNjI2Mzg1MTE1LCJuYmYiOjE2MjYzODUxMTUsImV4cCI6MTYyNjU1NzkxNSwiYWNjZXNzVHlwZSI6IkFwaUFjY2VzcyIsInNfb3JnSWQiOiI2MGYwNGVhN2RmN2JhMjFlY2U0YmYzYzIifQ.cxG_7dIS-VbmDXdJuLkekoyuyCIzQG2fMcgc0nkfbWE8cihhcb5FnALbQkjU9b5-qVcEoMHZlSuUA-jMEBMMVQ"; // A valid bearer token.
    String accountHolderName = "accountHolderName_example"; // The accounts holder's name.
    String bankName = "bankName_example"; // The bank name.
    String accountNumber = "accountNumber_example"; // The account number.
    String iban = "iban_example"; // The IBAN.
    String swiftCode = "swiftCode_example"; // The SWIFT code.
    String nationalId = "nationalId_example"; // The national id document.
    String passport = "passport_example"; // The passport number.
    String nationalInsuranceNumber = "nationalInsuranceNumber_example"; // The national insurance number
    String taxCode = "taxCode_example"; // The tax number.
    String taxIdentificationNumber = "taxIdentificationNumber_example"; // The tax identification number.
    try {
      EmployeesUpdateFinancialsResponse result = client
              .employees
              .updateFinancials(employeeId, authorization)
              .accountHolderName(accountHolderName)
              .bankName(bankName)
              .accountNumber(accountNumber)
              .iban(iban)
              .swiftCode(swiftCode)
              .nationalId(nationalId)
              .passport(passport)
              .nationalInsuranceNumber(nationalInsuranceNumber)
              .taxCode(taxCode)
              .taxIdentificationNumber(taxIdentificationNumber)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getAccountHolderName());
      System.out.println(result.getBankName());
      System.out.println(result.getAccountNumber());
      System.out.println(result.getIban());
      System.out.println(result.getSwiftCode());
      System.out.println(result.getNationalId());
      System.out.println(result.getPassport());
      System.out.println(result.getNationalInsuranceNumber());
      System.out.println(result.getTaxCode());
      System.out.println(result.getTaxIdentificationNumber());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#updateFinancials");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeesUpdateFinancialsResponse> response = client
              .employees
              .updateFinancials(employeeId, authorization)
              .accountHolderName(accountHolderName)
              .bankName(bankName)
              .accountNumber(accountNumber)
              .iban(iban)
              .swiftCode(swiftCode)
              .nationalId(nationalId)
              .passport(passport)
              .nationalInsuranceNumber(nationalInsuranceNumber)
              .taxCode(taxCode)
              .taxIdentificationNumber(taxIdentificationNumber)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#updateFinancials");
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
| **employeeId** | **String**| The _id of the employee to update. | |
| **authorization** | **String**| A valid bearer token. | |
| **employeesUpdateFinancialsRequest** | [**EmployeesUpdateFinancialsRequest**](EmployeesUpdateFinancialsRequest.md)|  | |

### Return type

[**EmployeesUpdateFinancialsResponse**](EmployeesUpdateFinancialsResponse.md)

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

<a name="updateHome"></a>
# **updateHome**
> EmployeesUpdateHomeResponse updateHome(employeeId, authorization, employeesUpdateHomeRequest).execute();



This endpoint updates the employee **home** section for a given employee id. The operation only updates the fields provided in the body. &lt;br&gt;&lt;br&gt;**Custom fields** information can be provided in this operation. The *API name* of the custom field is required and the data format has to match with the type defined for the custom field in Kenjo. API names start with &#39;c_&#39; and the rest is composed by the trimmed name (spaces are removed). &lt;br&gt;&lt;br&gt; Example: &lt;br&gt; *The custom field &#39;pet name&#39; belongs to the &#39;home&#39; section*:   &#x60;&#x60;&#x60;   {     ...,     \&quot;maritalStatus\&quot;: \&quot;Divorced\&quot;,     \&quot;c_petname\&quot;: \&quot;Boliche\&quot;,     ...   } &#x60;&#x60;&#x60; *&#39;pet name&#39; is a field type &#39;String&#39;. It means that if a different type of data (number or boolean) is provided then the request will return an error.* 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Kenjo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox-api.kenjo.io/api/v1";
    Kenjo client = new Kenjo(configuration);
    String employeeId = "60a2db290da29e126a18789a"; // The _id of the employee to update.
    String authorization = "Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FwaS5rZW5qby5pbyIsInN1YiI6IjYwZjBhOTE2MjE0OTg3MjU2YmU5YzhmZiIsImF1ZCI6Imh0dHBzOi8vYXBpLmtlbmpvLmlvIiwiaWF0IjoxNjI2Mzg1MTE1LCJuYmYiOjE2MjYzODUxMTUsImV4cCI6MTYyNjU1NzkxNSwiYWNjZXNzVHlwZSI6IkFwaUFjY2VzcyIsInNfb3JnSWQiOiI2MGYwNGVhN2RmN2JhMjFlY2U0YmYzYzIifQ.cxG_7dIS-VbmDXdJuLkekoyuyCIzQG2fMcgc0nkfbWE8cihhcb5FnALbQkjU9b5-qVcEoMHZlSuUA-jMEBMMVQ"; // A valid bearer token.
    String maritalStatus = "maritalStatus_example"; // The marital status. Only is valid one of the following values \\\"Divorced\\\", \\\"Domestic Partnership\\\", \\\"Married\\\", \\\"Separated\\\", \\\"Single\\\", \\\"Widowed\\\".
    String spouseFirstName = "spouseFirstName_example"; // The first name of the employee's spouse.
    String spouseLastName = "spouseLastName_example"; // The last name of the employee's spouse.
    String spouseBirthdate = "spouseBirthdate_example"; // The birth date of the employee's spouse. Format YYYY-MM-DDThh:mm:ss.000Z.
    String spouseGender = "spouseGender_example"; // The employee's spouse gender. Only is valid one of the following values 'Male' (male), 'Female' (female) or 'Other' (other).
    String personalEmail = "personalEmail_example"; // The employee personal email.
    String personalPhone = "personalPhone_example"; // The employee personal phone.
    String personalMobile = "personalMobile_example"; // The employee personal phone
    try {
      EmployeesUpdateHomeResponse result = client
              .employees
              .updateHome(employeeId, authorization)
              .maritalStatus(maritalStatus)
              .spouseFirstName(spouseFirstName)
              .spouseLastName(spouseLastName)
              .spouseBirthdate(spouseBirthdate)
              .spouseGender(spouseGender)
              .personalEmail(personalEmail)
              .personalPhone(personalPhone)
              .personalMobile(personalMobile)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getMaritalStatus());
      System.out.println(result.getSpouseFirstName());
      System.out.println(result.getSpouseLastName());
      System.out.println(result.getSpouseBirthdate());
      System.out.println(result.getSpouseGender());
      System.out.println(result.getPersonalEmail());
      System.out.println(result.getPersonalPhone());
      System.out.println(result.getPersonalMobile());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#updateHome");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeesUpdateHomeResponse> response = client
              .employees
              .updateHome(employeeId, authorization)
              .maritalStatus(maritalStatus)
              .spouseFirstName(spouseFirstName)
              .spouseLastName(spouseLastName)
              .spouseBirthdate(spouseBirthdate)
              .spouseGender(spouseGender)
              .personalEmail(personalEmail)
              .personalPhone(personalPhone)
              .personalMobile(personalMobile)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#updateHome");
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
| **employeeId** | **String**| The _id of the employee to update. | |
| **authorization** | **String**| A valid bearer token. | |
| **employeesUpdateHomeRequest** | [**EmployeesUpdateHomeRequest**](EmployeesUpdateHomeRequest.md)|  | |

### Return type

[**EmployeesUpdateHomeResponse**](EmployeesUpdateHomeResponse.md)

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

<a name="updatePersonals"></a>
# **updatePersonals**
> EmployeesUpdatePersonalsResponse updatePersonals(employeeId, authorization, employeesUpdatePersonalsRequest).execute();



This endpoint updates the employee **personal** section for a given employee id. The operation only updates the fields provided in the body. &lt;br&gt;&lt;br&gt;**Custom fields** information can be provided in this operation. The *API name* of the custom field is required and the data format has to match with the type defined for the custom field in Kenjo. API names start with &#39;c_&#39; and the rest is composed by the trimmed name (spaces are removed). &lt;br&gt;&lt;br&gt; Example: &lt;br&gt; *The custom field &#39;category&#39; belongs to the &#39;personal&#39; section*:   &#x60;&#x60;&#x60;   {     ...,     \&quot;lastName\&quot;: \&quot;Nadie\&quot;,     \&quot;c_category\&quot;: \&quot;Good\&quot;,     ...   } &#x60;&#x60;&#x60; *&#39;category&#39; is a field type &#39;List&#39; (Strings list) with the possible values: \&quot;Good\&quot; and \&quot;Bad\&quot;. It means that if a different value or type is provided then the request will return an error.* 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Kenjo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox-api.kenjo.io/api/v1";
    Kenjo client = new Kenjo(configuration);
    String employeeId = "60a2db290da29e126a18789a"; // The _id of the employee to update.
    String authorization = "Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FwaS5rZW5qby5pbyIsInN1YiI6IjYwZjBhOTE2MjE0OTg3MjU2YmU5YzhmZiIsImF1ZCI6Imh0dHBzOi8vYXBpLmtlbmpvLmlvIiwiaWF0IjoxNjI2Mzg1MTE1LCJuYmYiOjE2MjYzODUxMTUsImV4cCI6MTYyNjU1NzkxNSwiYWNjZXNzVHlwZSI6IkFwaUFjY2VzcyIsInNfb3JnSWQiOiI2MGYwNGVhN2RmN2JhMjFlY2U0YmYzYzIifQ.cxG_7dIS-VbmDXdJuLkekoyuyCIzQG2fMcgc0nkfbWE8cihhcb5FnALbQkjU9b5-qVcEoMHZlSuUA-jMEBMMVQ"; // A valid bearer token.
    String firstName = "firstName_example"; // The name of the Kenjo employee. This field is required.
    String lastName = "lastName_example"; // The surname of the Kenjo employee. This field is required.
    String displayName = "displayName_example"; // The composition of firstName and lastName of the Kenjo employee.
    String gender = "gender_example"; // The gender of the Kenjo employee. Only is valid one of the following values 'Male' (male), 'Female' (female) or 'Other' (other).
    String birthdate = "birthdate_example"; // The employee birth date. Format YYYY-MM-DDThh:mm:ss.000Z.
    try {
      EmployeesUpdatePersonalsResponse result = client
              .employees
              .updatePersonals(employeeId, authorization)
              .firstName(firstName)
              .lastName(lastName)
              .displayName(displayName)
              .gender(gender)
              .birthdate(birthdate)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getFirstName());
      System.out.println(result.getLastName());
      System.out.println(result.getDisplayName());
      System.out.println(result.getGender());
      System.out.println(result.getBirthdate());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#updatePersonals");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeesUpdatePersonalsResponse> response = client
              .employees
              .updatePersonals(employeeId, authorization)
              .firstName(firstName)
              .lastName(lastName)
              .displayName(displayName)
              .gender(gender)
              .birthdate(birthdate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#updatePersonals");
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
| **employeeId** | **String**| The _id of the employee to update. | |
| **authorization** | **String**| A valid bearer token. | |
| **employeesUpdatePersonalsRequest** | [**EmployeesUpdatePersonalsRequest**](EmployeesUpdatePersonalsRequest.md)|  | |

### Return type

[**EmployeesUpdatePersonalsResponse**](EmployeesUpdatePersonalsResponse.md)

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

<a name="updateWorkSchedule"></a>
# **updateWorkSchedule**
> EmployeesUpdateWorkScheduleResponse updateWorkSchedule(employeeId, authorization, employeesUpdateWorkScheduleRequest).execute();



This endpoint updates the employee **work schedule** section for a given employee id. The operation only updates the fields provided in the body.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Kenjo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox-api.kenjo.io/api/v1";
    Kenjo client = new Kenjo(configuration);
    String employeeId = "60a2db290da29e126a18789a"; // The _id of the employee to update.
    String authorization = "Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FwaS5rZW5qby5pbyIsInN1YiI6IjYwZjBhOTE2MjE0OTg3MjU2YmU5YzhmZiIsImF1ZCI6Imh0dHBzOi8vYXBpLmtlbmpvLmlvIiwiaWF0IjoxNjI2Mzg1MTE1LCJuYmYiOjE2MjYzODUxMTUsImV4cCI6MTYyNjU1NzkxNSwiYWNjZXNzVHlwZSI6IkFwaUFjY2VzcyIsInNfb3JnSWQiOiI2MGYwNGVhN2RmN2JhMjFlY2U0YmYzYzIifQ.cxG_7dIS-VbmDXdJuLkekoyuyCIzQG2fMcgc0nkfbWE8cihhcb5FnALbQkjU9b5-qVcEoMHZlSuUA-jMEBMMVQ"; // A valid bearer token.
    Boolean mondayWorkingDay = true; // Allow to indicate if mondays are working days for the employee.
    Boolean tuesdayWorkingDay = true; // Allow to indicate if tuesdays are working days for the employee.
    Boolean wednesdayWorkingDay = true; // Allow to indicate if wednesdays are working days for the employee.
    Boolean thursdayWorkingDay = true; // Allow to indicate if thursdays are working days for the employee.
    Boolean fridayWorkingDay = true; // Allow to indicate if fridays are working days for the employee.
    Boolean saturdayWorkingDay = true; // Allow to indicate if saturdays are working days for the employee.
    Boolean sundayWorkingDay = true; // Allow to indicate if sundays are working days for the employee.
    try {
      EmployeesUpdateWorkScheduleResponse result = client
              .employees
              .updateWorkSchedule(employeeId, authorization)
              .mondayWorkingDay(mondayWorkingDay)
              .tuesdayWorkingDay(tuesdayWorkingDay)
              .wednesdayWorkingDay(wednesdayWorkingDay)
              .thursdayWorkingDay(thursdayWorkingDay)
              .fridayWorkingDay(fridayWorkingDay)
              .saturdayWorkingDay(saturdayWorkingDay)
              .sundayWorkingDay(sundayWorkingDay)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getMondayWorkingDay());
      System.out.println(result.getTuesdayWorkingDay());
      System.out.println(result.getWednesdayWorkingDay());
      System.out.println(result.getThursdayWorkingDay());
      System.out.println(result.getFridayWorkingDay());
      System.out.println(result.getSaturdayWorkingDay());
      System.out.println(result.getSundayWorkingDay());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#updateWorkSchedule");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeesUpdateWorkScheduleResponse> response = client
              .employees
              .updateWorkSchedule(employeeId, authorization)
              .mondayWorkingDay(mondayWorkingDay)
              .tuesdayWorkingDay(tuesdayWorkingDay)
              .wednesdayWorkingDay(wednesdayWorkingDay)
              .thursdayWorkingDay(thursdayWorkingDay)
              .fridayWorkingDay(fridayWorkingDay)
              .saturdayWorkingDay(saturdayWorkingDay)
              .sundayWorkingDay(sundayWorkingDay)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#updateWorkSchedule");
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
| **employeeId** | **String**| The _id of the employee to update. | |
| **authorization** | **String**| A valid bearer token. | |
| **employeesUpdateWorkScheduleRequest** | [**EmployeesUpdateWorkScheduleRequest**](EmployeesUpdateWorkScheduleRequest.md)|  | |

### Return type

[**EmployeesUpdateWorkScheduleResponse**](EmployeesUpdateWorkScheduleResponse.md)

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

<a name="updateWorks"></a>
# **updateWorks**
> EmployeesUpdateWorksResponse updateWorks(employeeId, authorization, employeesUpdateWorksRequest).execute();



This endpoint updates the employee **work** section for a given employee id. The operation only updates the fields provided in the body. &lt;br&gt;&lt;br&gt;**Custom fields** information can be provided in this operation. The *API name* of the custom field is required and the data format has to match with the type defined for the custom field in Kenjo. API names start with &#39;c_&#39; and the rest is composed by the trimmed name (spaces are removed). &lt;br&gt;&lt;br&gt; Example: &lt;br&gt; *The custom field &#39;activity type&#39; belongs to the &#39;personal&#39; section*:   &#x60;&#x60;&#x60;   {     ...,     \&quot;companyId\&quot;: \&quot;61d874aef37c05cfba4f1b38\&quot;,     \&quot;c_activityType\&quot;: \&quot;1\&quot;,     ...   } &#x60;&#x60;&#x60; *&#39;activity Type&#39; is a field type &#39;List&#39; (Strings list) with the possible values: \&quot;1\&quot; and \&quot;2\&quot;. It means that if a different value or type is provided then the request will return an error.* 

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Kenjo;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmployeesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://sandbox-api.kenjo.io/api/v1";
    Kenjo client = new Kenjo(configuration);
    String employeeId = "60a2db290da29e126a18789a"; // The _id of the employee to update.
    String authorization = "Bearer eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJodHRwczovL2FwaS5rZW5qby5pbyIsInN1YiI6IjYwZjBhOTE2MjE0OTg3MjU2YmU5YzhmZiIsImF1ZCI6Imh0dHBzOi8vYXBpLmtlbmpvLmlvIiwiaWF0IjoxNjI2Mzg1MTE1LCJuYmYiOjE2MjYzODUxMTUsImV4cCI6MTYyNjU1NzkxNSwiYWNjZXNzVHlwZSI6IkFwaUFjY2VzcyIsInNfb3JnSWQiOiI2MGYwNGVhN2RmN2JhMjFlY2U0YmYzYzIifQ.cxG_7dIS-VbmDXdJuLkekoyuyCIzQG2fMcgc0nkfbWE8cihhcb5FnALbQkjU9b5-qVcEoMHZlSuUA-jMEBMMVQ"; // A valid bearer token.
    String companyId = "companyId_example"; // The company id of the Kenjo employee.
    String officeId = "officeId_example"; // The office id of the Kenjo employee.
    String departmentId = "departmentId_example"; // The department id of the Kenjo employee.
    String startDate = "startDate_example"; // The starting date of the Kenjo employee in format YYYY-MM-DDThh:mm:ss.
    String jobTitle = "jobTitle_example"; // The job title of the employee.
    String workPhone = "workPhone_example"; // The work phone of the employee.
    String workMobile = "workMobile_example"; // The work mobile of the employee.
    Boolean isAssistant = true; // Allow to indicate if the employee has or not the assistant role.
    String probationPeriodEnd = "probationPeriodEnd_example"; // The probation period of the employee. Format YYYY-MM-DDThh:mm:ss.000Z.
    String reportsToId = "reportsToId_example"; // The Kenjo employee id of the user to whom the employee reports. The employee id to assign can be an active or inactive user. Trying to assign the own employee id or the id of someone who is already reporting will arise an error.
    try {
      EmployeesUpdateWorksResponse result = client
              .employees
              .updateWorks(employeeId, authorization)
              .companyId(companyId)
              .officeId(officeId)
              .departmentId(departmentId)
              .startDate(startDate)
              .jobTitle(jobTitle)
              .workPhone(workPhone)
              .workMobile(workMobile)
              .isAssistant(isAssistant)
              .probationPeriodEnd(probationPeriodEnd)
              .reportsToId(reportsToId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getCompanyId());
      System.out.println(result.getOfficeId());
      System.out.println(result.getDepartmentId());
      System.out.println(result.getStartDate());
      System.out.println(result.getJobTitle());
      System.out.println(result.getWorkPhone());
      System.out.println(result.getWorkMobile());
      System.out.println(result.getIsAssistant());
      System.out.println(result.getProbationPeriodEnd());
      System.out.println(result.getReportsToId());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#updateWorks");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<EmployeesUpdateWorksResponse> response = client
              .employees
              .updateWorks(employeeId, authorization)
              .companyId(companyId)
              .officeId(officeId)
              .departmentId(departmentId)
              .startDate(startDate)
              .jobTitle(jobTitle)
              .workPhone(workPhone)
              .workMobile(workMobile)
              .isAssistant(isAssistant)
              .probationPeriodEnd(probationPeriodEnd)
              .reportsToId(reportsToId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmployeesApi#updateWorks");
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
| **employeeId** | **String**| The _id of the employee to update. | |
| **authorization** | **String**| A valid bearer token. | |
| **employeesUpdateWorksRequest** | [**EmployeesUpdateWorksRequest**](EmployeesUpdateWorksRequest.md)|  | |

### Return type

[**EmployeesUpdateWorksResponse**](EmployeesUpdateWorksResponse.md)

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

