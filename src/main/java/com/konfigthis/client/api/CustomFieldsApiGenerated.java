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


import com.konfigthis.client.model.CustomFieldsGetListResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class CustomFieldsApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CustomFieldsApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public CustomFieldsApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getListCall(String authorization, String section, String label, String apiName, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/custom-fields";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (section != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("section", section));
        }

        if (label != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("label", label));
        }

        if (apiName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("apiName", apiName));
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
    private okhttp3.Call getListValidateBeforeCall(String authorization, String section, String label, String apiName, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new ApiException("Missing the required parameter 'authorization' when calling getList(Async)");
        }

        return getListCall(authorization, section, label, apiName, _callback);

    }


    private ApiResponse<CustomFieldsGetListResponse> getListWithHttpInfo(String authorization, String section, String label, String apiName) throws ApiException {
        okhttp3.Call localVarCall = getListValidateBeforeCall(authorization, section, label, apiName, null);
        Type localVarReturnType = new TypeToken<CustomFieldsGetListResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getListAsync(String authorization, String section, String label, String apiName, final ApiCallback<CustomFieldsGetListResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getListValidateBeforeCall(authorization, section, label, apiName, _callback);
        Type localVarReturnType = new TypeToken<CustomFieldsGetListResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetListRequestBuilder {
        private final String authorization;
        private String section;
        private String label;
        private String apiName;

        private GetListRequestBuilder(String authorization) {
            this.authorization = authorization;
        }

        /**
         * Set section
         * @param section The name of custom field section. (optional)
         * @return GetListRequestBuilder
         */
        public GetListRequestBuilder section(String section) {
            this.section = section;
            return this;
        }
        
        /**
         * Set label
         * @param label The name of the custom field label. (optional)
         * @return GetListRequestBuilder
         */
        public GetListRequestBuilder label(String label) {
            this.label = label;
            return this;
        }
        
        /**
         * Set apiName
         * @param apiName The api name is a required identifier to perform POST and PUT operations with employees. (optional)
         * @return GetListRequestBuilder
         */
        public GetListRequestBuilder apiName(String apiName) {
            this.apiName = apiName;
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
            return getListCall(authorization, section, label, apiName, _callback);
        }


        /**
         * Execute getList request
         * @return CustomFieldsGetListResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> UNAUTHORIZED. The Authorization header is incorrect, not provided or the token expired. </td><td>  -  </td></tr>
         </table>
         */
        public CustomFieldsGetListResponse execute() throws ApiException {
            ApiResponse<CustomFieldsGetListResponse> localVarResp = getListWithHttpInfo(authorization, section, label, apiName);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getList request with HTTP info returned
         * @return ApiResponse&lt;CustomFieldsGetListResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> UNAUTHORIZED. The Authorization header is incorrect, not provided or the token expired. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<CustomFieldsGetListResponse> executeWithHttpInfo() throws ApiException {
            return getListWithHttpInfo(authorization, section, label, apiName);
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
        public okhttp3.Call executeAsync(final ApiCallback<CustomFieldsGetListResponse> _callback) throws ApiException {
            return getListAsync(authorization, section, label, apiName, _callback);
        }
    }

    /**
     * 
     * Returns a list of the existing custom fields in Kenjo.
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
