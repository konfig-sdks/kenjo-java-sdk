<div align="left">

[![Visit Kenjo](./header.png)](https://kenjo.io)

# [Kenjo](https://kenjo.io)

Before starting to use the Kenjo API, you have to request the API activation for a sandbox or production environment to the Kenjo Customer Success team. After that, an admin user has to go to *Settings > Integrations > API keys*, to generate the **API Key**. Follow the steps described in the **Autentication section** of this document. <br>The API key is needed to request the bearer token. Each endpoint callout requires a valid bearer token in the Authorization header. Once the token is retrieved, it will be useful during the time limit indicated by the 'expiration date'.

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Kenjo&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>kenjo-java-sdk</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:kenjo-java-sdk:1.0.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/kenjo-java-sdk-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://sandbox-api.kenjo.io/api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AreasApi* | [**createNewArea**](docs/AreasApi.md#createNewArea) | **POST** /areas | 
*AreasApi* | [**getById**](docs/AreasApi.md#getById) | **GET** /areas/{id} | 
*AreasApi* | [**getList**](docs/AreasApi.md#getList) | **GET** /areas | 
*AreasApi* | [**removeById**](docs/AreasApi.md#removeById) | **DELETE** /areas/{id} | 
*AreasApi* | [**updateAreaById**](docs/AreasApi.md#updateAreaById) | **PUT** /areas/{id} | 
*AttendanceApi* | [**createEntry**](docs/AttendanceApi.md#createEntry) | **POST** /attendances | 
*AttendanceApi* | [**createTrackTime**](docs/AttendanceApi.md#createTrackTime) | **POST** /attendances/track-time | 
*AttendanceApi* | [**getById**](docs/AttendanceApi.md#getById) | **GET** /attendances/{attendanceId} | 
*AttendanceApi* | [**getCategories**](docs/AttendanceApi.md#getCategories) | **GET** /attendances/categories | 
*AttendanceApi* | [**getExpectedTimeByUser**](docs/AttendanceApi.md#getExpectedTimeByUser) | **GET** /attendances/expected-time | 
*AttendanceApi* | [**getList**](docs/AttendanceApi.md#getList) | **GET** /attendances | 
*AttendanceApi* | [**removeById**](docs/AttendanceApi.md#removeById) | **DELETE** /attendances/{attendanceId} | 
*AttendanceApi* | [**updateEntry**](docs/AttendanceApi.md#updateEntry) | **PUT** /attendances/{attendanceId} | 
*AuthenticationApi* | [**createBearerToken**](docs/AuthenticationApi.md#createBearerToken) | **POST** /auth/login | 
*AuthenticationApi* | [**invalidateToken**](docs/AuthenticationApi.md#invalidateToken) | **POST** /auth/logout | 
*CalendarsApi* | [**getById**](docs/CalendarsApi.md#getById) | **GET** /calendars/{id} | 
*CalendarsApi* | [**getList**](docs/CalendarsApi.md#getList) | **GET** /calendars | 
*CompaniesApi* | [**getList**](docs/CompaniesApi.md#getList) | **GET** /companies | 
*CompensationApi* | [**getContracts**](docs/CompensationApi.md#getContracts) | **GET** /compensation/contracts | 
*CompensationApi* | [**getSalariesList**](docs/CompensationApi.md#getSalariesList) | **GET** /compensation/salaries | 
*CompensationApi* | [**listAdditionalPaymentTypes**](docs/CompensationApi.md#listAdditionalPaymentTypes) | **GET** /compensation/additional-payment-types | 
*CompensationApi* | [**listAdditionalPayments**](docs/CompensationApi.md#listAdditionalPayments) | **GET** /compensation/additional-payments | 
*CompensationApi* | [**listContractTypes**](docs/CompensationApi.md#listContractTypes) | **GET** /compensation/contract-types | 
*CustomFieldsApi* | [**getList**](docs/CustomFieldsApi.md#getList) | **GET** /custom-fields | 
*DepartmentsApi* | [**createNewDepartment**](docs/DepartmentsApi.md#createNewDepartment) | **POST** /departments | 
*DepartmentsApi* | [**getById**](docs/DepartmentsApi.md#getById) | **GET** /departments/{id} | 
*DepartmentsApi* | [**listDepartments**](docs/DepartmentsApi.md#listDepartments) | **GET** /departments | 
*DepartmentsApi* | [**removeById**](docs/DepartmentsApi.md#removeById) | **DELETE** /departments/{id} | 
*DepartmentsApi* | [**updateAttributes**](docs/DepartmentsApi.md#updateAttributes) | **PUT** /departments/{id} | 
*EmployeesApi* | [**activateEmployee**](docs/EmployeesApi.md#activateEmployee) | **PUT** /employees/{employeeId}/activate | 
*EmployeesApi* | [**createInactiveEmployee**](docs/EmployeesApi.md#createInactiveEmployee) | **POST** /employees | 
*EmployeesApi* | [**deactivateEmployeeById**](docs/EmployeesApi.md#deactivateEmployeeById) | **PUT** /employees/{employeeId}/deactivate | 
*EmployeesApi* | [**getAccounts**](docs/EmployeesApi.md#getAccounts) | **GET** /employees/accounts | 
*EmployeesApi* | [**getEmployeeInformation**](docs/EmployeesApi.md#getEmployeeInformation) | **GET** /employees/{employeeId} | 
*EmployeesApi* | [**getList**](docs/EmployeesApi.md#getList) | **GET** /employees | 
*EmployeesApi* | [**getWorkSchedules**](docs/EmployeesApi.md#getWorkSchedules) | **GET** /employees/work-schedules | 
*EmployeesApi* | [**listAddresses**](docs/EmployeesApi.md#listAddresses) | **GET** /employees/addresses | 
*EmployeesApi* | [**listFinancials**](docs/EmployeesApi.md#listFinancials) | **GET** /employees/financials | 
*EmployeesApi* | [**listHomes**](docs/EmployeesApi.md#listHomes) | **GET** /employees/homes | 
*EmployeesApi* | [**listPersonals**](docs/EmployeesApi.md#listPersonals) | **GET** /employees/personals | 
*EmployeesApi* | [**listWorks**](docs/EmployeesApi.md#listWorks) | **GET** /employees/works | 
*EmployeesApi* | [**updateAddress**](docs/EmployeesApi.md#updateAddress) | **PUT** /employees/{employeeId}/addresses | 
*EmployeesApi* | [**updateEmployeeAccounts**](docs/EmployeesApi.md#updateEmployeeAccounts) | **PUT** /employees/{employeeId}/accounts | 
*EmployeesApi* | [**updateFinancials**](docs/EmployeesApi.md#updateFinancials) | **PUT** /employees/{employeeId}/financials | 
*EmployeesApi* | [**updateHome**](docs/EmployeesApi.md#updateHome) | **PUT** /employees/{employeeId}/homes | 
*EmployeesApi* | [**updatePersonals**](docs/EmployeesApi.md#updatePersonals) | **PUT** /employees/{employeeId}/personals | 
*EmployeesApi* | [**updateWorkSchedule**](docs/EmployeesApi.md#updateWorkSchedule) | **PUT** /employees/{employeeId}/work-schedules | 
*EmployeesApi* | [**updateWorks**](docs/EmployeesApi.md#updateWorks) | **PUT** /employees/{employeeId}/works | 
*OfficesApi* | [**createNewOffice**](docs/OfficesApi.md#createNewOffice) | **POST** /offices | 
*OfficesApi* | [**getById**](docs/OfficesApi.md#getById) | **GET** /offices/{id} | 
*OfficesApi* | [**getList**](docs/OfficesApi.md#getList) | **GET** /offices | 
*OfficesApi* | [**removeById**](docs/OfficesApi.md#removeById) | **DELETE** /offices/{id} | 
*OfficesApi* | [**updateOfficeAttributes**](docs/OfficesApi.md#updateOfficeAttributes) | **PUT** /offices/{id} | 
*TeamsApi* | [**createTeam**](docs/TeamsApi.md#createTeam) | **POST** /teams | 
*TeamsApi* | [**getById**](docs/TeamsApi.md#getById) | **GET** /teams/{id} | 
*TeamsApi* | [**getList**](docs/TeamsApi.md#getList) | **GET** /teams | 
*TeamsApi* | [**removeTeam**](docs/TeamsApi.md#removeTeam) | **DELETE** /teams/{id} | 
*TeamsApi* | [**updateTeamAttributes**](docs/TeamsApi.md#updateTeamAttributes) | **PUT** /teams/{id} | 
*TimeOffApi* | [**getRequestsByDate**](docs/TimeOffApi.md#getRequestsByDate) | **GET** /time-off/requests | 
*UserAccountsApi* | [**listEmployees**](docs/UserAccountsApi.md#listEmployees) | **GET** /user-accounts | 


## Documentation for Models

 - [AreasCreateNewAreaRequest](docs/AreasCreateNewAreaRequest.md)
 - [AreasCreateNewAreaResponse](docs/AreasCreateNewAreaResponse.md)
 - [AreasGetByIdResponse](docs/AreasGetByIdResponse.md)
 - [AreasGetListResponseInner](docs/AreasGetListResponseInner.md)
 - [AreasUpdateAreaByIdRequest](docs/AreasUpdateAreaByIdRequest.md)
 - [AreasUpdateAreaByIdResponse](docs/AreasUpdateAreaByIdResponse.md)
 - [AttendanceCreateEntryRequest](docs/AttendanceCreateEntryRequest.md)
 - [AttendanceCreateEntryRequestBreaksInner](docs/AttendanceCreateEntryRequestBreaksInner.md)
 - [AttendanceCreateEntryResponse](docs/AttendanceCreateEntryResponse.md)
 - [AttendanceCreateEntryResponseBreaksInner](docs/AttendanceCreateEntryResponseBreaksInner.md)
 - [AttendanceCreateTrackTimeRequest](docs/AttendanceCreateTrackTimeRequest.md)
 - [AttendanceCreateTrackTimeResponse](docs/AttendanceCreateTrackTimeResponse.md)
 - [AttendanceGetByIdResponse](docs/AttendanceGetByIdResponse.md)
 - [AttendanceGetByIdResponseBreaksInner](docs/AttendanceGetByIdResponseBreaksInner.md)
 - [AttendanceGetCategoriesResponse](docs/AttendanceGetCategoriesResponse.md)
 - [AttendanceGetCategoriesResponseDataInner](docs/AttendanceGetCategoriesResponseDataInner.md)
 - [AttendanceGetExpectedTimeByUserResponse](docs/AttendanceGetExpectedTimeByUserResponse.md)
 - [AttendanceGetExpectedTimeByUserResponseDataInner](docs/AttendanceGetExpectedTimeByUserResponseDataInner.md)
 - [AttendanceGetExpectedTimeByUserResponseDataInnerDaysInner](docs/AttendanceGetExpectedTimeByUserResponseDataInnerDaysInner.md)
 - [AttendanceGetExpectedTimeByUserResponseMetadata](docs/AttendanceGetExpectedTimeByUserResponseMetadata.md)
 - [AttendanceGetListResponseInner](docs/AttendanceGetListResponseInner.md)
 - [AttendanceGetListResponseInnerBreaksInner](docs/AttendanceGetListResponseInnerBreaksInner.md)
 - [AttendanceUpdateEntryRequest](docs/AttendanceUpdateEntryRequest.md)
 - [AttendanceUpdateEntryRequestBreaksInner](docs/AttendanceUpdateEntryRequestBreaksInner.md)
 - [AttendanceUpdateEntryResponse](docs/AttendanceUpdateEntryResponse.md)
 - [AuthenticationCreateBearerTokenRequest](docs/AuthenticationCreateBearerTokenRequest.md)
 - [AuthenticationCreateBearerTokenResponse](docs/AuthenticationCreateBearerTokenResponse.md)
 - [CalendarsGetByIdResponse](docs/CalendarsGetByIdResponse.md)
 - [CalendarsGetListResponseInner](docs/CalendarsGetListResponseInner.md)
 - [CompaniesGetListResponseInner](docs/CompaniesGetListResponseInner.md)
 - [CompensationGetContractsResponse](docs/CompensationGetContractsResponse.md)
 - [CompensationGetContractsResponseDataInner](docs/CompensationGetContractsResponseDataInner.md)
 - [CompensationGetContractsResponseMetadata](docs/CompensationGetContractsResponseMetadata.md)
 - [CompensationGetSalariesListResponse](docs/CompensationGetSalariesListResponse.md)
 - [CompensationGetSalariesListResponseDataInner](docs/CompensationGetSalariesListResponseDataInner.md)
 - [CompensationGetSalariesListResponseMetadata](docs/CompensationGetSalariesListResponseMetadata.md)
 - [CompensationListAdditionalPaymentTypesResponse](docs/CompensationListAdditionalPaymentTypesResponse.md)
 - [CompensationListAdditionalPaymentTypesResponseDataInner](docs/CompensationListAdditionalPaymentTypesResponseDataInner.md)
 - [CompensationListAdditionalPaymentTypesResponseMetadata](docs/CompensationListAdditionalPaymentTypesResponseMetadata.md)
 - [CompensationListAdditionalPaymentsResponse](docs/CompensationListAdditionalPaymentsResponse.md)
 - [CompensationListAdditionalPaymentsResponseDataInner](docs/CompensationListAdditionalPaymentsResponseDataInner.md)
 - [CompensationListAdditionalPaymentsResponseMetadata](docs/CompensationListAdditionalPaymentsResponseMetadata.md)
 - [CompensationListContractTypesResponse](docs/CompensationListContractTypesResponse.md)
 - [CompensationListContractTypesResponseDataInner](docs/CompensationListContractTypesResponseDataInner.md)
 - [CompensationListContractTypesResponseMetadata](docs/CompensationListContractTypesResponseMetadata.md)
 - [CustomFieldsGetListResponse](docs/CustomFieldsGetListResponse.md)
 - [CustomFieldsGetListResponseDataInner](docs/CustomFieldsGetListResponseDataInner.md)
 - [DepartmentsCreateNewDepartmentRequest](docs/DepartmentsCreateNewDepartmentRequest.md)
 - [DepartmentsCreateNewDepartmentResponse](docs/DepartmentsCreateNewDepartmentResponse.md)
 - [DepartmentsGetByIdResponse](docs/DepartmentsGetByIdResponse.md)
 - [DepartmentsListDepartmentsResponseInner](docs/DepartmentsListDepartmentsResponseInner.md)
 - [DepartmentsUpdateAttributesRequest](docs/DepartmentsUpdateAttributesRequest.md)
 - [DepartmentsUpdateAttributesResponse](docs/DepartmentsUpdateAttributesResponse.md)
 - [EmployeesCreateInactiveEmployeeRequest](docs/EmployeesCreateInactiveEmployeeRequest.md)
 - [EmployeesCreateInactiveEmployeeRequestAccount](docs/EmployeesCreateInactiveEmployeeRequestAccount.md)
 - [EmployeesCreateInactiveEmployeeRequestAddress](docs/EmployeesCreateInactiveEmployeeRequestAddress.md)
 - [EmployeesCreateInactiveEmployeeRequestFinancial](docs/EmployeesCreateInactiveEmployeeRequestFinancial.md)
 - [EmployeesCreateInactiveEmployeeRequestHome](docs/EmployeesCreateInactiveEmployeeRequestHome.md)
 - [EmployeesCreateInactiveEmployeeRequestPersonal](docs/EmployeesCreateInactiveEmployeeRequestPersonal.md)
 - [EmployeesCreateInactiveEmployeeRequestWork](docs/EmployeesCreateInactiveEmployeeRequestWork.md)
 - [EmployeesCreateInactiveEmployeeRequestWorkSchedule](docs/EmployeesCreateInactiveEmployeeRequestWorkSchedule.md)
 - [EmployeesCreateInactiveEmployeeResponse](docs/EmployeesCreateInactiveEmployeeResponse.md)
 - [EmployeesCreateInactiveEmployeeResponseAccount](docs/EmployeesCreateInactiveEmployeeResponseAccount.md)
 - [EmployeesCreateInactiveEmployeeResponseAddress](docs/EmployeesCreateInactiveEmployeeResponseAddress.md)
 - [EmployeesCreateInactiveEmployeeResponseFinancial](docs/EmployeesCreateInactiveEmployeeResponseFinancial.md)
 - [EmployeesCreateInactiveEmployeeResponseHome](docs/EmployeesCreateInactiveEmployeeResponseHome.md)
 - [EmployeesCreateInactiveEmployeeResponsePersonal](docs/EmployeesCreateInactiveEmployeeResponsePersonal.md)
 - [EmployeesCreateInactiveEmployeeResponseWork](docs/EmployeesCreateInactiveEmployeeResponseWork.md)
 - [EmployeesCreateInactiveEmployeeResponseWorkSchedule](docs/EmployeesCreateInactiveEmployeeResponseWorkSchedule.md)
 - [EmployeesGetAccountsResponse](docs/EmployeesGetAccountsResponse.md)
 - [EmployeesGetAccountsResponseDataInner](docs/EmployeesGetAccountsResponseDataInner.md)
 - [EmployeesGetEmployeeInformationResponse](docs/EmployeesGetEmployeeInformationResponse.md)
 - [EmployeesGetEmployeeInformationResponseAccount](docs/EmployeesGetEmployeeInformationResponseAccount.md)
 - [EmployeesGetEmployeeInformationResponseAddress](docs/EmployeesGetEmployeeInformationResponseAddress.md)
 - [EmployeesGetEmployeeInformationResponseFinancial](docs/EmployeesGetEmployeeInformationResponseFinancial.md)
 - [EmployeesGetEmployeeInformationResponseHome](docs/EmployeesGetEmployeeInformationResponseHome.md)
 - [EmployeesGetEmployeeInformationResponsePersonal](docs/EmployeesGetEmployeeInformationResponsePersonal.md)
 - [EmployeesGetEmployeeInformationResponseWork](docs/EmployeesGetEmployeeInformationResponseWork.md)
 - [EmployeesGetEmployeeInformationResponseWorkSchedule](docs/EmployeesGetEmployeeInformationResponseWorkSchedule.md)
 - [EmployeesGetListResponse](docs/EmployeesGetListResponse.md)
 - [EmployeesGetListResponseDataInner](docs/EmployeesGetListResponseDataInner.md)
 - [EmployeesGetWorkSchedulesResponse](docs/EmployeesGetWorkSchedulesResponse.md)
 - [EmployeesGetWorkSchedulesResponseDataInner](docs/EmployeesGetWorkSchedulesResponseDataInner.md)
 - [EmployeesListAddressesResponse](docs/EmployeesListAddressesResponse.md)
 - [EmployeesListAddressesResponseDataInner](docs/EmployeesListAddressesResponseDataInner.md)
 - [EmployeesListFinancialsResponse](docs/EmployeesListFinancialsResponse.md)
 - [EmployeesListFinancialsResponseDataInner](docs/EmployeesListFinancialsResponseDataInner.md)
 - [EmployeesListHomesResponse](docs/EmployeesListHomesResponse.md)
 - [EmployeesListHomesResponseDataInner](docs/EmployeesListHomesResponseDataInner.md)
 - [EmployeesListPersonalsResponse](docs/EmployeesListPersonalsResponse.md)
 - [EmployeesListPersonalsResponseDataInner](docs/EmployeesListPersonalsResponseDataInner.md)
 - [EmployeesListWorksResponse](docs/EmployeesListWorksResponse.md)
 - [EmployeesListWorksResponseDataInner](docs/EmployeesListWorksResponseDataInner.md)
 - [EmployeesUpdateAddressRequest](docs/EmployeesUpdateAddressRequest.md)
 - [EmployeesUpdateAddressResponse](docs/EmployeesUpdateAddressResponse.md)
 - [EmployeesUpdateEmployeeAccountsRequest](docs/EmployeesUpdateEmployeeAccountsRequest.md)
 - [EmployeesUpdateEmployeeAccountsResponse](docs/EmployeesUpdateEmployeeAccountsResponse.md)
 - [EmployeesUpdateFinancialsRequest](docs/EmployeesUpdateFinancialsRequest.md)
 - [EmployeesUpdateFinancialsResponse](docs/EmployeesUpdateFinancialsResponse.md)
 - [EmployeesUpdateHomeRequest](docs/EmployeesUpdateHomeRequest.md)
 - [EmployeesUpdateHomeResponse](docs/EmployeesUpdateHomeResponse.md)
 - [EmployeesUpdatePersonalsRequest](docs/EmployeesUpdatePersonalsRequest.md)
 - [EmployeesUpdatePersonalsResponse](docs/EmployeesUpdatePersonalsResponse.md)
 - [EmployeesUpdateWorkScheduleRequest](docs/EmployeesUpdateWorkScheduleRequest.md)
 - [EmployeesUpdateWorkScheduleResponse](docs/EmployeesUpdateWorkScheduleResponse.md)
 - [EmployeesUpdateWorksRequest](docs/EmployeesUpdateWorksRequest.md)
 - [EmployeesUpdateWorksResponse](docs/EmployeesUpdateWorksResponse.md)
 - [OfficesCreateNewOfficeRequest](docs/OfficesCreateNewOfficeRequest.md)
 - [OfficesCreateNewOfficeResponse](docs/OfficesCreateNewOfficeResponse.md)
 - [OfficesGetByIdResponse](docs/OfficesGetByIdResponse.md)
 - [OfficesGetListResponseInner](docs/OfficesGetListResponseInner.md)
 - [OfficesUpdateOfficeAttributesRequest](docs/OfficesUpdateOfficeAttributesRequest.md)
 - [OfficesUpdateOfficeAttributesResponse](docs/OfficesUpdateOfficeAttributesResponse.md)
 - [TeamsCreateTeamRequest](docs/TeamsCreateTeamRequest.md)
 - [TeamsCreateTeamResponse](docs/TeamsCreateTeamResponse.md)
 - [TeamsGetByIdResponse](docs/TeamsGetByIdResponse.md)
 - [TeamsGetListResponseInner](docs/TeamsGetListResponseInner.md)
 - [TeamsUpdateTeamAttributesRequest](docs/TeamsUpdateTeamAttributesRequest.md)
 - [TeamsUpdateTeamAttributesResponse](docs/TeamsUpdateTeamAttributesResponse.md)
 - [TimeOffGetRequestsByDateResponse](docs/TimeOffGetRequestsByDateResponse.md)
 - [TimeOffGetRequestsByDateResponseDataInner](docs/TimeOffGetRequestsByDateResponseDataInner.md)
 - [TimeOffGetRequestsByDateResponseMetadata](docs/TimeOffGetRequestsByDateResponseMetadata.md)
 - [UserAccountsListEmployeesResponseInner](docs/UserAccountsListEmployeesResponseInner.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
