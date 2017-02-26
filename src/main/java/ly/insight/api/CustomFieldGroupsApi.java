

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

import ly.insight.model.CustomFieldGroup;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomFieldGroupsApi {
    private ApiClient apiClient;

    public CustomFieldGroupsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CustomFieldGroupsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getCustomFieldGroups */
    private com.squareup.okhttp.Call getCustomFieldGroupsCall(Integer skip, Integer top, Boolean countTotal, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/CustomFieldGroups".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
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
     * Gets a list of Custom Field Groups defined for your instance
     * 
     * @param skip Optional, number of custom field groups to skip. (optional)
     * @param top Optional, maximum number of custom field groups to return in the response. (optional)
     * @param countTotal Optional, true if total number of records should be returned in the response headers. (optional, default to false)
     * @return List&lt;CustomFieldGroup&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<CustomFieldGroup> getCustomFieldGroups(Integer skip, Integer top, Boolean countTotal) throws ApiException {
        ApiResponse<List<CustomFieldGroup>> resp = getCustomFieldGroupsWithHttpInfo(skip, top, countTotal);
        return resp.getData();
    }

    /**
     * Gets a list of Custom Field Groups defined for your instance
     * 
     * @param skip Optional, number of custom field groups to skip. (optional)
     * @param top Optional, maximum number of custom field groups to return in the response. (optional)
     * @param countTotal Optional, true if total number of records should be returned in the response headers. (optional, default to false)
     * @return ApiResponse&lt;List&lt;CustomFieldGroup&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<CustomFieldGroup>> getCustomFieldGroupsWithHttpInfo(Integer skip, Integer top, Boolean countTotal) throws ApiException {
        com.squareup.okhttp.Call call = getCustomFieldGroupsCall(skip, top, countTotal, null, null);
        Type localVarReturnType = new TypeToken<List<CustomFieldGroup>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a list of Custom Field Groups defined for your instance (asynchronously)
     * 
     * @param skip Optional, number of custom field groups to skip. (optional)
     * @param top Optional, maximum number of custom field groups to return in the response. (optional)
     * @param countTotal Optional, true if total number of records should be returned in the response headers. (optional, default to false)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCustomFieldGroupsAsync(Integer skip, Integer top, Boolean countTotal, final ApiCallback<List<CustomFieldGroup>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCustomFieldGroupsCall(skip, top, countTotal, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<CustomFieldGroup>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
