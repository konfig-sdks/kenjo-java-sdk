

# TimeOffGetRequestsByDateResponseDataInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The provided description on the time-off request. |  [optional] |
|**id** | **String** | The Kenjo _id of the returned time-off request. |  [optional] |
|**userId** | **String** | The employee id associated to the time-off request. |  [optional] |
|**timeOfTypeId** | **String** | The time-off type id associated to the time-off request. |  [optional] |
|**policyId** | **String** | The policy id associated to the time-off request. |  [optional] |
|**policyName** | **String** | The name of the policy id associated to the time-off request. |  [optional] |
|**policyType** | **String** | The type of the policy associated to the time-off request. It can be type *Hour* or *Day*. |  [optional] |
|**status** | **String** | The status of the time-off request. |  [optional] |
|**from** | **String** | The from date of the time-off request in format YYYY-MM-DDThh:mm:ss. |  [optional] |
|**to** | **String** | The to date of the time-off request in format YYYY-MM-DDThh:mm:ss. |  [optional] |
|**duration** | **Double** | The duration of the time-off request. It doesn&#39;t exclude bank holidays nor non-working days. |  [optional] |
|**workingTime** | **Double** | The duration of the time-off request. It excludes bank holidays and non-working days. |  [optional] |
|**createdAt** | **String** | The date that the time-off request was created in format YYYY-MM-DDThh:mm:ss. |  [optional] |
|**hasAttachment** | **Boolean** | Determines if the time-off request has related attachments. |  [optional] |



