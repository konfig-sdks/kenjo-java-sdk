

# AttendanceCreateEntryRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**userId** | **String** | The Kenjo employee *_id*. |  [optional] |
|**email** | **String** | The Kenjo *email* for an employee. |  [optional] |
|**externalId** | **String** | The *external id* for an employee for integrations. |  [optional] |
|**date** | **String** | The date of the entry. The valid format is *YYYY-MM-DD*. Required field. |  |
|**startTime** | **String** | The start time of the entry. The valid format is *hh:mm:ss*. Required field. |  |
|**endTime** | **String** | The end time of the entry. It is not a required field but cannot be less or equal than the *startTime*. The valid format is *hh:mm:ss* |  [optional] |
|**breaks** | [**List&lt;AttendanceCreateEntryRequestBreaksInner&gt;**](AttendanceCreateEntryRequestBreaksInner.md) | Array that contains the breaks in detail. Rules:&lt;br&gt; - A maximum of 10 breaks can be loaded via API.&lt;br&gt; - Breaks cannot be overlapped in the same day.&lt;br&gt; - &#39;start&#39; field is required. |  [optional] |
|**comment** | **String** | Optional text to describe an attendance record (pair of startTime and endTime). The maximum number of characters is 150. |  [optional] |



