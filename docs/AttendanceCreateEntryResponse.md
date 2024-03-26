

# AttendanceCreateEntryResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The Kenjo _id of the new attendance entry. |  [optional] |
|**userId** | **String** | The id of the employee assigned to the requested attendance entry. |  [optional] |
|**email** | **String** | The email of the employee assigned to the requested attendance entry. |  [optional] |
|**externalId** | **String** | The external Id of the employee assigned to the requested attendance entry. |  [optional] |
|**startTime** | **String** | The start date time of the created attendance entry |  [optional] |
|**endTime** | **String** | The end date time of the created attendance entry. |  [optional] |
|**breaks** | [**List&lt;AttendanceCreateEntryResponseBreaksInner&gt;**](AttendanceCreateEntryResponseBreaksInner.md) | Array that contains the breaks in detail. |  [optional] |
|**breakTime** | **Double** | DEPRECATED field, use the &#39;breaks&#39; field to specify the breaktime. The time in minutes to indicate a break of time. It cannot be greater than the total of minutes reported for the attendance entry. |  [optional] |
|**comment** | **String** | Optional text to describe an attendance record (pair of startTime and endTime). The maximum number of characters is 150. |  [optional] |



