

# AttendanceGetListResponseInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The Kenjo _id of the returned attendance entry. |  [optional] |
|**userId** | **String** | The Kenjo _id of the employee assigned to the attendance entry. |  [optional] |
|**email** | **String** | The Kenjo email of the employee assigned to the attendance entry. |  [optional] |
|**externalId** | **String** | The external id of the employee assigned to the attendance entry. |  [optional] |
|**startTime** | **String** | The start date time of the attendance entry. |  [optional] |
|**endTime** | **String** | The end date time of the attendance entry. |  [optional] |
|**breaks** | [**List&lt;AttendanceGetListResponseInnerBreaksInner&gt;**](AttendanceGetListResponseInnerBreaksInner.md) | Array that contains the breaks in detail. |  [optional] |
|**breakTime** | **String** | The break time of the attendance entry. If there is no &#39;breaktime&#39; this field will not be in the response. This value is the sum of the total time of breaks. |  [optional] |
|**attendanceCategoryId** | **String** | The Kenjo _id of the attendance category. |  [optional] |
|**attendanceSubCategoryId** | **String** | The Kenjo _id of the attendance sub category. |  [optional] |
|**comment** | **String** | Optional text to describe an attendance record (pair of startTime and endTime). The maximum number of characters is 150. |  [optional] |



