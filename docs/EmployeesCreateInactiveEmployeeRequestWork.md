

# EmployeesCreateInactiveEmployeeRequestWork


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**companyId** | **String** | The company id of the Kenjo employee. This field is required and must to match with Kenjo _id of an existing company. |  |
|**officeId** | **String** | The office id of the Kenjo employee. |  [optional] |
|**departmentId** | **String** | The department id of the Kenjo employee. |  [optional] |
|**startDate** | **String** | The starting date of the employee. Format YYYY-MM-DDThh:mm:ss.000Z. |  [optional] |
|**jobTitle** | **String** | The job title of the employee. |  [optional] |
|**workPhone** | **String** | The work phone of the employee. |  [optional] |
|**workMobile** | **String** | The work mobile of the employee. |  [optional] |
|**isAssistant** | **Boolean** | Allow to indicate if the employee has or not the assistant role. |  [optional] |
|**probationPeriodEnd** | **String** | The probation period of the employee. Format YYYY-MM-DDThh:mm:ss.000Z. |  [optional] |
|**reportsToId** | **String** | The Kenjo employee id of the user to whom the employee reports. The employee id to assign can be an active or inactive user. Trying to assign the own employee id or the id of someone who is already reporting will arise an error. |  [optional] |
|**weeklyHours** | **Double** | The number of weekly hours that an employee works. Combined with the work schedule allows to determine the day hours. This field is required and must be equals or greater than 1. |  |



