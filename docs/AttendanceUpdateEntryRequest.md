

# AttendanceUpdateEntryRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**startTime** | **String** | The new start time of the attendance entry to update. The valid format is *hh:mm:ss* |  [optional] |
|**endTime** | **String** | The new end time of the attendance entry to update. The valid format is *hh:mm:ss* |  [optional] |
|**breaks** | [**List&lt;AttendanceUpdateEntryRequestBreaksInner&gt;**](AttendanceUpdateEntryRequestBreaksInner.md) | Array that contains the breaks in detail. Rules:&lt;br&gt; - A maximum of 10 breaks can be loaded via API.&lt;br&gt; - Breaks cannot be overlapped in the same day.&lt;br&gt; - &#39;start&#39; field is required.&lt;br&gt; - There is no way to update specifically a break.&lt;br&gt; - To remove &#39;breaks&#39;, just send an empty array in the update, something like \&quot;breaks\&quot;:[] |  [optional] |
|**comment** | **String** | Optional text to describe an attendance record (pair of startTime and endTime). The maximum number of characters is 150. |  [optional] |



