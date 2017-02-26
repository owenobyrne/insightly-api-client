

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

import ly.insight.model.APIInstance;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InstanceApi {
    private ApiClient apiClient;

    public InstanceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public InstanceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getInstance */
    private com.squareup.okhttp.Call getInstanceCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/Instance".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
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
     * Gets the Instance
     * 
     * @return APIInstance
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public APIInstance getInstance() throws ApiException {
        ApiResponse<APIInstance> resp = getInstanceWithHttpInfo();
        return resp.getData();
    }

    /**
     * Gets the Instance
     * 
     * @return ApiResponse&lt;APIInstance&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<APIInstance> getInstanceWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getInstanceCall(null, null);
        Type localVarReturnType = new TypeToken<APIInstance>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets the Instance (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getInstanceAsync(final ApiCallback<APIInstance> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getInstanceCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<APIInstance>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
