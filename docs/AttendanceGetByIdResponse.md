

# AttendanceGetByIdResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The _id of the requested attendance entry. |  [optional] |
|**userId** | **String** | The id of the employee associated to the requested attendance entry. |  [optional] |
|**email** | **String** | The email of the employee associated to the requested attendance entry. |  [optional] |
|**externalId** | **String** | The external Id of the employee associated to the requested attendance entry. |  [optional] |
|**startTime** | **String** | The start date time of the requested attendance entry. |  [optional] |
|**endTime** | **String** | The end date time of the requested attendance entry. |  [optional] |
|**breaks** | [**List&lt;AttendanceGetByIdResponseBreaksInner&gt;**](AttendanceGetByIdResponseBreaksInner.md) | Array that contains the breaks in detail. |  [optional] |
|**breakTime** | **Double** | Number of minutes of break time. If there is no &#39;breaktime&#39; this field will not be in the response. This value is the sum of the total time of breaks. |  [optional] |
|**attendanceCategoryId** | **String** | The Kenjo _id of the attendance category. |  [optional] |
|**attendanceSubCategoryId** | **String** | The Kenjo _id of the attendance sub category. |  [optional] |
|**comment** | **String** | Optional text to describe an attendance record (pair of startTime and endTime). The maximum number of characters is 150. |  [optional] |



