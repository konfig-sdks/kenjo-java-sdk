package com.konfigthis.client;

import com.konfigthis.client.api.AreasApi;
import com.konfigthis.client.api.AttendanceApi;
import com.konfigthis.client.api.AuthenticationApi;
import com.konfigthis.client.api.CalendarsApi;
import com.konfigthis.client.api.CompaniesApi;
import com.konfigthis.client.api.CompensationApi;
import com.konfigthis.client.api.CustomFieldsApi;
import com.konfigthis.client.api.DepartmentsApi;
import com.konfigthis.client.api.EmployeesApi;
import com.konfigthis.client.api.OfficesApi;
import com.konfigthis.client.api.TeamsApi;
import com.konfigthis.client.api.TimeOffApi;
import com.konfigthis.client.api.UserAccountsApi;

public class Kenjo {
    private ApiClient apiClient;
    public final AreasApi areas;
    public final AttendanceApi attendance;
    public final AuthenticationApi authentication;
    public final CalendarsApi calendars;
    public final CompaniesApi companies;
    public final CompensationApi compensation;
    public final CustomFieldsApi customFields;
    public final DepartmentsApi departments;
    public final EmployeesApi employees;
    public final OfficesApi offices;
    public final TeamsApi teams;
    public final TimeOffApi timeOff;
    public final UserAccountsApi userAccounts;

    public Kenjo() {
        this(null);
    }

    public Kenjo(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.areas = new AreasApi(this.apiClient);
        this.attendance = new AttendanceApi(this.apiClient);
        this.authentication = new AuthenticationApi(this.apiClient);
        this.calendars = new CalendarsApi(this.apiClient);
        this.companies = new CompaniesApi(this.apiClient);
        this.compensation = new CompensationApi(this.apiClient);
        this.customFields = new CustomFieldsApi(this.apiClient);
        this.departments = new DepartmentsApi(this.apiClient);
        this.employees = new EmployeesApi(this.apiClient);
        this.offices = new OfficesApi(this.apiClient);
        this.teams = new TeamsApi(this.apiClient);
        this.timeOff = new TimeOffApi(this.apiClient);
        this.userAccounts = new UserAccountsApi(this.apiClient);
    }

}
