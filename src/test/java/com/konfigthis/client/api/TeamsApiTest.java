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
import com.konfigthis.client.model.TeamsCreateTeamRequest;
import com.konfigthis.client.model.TeamsCreateTeamResponse;
import com.konfigthis.client.model.TeamsGetByIdResponse;
import com.konfigthis.client.model.TeamsGetListResponseInner;
import com.konfigthis.client.model.TeamsUpdateTeamAttributesRequest;
import com.konfigthis.client.model.TeamsUpdateTeamAttributesResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TeamsApi
 */
@Disabled
public class TeamsApiTest {

    private static TeamsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new TeamsApi(apiClient);
    }

    /**
     * Creates a new team.&lt;br&gt;The *name* is the only required field.&lt;br&gt;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createTeamTest() throws ApiException {
        String authorization = null;
        String name = null;
        TeamsCreateTeamResponse response = api.createTeam(authorization)
                .name(name)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns the team referenced by *id*.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByIdTest() throws ApiException {
        String id = null;
        String authorization = null;
        TeamsGetByIdResponse response = api.getById(id, authorization)
                .execute();
        // TODO: test validations
    }

    /**
     * Returns a list of the existing teams in Kenjo.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getListTest() throws ApiException {
        String authorization = null;
        String name = null;
        List<TeamsGetListResponseInner> response = api.getList(authorization)
                .name(name)
                .execute();
        // TODO: test validations
    }

    /**
     * Removes the team referenced by *id*.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeTeamTest() throws ApiException {
        String id = null;
        String authorization = null;
        api.removeTeam(id, authorization)
                .execute();
        // TODO: test validations
    }

    /**
     * Updates a team referenced by *id*. Only the attributes submitted are modified.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateTeamAttributesTest() throws ApiException {
        String id = null;
        String authorization = null;
        String name = null;
        TeamsUpdateTeamAttributesResponse response = api.updateTeamAttributes(id, authorization)
                .name(name)
                .execute();
        // TODO: test validations
    }

}
