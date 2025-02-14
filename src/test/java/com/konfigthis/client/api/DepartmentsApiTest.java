/*
 * Kenjo API
 * Before starting to use the Kenjo API, you have to request the API activation for a sandbox or production environment to the Kenjo Customer Success team. After that, an admin user has to go to *Settings > Integrations > API keys*, to generate the **API Key**. Follow the steps described in the **Autentication section** of this document. <br>The API key is needed to request the bearer token. Each endpoint callout requires a valid bearer token in the Authorization header. Once the token is retrieved, it will be useful during the time limit indicated by the 'expiration date'.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.DepartmentsCreateNewDepartmentRequest;
import com.konfigthis.client.model.DepartmentsCreateNewDepartmentResponse;
import com.konfigthis.client.model.DepartmentsGetByIdResponse;
import com.konfigthis.client.model.DepartmentsListDepartmentsResponseInner;
import com.konfigthis.client.model.DepartmentsUpdateAttributesRequest;
import com.konfigthis.client.model.DepartmentsUpdateAttributesResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DepartmentsApi
 */
@Disabled
public class DepartmentsApiTest {

    private static DepartmentsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new DepartmentsApi(apiClient);
    }

    /**
     * Creates a new department.&lt;br&gt;The *name* is the only required field.&lt;br&gt;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewDepartmentTest() throws ApiException {
        String authorization = null;
        String name = null;
        DepartmentsCreateNewDepartmentResponse response = api.createNewDepartment(authorization)
                .name(name)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns the department referenced by *id*.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByIdTest() throws ApiException {
        String id = null;
        String authorization = null;
        DepartmentsGetByIdResponse response = api.getById(id, authorization)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a list of the existing departments in Kenjo.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listDepartmentsTest() throws ApiException {
        String authorization = null;
        String name = null;
        List<DepartmentsListDepartmentsResponseInner> response = api.listDepartments(authorization)
                .name(name)
                .execute();
        // TODO: test validations
    }

    /**
     * Removes the department referenced by *id*.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeByIdTest() throws ApiException {
        String id = null;
        String authorization = null;
        api.removeById(id, authorization)
                .execute();
        // TODO: test validations
    }

    /**
     * Updates a deparment referenced by *id*. Only the attributes submitted are modified.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateAttributesTest() throws ApiException {
        String id = null;
        String authorization = null;
        String name = null;
        DepartmentsUpdateAttributesResponse response = api.updateAttributes(id, authorization)
                .name(name)
                .execute();
        // TODO: test validations
    }

}
