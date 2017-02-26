

package ly.insight.api;

import ly.insight.ApiCallback;
import ly.insight.ApiClient;
import ly.insight.ApiException;
import ly.insight.ApiResponse;
import ly.insight.Configuration;
import ly.insight.Pair;
import ly.insight.ProgressRequestBody;
import ly.insight.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import ly.insight.model.APILeadStatus;
import ly.insight.model.LeadStatus;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeadStatusesApi {
    private ApiClient apiClient;

    public LeadStatusesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public LeadStatusesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for addLeadStatus */
    private com.squareup.okhttp.Call addLeadStatusCall(APILeadStatus leadStatus, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = leadStatus;
        
        // verify the required parameter 'leadStatus' is set
        if (leadStatus == null) {
            throw new ApiException("Missing the required parameter 'leadStatus' when calling addLeadStatus(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/LeadStatuses".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Adds a Lead Status
     * This endpoint is used to add a new lead status option to the instance. This endpoint is only accessible to users with administrator access.
     * @param leadStatus The Lead Status to add (required)
     * @return LeadStatus
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LeadStatus addLeadStatus(APILeadStatus leadStatus) throws ApiException {
        ApiResponse<LeadStatus> resp = addLeadStatusWithHttpInfo(leadStatus);
        return resp.getData();
    }

    /**
     * Adds a Lead Status
     * This endpoint is used to add a new lead status option to the instance. This endpoint is only accessible to users with administrator access.
     * @param leadStatus The Lead Status to add (required)
     * @return ApiResponse&lt;LeadStatus&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LeadStatus> addLeadStatusWithHttpInfo(APILeadStatus leadStatus) throws ApiException {
        com.squareup.okhttp.Call call = addLeadStatusCall(leadStatus, null, null);
        Type localVarReturnType = new TypeToken<LeadStatus>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Adds a Lead Status (asynchronously)
     * This endpoint is used to add a new lead status option to the instance. This endpoint is only accessible to users with administrator access.
     * @param leadStatus The Lead Status to add (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addLeadStatusAsync(APILeadStatus leadStatus, final ApiCallback<LeadStatus> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addLeadStatusCall(leadStatus, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LeadStatus>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for deleteLeadStatus */
    private com.squareup.okhttp.Call deleteLeadStatusCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteLeadStatus(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/LeadStatuses/{id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Deletes a Lead Status
     * This endpoint is used to delete an existing lead status.
     * @param id A Lead Status&#39;s ID (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteLeadStatus(Long id) throws ApiException {
        deleteLeadStatusWithHttpInfo(id);
    }

    /**
     * Deletes a Lead Status
     * This endpoint is used to delete an existing lead status.
     * @param id A Lead Status&#39;s ID (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteLeadStatusWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = deleteLeadStatusCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes a Lead Status (asynchronously)
     * This endpoint is used to delete an existing lead status.
     * @param id A Lead Status&#39;s ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteLeadStatusAsync(Long id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteLeadStatusCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for getLeadStatuses */
    private com.squareup.okhttp.Call getLeadStatusesCall(Boolean includeConverted, Integer skip, Integer top, Boolean countTotal, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/LeadStatuses".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (includeConverted != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "include_converted", includeConverted));
        if (skip != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "skip", skip));
        if (top != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "top", top));
        if (countTotal != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "count_total", countTotal));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Gets a list of Lead Statuses
     * This endpoint returns a list of the possible lead statuses that have been defined for the Insightly instance.
     * @param includeConverted Optional, by default converted status is not included, pass in \&quot;true\&quot; to include it in the response (optional, default to false)
     * @param skip Optional, number of lead statuses to skip. (optional)
     * @param top Optional, maximum number of lead statuses to return in the response. (optional)
     * @param countTotal Optional, true if total number of records should be returned in the response headers. (optional, default to false)
     * @return List&lt;LeadStatus&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<LeadStatus> getLeadStatuses(Boolean includeConverted, Integer skip, Integer top, Boolean countTotal) throws ApiException {
        ApiResponse<List<LeadStatus>> resp = getLeadStatusesWithHttpInfo(includeConverted, skip, top, countTotal);
        return resp.getData();
    }

    /**
     * Gets a list of Lead Statuses
     * This endpoint returns a list of the possible lead statuses that have been defined for the Insightly instance.
     * @param includeConverted Optional, by default converted status is not included, pass in \&quot;true\&quot; to include it in the response (optional, default to false)
     * @param skip Optional, number of lead statuses to skip. (optional)
     * @param top Optional, maximum number of lead statuses to return in the response. (optional)
     * @param countTotal Optional, true if total number of records should be returned in the response headers. (optional, default to false)
     * @return ApiResponse&lt;List&lt;LeadStatus&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<LeadStatus>> getLeadStatusesWithHttpInfo(Boolean includeConverted, Integer skip, Integer top, Boolean countTotal) throws ApiException {
        com.squareup.okhttp.Call call = getLeadStatusesCall(includeConverted, skip, top, countTotal, null, null);
        Type localVarReturnType = new TypeToken<List<LeadStatus>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a list of Lead Statuses (asynchronously)
     * This endpoint returns a list of the possible lead statuses that have been defined for the Insightly instance.
     * @param includeConverted Optional, by default converted status is not included, pass in \&quot;true\&quot; to include it in the response (optional, default to false)
     * @param skip Optional, number of lead statuses to skip. (optional)
     * @param top Optional, maximum number of lead statuses to return in the response. (optional)
     * @param countTotal Optional, true if total number of records should be returned in the response headers. (optional, default to false)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLeadStatusesAsync(Boolean includeConverted, Integer skip, Integer top, Boolean countTotal, final ApiCallback<List<LeadStatus>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLeadStatusesCall(includeConverted, skip, top, countTotal, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<LeadStatus>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updateLeadStatus */
    private com.squareup.okhttp.Call updateLeadStatusCall(APILeadStatus leadStatus, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = leadStatus;
        
        // verify the required parameter 'leadStatus' is set
        if (leadStatus == null) {
            throw new ApiException("Missing the required parameter 'leadStatus' when calling updateLeadStatus(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/LeadStatuses".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Updates a Lead Status
     * This endpoint is used to update an existing lead status. This endpoint is only accessible to users with administrator access.
     * @param leadStatus A Lead Status (required)
     * @return LeadStatus
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LeadStatus updateLeadStatus(APILeadStatus leadStatus) throws ApiException {
        ApiResponse<LeadStatus> resp = updateLeadStatusWithHttpInfo(leadStatus);
        return resp.getData();
    }

    /**
     * Updates a Lead Status
     * This endpoint is used to update an existing lead status. This endpoint is only accessible to users with administrator access.
     * @param leadStatus A Lead Status (required)
     * @return ApiResponse&lt;LeadStatus&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LeadStatus> updateLeadStatusWithHttpInfo(APILeadStatus leadStatus) throws ApiException {
        com.squareup.okhttp.Call call = updateLeadStatusCall(leadStatus, null, null);
        Type localVarReturnType = new TypeToken<LeadStatus>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Updates a Lead Status (asynchronously)
     * This endpoint is used to update an existing lead status. This endpoint is only accessible to users with administrator access.
     * @param leadStatus A Lead Status (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateLeadStatusAsync(APILeadStatus leadStatus, final ApiCallback<LeadStatus> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateLeadStatusCall(leadStatus, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LeadStatus>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
