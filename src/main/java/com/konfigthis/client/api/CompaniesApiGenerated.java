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

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.CompaniesGetListResponseInner;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class CompaniesApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CompaniesApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public CompaniesApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call getListCall(String authorization, String name, String city, String country, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/companies";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (name != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("name", name));
        }

        if (city != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("city", city));
        }

        if (country != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("country", country));
        }

        if (authorization != null) {
            localVarHeaderParams.put("Authorization", localVarApiClient.parameterToString(authorization));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getListValidateBeforeCall(String authorization, String name, String city, String country, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling getList(Async)");
        }

        return getListCall(authorization, name, city, country, _callback);

    }


    private ApiResponse<List<CompaniesGetListResponseInner>> getListWithHttpInfo(String authorization, String name, String city, String country) throws ApiException {
        okhttp3.Call localVarCall = getListValidateBeforeCall(authorization, name, city, country, null);
        Type localVarReturnType = new TypeToken<List<CompaniesGetListResponseInner>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getListAsync(String authorization, String name, String city, String country, final ApiCallback<List<CompaniesGetListResponseInner>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getListValidateBeforeCall(authorization, name, city, country, _callback);
        Type localVarReturnType = new TypeToken<List<CompaniesGetListResponseInner>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetListRequestBuilder {
        private final String authorization;
        private String name;
        private String city;
        private String country;

        private GetListRequestBuilder(String authorization) {
            this.authorization = authorization;
        }

        /**
         * Set name
         * @param name The name of the company. (optional)
         * @return GetListRequestBuilder
         */
        public GetListRequestBuilder name(String name) {
            this.name = name;
            return this;
        }
        
        /**
         * Set city
         * @param city The city of the company. (optional)
         * @return GetListRequestBuilder
         */
        public GetListRequestBuilder city(String city) {
            this.city = city;
            return this;
        }
        
        /**
         * Set country
         * @param country The country code of the company in ISO 3166-1 alpha-2. (optional)
         * @return GetListRequestBuilder
         */
        public GetListRequestBuilder country(String country) {
            this.country = country;
            return this;
        }
        
        /**
         * Build call for getList
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> UNAUTHORIZED. The Authorization header is incorrect, not provided or the token expired. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getListCall(authorization, name, city, country, _callback);
        }


        /**
         * Execute getList request
         * @return List&lt;CompaniesGetListResponseInner&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> UNAUTHORIZED. The Authorization header is incorrect, not provided or the token expired. </td><td>  -  </td></tr>
         </table>
         */
        public List<CompaniesGetListResponseInner> execute() throws ApiException {
            ApiResponse<List<CompaniesGetListResponseInner>> localVarResp = getListWithHttpInfo(authorization, name, city, country);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getList request with HTTP info returned
         * @return ApiResponse&lt;List&lt;CompaniesGetListResponseInner&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> UNAUTHORIZED. The Authorization header is incorrect, not provided or the token expired. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<CompaniesGetListResponseInner>> executeWithHttpInfo() throws ApiException {
            return getListWithHttpInfo(authorization, name, city, country);
        }

        /**
         * Execute getList request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> UNAUTHORIZED. The Authorization header is incorrect, not provided or the token expired. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<List<CompaniesGetListResponseInner>> _callback) throws ApiException {
            return getListAsync(authorization, name, city, country, _callback);
        }
    }

    /**
     * 
     * Returns a list of the existing companies in Kenjo.
     * @param authorization A valid bearer token. (required)
     * @return GetListRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> UNAUTHORIZED. The Authorization header is incorrect, not provided or the token expired. </td><td>  -  </td></tr>
     </table>
     */
    public GetListRequestBuilder getList(String authorization) throws IllegalArgumentException {
        if (authorization == null) throw new IllegalArgumentException("\"authorization\" is required but got null");
            

        return new GetListRequestBuilder(authorization);
    }
}
