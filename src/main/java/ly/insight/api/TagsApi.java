

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

import ly.insight.model.Tag;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TagsApi {
    private ApiClient apiClient;

    public TagsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TagsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getTags */
    private com.squareup.okhttp.Call getTagsCall(String recordType, Integer skip, Integer top, Boolean countTotal, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'recordType' is set
        if (recordType == null) {
            throw new ApiException("Missing the required parameter 'recordType' when calling getTags(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Tags".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (recordType != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "record_type", recordType));
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
     * Gets a list of Tags used for a record type
     * This endpoint returns a list of tags associated with a record type. The endpoint expects the query parameter            record_type&#x3D;contacts|leads|opportunities|organisations|projects|emails, so to fetch a list of tags associated with contacts, your query would be            /Tags?record_type&#x3D;contacts
     * @param recordType Required, filters tags by a given record type. (required)
     * @param skip Optional, number of records to skip. (optional)
     * @param top Optional, maximum number of records to return in the response. (optional)
     * @param countTotal Optional, true if total number of records should be returned in the response headers. (optional, default to false)
     * @return List&lt;Tag&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Tag> getTags(String recordType, Integer skip, Integer top, Boolean countTotal) throws ApiException {
        ApiResponse<List<Tag>> resp = getTagsWithHttpInfo(recordType, skip, top, countTotal);
        return resp.getData();
    }

    /**
     * Gets a list of Tags used for a record type
     * This endpoint returns a list of tags associated with a record type. The endpoint expects the query parameter            record_type&#x3D;contacts|leads|opportunities|organisations|projects|emails, so to fetch a list of tags associated with contacts, your query would be            /Tags?record_type&#x3D;contacts
     * @param recordType Required, filters tags by a given record type. (required)
     * @param skip Optional, number of records to skip. (optional)
     * @param top Optional, maximum number of records to return in the response. (optional)
     * @param countTotal Optional, true if total number of records should be returned in the response headers. (optional, default to false)
     * @return ApiResponse&lt;List&lt;Tag&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Tag>> getTagsWithHttpInfo(String recordType, Integer skip, Integer top, Boolean countTotal) throws ApiException {
        com.squareup.okhttp.Call call = getTagsCall(recordType, skip, top, countTotal, null, null);
        Type localVarReturnType = new TypeToken<List<Tag>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a list of Tags used for a record type (asynchronously)
     * This endpoint returns a list of tags associated with a record type. The endpoint expects the query parameter            record_type&#x3D;contacts|leads|opportunities|organisations|projects|emails, so to fetch a list of tags associated with contacts, your query would be            /Tags?record_type&#x3D;contacts
     * @param recordType Required, filters tags by a given record type. (required)
     * @param skip Optional, number of records to skip. (optional)
     * @param top Optional, maximum number of records to return in the response. (optional)
     * @param countTotal Optional, true if total number of records should be returned in the response headers. (optional, default to false)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTagsAsync(String recordType, Integer skip, Integer top, Boolean countTotal, final ApiCallback<List<Tag>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTagsCall(recordType, skip, top, countTotal, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Tag>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
