

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

import ly.insight.model.APIComment;
import ly.insight.model.Comment;
import java.util.Date;
import java.io.File;
import ly.insight.model.FileAttachment;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommentsApi {
    private ApiClient apiClient;

    public CommentsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CommentsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for addFileAttachment */
    private com.squareup.okhttp.Call addFileAttachmentCall(Long id, File file, String fileName, String contentType, Integer fileCategoryId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling addFileAttachment(Async)");
        }
        
        // verify the required parameter 'file' is set
        if (file == null) {
            throw new ApiException("Missing the required parameter 'file' when calling addFileAttachment(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Comments/{id}/FileAttachments".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (file != null)
        localVarFormParams.put("file", file);
        if (fileName != null)
        localVarFormParams.put("file_name", fileName);
        if (contentType != null)
        localVarFormParams.put("content_type", contentType);
        if (fileCategoryId != null)
        localVarFormParams.put("file_category_id", fileCategoryId);

        final String[] localVarAccepts = {
            "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
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
     * Adds a File Attachment to a Comment
     * 
     * @param id Comment ID (required)
     * @param file File and metadata to be attached to Comment (required)
     * @param fileName The name and extension of the File Attachment (optional)
     * @param contentType The MIME type of the File Attachment (optional)
     * @param fileCategoryId The category of the File Attachment, if it has been assigned to one (optional)
     * @return FileAttachment
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FileAttachment addFileAttachment(Long id, File file, String fileName, String contentType, Integer fileCategoryId) throws ApiException {
        ApiResponse<FileAttachment> resp = addFileAttachmentWithHttpInfo(id, file, fileName, contentType, fileCategoryId);
        return resp.getData();
    }

    /**
     * Adds a File Attachment to a Comment
     * 
     * @param id Comment ID (required)
     * @param file File and metadata to be attached to Comment (required)
     * @param fileName The name and extension of the File Attachment (optional)
     * @param contentType The MIME type of the File Attachment (optional)
     * @param fileCategoryId The category of the File Attachment, if it has been assigned to one (optional)
     * @return ApiResponse&lt;FileAttachment&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FileAttachment> addFileAttachmentWithHttpInfo(Long id, File file, String fileName, String contentType, Integer fileCategoryId) throws ApiException {
        com.squareup.okhttp.Call call = addFileAttachmentCall(id, file, fileName, contentType, fileCategoryId, null, null);
        Type localVarReturnType = new TypeToken<FileAttachment>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Adds a File Attachment to a Comment (asynchronously)
     * 
     * @param id Comment ID (required)
     * @param file File and metadata to be attached to Comment (required)
     * @param fileName The name and extension of the File Attachment (optional)
     * @param contentType The MIME type of the File Attachment (optional)
     * @param fileCategoryId The category of the File Attachment, if it has been assigned to one (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addFileAttachmentAsync(Long id, File file, String fileName, String contentType, Integer fileCategoryId, final ApiCallback<FileAttachment> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addFileAttachmentCall(id, file, fileName, contentType, fileCategoryId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FileAttachment>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for deleteComment */
    private com.squareup.okhttp.Call deleteCommentCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteComment(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Comments/{id}".replaceAll("\\{format\\}","json")
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
     * Deletes a Comment
     * 
     * @param id A Comment&#39;s ID (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteComment(Long id) throws ApiException {
        deleteCommentWithHttpInfo(id);
    }

    /**
     * Deletes a Comment
     * 
     * @param id A Comment&#39;s ID (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteCommentWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = deleteCommentCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes a Comment (asynchronously)
     * 
     * @param id A Comment&#39;s ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteCommentAsync(Long id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteCommentCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for getComment */
    private com.squareup.okhttp.Call getCommentCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getComment(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Comments/{id}".replaceAll("\\{format\\}","json")
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
     * Gets a Comment
     * 
     * @param id A Comments&#39;s ID (required)
     * @return Comment
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Comment getComment(Long id) throws ApiException {
        ApiResponse<Comment> resp = getCommentWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Gets a Comment
     * 
     * @param id A Comments&#39;s ID (required)
     * @return ApiResponse&lt;Comment&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Comment> getCommentWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = getCommentCall(id, null, null);
        Type localVarReturnType = new TypeToken<Comment>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a Comment (asynchronously)
     * 
     * @param id A Comments&#39;s ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCommentAsync(Long id, final ApiCallback<Comment> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCommentCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Comment>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getFileAttachments */
    private com.squareup.okhttp.Call getFileAttachmentsCall(Long id, Date updatedAfterUtc, Integer skip, Integer top, Boolean countTotal, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getFileAttachments(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Comments/{id}/FileAttachments".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (updatedAfterUtc != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "updated_after_utc", updatedAfterUtc));
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
     * Gets a Comments&#39;s File Attachments
     * 
     * @param id A Comments&#39;s ID (COMMENT_ID) (required)
     * @param updatedAfterUtc Optional, earliest date when file attachment was last updated. (optional)
     * @param skip Optional, number of file attachments to skip. (optional)
     * @param top Optional, maximum number of file attachments to return in the response. (optional)
     * @param countTotal true if total number of records should be returned in the response headers. (optional, default to false)
     * @return List&lt;FileAttachment&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<FileAttachment> getFileAttachments(Long id, Date updatedAfterUtc, Integer skip, Integer top, Boolean countTotal) throws ApiException {
        ApiResponse<List<FileAttachment>> resp = getFileAttachmentsWithHttpInfo(id, updatedAfterUtc, skip, top, countTotal);
        return resp.getData();
    }

    /**
     * Gets a Comments&#39;s File Attachments
     * 
     * @param id A Comments&#39;s ID (COMMENT_ID) (required)
     * @param updatedAfterUtc Optional, earliest date when file attachment was last updated. (optional)
     * @param skip Optional, number of file attachments to skip. (optional)
     * @param top Optional, maximum number of file attachments to return in the response. (optional)
     * @param countTotal true if total number of records should be returned in the response headers. (optional, default to false)
     * @return ApiResponse&lt;List&lt;FileAttachment&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<FileAttachment>> getFileAttachmentsWithHttpInfo(Long id, Date updatedAfterUtc, Integer skip, Integer top, Boolean countTotal) throws ApiException {
        com.squareup.okhttp.Call call = getFileAttachmentsCall(id, updatedAfterUtc, skip, top, countTotal, null, null);
        Type localVarReturnType = new TypeToken<List<FileAttachment>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a Comments&#39;s File Attachments (asynchronously)
     * 
     * @param id A Comments&#39;s ID (COMMENT_ID) (required)
     * @param updatedAfterUtc Optional, earliest date when file attachment was last updated. (optional)
     * @param skip Optional, number of file attachments to skip. (optional)
     * @param top Optional, maximum number of file attachments to return in the response. (optional)
     * @param countTotal true if total number of records should be returned in the response headers. (optional, default to false)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFileAttachmentsAsync(Long id, Date updatedAfterUtc, Integer skip, Integer top, Boolean countTotal, final ApiCallback<List<FileAttachment>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getFileAttachmentsCall(id, updatedAfterUtc, skip, top, countTotal, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<FileAttachment>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updateComment */
    private com.squareup.okhttp.Call updateCommentCall(APIComment apiComment, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = apiComment;
        
        // verify the required parameter 'apiComment' is set
        if (apiComment == null) {
            throw new ApiException("Missing the required parameter 'apiComment' when calling updateComment(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Comments".replaceAll("\\{format\\}","json");

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
     * Updates a Comment
     * 
     * @param apiComment The Comment to add (required)
     * @return Comment
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Comment updateComment(APIComment apiComment) throws ApiException {
        ApiResponse<Comment> resp = updateCommentWithHttpInfo(apiComment);
        return resp.getData();
    }

    /**
     * Updates a Comment
     * 
     * @param apiComment The Comment to add (required)
     * @return ApiResponse&lt;Comment&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Comment> updateCommentWithHttpInfo(APIComment apiComment) throws ApiException {
        com.squareup.okhttp.Call call = updateCommentCall(apiComment, null, null);
        Type localVarReturnType = new TypeToken<Comment>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Updates a Comment (asynchronously)
     * 
     * @param apiComment The Comment to add (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateCommentAsync(APIComment apiComment, final ApiCallback<Comment> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateCommentCall(apiComment, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Comment>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
