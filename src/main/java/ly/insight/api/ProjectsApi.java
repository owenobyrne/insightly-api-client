

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

import ly.insight.model.APIActivitySetAssignment;
import ly.insight.model.APICustomField;
import ly.insight.model.APILink;
import ly.insight.model.APIMilestone;
import ly.insight.model.APINote;
import ly.insight.model.APIPipelineChange;
import ly.insight.model.APIPipelineStageChange;
import ly.insight.model.APIProject;
import ly.insight.model.APITag;
import ly.insight.model.CalendarEvent;
import ly.insight.model.CustomField;
import java.util.Date;
import ly.insight.model.Email;
import java.io.File;
import ly.insight.model.FileAttachment;
import ly.insight.model.Follow;
import ly.insight.model.Link;
import ly.insight.model.LinkEmailAddress;
import ly.insight.model.Milestone;
import ly.insight.model.Note;
import ly.insight.model.Project;
import ly.insight.model.Tag;
import ly.insight.model.Task;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProjectsApi {
    private ApiClient apiClient;

    public ProjectsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ProjectsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for addActivitySetAssignment */
    private com.squareup.okhttp.Call addActivitySetAssignmentCall(Long id, APIActivitySetAssignment apiActivitySetAssignment, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = apiActivitySetAssignment;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling addActivitySetAssignment(Async)");
        }
        
        // verify the required parameter 'apiActivitySetAssignment' is set
        if (apiActivitySetAssignment == null) {
            throw new ApiException("Missing the required parameter 'apiActivitySetAssignment' when calling addActivitySetAssignment(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Projects/{id}/ActivitySetAssignment".replaceAll("\\{format\\}","json")
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Adds an Activity Set to a Project
     * 
     * @param id A Project&#39;s ID (required)
     * @param apiActivitySetAssignment The Activity Set Assignment object which contains the configuration information for the Activity Set (just include JSON object as request body) (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void addActivitySetAssignment(Long id, APIActivitySetAssignment apiActivitySetAssignment) throws ApiException {
        addActivitySetAssignmentWithHttpInfo(id, apiActivitySetAssignment);
    }

    /**
     * Adds an Activity Set to a Project
     * 
     * @param id A Project&#39;s ID (required)
     * @param apiActivitySetAssignment The Activity Set Assignment object which contains the configuration information for the Activity Set (just include JSON object as request body) (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> addActivitySetAssignmentWithHttpInfo(Long id, APIActivitySetAssignment apiActivitySetAssignment) throws ApiException {
        com.squareup.okhttp.Call call = addActivitySetAssignmentCall(id, apiActivitySetAssignment, null, null);
        return apiClient.execute(call);
    }

    /**
     * Adds an Activity Set to a Project (asynchronously)
     * 
     * @param id A Project&#39;s ID (required)
     * @param apiActivitySetAssignment The Activity Set Assignment object which contains the configuration information for the Activity Set (just include JSON object as request body) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addActivitySetAssignmentAsync(Long id, APIActivitySetAssignment apiActivitySetAssignment, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addActivitySetAssignmentCall(id, apiActivitySetAssignment, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
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
        String localVarPath = "/Projects/{id}/FileAttachments".replaceAll("\\{format\\}","json")
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
     * Adds a File Attachment to a Project
     * This endpoint expects multipart/form-data as the request payload. See Stack Overflow for examples of how to generate multipart requests, or see our &lt;a href&#x3D;\&quot;http://github.com/Insightly\&quot; target&#x3D;\&quot;_blank\&quot;&gt;client libraries&lt;/a&gt; for an example of how this is generated. Only one file can be added per request.
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @param file The file part of the multipart/form-data request. Only one file can be added per request. (required)
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
     * Adds a File Attachment to a Project
     * This endpoint expects multipart/form-data as the request payload. See Stack Overflow for examples of how to generate multipart requests, or see our &lt;a href&#x3D;\&quot;http://github.com/Insightly\&quot; target&#x3D;\&quot;_blank\&quot;&gt;client libraries&lt;/a&gt; for an example of how this is generated. Only one file can be added per request.
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @param file The file part of the multipart/form-data request. Only one file can be added per request. (required)
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
     * Adds a File Attachment to a Project (asynchronously)
     * This endpoint expects multipart/form-data as the request payload. See Stack Overflow for examples of how to generate multipart requests, or see our &lt;a href&#x3D;\&quot;http://github.com/Insightly\&quot; target&#x3D;\&quot;_blank\&quot;&gt;client libraries&lt;/a&gt; for an example of how this is generated. Only one file can be added per request.
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @param file The file part of the multipart/form-data request. Only one file can be added per request. (required)
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
    /* Build call for addFollow */
    private com.squareup.okhttp.Call addFollowCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling addFollow(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Projects/{id}/Follow".replaceAll("\\{format\\}","json")
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Start following a Project
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @return Follow
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Follow addFollow(Long id) throws ApiException {
        ApiResponse<Follow> resp = addFollowWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Start following a Project
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @return ApiResponse&lt;Follow&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Follow> addFollowWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = addFollowCall(id, null, null);
        Type localVarReturnType = new TypeToken<Follow>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Start following a Project (asynchronously)
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addFollowAsync(Long id, final ApiCallback<Follow> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addFollowCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Follow>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for addLink */
    private com.squareup.okhttp.Call addLinkCall(Long id, APILink apiLink, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = apiLink;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling addLink(Async)");
        }
        
        // verify the required parameter 'apiLink' is set
        if (apiLink == null) {
            throw new ApiException("Missing the required parameter 'apiLink' when calling addLink(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Projects/{id}/Links".replaceAll("\\{format\\}","json")
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Adds a Link to a project
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @param apiLink The Link to add (just include JSON object as request body) (required)
     * @return Link
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Link addLink(Long id, APILink apiLink) throws ApiException {
        ApiResponse<Link> resp = addLinkWithHttpInfo(id, apiLink);
        return resp.getData();
    }

    /**
     * Adds a Link to a project
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @param apiLink The Link to add (just include JSON object as request body) (required)
     * @return ApiResponse&lt;Link&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Link> addLinkWithHttpInfo(Long id, APILink apiLink) throws ApiException {
        com.squareup.okhttp.Call call = addLinkCall(id, apiLink, null, null);
        Type localVarReturnType = new TypeToken<Link>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Adds a Link to a project (asynchronously)
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @param apiLink The Link to add (just include JSON object as request body) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addLinkAsync(Long id, APILink apiLink, final ApiCallback<Link> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addLinkCall(id, apiLink, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Link>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for addMilestone */
    private com.squareup.okhttp.Call addMilestoneCall(Long id, APIMilestone apiMilestone, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = apiMilestone;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling addMilestone(Async)");
        }
        
        // verify the required parameter 'apiMilestone' is set
        if (apiMilestone == null) {
            throw new ApiException("Missing the required parameter 'apiMilestone' when calling addMilestone(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Projects/{id}/Milestones".replaceAll("\\{format\\}","json")
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Adds a Milestone to a Project
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @param apiMilestone The Milestone to add (just include JSON object as request body) (required)
     * @return Milestone
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Milestone addMilestone(Long id, APIMilestone apiMilestone) throws ApiException {
        ApiResponse<Milestone> resp = addMilestoneWithHttpInfo(id, apiMilestone);
        return resp.getData();
    }

    /**
     * Adds a Milestone to a Project
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @param apiMilestone The Milestone to add (just include JSON object as request body) (required)
     * @return ApiResponse&lt;Milestone&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Milestone> addMilestoneWithHttpInfo(Long id, APIMilestone apiMilestone) throws ApiException {
        com.squareup.okhttp.Call call = addMilestoneCall(id, apiMilestone, null, null);
        Type localVarReturnType = new TypeToken<Milestone>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Adds a Milestone to a Project (asynchronously)
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @param apiMilestone The Milestone to add (just include JSON object as request body) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addMilestoneAsync(Long id, APIMilestone apiMilestone, final ApiCallback<Milestone> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addMilestoneCall(id, apiMilestone, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Milestone>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for addNote */
    private com.squareup.okhttp.Call addNoteCall(Long id, APINote apiNote, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = apiNote;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling addNote(Async)");
        }
        
        // verify the required parameter 'apiNote' is set
        if (apiNote == null) {
            throw new ApiException("Missing the required parameter 'apiNote' when calling addNote(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Projects/{id}/Notes".replaceAll("\\{format\\}","json")
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Adds a Note to a Project.
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @param apiNote The Note to add (just include JSON object as request body) (required)
     * @return Note
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Note addNote(Long id, APINote apiNote) throws ApiException {
        ApiResponse<Note> resp = addNoteWithHttpInfo(id, apiNote);
        return resp.getData();
    }

    /**
     * Adds a Note to a Project.
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @param apiNote The Note to add (just include JSON object as request body) (required)
     * @return ApiResponse&lt;Note&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Note> addNoteWithHttpInfo(Long id, APINote apiNote) throws ApiException {
        com.squareup.okhttp.Call call = addNoteCall(id, apiNote, null, null);
        Type localVarReturnType = new TypeToken<Note>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Adds a Note to a Project. (asynchronously)
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @param apiNote The Note to add (just include JSON object as request body) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addNoteAsync(Long id, APINote apiNote, final ApiCallback<Note> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addNoteCall(id, apiNote, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Note>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for addProject */
    private com.squareup.okhttp.Call addProjectCall(APIProject apiProject, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = apiProject;
        
        // verify the required parameter 'apiProject' is set
        if (apiProject == null) {
            throw new ApiException("Missing the required parameter 'apiProject' when calling addProject(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Projects".replaceAll("\\{format\\}","json");

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
     * Adds a Project
     * A common source of problems when creating projects occurs when users omit required fields, or insert             invalid data into a field (for example by referencing an invalid CATEGORY_ID). A good troubleshooting technique             is to create a few projects via the web interface, with representative data, links, etc, and then access             these projects via the API, and inspect the returned object graph. Also, note: The STAGE_ID and PIPELINE_ID             properties of projects are read-only. (There are separate endpoints to update pipelines/stages.)
     * @param apiProject The Project to add (just include JSON object as request body) (required)
     * @return Project
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Project addProject(APIProject apiProject) throws ApiException {
        ApiResponse<Project> resp = addProjectWithHttpInfo(apiProject);
        return resp.getData();
    }

    /**
     * Adds a Project
     * A common source of problems when creating projects occurs when users omit required fields, or insert             invalid data into a field (for example by referencing an invalid CATEGORY_ID). A good troubleshooting technique             is to create a few projects via the web interface, with representative data, links, etc, and then access             these projects via the API, and inspect the returned object graph. Also, note: The STAGE_ID and PIPELINE_ID             properties of projects are read-only. (There are separate endpoints to update pipelines/stages.)
     * @param apiProject The Project to add (just include JSON object as request body) (required)
     * @return ApiResponse&lt;Project&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Project> addProjectWithHttpInfo(APIProject apiProject) throws ApiException {
        com.squareup.okhttp.Call call = addProjectCall(apiProject, null, null);
        Type localVarReturnType = new TypeToken<Project>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Adds a Project (asynchronously)
     * A common source of problems when creating projects occurs when users omit required fields, or insert             invalid data into a field (for example by referencing an invalid CATEGORY_ID). A good troubleshooting technique             is to create a few projects via the web interface, with representative data, links, etc, and then access             these projects via the API, and inspect the returned object graph. Also, note: The STAGE_ID and PIPELINE_ID             properties of projects are read-only. (There are separate endpoints to update pipelines/stages.)
     * @param apiProject The Project to add (just include JSON object as request body) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addProjectAsync(APIProject apiProject, final ApiCallback<Project> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addProjectCall(apiProject, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Project>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for addTag */
    private com.squareup.okhttp.Call addTagCall(Long id, APITag apiTag, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = apiTag;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling addTag(Async)");
        }
        
        // verify the required parameter 'apiTag' is set
        if (apiTag == null) {
            throw new ApiException("Missing the required parameter 'apiTag' when calling addTag(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Projects/{id}/Tags".replaceAll("\\{format\\}","json")
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Adds a Tag for a Project
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @param apiTag The Tag to add (just include JSON object as request body) (required)
     * @return Tag
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Tag addTag(Long id, APITag apiTag) throws ApiException {
        ApiResponse<Tag> resp = addTagWithHttpInfo(id, apiTag);
        return resp.getData();
    }

    /**
     * Adds a Tag for a Project
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @param apiTag The Tag to add (just include JSON object as request body) (required)
     * @return ApiResponse&lt;Tag&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Tag> addTagWithHttpInfo(Long id, APITag apiTag) throws ApiException {
        com.squareup.okhttp.Call call = addTagCall(id, apiTag, null, null);
        Type localVarReturnType = new TypeToken<Tag>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Adds a Tag for a Project (asynchronously)
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @param apiTag The Tag to add (just include JSON object as request body) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addTagAsync(Long id, APITag apiTag, final ApiCallback<Tag> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addTagCall(id, apiTag, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Tag>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for deleteCustomField */
    private com.squareup.okhttp.Call deleteCustomFieldCall(Long id, String customFieldId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteCustomField(Async)");
        }
        
        // verify the required parameter 'customFieldId' is set
        if (customFieldId == null) {
            throw new ApiException("Missing the required parameter 'customFieldId' when calling deleteCustomField(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Projects/{id}/CustomFields/{customFieldId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
        .replaceAll("\\{" + "customFieldId" + "\\}", apiClient.escapeString(customFieldId.toString()));

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
     * Deletes a Custom Field
     * 
     * @param id A Project&#39;s ID (Project_ID) (required)
     * @param customFieldId A Custom Field&#39;s ID (CUSTOM_FIELD_ID) (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteCustomField(Long id, String customFieldId) throws ApiException {
        deleteCustomFieldWithHttpInfo(id, customFieldId);
    }

    /**
     * Deletes a Custom Field
     * 
     * @param id A Project&#39;s ID (Project_ID) (required)
     * @param customFieldId A Custom Field&#39;s ID (CUSTOM_FIELD_ID) (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteCustomFieldWithHttpInfo(Long id, String customFieldId) throws ApiException {
        com.squareup.okhttp.Call call = deleteCustomFieldCall(id, customFieldId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes a Custom Field (asynchronously)
     * 
     * @param id A Project&#39;s ID (Project_ID) (required)
     * @param customFieldId A Custom Field&#39;s ID (CUSTOM_FIELD_ID) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteCustomFieldAsync(Long id, String customFieldId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteCustomFieldCall(id, customFieldId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for deleteFollow */
    private com.squareup.okhttp.Call deleteFollowCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteFollow(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Projects/{id}/Follow".replaceAll("\\{format\\}","json")
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
     * Stop following a Project
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteFollow(Long id) throws ApiException {
        deleteFollowWithHttpInfo(id);
    }

    /**
     * Stop following a Project
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteFollowWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = deleteFollowCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Stop following a Project (asynchronously)
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteFollowAsync(Long id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteFollowCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for deleteImage */
    private com.squareup.okhttp.Call deleteImageCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteImage(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Projects/{id}/Image".replaceAll("\\{format\\}","json")
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
     * Deletes a Project&#39;s Image
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteImage(Long id) throws ApiException {
        deleteImageWithHttpInfo(id);
    }

    /**
     * Deletes a Project&#39;s Image
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteImageWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = deleteImageCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes a Project&#39;s Image (asynchronously)
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteImageAsync(Long id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteImageCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for deleteLink */
    private com.squareup.okhttp.Call deleteLinkCall(Long id, Long linkId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteLink(Async)");
        }
        
        // verify the required parameter 'linkId' is set
        if (linkId == null) {
            throw new ApiException("Missing the required parameter 'linkId' when calling deleteLink(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Projects/{id}/Links/{linkId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
        .replaceAll("\\{" + "linkId" + "\\}", apiClient.escapeString(linkId.toString()));

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
     * Deletes a Link from a project
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @param linkId A Link&#39;s ID (LINK_ID) (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteLink(Long id, Long linkId) throws ApiException {
        deleteLinkWithHttpInfo(id, linkId);
    }

    /**
     * Deletes a Link from a project
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @param linkId A Link&#39;s ID (LINK_ID) (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteLinkWithHttpInfo(Long id, Long linkId) throws ApiException {
        com.squareup.okhttp.Call call = deleteLinkCall(id, linkId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes a Link from a project (asynchronously)
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @param linkId A Link&#39;s ID (LINK_ID) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteLinkAsync(Long id, Long linkId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteLinkCall(id, linkId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for deleteMilestone */
    private com.squareup.okhttp.Call deleteMilestoneCall(Long id, Long milestoneId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteMilestone(Async)");
        }
        
        // verify the required parameter 'milestoneId' is set
        if (milestoneId == null) {
            throw new ApiException("Missing the required parameter 'milestoneId' when calling deleteMilestone(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Projects/{id}/Milestones/{milestoneId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
        .replaceAll("\\{" + "milestoneId" + "\\}", apiClient.escapeString(milestoneId.toString()));

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
     * Deletes a Milestone from a Project
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @param milestoneId A Milestone&#39;s ID (MILESTONE_ID) (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteMilestone(Long id, Long milestoneId) throws ApiException {
        deleteMilestoneWithHttpInfo(id, milestoneId);
    }

    /**
     * Deletes a Milestone from a Project
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @param milestoneId A Milestone&#39;s ID (MILESTONE_ID) (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteMilestoneWithHttpInfo(Long id, Long milestoneId) throws ApiException {
        com.squareup.okhttp.Call call = deleteMilestoneCall(id, milestoneId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes a Milestone from a Project (asynchronously)
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @param milestoneId A Milestone&#39;s ID (MILESTONE_ID) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteMilestoneAsync(Long id, Long milestoneId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteMilestoneCall(id, milestoneId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for deletePipeline */
    private com.squareup.okhttp.Call deletePipelineCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deletePipeline(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Projects/{id}/Pipeline".replaceAll("\\{format\\}","json")
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
     * Clears pipeline for the Project.
     * 
     * @param id A Project&#39;s ID (required)
     * @return Project
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Project deletePipeline(Long id) throws ApiException {
        ApiResponse<Project> resp = deletePipelineWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Clears pipeline for the Project.
     * 
     * @param id A Project&#39;s ID (required)
     * @return ApiResponse&lt;Project&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Project> deletePipelineWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = deletePipelineCall(id, null, null);
        Type localVarReturnType = new TypeToken<Project>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Clears pipeline for the Project. (asynchronously)
     * 
     * @param id A Project&#39;s ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deletePipelineAsync(Long id, final ApiCallback<Project> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deletePipelineCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Project>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for deleteProject */
    private com.squareup.okhttp.Call deleteProjectCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteProject(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Projects/{id}".replaceAll("\\{format\\}","json")
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
     * Deletes a Project
     * 
     * @param id A Project&#39;s ID (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteProject(Long id) throws ApiException {
        deleteProjectWithHttpInfo(id);
    }

    /**
     * Deletes a Project
     * 
     * @param id A Project&#39;s ID (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteProjectWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = deleteProjectCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes a Project (asynchronously)
     * 
     * @param id A Project&#39;s ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteProjectAsync(Long id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteProjectCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for deleteTag */
    private com.squareup.okhttp.Call deleteTagCall(Long id, String tagName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteTag(Async)");
        }
        
        // verify the required parameter 'tagName' is set
        if (tagName == null) {
            throw new ApiException("Missing the required parameter 'tagName' when calling deleteTag(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Projects/{id}/Tags/{tagName}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
        .replaceAll("\\{" + "tagName" + "\\}", apiClient.escapeString(tagName.toString()));

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
     * Deletes a Tag from a Project
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @param tagName A Tag&#39;s name (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteTag(Long id, String tagName) throws ApiException {
        deleteTagWithHttpInfo(id, tagName);
    }

    /**
     * Deletes a Tag from a Project
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @param tagName A Tag&#39;s name (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteTagWithHttpInfo(Long id, String tagName) throws ApiException {
        com.squareup.okhttp.Call call = deleteTagCall(id, tagName, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes a Tag from a Project (asynchronously)
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @param tagName A Tag&#39;s name (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteTagAsync(Long id, String tagName, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteTagCall(id, tagName, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for getEmails */
    private com.squareup.okhttp.Call getEmailsCall(Long id, Date updatedAfterUtc, Integer top, Integer skip, Boolean brief, Boolean countTotal, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getEmails(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Projects/{id}/Emails".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (updatedAfterUtc != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "updated_after_utc", updatedAfterUtc));
        if (top != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "top", top));
        if (skip != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "skip", skip));
        if (brief != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "brief", brief));
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
     * Gets a list of Project&#39;s Emails
     * 
     * @param id A Project&#39;s ID (required)
     * @param updatedAfterUtc Optional, earliest date when email was last updated. (optional)
     * @param top Optional, maximum number of emails to return. (optional)
     * @param skip Optional, number of emails to skip. (optional)
     * @param brief true if only top level properties needs to be returned. (optional, default to false)
     * @param countTotal true if total number of records should be returned in the response headers. (optional, default to false)
     * @return List&lt;Email&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Email> getEmails(Long id, Date updatedAfterUtc, Integer top, Integer skip, Boolean brief, Boolean countTotal) throws ApiException {
        ApiResponse<List<Email>> resp = getEmailsWithHttpInfo(id, updatedAfterUtc, top, skip, brief, countTotal);
        return resp.getData();
    }

    /**
     * Gets a list of Project&#39;s Emails
     * 
     * @param id A Project&#39;s ID (required)
     * @param updatedAfterUtc Optional, earliest date when email was last updated. (optional)
     * @param top Optional, maximum number of emails to return. (optional)
     * @param skip Optional, number of emails to skip. (optional)
     * @param brief true if only top level properties needs to be returned. (optional, default to false)
     * @param countTotal true if total number of records should be returned in the response headers. (optional, default to false)
     * @return ApiResponse&lt;List&lt;Email&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Email>> getEmailsWithHttpInfo(Long id, Date updatedAfterUtc, Integer top, Integer skip, Boolean brief, Boolean countTotal) throws ApiException {
        com.squareup.okhttp.Call call = getEmailsCall(id, updatedAfterUtc, top, skip, brief, countTotal, null, null);
        Type localVarReturnType = new TypeToken<List<Email>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a list of Project&#39;s Emails (asynchronously)
     * 
     * @param id A Project&#39;s ID (required)
     * @param updatedAfterUtc Optional, earliest date when email was last updated. (optional)
     * @param top Optional, maximum number of emails to return. (optional)
     * @param skip Optional, number of emails to skip. (optional)
     * @param brief true if only top level properties needs to be returned. (optional, default to false)
     * @param countTotal true if total number of records should be returned in the response headers. (optional, default to false)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEmailsAsync(Long id, Date updatedAfterUtc, Integer top, Integer skip, Boolean brief, Boolean countTotal, final ApiCallback<List<Email>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getEmailsCall(id, updatedAfterUtc, top, skip, brief, countTotal, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Email>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getEvents */
    private com.squareup.okhttp.Call getEventsCall(Long id, Date updatedAfterUtc, Integer top, Integer skip, Boolean brief, Boolean countTotal, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getEvents(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Projects/{id}/Events".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (updatedAfterUtc != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "updated_after_utc", updatedAfterUtc));
        if (top != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "top", top));
        if (skip != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "skip", skip));
        if (brief != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "brief", brief));
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
     * Gets a Project&#39;s Events
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @param updatedAfterUtc Optional, earliest date when event was last updated. (optional)
     * @param top Optional, maximum number of events to return. (optional)
     * @param skip Optional, number of events to skip. (optional)
     * @param brief true if only top level properties needs to be returned. (optional, default to false)
     * @param countTotal true if total number of records should be returned in the response headers. (optional, default to false)
     * @return List&lt;CalendarEvent&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<CalendarEvent> getEvents(Long id, Date updatedAfterUtc, Integer top, Integer skip, Boolean brief, Boolean countTotal) throws ApiException {
        ApiResponse<List<CalendarEvent>> resp = getEventsWithHttpInfo(id, updatedAfterUtc, top, skip, brief, countTotal);
        return resp.getData();
    }

    /**
     * Gets a Project&#39;s Events
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @param updatedAfterUtc Optional, earliest date when event was last updated. (optional)
     * @param top Optional, maximum number of events to return. (optional)
     * @param skip Optional, number of events to skip. (optional)
     * @param brief true if only top level properties needs to be returned. (optional, default to false)
     * @param countTotal true if total number of records should be returned in the response headers. (optional, default to false)
     * @return ApiResponse&lt;List&lt;CalendarEvent&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<CalendarEvent>> getEventsWithHttpInfo(Long id, Date updatedAfterUtc, Integer top, Integer skip, Boolean brief, Boolean countTotal) throws ApiException {
        com.squareup.okhttp.Call call = getEventsCall(id, updatedAfterUtc, top, skip, brief, countTotal, null, null);
        Type localVarReturnType = new TypeToken<List<CalendarEvent>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a Project&#39;s Events (asynchronously)
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @param updatedAfterUtc Optional, earliest date when event was last updated. (optional)
     * @param top Optional, maximum number of events to return. (optional)
     * @param skip Optional, number of events to skip. (optional)
     * @param brief true if only top level properties needs to be returned. (optional, default to false)
     * @param countTotal true if total number of records should be returned in the response headers. (optional, default to false)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEventsAsync(Long id, Date updatedAfterUtc, Integer top, Integer skip, Boolean brief, Boolean countTotal, final ApiCallback<List<CalendarEvent>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getEventsCall(id, updatedAfterUtc, top, skip, brief, countTotal, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<CalendarEvent>>(){}.getType();
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
        String localVarPath = "/Projects/{id}/FileAttachments".replaceAll("\\{format\\}","json")
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
     * Gets a Project&#39;s File Attachments
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
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
     * Gets a Project&#39;s File Attachments
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
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
     * Gets a Project&#39;s File Attachments (asynchronously)
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
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
    /* Build call for getFollow */
    private com.squareup.okhttp.Call getFollowCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getFollow(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Projects/{id}/Follow".replaceAll("\\{format\\}","json")
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
     * Gets a Follow record for the Project
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @return Follow
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Follow getFollow(Long id) throws ApiException {
        ApiResponse<Follow> resp = getFollowWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Gets a Follow record for the Project
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @return ApiResponse&lt;Follow&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Follow> getFollowWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = getFollowCall(id, null, null);
        Type localVarReturnType = new TypeToken<Follow>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a Follow record for the Project (asynchronously)
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFollowAsync(Long id, final ApiCallback<Follow> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getFollowCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Follow>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getImage */
    private com.squareup.okhttp.Call getImageCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getImage(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Projects/{id}/Image".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/octet-stream"
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
     * Gets a Project&#39;s Image
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getImage(Long id) throws ApiException {
        getImageWithHttpInfo(id);
    }

    /**
     * Gets a Project&#39;s Image
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getImageWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = getImageCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Gets a Project&#39;s Image (asynchronously)
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getImageAsync(Long id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getImageCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for getLinkEmailAddress */
    private com.squareup.okhttp.Call getLinkEmailAddressCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getLinkEmailAddress(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Projects/{id}/LinkEmailAddress".replaceAll("\\{format\\}","json")
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
     * Gets the email address to use for linking with the Project
     * An email address to use as a maildrop for the Project.
     * @param id A Project&#39;s ID (required)
     * @return LinkEmailAddress
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public LinkEmailAddress getLinkEmailAddress(Long id) throws ApiException {
        ApiResponse<LinkEmailAddress> resp = getLinkEmailAddressWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Gets the email address to use for linking with the Project
     * An email address to use as a maildrop for the Project.
     * @param id A Project&#39;s ID (required)
     * @return ApiResponse&lt;LinkEmailAddress&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<LinkEmailAddress> getLinkEmailAddressWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = getLinkEmailAddressCall(id, null, null);
        Type localVarReturnType = new TypeToken<LinkEmailAddress>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets the email address to use for linking with the Project (asynchronously)
     * An email address to use as a maildrop for the Project.
     * @param id A Project&#39;s ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getLinkEmailAddressAsync(Long id, final ApiCallback<LinkEmailAddress> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getLinkEmailAddressCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<LinkEmailAddress>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getMilestones */
    private com.squareup.okhttp.Call getMilestonesCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getMilestones(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Projects/{id}/Milestones".replaceAll("\\{format\\}","json")
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
     * Gets a list of Milestones for a Project
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @return List&lt;Milestone&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Milestone> getMilestones(Long id) throws ApiException {
        ApiResponse<List<Milestone>> resp = getMilestonesWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Gets a list of Milestones for a Project
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @return ApiResponse&lt;List&lt;Milestone&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Milestone>> getMilestonesWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = getMilestonesCall(id, null, null);
        Type localVarReturnType = new TypeToken<List<Milestone>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a list of Milestones for a Project (asynchronously)
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getMilestonesAsync(Long id, final ApiCallback<List<Milestone>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getMilestonesCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Milestone>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getNotes */
    private com.squareup.okhttp.Call getNotesCall(Long id, Date updatedAfterUtc, Integer top, Integer skip, Boolean brief, Boolean countTotal, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getNotes(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Projects/{id}/Notes".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (updatedAfterUtc != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "updated_after_utc", updatedAfterUtc));
        if (top != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "top", top));
        if (skip != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "skip", skip));
        if (brief != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "brief", brief));
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
     * Gets a Project&#39;s Notes
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @param updatedAfterUtc Optional, earliest date when note was last updated. (optional)
     * @param top Optional, maximum number of notes to return. (optional)
     * @param skip Optional, number of notes to skip. (optional)
     * @param brief true if only top level properties needs to be returned. (optional, default to false)
     * @param countTotal true if total number of records should be returned in the response headers. (optional, default to false)
     * @return List&lt;Note&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Note> getNotes(Long id, Date updatedAfterUtc, Integer top, Integer skip, Boolean brief, Boolean countTotal) throws ApiException {
        ApiResponse<List<Note>> resp = getNotesWithHttpInfo(id, updatedAfterUtc, top, skip, brief, countTotal);
        return resp.getData();
    }

    /**
     * Gets a Project&#39;s Notes
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @param updatedAfterUtc Optional, earliest date when note was last updated. (optional)
     * @param top Optional, maximum number of notes to return. (optional)
     * @param skip Optional, number of notes to skip. (optional)
     * @param brief true if only top level properties needs to be returned. (optional, default to false)
     * @param countTotal true if total number of records should be returned in the response headers. (optional, default to false)
     * @return ApiResponse&lt;List&lt;Note&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Note>> getNotesWithHttpInfo(Long id, Date updatedAfterUtc, Integer top, Integer skip, Boolean brief, Boolean countTotal) throws ApiException {
        com.squareup.okhttp.Call call = getNotesCall(id, updatedAfterUtc, top, skip, brief, countTotal, null, null);
        Type localVarReturnType = new TypeToken<List<Note>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a Project&#39;s Notes (asynchronously)
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @param updatedAfterUtc Optional, earliest date when note was last updated. (optional)
     * @param top Optional, maximum number of notes to return. (optional)
     * @param skip Optional, number of notes to skip. (optional)
     * @param brief true if only top level properties needs to be returned. (optional, default to false)
     * @param countTotal true if total number of records should be returned in the response headers. (optional, default to false)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getNotesAsync(Long id, Date updatedAfterUtc, Integer top, Integer skip, Boolean brief, Boolean countTotal, final ApiCallback<List<Note>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getNotesCall(id, updatedAfterUtc, top, skip, brief, countTotal, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Note>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getProject */
    private com.squareup.okhttp.Call getProjectCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getProject(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Projects/{id}".replaceAll("\\{format\\}","json")
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
     * Gets a Project
     * 
     * @param id A Project&#39;s ID (required)
     * @return Project
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Project getProject(Long id) throws ApiException {
        ApiResponse<Project> resp = getProjectWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Gets a Project
     * 
     * @param id A Project&#39;s ID (required)
     * @return ApiResponse&lt;Project&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Project> getProjectWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = getProjectCall(id, null, null);
        Type localVarReturnType = new TypeToken<Project>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a Project (asynchronously)
     * 
     * @param id A Project&#39;s ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getProjectAsync(Long id, final ApiCallback<Project> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getProjectCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Project>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getProjects */
    private com.squareup.okhttp.Call getProjectsCall(Boolean brief, Integer skip, Integer top, Boolean countTotal, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/Projects".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (brief != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "brief", brief));
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
     * Gets a list of Projects.
     * Simple object graphs (excluding CUSTOMFIELDS, TAGS, etc.) are returned if \&quot;brief&#x3D;true\&quot; is used in the query string.
     * @param brief Optional, true if response should only contain top level properties of the project. (optional, default to false)
     * @param skip Optional, number of projects to skip. (optional)
     * @param top Optional, maximum number of projects to return in the response. (optional)
     * @param countTotal Optional, true if total number of records should be returned in the response headers. (optional, default to false)
     * @return List&lt;Project&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Project> getProjects(Boolean brief, Integer skip, Integer top, Boolean countTotal) throws ApiException {
        ApiResponse<List<Project>> resp = getProjectsWithHttpInfo(brief, skip, top, countTotal);
        return resp.getData();
    }

    /**
     * Gets a list of Projects.
     * Simple object graphs (excluding CUSTOMFIELDS, TAGS, etc.) are returned if \&quot;brief&#x3D;true\&quot; is used in the query string.
     * @param brief Optional, true if response should only contain top level properties of the project. (optional, default to false)
     * @param skip Optional, number of projects to skip. (optional)
     * @param top Optional, maximum number of projects to return in the response. (optional)
     * @param countTotal Optional, true if total number of records should be returned in the response headers. (optional, default to false)
     * @return ApiResponse&lt;List&lt;Project&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Project>> getProjectsWithHttpInfo(Boolean brief, Integer skip, Integer top, Boolean countTotal) throws ApiException {
        com.squareup.okhttp.Call call = getProjectsCall(brief, skip, top, countTotal, null, null);
        Type localVarReturnType = new TypeToken<List<Project>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a list of Projects. (asynchronously)
     * Simple object graphs (excluding CUSTOMFIELDS, TAGS, etc.) are returned if \&quot;brief&#x3D;true\&quot; is used in the query string.
     * @param brief Optional, true if response should only contain top level properties of the project. (optional, default to false)
     * @param skip Optional, number of projects to skip. (optional)
     * @param top Optional, maximum number of projects to return in the response. (optional)
     * @param countTotal Optional, true if total number of records should be returned in the response headers. (optional, default to false)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getProjectsAsync(Boolean brief, Integer skip, Integer top, Boolean countTotal, final ApiCallback<List<Project>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getProjectsCall(brief, skip, top, countTotal, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Project>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getProjectsBySearch */
    private com.squareup.okhttp.Call getProjectsBySearchCall(String tag, String projectName, String status, Long categoryId, Long pipelineId, Long stageId, Long responsibleUserId, Long ownerUserId, Date updatedAfterUtc, Boolean brief, Integer skip, Integer top, Boolean countTotal, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/Projects/Search".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (tag != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "tag", tag));
        if (projectName != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "project_name", projectName));
        if (status != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
        if (categoryId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "category_id", categoryId));
        if (pipelineId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "pipeline_id", pipelineId));
        if (stageId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "stage_id", stageId));
        if (responsibleUserId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "responsible_user_id", responsibleUserId));
        if (ownerUserId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "owner_user_id", ownerUserId));
        if (updatedAfterUtc != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "updated_after_utc", updatedAfterUtc));
        if (brief != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "brief", brief));
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
     * Gets a filtered list of Projects.
     * Only one optional parameter (excluding brief, top, skip and count_total) can be specified. Simple object graphs (excluding CUSTOMFIELDS, TAGS, etc.) are returned if \&quot;brief&#x3D;true\&quot; is used in the query string.
     * @param tag Optional, a single tag. (optional)
     * @param projectName Optional, project name. (optional)
     * @param status Optional, project status. (optional)
     * @param categoryId Optional, category id. (optional)
     * @param pipelineId Optional, pipeline id. (optional)
     * @param stageId Optional, stage id. (optional)
     * @param responsibleUserId Optional, responsible user id. (optional)
     * @param ownerUserId Optional, owner user id. (optional)
     * @param updatedAfterUtc Optional, earliest date when project was last updated. (optional)
     * @param brief Optional, true if response should only contain top level properties of the project. (optional, default to false)
     * @param skip Optional, number of projects to skip. (optional)
     * @param top Optional, maximum number of projects to return in the response. (optional)
     * @param countTotal Optional, true if total number of records should be returned in the response headers. (optional, default to false)
     * @return List&lt;Project&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Project> getProjectsBySearch(String tag, String projectName, String status, Long categoryId, Long pipelineId, Long stageId, Long responsibleUserId, Long ownerUserId, Date updatedAfterUtc, Boolean brief, Integer skip, Integer top, Boolean countTotal) throws ApiException {
        ApiResponse<List<Project>> resp = getProjectsBySearchWithHttpInfo(tag, projectName, status, categoryId, pipelineId, stageId, responsibleUserId, ownerUserId, updatedAfterUtc, brief, skip, top, countTotal);
        return resp.getData();
    }

    /**
     * Gets a filtered list of Projects.
     * Only one optional parameter (excluding brief, top, skip and count_total) can be specified. Simple object graphs (excluding CUSTOMFIELDS, TAGS, etc.) are returned if \&quot;brief&#x3D;true\&quot; is used in the query string.
     * @param tag Optional, a single tag. (optional)
     * @param projectName Optional, project name. (optional)
     * @param status Optional, project status. (optional)
     * @param categoryId Optional, category id. (optional)
     * @param pipelineId Optional, pipeline id. (optional)
     * @param stageId Optional, stage id. (optional)
     * @param responsibleUserId Optional, responsible user id. (optional)
     * @param ownerUserId Optional, owner user id. (optional)
     * @param updatedAfterUtc Optional, earliest date when project was last updated. (optional)
     * @param brief Optional, true if response should only contain top level properties of the project. (optional, default to false)
     * @param skip Optional, number of projects to skip. (optional)
     * @param top Optional, maximum number of projects to return in the response. (optional)
     * @param countTotal Optional, true if total number of records should be returned in the response headers. (optional, default to false)
     * @return ApiResponse&lt;List&lt;Project&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Project>> getProjectsBySearchWithHttpInfo(String tag, String projectName, String status, Long categoryId, Long pipelineId, Long stageId, Long responsibleUserId, Long ownerUserId, Date updatedAfterUtc, Boolean brief, Integer skip, Integer top, Boolean countTotal) throws ApiException {
        com.squareup.okhttp.Call call = getProjectsBySearchCall(tag, projectName, status, categoryId, pipelineId, stageId, responsibleUserId, ownerUserId, updatedAfterUtc, brief, skip, top, countTotal, null, null);
        Type localVarReturnType = new TypeToken<List<Project>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a filtered list of Projects. (asynchronously)
     * Only one optional parameter (excluding brief, top, skip and count_total) can be specified. Simple object graphs (excluding CUSTOMFIELDS, TAGS, etc.) are returned if \&quot;brief&#x3D;true\&quot; is used in the query string.
     * @param tag Optional, a single tag. (optional)
     * @param projectName Optional, project name. (optional)
     * @param status Optional, project status. (optional)
     * @param categoryId Optional, category id. (optional)
     * @param pipelineId Optional, pipeline id. (optional)
     * @param stageId Optional, stage id. (optional)
     * @param responsibleUserId Optional, responsible user id. (optional)
     * @param ownerUserId Optional, owner user id. (optional)
     * @param updatedAfterUtc Optional, earliest date when project was last updated. (optional)
     * @param brief Optional, true if response should only contain top level properties of the project. (optional, default to false)
     * @param skip Optional, number of projects to skip. (optional)
     * @param top Optional, maximum number of projects to return in the response. (optional)
     * @param countTotal Optional, true if total number of records should be returned in the response headers. (optional, default to false)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getProjectsBySearchAsync(String tag, String projectName, String status, Long categoryId, Long pipelineId, Long stageId, Long responsibleUserId, Long ownerUserId, Date updatedAfterUtc, Boolean brief, Integer skip, Integer top, Boolean countTotal, final ApiCallback<List<Project>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getProjectsBySearchCall(tag, projectName, status, categoryId, pipelineId, stageId, responsibleUserId, ownerUserId, updatedAfterUtc, brief, skip, top, countTotal, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Project>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getTasks */
    private com.squareup.okhttp.Call getTasksCall(Long id, Date updatedAfterUtc, Integer top, Integer skip, Boolean brief, Boolean countTotal, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getTasks(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Projects/{id}/Tasks".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (updatedAfterUtc != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "updated_after_utc", updatedAfterUtc));
        if (top != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "top", top));
        if (skip != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "skip", skip));
        if (brief != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "brief", brief));
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
     * Gets a list of Project&#39;s Tasks
     * 
     * @param id A Project&#39;s ID (required)
     * @param updatedAfterUtc Optional, earliest date when task was last updated. (optional)
     * @param top Optional, maximum number of tasks to return. (optional)
     * @param skip Optional, number of tasks to skip. (optional)
     * @param brief true if only top level properties needs to be returned. (optional, default to false)
     * @param countTotal true if total number of records should be returned in the response headers. (optional, default to false)
     * @return List&lt;Task&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Task> getTasks(Long id, Date updatedAfterUtc, Integer top, Integer skip, Boolean brief, Boolean countTotal) throws ApiException {
        ApiResponse<List<Task>> resp = getTasksWithHttpInfo(id, updatedAfterUtc, top, skip, brief, countTotal);
        return resp.getData();
    }

    /**
     * Gets a list of Project&#39;s Tasks
     * 
     * @param id A Project&#39;s ID (required)
     * @param updatedAfterUtc Optional, earliest date when task was last updated. (optional)
     * @param top Optional, maximum number of tasks to return. (optional)
     * @param skip Optional, number of tasks to skip. (optional)
     * @param brief true if only top level properties needs to be returned. (optional, default to false)
     * @param countTotal true if total number of records should be returned in the response headers. (optional, default to false)
     * @return ApiResponse&lt;List&lt;Task&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Task>> getTasksWithHttpInfo(Long id, Date updatedAfterUtc, Integer top, Integer skip, Boolean brief, Boolean countTotal) throws ApiException {
        com.squareup.okhttp.Call call = getTasksCall(id, updatedAfterUtc, top, skip, brief, countTotal, null, null);
        Type localVarReturnType = new TypeToken<List<Task>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a list of Project&#39;s Tasks (asynchronously)
     * 
     * @param id A Project&#39;s ID (required)
     * @param updatedAfterUtc Optional, earliest date when task was last updated. (optional)
     * @param top Optional, maximum number of tasks to return. (optional)
     * @param skip Optional, number of tasks to skip. (optional)
     * @param brief true if only top level properties needs to be returned. (optional, default to false)
     * @param countTotal true if total number of records should be returned in the response headers. (optional, default to false)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTasksAsync(Long id, Date updatedAfterUtc, Integer top, Integer skip, Boolean brief, Boolean countTotal, final ApiCallback<List<Task>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTasksCall(id, updatedAfterUtc, top, skip, brief, countTotal, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Task>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updateCustomField */
    private com.squareup.okhttp.Call updateCustomFieldCall(Long id, APICustomField apiCustomField, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = apiCustomField;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateCustomField(Async)");
        }
        
        // verify the required parameter 'apiCustomField' is set
        if (apiCustomField == null) {
            throw new ApiException("Missing the required parameter 'apiCustomField' when calling updateCustomField(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Projects/{id}/CustomFields".replaceAll("\\{format\\}","json")
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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Updates a Custom Field
     * 
     * @param id A Project&#39;s ID (Project_ID) (required)
     * @param apiCustomField The Custom Field to edit (just include JSON object as request body) (required)
     * @return CustomField
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CustomField updateCustomField(Long id, APICustomField apiCustomField) throws ApiException {
        ApiResponse<CustomField> resp = updateCustomFieldWithHttpInfo(id, apiCustomField);
        return resp.getData();
    }

    /**
     * Updates a Custom Field
     * 
     * @param id A Project&#39;s ID (Project_ID) (required)
     * @param apiCustomField The Custom Field to edit (just include JSON object as request body) (required)
     * @return ApiResponse&lt;CustomField&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CustomField> updateCustomFieldWithHttpInfo(Long id, APICustomField apiCustomField) throws ApiException {
        com.squareup.okhttp.Call call = updateCustomFieldCall(id, apiCustomField, null, null);
        Type localVarReturnType = new TypeToken<CustomField>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Updates a Custom Field (asynchronously)
     * 
     * @param id A Project&#39;s ID (Project_ID) (required)
     * @param apiCustomField The Custom Field to edit (just include JSON object as request body) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateCustomFieldAsync(Long id, APICustomField apiCustomField, final ApiCallback<CustomField> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateCustomFieldCall(id, apiCustomField, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CustomField>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updateImage */
    private com.squareup.okhttp.Call updateImageCall(Long id, String filename, byte[] file, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = file;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateImage(Async)");
        }
        
        // verify the required parameter 'filename' is set
        if (filename == null) {
            throw new ApiException("Missing the required parameter 'filename' when calling updateImage(Async)");
        }
        
        // verify the required parameter 'file' is set
        if (file == null) {
            throw new ApiException("Missing the required parameter 'file' when calling updateImage(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Projects/{id}/Image/{filename}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
        .replaceAll("\\{" + "filename" + "\\}", apiClient.escapeString(filename.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/octet-stream"
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
     * Updates a Project&#39;s Image
     * This action will replace any existing Image attached to the Project. Image file contents should be sent as binary data in request payload. See our &lt;a href&#x3D;\&quot;http://github.com/Insightly\&quot; target&#x3D;\&quot;_blank\&quot;&gt;client libraries&lt;/a&gt; for an example of how this is done.
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @param filename Name of Image File to be attached to Project (required)
     * @param file File to upload (required)
     * @return Project
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Project updateImage(Long id, String filename, byte[] file) throws ApiException {
        ApiResponse<Project> resp = updateImageWithHttpInfo(id, filename, file);
        return resp.getData();
    }

    /**
     * Updates a Project&#39;s Image
     * This action will replace any existing Image attached to the Project. Image file contents should be sent as binary data in request payload. See our &lt;a href&#x3D;\&quot;http://github.com/Insightly\&quot; target&#x3D;\&quot;_blank\&quot;&gt;client libraries&lt;/a&gt; for an example of how this is done.
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @param filename Name of Image File to be attached to Project (required)
     * @param file File to upload (required)
     * @return ApiResponse&lt;Project&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Project> updateImageWithHttpInfo(Long id, String filename, byte[] file) throws ApiException {
        com.squareup.okhttp.Call call = updateImageCall(id, filename, file, null, null);
        Type localVarReturnType = new TypeToken<Project>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Updates a Project&#39;s Image (asynchronously)
     * This action will replace any existing Image attached to the Project. Image file contents should be sent as binary data in request payload. See our &lt;a href&#x3D;\&quot;http://github.com/Insightly\&quot; target&#x3D;\&quot;_blank\&quot;&gt;client libraries&lt;/a&gt; for an example of how this is done.
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @param filename Name of Image File to be attached to Project (required)
     * @param file File to upload (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateImageAsync(Long id, String filename, byte[] file, final ApiCallback<Project> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateImageCall(id, filename, file, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Project>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updateLink */
    private com.squareup.okhttp.Call updateLinkCall(Long id, APILink apiLink, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = apiLink;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateLink(Async)");
        }
        
        // verify the required parameter 'apiLink' is set
        if (apiLink == null) {
            throw new ApiException("Missing the required parameter 'apiLink' when calling updateLink(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Projects/{id}/Links".replaceAll("\\{format\\}","json")
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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Updates a Link for a project
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @param apiLink The Link to add (just include JSON object as request body) (required)
     * @return Link
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Link updateLink(Long id, APILink apiLink) throws ApiException {
        ApiResponse<Link> resp = updateLinkWithHttpInfo(id, apiLink);
        return resp.getData();
    }

    /**
     * Updates a Link for a project
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @param apiLink The Link to add (just include JSON object as request body) (required)
     * @return ApiResponse&lt;Link&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Link> updateLinkWithHttpInfo(Long id, APILink apiLink) throws ApiException {
        com.squareup.okhttp.Call call = updateLinkCall(id, apiLink, null, null);
        Type localVarReturnType = new TypeToken<Link>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Updates a Link for a project (asynchronously)
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @param apiLink The Link to add (just include JSON object as request body) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateLinkAsync(Long id, APILink apiLink, final ApiCallback<Link> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateLinkCall(id, apiLink, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Link>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updateMilestone */
    private com.squareup.okhttp.Call updateMilestoneCall(Long id, APIMilestone apiMilestone, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = apiMilestone;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateMilestone(Async)");
        }
        
        // verify the required parameter 'apiMilestone' is set
        if (apiMilestone == null) {
            throw new ApiException("Missing the required parameter 'apiMilestone' when calling updateMilestone(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Projects/{id}/Milestones".replaceAll("\\{format\\}","json")
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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Updates a Milestone for a Project
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @param apiMilestone The Milestone to update (just include JSON object as request body) (required)
     * @return Milestone
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Milestone updateMilestone(Long id, APIMilestone apiMilestone) throws ApiException {
        ApiResponse<Milestone> resp = updateMilestoneWithHttpInfo(id, apiMilestone);
        return resp.getData();
    }

    /**
     * Updates a Milestone for a Project
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @param apiMilestone The Milestone to update (just include JSON object as request body) (required)
     * @return ApiResponse&lt;Milestone&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Milestone> updateMilestoneWithHttpInfo(Long id, APIMilestone apiMilestone) throws ApiException {
        com.squareup.okhttp.Call call = updateMilestoneCall(id, apiMilestone, null, null);
        Type localVarReturnType = new TypeToken<Milestone>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Updates a Milestone for a Project (asynchronously)
     * 
     * @param id A Project&#39;s ID (PROJECT_ID) (required)
     * @param apiMilestone The Milestone to update (just include JSON object as request body) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateMilestoneAsync(Long id, APIMilestone apiMilestone, final ApiCallback<Milestone> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateMilestoneCall(id, apiMilestone, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Milestone>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updatePipeline */
    private com.squareup.okhttp.Call updatePipelineCall(Long id, APIPipelineChange apiPipelineChange, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = apiPipelineChange;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updatePipeline(Async)");
        }
        
        // verify the required parameter 'apiPipelineChange' is set
        if (apiPipelineChange == null) {
            throw new ApiException("Missing the required parameter 'apiPipelineChange' when calling updatePipeline(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Projects/{id}/Pipeline".replaceAll("\\{format\\}","json")
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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Changes current pipeline for the project.
     * 
     * @param id A Project&#39;s ID (required)
     * @param apiPipelineChange Pipeline change parameters (just include JSON object as request body) (required)
     * @return Project
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Project updatePipeline(Long id, APIPipelineChange apiPipelineChange) throws ApiException {
        ApiResponse<Project> resp = updatePipelineWithHttpInfo(id, apiPipelineChange);
        return resp.getData();
    }

    /**
     * Changes current pipeline for the project.
     * 
     * @param id A Project&#39;s ID (required)
     * @param apiPipelineChange Pipeline change parameters (just include JSON object as request body) (required)
     * @return ApiResponse&lt;Project&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Project> updatePipelineWithHttpInfo(Long id, APIPipelineChange apiPipelineChange) throws ApiException {
        com.squareup.okhttp.Call call = updatePipelineCall(id, apiPipelineChange, null, null);
        Type localVarReturnType = new TypeToken<Project>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Changes current pipeline for the project. (asynchronously)
     * 
     * @param id A Project&#39;s ID (required)
     * @param apiPipelineChange Pipeline change parameters (just include JSON object as request body) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updatePipelineAsync(Long id, APIPipelineChange apiPipelineChange, final ApiCallback<Project> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updatePipelineCall(id, apiPipelineChange, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Project>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updatePipelineStage */
    private com.squareup.okhttp.Call updatePipelineStageCall(Long id, APIPipelineStageChange apiStageChange, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = apiStageChange;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updatePipelineStage(Async)");
        }
        
        // verify the required parameter 'apiStageChange' is set
        if (apiStageChange == null) {
            throw new ApiException("Missing the required parameter 'apiStageChange' when calling updatePipelineStage(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Projects/{id}/PipelineStage".replaceAll("\\{format\\}","json")
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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Changes current pipeline stage for the project.
     * 
     * @param id A Project&#39;s ID (required)
     * @param apiStageChange Pipeline stage change parameters (just include JSON object as request body) (required)
     * @return Project
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Project updatePipelineStage(Long id, APIPipelineStageChange apiStageChange) throws ApiException {
        ApiResponse<Project> resp = updatePipelineStageWithHttpInfo(id, apiStageChange);
        return resp.getData();
    }

    /**
     * Changes current pipeline stage for the project.
     * 
     * @param id A Project&#39;s ID (required)
     * @param apiStageChange Pipeline stage change parameters (just include JSON object as request body) (required)
     * @return ApiResponse&lt;Project&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Project> updatePipelineStageWithHttpInfo(Long id, APIPipelineStageChange apiStageChange) throws ApiException {
        com.squareup.okhttp.Call call = updatePipelineStageCall(id, apiStageChange, null, null);
        Type localVarReturnType = new TypeToken<Project>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Changes current pipeline stage for the project. (asynchronously)
     * 
     * @param id A Project&#39;s ID (required)
     * @param apiStageChange Pipeline stage change parameters (just include JSON object as request body) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updatePipelineStageAsync(Long id, APIPipelineStageChange apiStageChange, final ApiCallback<Project> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updatePipelineStageCall(id, apiStageChange, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Project>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updateProject */
    private com.squareup.okhttp.Call updateProjectCall(APIProject apiProject, Boolean brief, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = apiProject;
        
        // verify the required parameter 'apiProject' is set
        if (apiProject == null) {
            throw new ApiException("Missing the required parameter 'apiProject' when calling updateProject(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Projects".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (brief != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "brief", brief));

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
     * Updates a Project
     * A common source of problems when updating projects occurs when users omit required fields, or insert             invalid data into a field (for example by referencing an invalid CATEGORY_ID). A good troubleshooting technique             is to create a few projects via the web interface, with representative data, links, etc, and then access             these projects via the API, and inspect the returned object graph. Also, note: The STAGE_ID and PIPELINE_ID             properties of projects are read-only. (There are separate endpoints to update pipelines/stages.)
     * @param apiProject A Project (just include JSON object as request body) (required)
     * @param brief Optional, true if you wish to do a partial update containing only top level properties of the Project. When true, all sub-collections are ignored. (optional, default to false)
     * @return Project
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Project updateProject(APIProject apiProject, Boolean brief) throws ApiException {
        ApiResponse<Project> resp = updateProjectWithHttpInfo(apiProject, brief);
        return resp.getData();
    }

    /**
     * Updates a Project
     * A common source of problems when updating projects occurs when users omit required fields, or insert             invalid data into a field (for example by referencing an invalid CATEGORY_ID). A good troubleshooting technique             is to create a few projects via the web interface, with representative data, links, etc, and then access             these projects via the API, and inspect the returned object graph. Also, note: The STAGE_ID and PIPELINE_ID             properties of projects are read-only. (There are separate endpoints to update pipelines/stages.)
     * @param apiProject A Project (just include JSON object as request body) (required)
     * @param brief Optional, true if you wish to do a partial update containing only top level properties of the Project. When true, all sub-collections are ignored. (optional, default to false)
     * @return ApiResponse&lt;Project&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Project> updateProjectWithHttpInfo(APIProject apiProject, Boolean brief) throws ApiException {
        com.squareup.okhttp.Call call = updateProjectCall(apiProject, brief, null, null);
        Type localVarReturnType = new TypeToken<Project>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Updates a Project (asynchronously)
     * A common source of problems when updating projects occurs when users omit required fields, or insert             invalid data into a field (for example by referencing an invalid CATEGORY_ID). A good troubleshooting technique             is to create a few projects via the web interface, with representative data, links, etc, and then access             these projects via the API, and inspect the returned object graph. Also, note: The STAGE_ID and PIPELINE_ID             properties of projects are read-only. (There are separate endpoints to update pipelines/stages.)
     * @param apiProject A Project (just include JSON object as request body) (required)
     * @param brief Optional, true if you wish to do a partial update containing only top level properties of the Project. When true, all sub-collections are ignored. (optional, default to false)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateProjectAsync(APIProject apiProject, Boolean brief, final ApiCallback<Project> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateProjectCall(apiProject, brief, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Project>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
