/*
 * Sales Order - Create, Read, Update, Delete (A2X)
 * You can use this service to integrate external  applications with sales order processing in SAP  S/4HANA Cloud. In every API call, you can make  use of the following operations:  - You can retrieve  sales orders. Apply any of the filters provided or  retrieve all existing data.  - You can create sales  orders. Note that you must use “deep insert”  requests (a header plus the following entities:  header partner, header pricing element, header  text, payment details, item, item partner, item  pricing element, and item text). You cannot create  entities without including any related entities.  - For  existing sales orders, you can create new items.  Note that you must use “deep insert” requests  (with the following entities: item partner, item pricing  element, and item text). You cannot create entities  without including any related entities.  - For existing  sales orders, you can update the header, header  partner, header pricing element, header text,  payment details, item, item partner, item pricing  element, and item text.  - For existing sales  orders, you can delete the header, header partner,  header pricing element, header text, payment  details, item, item partner, item pricing element,  and item text.  - You can accept or deny approval  requests for sales orders that cannot be processed  without the consent of an approver.
 *
 * OpenAPI spec version: 1 
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.sap.apibhub.sdk.api_sales_order_srv.api;

import com.sap.apibhub.sdk.client.ApiCallback;
import com.sap.apibhub.sdk.client.ApiClient;
import com.sap.apibhub.sdk.client.ApiException;
import com.sap.apibhub.sdk.client.ApiResponse;
import com.sap.apibhub.sdk.client.Configuration;
import com.sap.apibhub.sdk.client.Pair;
import com.sap.apibhub.sdk.client.ProgressRequestBody;
import com.sap.apibhub.sdk.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.sap.apibhub.sdk.api_sales_order_srv.model.OdataError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BatchRequestsApi {
    private ApiClient apiClient;

    public BatchRequestsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BatchRequestsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for batchPost */
    private com.squareup.okhttp.Call batchPostCall(String requestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = requestBody;
        
        // create path and map variables
        String localVarPath = "/$batch".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "multipart/mixed"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/mixed;boundary=request-separator"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {"APIBHUB_SANDBOX_APIKEY", "basicAuthentication" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call batchPostValidateBeforeCall(String requestBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = batchPostCall(requestBody, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Send a group of requests
     * Group multiple requests into a single request payload, see [OData Batch Requests](http://docs.oasis-open.org/odata/odata/v4.01/odata-v4.01-part1-protocol.html#sec_BatchRequests).
     * @param requestBody Batch request (optional)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String batchPost(String requestBody) throws ApiException {
        ApiResponse<String> resp = batchPostWithHttpInfo(requestBody);
        return resp.getData();
    }

    /**
     * Send a group of requests
     * Group multiple requests into a single request payload, see [OData Batch Requests](http://docs.oasis-open.org/odata/odata/v4.01/odata-v4.01-part1-protocol.html#sec_BatchRequests).
     * @param requestBody Batch request (optional)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> batchPostWithHttpInfo(String requestBody) throws ApiException {
        com.squareup.okhttp.Call call = batchPostValidateBeforeCall(requestBody, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Send a group of requests (asynchronously)
     * Group multiple requests into a single request payload, see [OData Batch Requests](http://docs.oasis-open.org/odata/odata/v4.01/odata-v4.01-part1-protocol.html#sec_BatchRequests).
     * @param requestBody Batch request (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call batchPostAsync(String requestBody, final ApiCallback<String> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = batchPostValidateBeforeCall(requestBody, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
