

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

import ly.insight.model.APICategory;
import ly.insight.model.Category;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskCategoriesApi {
    private ApiClient apiClient;

    public TaskCategoriesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TaskCategoriesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for addTaskCategory */
    private com.squareup.okhttp.Call addTaskCategoryCall(APICategory category, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = category;
        
        // verify the required parameter 'category' is set
        if (category == null) {
            throw new ApiException("Missing the required parameter 'category' when calling addTaskCategory(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/TaskCategories".replaceAll("\\{format\\}","json");

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
     * Adds a Task Category
     * This endpoint is used to create a new task category. This endpoint is only accessible to users with administrator permission.
     * @param category The Task Category to add (just include JSON object as request body) (required)
     * @return Category
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Category addTaskCategory(APICategory category) throws ApiException {
        ApiResponse<Category> resp = addTaskCategoryWithHttpInfo(category);
        return resp.getData();
    }

    /**
     * Adds a Task Category
     * This endpoint is used to create a new task category. This endpoint is only accessible to users with administrator permission.
     * @param category The Task Category to add (just include JSON object as request body) (required)
     * @return ApiResponse&lt;Category&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Category> addTaskCategoryWithHttpInfo(APICategory category) throws ApiException {
        com.squareup.okhttp.Call call = addTaskCategoryCall(category, null, null);
        Type localVarReturnType = new TypeToken<Category>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Adds a Task Category (asynchronously)
     * This endpoint is used to create a new task category. This endpoint is only accessible to users with administrator permission.
     * @param category The Task Category to add (just include JSON object as request body) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addTaskCategoryAsync(APICategory category, final ApiCallback<Category> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addTaskCategoryCall(category, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Category>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for deleteTaskCategory */
    private com.squareup.okhttp.Call deleteTaskCategoryCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteTaskCategory(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/TaskCategories/{id}".replaceAll("\\{format\\}","json")
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
     * Deactivates a Task Category
     * This endpoint is used to deactivate a task category. This endpoint is only accessible to users with administrator permission.
     * @param id A Task Category&#39;s ID (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteTaskCategory(Long id) throws ApiException {
        deleteTaskCategoryWithHttpInfo(id);
    }

    /**
     * Deactivates a Task Category
     * This endpoint is used to deactivate a task category. This endpoint is only accessible to users with administrator permission.
     * @param id A Task Category&#39;s ID (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteTaskCategoryWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = deleteTaskCategoryCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deactivates a Task Category (asynchronously)
     * This endpoint is used to deactivate a task category. This endpoint is only accessible to users with administrator permission.
     * @param id A Task Category&#39;s ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteTaskCategoryAsync(Long id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteTaskCategoryCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for getTaskCategories */
    private com.squareup.okhttp.Call getTaskCategoriesCall(Integer skip, Integer top, Boolean countTotal, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/TaskCategories".replaceAll("\\{format\\}","json");

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
     * Gets a list of Task Categories
     * This read only endpoint returns a list of the task categories set up for the Insightly instance.
     * @param skip Optional, number of records to skip. (optional)
     * @param top Optional, maximum number of records to return in the response. (optional)
     * @param countTotal Optional, true if total number of records should be returned in the response headers. (optional, default to false)
     * @return List&lt;Category&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Category> getTaskCategories(Integer skip, Integer top, Boolean countTotal) throws ApiException {
        ApiResponse<List<Category>> resp = getTaskCategoriesWithHttpInfo(skip, top, countTotal);
        return resp.getData();
    }

    /**
     * Gets a list of Task Categories
     * This read only endpoint returns a list of the task categories set up for the Insightly instance.
     * @param skip Optional, number of records to skip. (optional)
     * @param top Optional, maximum number of records to return in the response. (optional)
     * @param countTotal Optional, true if total number of records should be returned in the response headers. (optional, default to false)
     * @return ApiResponse&lt;List&lt;Category&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Category>> getTaskCategoriesWithHttpInfo(Integer skip, Integer top, Boolean countTotal) throws ApiException {
        com.squareup.okhttp.Call call = getTaskCategoriesCall(skip, top, countTotal, null, null);
        Type localVarReturnType = new TypeToken<List<Category>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a list of Task Categories (asynchronously)
     * This read only endpoint returns a list of the task categories set up for the Insightly instance.
     * @param skip Optional, number of records to skip. (optional)
     * @param top Optional, maximum number of records to return in the response. (optional)
     * @param countTotal Optional, true if total number of records should be returned in the response headers. (optional, default to false)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTaskCategoriesAsync(Integer skip, Integer top, Boolean countTotal, final ApiCallback<List<Category>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTaskCategoriesCall(skip, top, countTotal, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Category>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getTaskCategory */
    private com.squareup.okhttp.Call getTaskCategoryCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getTaskCategory(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/TaskCategories/{id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

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
     * Gets a Task Category
     * This endpoint returns the graph for a specific task category.
     * @param id A Task Category&#39;s ID (required)
     * @return Category
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Category getTaskCategory(Long id) throws ApiException {
        ApiResponse<Category> resp = getTaskCategoryWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Gets a Task Category
     * This endpoint returns the graph for a specific task category.
     * @param id A Task Category&#39;s ID (required)
     * @return ApiResponse&lt;Category&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Category> getTaskCategoryWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = getTaskCategoryCall(id, null, null);
        Type localVarReturnType = new TypeToken<Category>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a Task Category (asynchronously)
     * This endpoint returns the graph for a specific task category.
     * @param id A Task Category&#39;s ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTaskCategoryAsync(Long id, final ApiCallback<Category> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTaskCategoryCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Category>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updateTaskCategory */
    private com.squareup.okhttp.Call updateTaskCategoryCall(APICategory category, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = category;
        
        // verify the required parameter 'category' is set
        if (category == null) {
            throw new ApiException("Missing the required parameter 'category' when calling updateTaskCategory(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/TaskCategories".replaceAll("\\{format\\}","json");

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
     * Updates a Task Category
     * This endpoint is used to update an existing task category, for example to change the background color for the task category&#39;s label in the web UI. This endpoint is only accessible to users with administrator permission.
     * @param category A Task Category (just include JSON object as request body) (required)
     * @return Category
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Category updateTaskCategory(APICategory category) throws ApiException {
        ApiResponse<Category> resp = updateTaskCategoryWithHttpInfo(category);
        return resp.getData();
    }

    /**
     * Updates a Task Category
     * This endpoint is used to update an existing task category, for example to change the background color for the task category&#39;s label in the web UI. This endpoint is only accessible to users with administrator permission.
     * @param category A Task Category (just include JSON object as request body) (required)
     * @return ApiResponse&lt;Category&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Category> updateTaskCategoryWithHttpInfo(APICategory category) throws ApiException {
        com.squareup.okhttp.Call call = updateTaskCategoryCall(category, null, null);
        Type localVarReturnType = new TypeToken<Category>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Updates a Task Category (asynchronously)
     * This endpoint is used to update an existing task category, for example to change the background color for the task category&#39;s label in the web UI. This endpoint is only accessible to users with administrator permission.
     * @param category A Task Category (just include JSON object as request body) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateTaskCategoryAsync(APICategory category, final ApiCallback<Category> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateTaskCategoryCall(category, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Category>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
