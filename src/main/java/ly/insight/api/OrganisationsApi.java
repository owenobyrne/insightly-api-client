

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
import ly.insight.model.APIAddress;
import ly.insight.model.APIContactInfo;
import ly.insight.model.APICustomField;
import ly.insight.model.APILink;
import ly.insight.model.APINote;
import ly.insight.model.APIOrganisation;
import ly.insight.model.APIOrganisationDate;
import ly.insight.model.APIOrganisationLink;
import ly.insight.model.APITag;
import ly.insight.model.Address;
import ly.insight.model.CalendarEvent;
import ly.insight.model.ContactInfo;
import ly.insight.model.CustomField;
import java.util.Date;
import ly.insight.model.Email;
import java.io.File;
import ly.insight.model.FileAttachment;
import ly.insight.model.Follow;
import ly.insight.model.Link;
import ly.insight.model.Note;
import ly.insight.model.Organisation;
import ly.insight.model.OrganisationDate;
import ly.insight.model.OrganisationLink;
import ly.insight.model.Tag;
import ly.insight.model.Task;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrganisationsApi {
    private ApiClient apiClient;

    public OrganisationsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public OrganisationsApi(ApiClient apiClient) {
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
        String localVarPath = "/Organisations/{id}/ActivitySetAssignment".replaceAll("\\{format\\}","json")
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
     * Adds an Activity Set to an Organisation
     * 
     * @param id A Organisaton&#39;s ID (required)
     * @param apiActivitySetAssignment The Activity Set Assignment object which contains the configuration information for the Activity Set (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void addActivitySetAssignment(Long id, APIActivitySetAssignment apiActivitySetAssignment) throws ApiException {
        addActivitySetAssignmentWithHttpInfo(id, apiActivitySetAssignment);
    }

    /**
     * Adds an Activity Set to an Organisation
     * 
     * @param id A Organisaton&#39;s ID (required)
     * @param apiActivitySetAssignment The Activity Set Assignment object which contains the configuration information for the Activity Set (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> addActivitySetAssignmentWithHttpInfo(Long id, APIActivitySetAssignment apiActivitySetAssignment) throws ApiException {
        com.squareup.okhttp.Call call = addActivitySetAssignmentCall(id, apiActivitySetAssignment, null, null);
        return apiClient.execute(call);
    }

    /**
     * Adds an Activity Set to an Organisation (asynchronously)
     * 
     * @param id A Organisaton&#39;s ID (required)
     * @param apiActivitySetAssignment The Activity Set Assignment object which contains the configuration information for the Activity Set (required)
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
    /* Build call for addAddress */
    private com.squareup.okhttp.Call addAddressCall(Long id, APIAddress apiAddress, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = apiAddress;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling addAddress(Async)");
        }
        
        // verify the required parameter 'apiAddress' is set
        if (apiAddress == null) {
            throw new ApiException("Missing the required parameter 'apiAddress' when calling addAddress(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Organisations/{id}/Addresses".replaceAll("\\{format\\}","json")
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
     * Adds an Address
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param apiAddress The Address to add (just include the JSON object in the request body) (required)
     * @return Address
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Address addAddress(Long id, APIAddress apiAddress) throws ApiException {
        ApiResponse<Address> resp = addAddressWithHttpInfo(id, apiAddress);
        return resp.getData();
    }

    /**
     * Adds an Address
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param apiAddress The Address to add (just include the JSON object in the request body) (required)
     * @return ApiResponse&lt;Address&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Address> addAddressWithHttpInfo(Long id, APIAddress apiAddress) throws ApiException {
        com.squareup.okhttp.Call call = addAddressCall(id, apiAddress, null, null);
        Type localVarReturnType = new TypeToken<Address>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Adds an Address (asynchronously)
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param apiAddress The Address to add (just include the JSON object in the request body) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addAddressAsync(Long id, APIAddress apiAddress, final ApiCallback<Address> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addAddressCall(id, apiAddress, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Address>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for addContactInfo */
    private com.squareup.okhttp.Call addContactInfoCall(Long id, APIContactInfo apiContactInfo, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = apiContactInfo;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling addContactInfo(Async)");
        }
        
        // verify the required parameter 'apiContactInfo' is set
        if (apiContactInfo == null) {
            throw new ApiException("Missing the required parameter 'apiContactInfo' when calling addContactInfo(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Organisations/{id}/ContactInfos".replaceAll("\\{format\\}","json")
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
     * Adds a Contact Info
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param apiContactInfo The Contact Info to add (just include the JSON object in the request body) (required)
     * @return ContactInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ContactInfo addContactInfo(Long id, APIContactInfo apiContactInfo) throws ApiException {
        ApiResponse<ContactInfo> resp = addContactInfoWithHttpInfo(id, apiContactInfo);
        return resp.getData();
    }

    /**
     * Adds a Contact Info
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param apiContactInfo The Contact Info to add (just include the JSON object in the request body) (required)
     * @return ApiResponse&lt;ContactInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ContactInfo> addContactInfoWithHttpInfo(Long id, APIContactInfo apiContactInfo) throws ApiException {
        com.squareup.okhttp.Call call = addContactInfoCall(id, apiContactInfo, null, null);
        Type localVarReturnType = new TypeToken<ContactInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Adds a Contact Info (asynchronously)
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param apiContactInfo The Contact Info to add (just include the JSON object in the request body) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addContactInfoAsync(Long id, APIContactInfo apiContactInfo, final ApiCallback<ContactInfo> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addContactInfoCall(id, apiContactInfo, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ContactInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for addDate */
    private com.squareup.okhttp.Call addDateCall(Long id, APIOrganisationDate apiDate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = apiDate;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling addDate(Async)");
        }
        
        // verify the required parameter 'apiDate' is set
        if (apiDate == null) {
            throw new ApiException("Missing the required parameter 'apiDate' when calling addDate(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Organisations/{id}/Dates".replaceAll("\\{format\\}","json")
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
     * Adds an Organisation Date
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param apiDate The Organisation Date to add (just include the JSON object in the request body) (required)
     * @return OrganisationDate
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OrganisationDate addDate(Long id, APIOrganisationDate apiDate) throws ApiException {
        ApiResponse<OrganisationDate> resp = addDateWithHttpInfo(id, apiDate);
        return resp.getData();
    }

    /**
     * Adds an Organisation Date
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param apiDate The Organisation Date to add (just include the JSON object in the request body) (required)
     * @return ApiResponse&lt;OrganisationDate&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OrganisationDate> addDateWithHttpInfo(Long id, APIOrganisationDate apiDate) throws ApiException {
        com.squareup.okhttp.Call call = addDateCall(id, apiDate, null, null);
        Type localVarReturnType = new TypeToken<OrganisationDate>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Adds an Organisation Date (asynchronously)
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param apiDate The Organisation Date to add (just include the JSON object in the request body) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addDateAsync(Long id, APIOrganisationDate apiDate, final ApiCallback<OrganisationDate> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addDateCall(id, apiDate, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OrganisationDate>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
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
        String localVarPath = "/Organisations/{id}/FileAttachments".replaceAll("\\{format\\}","json")
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
     * Adds a File Attachment to an Organisation
     * This endpoint expects multipart/form-data as the request payload. See Stack Overflow for examples of how to generate multipart requests, or see our &lt;a href&#x3D;\&quot;http://github.com/Insightly\&quot; target&#x3D;\&quot;_blank\&quot;&gt;client libraries&lt;/a&gt; for an example of how this is generated. Only one file can be added per request.
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
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
     * Adds a File Attachment to an Organisation
     * This endpoint expects multipart/form-data as the request payload. See Stack Overflow for examples of how to generate multipart requests, or see our &lt;a href&#x3D;\&quot;http://github.com/Insightly\&quot; target&#x3D;\&quot;_blank\&quot;&gt;client libraries&lt;/a&gt; for an example of how this is generated. Only one file can be added per request.
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
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
     * Adds a File Attachment to an Organisation (asynchronously)
     * This endpoint expects multipart/form-data as the request payload. See Stack Overflow for examples of how to generate multipart requests, or see our &lt;a href&#x3D;\&quot;http://github.com/Insightly\&quot; target&#x3D;\&quot;_blank\&quot;&gt;client libraries&lt;/a&gt; for an example of how this is generated. Only one file can be added per request.
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
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
        String localVarPath = "/Organisations/{id}/Follow".replaceAll("\\{format\\}","json")
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
     * Start following an Organisation
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @return Follow
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Follow addFollow(Long id) throws ApiException {
        ApiResponse<Follow> resp = addFollowWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Start following an Organisation
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @return ApiResponse&lt;Follow&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Follow> addFollowWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = addFollowCall(id, null, null);
        Type localVarReturnType = new TypeToken<Follow>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Start following an Organisation (asynchronously)
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
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
        String localVarPath = "/Organisations/{id}/Links".replaceAll("\\{format\\}","json")
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
     * Adds a Link
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param apiLink The Link to add (just include the JSON object in the request body) (required)
     * @return Link
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Link addLink(Long id, APILink apiLink) throws ApiException {
        ApiResponse<Link> resp = addLinkWithHttpInfo(id, apiLink);
        return resp.getData();
    }

    /**
     * Adds a Link
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param apiLink The Link to add (just include the JSON object in the request body) (required)
     * @return ApiResponse&lt;Link&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Link> addLinkWithHttpInfo(Long id, APILink apiLink) throws ApiException {
        com.squareup.okhttp.Call call = addLinkCall(id, apiLink, null, null);
        Type localVarReturnType = new TypeToken<Link>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Adds a Link (asynchronously)
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param apiLink The Link to add (just include the JSON object in the request body) (required)
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
        String localVarPath = "/Organisations/{id}/Notes".replaceAll("\\{format\\}","json")
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
     * Adds a Note to an Organisation
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param apiNote The Note to add (just include the JSON object in the request body) (required)
     * @return Note
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Note addNote(Long id, APINote apiNote) throws ApiException {
        ApiResponse<Note> resp = addNoteWithHttpInfo(id, apiNote);
        return resp.getData();
    }

    /**
     * Adds a Note to an Organisation
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param apiNote The Note to add (just include the JSON object in the request body) (required)
     * @return ApiResponse&lt;Note&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Note> addNoteWithHttpInfo(Long id, APINote apiNote) throws ApiException {
        com.squareup.okhttp.Call call = addNoteCall(id, apiNote, null, null);
        Type localVarReturnType = new TypeToken<Note>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Adds a Note to an Organisation (asynchronously)
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param apiNote The Note to add (just include the JSON object in the request body) (required)
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
    /* Build call for addOrganisation */
    private com.squareup.okhttp.Call addOrganisationCall(APIOrganisation apiOrganisation, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = apiOrganisation;
        
        // verify the required parameter 'apiOrganisation' is set
        if (apiOrganisation == null) {
            throw new ApiException("Missing the required parameter 'apiOrganisation' when calling addOrganisation(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Organisations".replaceAll("\\{format\\}","json");

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
     * Adds an Organisation
     * If you have trouble with creating an organisation, try creating organisations via the web interface, and then access those organisations via the API. This way you            can see examples of the fields and sub-elements attached to the object. A common source of problems during write/update request is caused when users omit            required fields, or insert invalid data in a field (e.g. reference a CATEGORY_ID that does not exist in the user&#39;s Insightly instance.
     * @param apiOrganisation The Organisation to add (just include JSON object as request body) (required)
     * @return Organisation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Organisation addOrganisation(APIOrganisation apiOrganisation) throws ApiException {
        ApiResponse<Organisation> resp = addOrganisationWithHttpInfo(apiOrganisation);
        return resp.getData();
    }

    /**
     * Adds an Organisation
     * If you have trouble with creating an organisation, try creating organisations via the web interface, and then access those organisations via the API. This way you            can see examples of the fields and sub-elements attached to the object. A common source of problems during write/update request is caused when users omit            required fields, or insert invalid data in a field (e.g. reference a CATEGORY_ID that does not exist in the user&#39;s Insightly instance.
     * @param apiOrganisation The Organisation to add (just include JSON object as request body) (required)
     * @return ApiResponse&lt;Organisation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Organisation> addOrganisationWithHttpInfo(APIOrganisation apiOrganisation) throws ApiException {
        com.squareup.okhttp.Call call = addOrganisationCall(apiOrganisation, null, null);
        Type localVarReturnType = new TypeToken<Organisation>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Adds an Organisation (asynchronously)
     * If you have trouble with creating an organisation, try creating organisations via the web interface, and then access those organisations via the API. This way you            can see examples of the fields and sub-elements attached to the object. A common source of problems during write/update request is caused when users omit            required fields, or insert invalid data in a field (e.g. reference a CATEGORY_ID that does not exist in the user&#39;s Insightly instance.
     * @param apiOrganisation The Organisation to add (just include JSON object as request body) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addOrganisationAsync(APIOrganisation apiOrganisation, final ApiCallback<Organisation> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addOrganisationCall(apiOrganisation, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Organisation>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for addOrganisationLink */
    private com.squareup.okhttp.Call addOrganisationLinkCall(Long id, APIOrganisationLink apiLink, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = apiLink;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling addOrganisationLink(Async)");
        }
        
        // verify the required parameter 'apiLink' is set
        if (apiLink == null) {
            throw new ApiException("Missing the required parameter 'apiLink' when calling addOrganisationLink(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Organisations/{id}/OrganisationLinks".replaceAll("\\{format\\}","json")
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
     * Adds an Organisation Link
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param apiLink The Organisation Link to add (just include the JSON object in the request body) (required)
     * @return OrganisationLink
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OrganisationLink addOrganisationLink(Long id, APIOrganisationLink apiLink) throws ApiException {
        ApiResponse<OrganisationLink> resp = addOrganisationLinkWithHttpInfo(id, apiLink);
        return resp.getData();
    }

    /**
     * Adds an Organisation Link
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param apiLink The Organisation Link to add (just include the JSON object in the request body) (required)
     * @return ApiResponse&lt;OrganisationLink&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OrganisationLink> addOrganisationLinkWithHttpInfo(Long id, APIOrganisationLink apiLink) throws ApiException {
        com.squareup.okhttp.Call call = addOrganisationLinkCall(id, apiLink, null, null);
        Type localVarReturnType = new TypeToken<OrganisationLink>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Adds an Organisation Link (asynchronously)
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param apiLink The Organisation Link to add (just include the JSON object in the request body) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addOrganisationLinkAsync(Long id, APIOrganisationLink apiLink, final ApiCallback<OrganisationLink> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addOrganisationLinkCall(id, apiLink, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OrganisationLink>(){}.getType();
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
        String localVarPath = "/Organisations/{id}/Tags".replaceAll("\\{format\\}","json")
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
     * Adds a Tag
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param apiTag The Tag to add (just include the JSON object in the request body) (required)
     * @return Tag
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Tag addTag(Long id, APITag apiTag) throws ApiException {
        ApiResponse<Tag> resp = addTagWithHttpInfo(id, apiTag);
        return resp.getData();
    }

    /**
     * Adds a Tag
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param apiTag The Tag to add (just include the JSON object in the request body) (required)
     * @return ApiResponse&lt;Tag&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Tag> addTagWithHttpInfo(Long id, APITag apiTag) throws ApiException {
        com.squareup.okhttp.Call call = addTagCall(id, apiTag, null, null);
        Type localVarReturnType = new TypeToken<Tag>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Adds a Tag (asynchronously)
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param apiTag The Tag to add (just include the JSON object in the request body) (required)
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
    /* Build call for deleteAddress */
    private com.squareup.okhttp.Call deleteAddressCall(Long id, Long addressId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteAddress(Async)");
        }
        
        // verify the required parameter 'addressId' is set
        if (addressId == null) {
            throw new ApiException("Missing the required parameter 'addressId' when calling deleteAddress(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Organisations/{id}/Addresses/{addressId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
        .replaceAll("\\{" + "addressId" + "\\}", apiClient.escapeString(addressId.toString()));

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
     * Deletes an Address
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param addressId An Address&#39; ID (ADDRESS_ID) (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteAddress(Long id, Long addressId) throws ApiException {
        deleteAddressWithHttpInfo(id, addressId);
    }

    /**
     * Deletes an Address
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param addressId An Address&#39; ID (ADDRESS_ID) (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteAddressWithHttpInfo(Long id, Long addressId) throws ApiException {
        com.squareup.okhttp.Call call = deleteAddressCall(id, addressId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes an Address (asynchronously)
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param addressId An Address&#39; ID (ADDRESS_ID) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteAddressAsync(Long id, Long addressId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteAddressCall(id, addressId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for deleteContactInfo */
    private com.squareup.okhttp.Call deleteContactInfoCall(Long id, Long contactInfoId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteContactInfo(Async)");
        }
        
        // verify the required parameter 'contactInfoId' is set
        if (contactInfoId == null) {
            throw new ApiException("Missing the required parameter 'contactInfoId' when calling deleteContactInfo(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Organisations/{id}/ContactInfos/{contactInfoId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
        .replaceAll("\\{" + "contactInfoId" + "\\}", apiClient.escapeString(contactInfoId.toString()));

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
     * Deletes a Contact Info
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param contactInfoId A Contact Info&#39;s ID (CONTACT_INFO_ID) (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteContactInfo(Long id, Long contactInfoId) throws ApiException {
        deleteContactInfoWithHttpInfo(id, contactInfoId);
    }

    /**
     * Deletes a Contact Info
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param contactInfoId A Contact Info&#39;s ID (CONTACT_INFO_ID) (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteContactInfoWithHttpInfo(Long id, Long contactInfoId) throws ApiException {
        com.squareup.okhttp.Call call = deleteContactInfoCall(id, contactInfoId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes a Contact Info (asynchronously)
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param contactInfoId A Contact Info&#39;s ID (CONTACT_INFO_ID) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteContactInfoAsync(Long id, Long contactInfoId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteContactInfoCall(id, contactInfoId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
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
        String localVarPath = "/Organisations/{id}/CustomFields/{customFieldId}".replaceAll("\\{format\\}","json")
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
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param customFieldId A Custom Field&#39;s ID (CUSTOM_FIELD_ID) (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteCustomField(Long id, String customFieldId) throws ApiException {
        deleteCustomFieldWithHttpInfo(id, customFieldId);
    }

    /**
     * Deletes a Custom Field
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
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
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
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
    /* Build call for deleteDate */
    private com.squareup.okhttp.Call deleteDateCall(Long id, Long dateId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteDate(Async)");
        }
        
        // verify the required parameter 'dateId' is set
        if (dateId == null) {
            throw new ApiException("Missing the required parameter 'dateId' when calling deleteDate(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Organisations/{id}/Dates/{dateId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
        .replaceAll("\\{" + "dateId" + "\\}", apiClient.escapeString(dateId.toString()));

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
     * Deletes an Organisation Date
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param dateId An Organisation Date&#39;s ID (DATE_ID) (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteDate(Long id, Long dateId) throws ApiException {
        deleteDateWithHttpInfo(id, dateId);
    }

    /**
     * Deletes an Organisation Date
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param dateId An Organisation Date&#39;s ID (DATE_ID) (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteDateWithHttpInfo(Long id, Long dateId) throws ApiException {
        com.squareup.okhttp.Call call = deleteDateCall(id, dateId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes an Organisation Date (asynchronously)
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param dateId An Organisation Date&#39;s ID (DATE_ID) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteDateAsync(Long id, Long dateId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteDateCall(id, dateId, progressListener, progressRequestListener);
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
        String localVarPath = "/Organisations/{id}/Follow".replaceAll("\\{format\\}","json")
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
     * Stop following an Organisation
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteFollow(Long id) throws ApiException {
        deleteFollowWithHttpInfo(id);
    }

    /**
     * Stop following an Organisation
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteFollowWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = deleteFollowCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Stop following an Organisation (asynchronously)
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
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
        String localVarPath = "/Organisations/{id}/Image".replaceAll("\\{format\\}","json")
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
     * Deletes an Organisation&#39;s Image
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteImage(Long id) throws ApiException {
        deleteImageWithHttpInfo(id);
    }

    /**
     * Deletes an Organisation&#39;s Image
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteImageWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = deleteImageCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes an Organisation&#39;s Image (asynchronously)
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
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
        String localVarPath = "/Organisations/{id}/Links/{linkId}".replaceAll("\\{format\\}","json")
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
     * Deletes a Link
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param linkId A Link&#39;s ID (LINK_ID) (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteLink(Long id, Long linkId) throws ApiException {
        deleteLinkWithHttpInfo(id, linkId);
    }

    /**
     * Deletes a Link
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param linkId A Link&#39;s ID (LINK_ID) (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteLinkWithHttpInfo(Long id, Long linkId) throws ApiException {
        com.squareup.okhttp.Call call = deleteLinkCall(id, linkId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes a Link (asynchronously)
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
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
    /* Build call for deleteOrganisation */
    private com.squareup.okhttp.Call deleteOrganisationCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteOrganisation(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Organisations/{id}".replaceAll("\\{format\\}","json")
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
     * Deletes an Organisation
     * 
     * @param id An Organisation&#39;s ID (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteOrganisation(Long id) throws ApiException {
        deleteOrganisationWithHttpInfo(id);
    }

    /**
     * Deletes an Organisation
     * 
     * @param id An Organisation&#39;s ID (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteOrganisationWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = deleteOrganisationCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes an Organisation (asynchronously)
     * 
     * @param id An Organisation&#39;s ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteOrganisationAsync(Long id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteOrganisationCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for deleteOrganisationLink */
    private com.squareup.okhttp.Call deleteOrganisationLinkCall(Long id, Long linkId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteOrganisationLink(Async)");
        }
        
        // verify the required parameter 'linkId' is set
        if (linkId == null) {
            throw new ApiException("Missing the required parameter 'linkId' when calling deleteOrganisationLink(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Organisations/{id}/OrganisationLinks/{linkId}".replaceAll("\\{format\\}","json")
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
     * Deletes an Organisation Link
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param linkId An Organisation Link&#39;s ID (ORG_LINK_ID) (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteOrganisationLink(Long id, Long linkId) throws ApiException {
        deleteOrganisationLinkWithHttpInfo(id, linkId);
    }

    /**
     * Deletes an Organisation Link
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param linkId An Organisation Link&#39;s ID (ORG_LINK_ID) (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteOrganisationLinkWithHttpInfo(Long id, Long linkId) throws ApiException {
        com.squareup.okhttp.Call call = deleteOrganisationLinkCall(id, linkId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes an Organisation Link (asynchronously)
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param linkId An Organisation Link&#39;s ID (ORG_LINK_ID) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteOrganisationLinkAsync(Long id, Long linkId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteOrganisationLinkCall(id, linkId, progressListener, progressRequestListener);
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
        String localVarPath = "/Organisations/{id}/Tags/{tagName}".replaceAll("\\{format\\}","json")
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
     * Deletes a Tag
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param tagName A Tag&#39;s name (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteTag(Long id, String tagName) throws ApiException {
        deleteTagWithHttpInfo(id, tagName);
    }

    /**
     * Deletes a Tag
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param tagName A Tag&#39;s name (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteTagWithHttpInfo(Long id, String tagName) throws ApiException {
        com.squareup.okhttp.Call call = deleteTagCall(id, tagName, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes a Tag (asynchronously)
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
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
        String localVarPath = "/Organisations/{id}/Emails".replaceAll("\\{format\\}","json")
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
     * Gets a list of Organisation&#39;s Emails
     * 
     * @param id An Organisation&#39;s ID (required)
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
     * Gets a list of Organisation&#39;s Emails
     * 
     * @param id An Organisation&#39;s ID (required)
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
     * Gets a list of Organisation&#39;s Emails (asynchronously)
     * 
     * @param id An Organisation&#39;s ID (required)
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
        String localVarPath = "/Organisations/{id}/Events".replaceAll("\\{format\\}","json")
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
     * Gets an Organisation&#39;s Events
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
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
     * Gets an Organisation&#39;s Events
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
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
     * Gets an Organisation&#39;s Events (asynchronously)
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
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
        String localVarPath = "/Organisations/{id}/FileAttachments".replaceAll("\\{format\\}","json")
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
     * Gets an Organisation&#39;s File Attachments
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
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
     * Gets an Organisation&#39;s File Attachments
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
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
     * Gets an Organisation&#39;s File Attachments (asynchronously)
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
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
        String localVarPath = "/Organisations/{id}/Follow".replaceAll("\\{format\\}","json")
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
     * Gets a Follow record for the Organisation
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @return Follow
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Follow getFollow(Long id) throws ApiException {
        ApiResponse<Follow> resp = getFollowWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Gets a Follow record for the Organisation
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @return ApiResponse&lt;Follow&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Follow> getFollowWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = getFollowCall(id, null, null);
        Type localVarReturnType = new TypeToken<Follow>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a Follow record for the Organisation (asynchronously)
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
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
        String localVarPath = "/Organisations/{id}/Image".replaceAll("\\{format\\}","json")
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
     * Gets an Organisations&#39;s Image
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getImage(Long id) throws ApiException {
        getImageWithHttpInfo(id);
    }

    /**
     * Gets an Organisations&#39;s Image
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getImageWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = getImageCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Gets an Organisations&#39;s Image (asynchronously)
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
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
    /* Build call for getNotes */
    private com.squareup.okhttp.Call getNotesCall(Long id, Date updatedAfterUtc, Integer top, Integer skip, Boolean brief, Boolean countTotal, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getNotes(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Organisations/{id}/Notes".replaceAll("\\{format\\}","json")
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
     * Gets an Organisation&#39;s Notes
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
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
     * Gets an Organisation&#39;s Notes
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
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
     * Gets an Organisation&#39;s Notes (asynchronously)
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
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
    /* Build call for getOrganisation */
    private com.squareup.okhttp.Call getOrganisationCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getOrganisation(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Organisations/{id}".replaceAll("\\{format\\}","json")
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
     * Gets an Organisation
     * 
     * @param id An Organisation&#39;s ID (required)
     * @return Organisation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Organisation getOrganisation(Long id) throws ApiException {
        ApiResponse<Organisation> resp = getOrganisationWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Gets an Organisation
     * 
     * @param id An Organisation&#39;s ID (required)
     * @return ApiResponse&lt;Organisation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Organisation> getOrganisationWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = getOrganisationCall(id, null, null);
        Type localVarReturnType = new TypeToken<Organisation>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets an Organisation (asynchronously)
     * 
     * @param id An Organisation&#39;s ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getOrganisationAsync(Long id, final ApiCallback<Organisation> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getOrganisationCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Organisation>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getOrganisations */
    private com.squareup.okhttp.Call getOrganisationsCall(Boolean brief, Integer skip, Integer top, Boolean countTotal, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/Organisations".replaceAll("\\{format\\}","json");

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
     * Gets a list of Organisations.
     * Simple object graphs (excluding ADDRESSES, CONTACTINFOS, etc.) are returned if \&quot;brief&#x3D;true\&quot; is used in the query string.
     * @param brief Optional, true if response should only contain top level properties of the organisation. (optional, default to false)
     * @param skip Optional, number of organisations to skip. (optional)
     * @param top Optional, maximum number of organisations to return in the response. (optional)
     * @param countTotal Optional, true if total number of records should be returned in the response headers. (optional, default to false)
     * @return List&lt;Organisation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Organisation> getOrganisations(Boolean brief, Integer skip, Integer top, Boolean countTotal) throws ApiException {
        ApiResponse<List<Organisation>> resp = getOrganisationsWithHttpInfo(brief, skip, top, countTotal);
        return resp.getData();
    }

    /**
     * Gets a list of Organisations.
     * Simple object graphs (excluding ADDRESSES, CONTACTINFOS, etc.) are returned if \&quot;brief&#x3D;true\&quot; is used in the query string.
     * @param brief Optional, true if response should only contain top level properties of the organisation. (optional, default to false)
     * @param skip Optional, number of organisations to skip. (optional)
     * @param top Optional, maximum number of organisations to return in the response. (optional)
     * @param countTotal Optional, true if total number of records should be returned in the response headers. (optional, default to false)
     * @return ApiResponse&lt;List&lt;Organisation&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Organisation>> getOrganisationsWithHttpInfo(Boolean brief, Integer skip, Integer top, Boolean countTotal) throws ApiException {
        com.squareup.okhttp.Call call = getOrganisationsCall(brief, skip, top, countTotal, null, null);
        Type localVarReturnType = new TypeToken<List<Organisation>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a list of Organisations. (asynchronously)
     * Simple object graphs (excluding ADDRESSES, CONTACTINFOS, etc.) are returned if \&quot;brief&#x3D;true\&quot; is used in the query string.
     * @param brief Optional, true if response should only contain top level properties of the organisation. (optional, default to false)
     * @param skip Optional, number of organisations to skip. (optional)
     * @param top Optional, maximum number of organisations to return in the response. (optional)
     * @param countTotal Optional, true if total number of records should be returned in the response headers. (optional, default to false)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getOrganisationsAsync(Boolean brief, Integer skip, Integer top, Boolean countTotal, final ApiCallback<List<Organisation>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getOrganisationsCall(brief, skip, top, countTotal, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Organisation>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getOrganisationsBySearch */
    private com.squareup.okhttp.Call getOrganisationsBySearchCall(String email, String emailDomain, String tag, String phoneNumber, String organisationName, String city, String state, String postcode, String country, Date updatedAfterUtc, Boolean brief, Integer skip, Integer top, Boolean countTotal, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/Organisations/Search".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (email != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));
        if (emailDomain != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "email_domain", emailDomain));
        if (tag != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "tag", tag));
        if (phoneNumber != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "phone_number", phoneNumber));
        if (organisationName != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "organisation_name", organisationName));
        if (city != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "city", city));
        if (state != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "state", state));
        if (postcode != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "postcode", postcode));
        if (country != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "country", country));
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
     * Gets a filtered list of Organisations.
     * Only one optional parameter (excluding brief, top, skip and count_total) can be specified. Simple object graphs (excluding ADDRESSES, CONTACTINFOS, etc.) are returned if \&quot;brief&#x3D;true\&quot; is used in the query string.
     * @param email Optional, email address. (optional)
     * @param emailDomain Optional, email domain. (optional)
     * @param tag Optional, a single tag. (optional)
     * @param phoneNumber Optional, phone number. (optional)
     * @param organisationName Optional, name of the organisation. (optional)
     * @param city Optional, name of the city from organisation address. (optional)
     * @param state Optional, state from the organisation address. (optional)
     * @param postcode Optional, postal code from the organisation address. (optional)
     * @param country Optional, name of the country from organisation address. (optional)
     * @param updatedAfterUtc Optional, earliest date when organisation was last updated. (optional)
     * @param brief Optional, true if response should only contain top level properties of the organisation. (optional, default to false)
     * @param skip Optional, number of organisations to skip. (optional)
     * @param top Optional, maximum number of organisations to return in the response. (optional)
     * @param countTotal Optional, true if total number of records should be returned in the response headers. (optional, default to false)
     * @return List&lt;Organisation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Organisation> getOrganisationsBySearch(String email, String emailDomain, String tag, String phoneNumber, String organisationName, String city, String state, String postcode, String country, Date updatedAfterUtc, Boolean brief, Integer skip, Integer top, Boolean countTotal) throws ApiException {
        ApiResponse<List<Organisation>> resp = getOrganisationsBySearchWithHttpInfo(email, emailDomain, tag, phoneNumber, organisationName, city, state, postcode, country, updatedAfterUtc, brief, skip, top, countTotal);
        return resp.getData();
    }

    /**
     * Gets a filtered list of Organisations.
     * Only one optional parameter (excluding brief, top, skip and count_total) can be specified. Simple object graphs (excluding ADDRESSES, CONTACTINFOS, etc.) are returned if \&quot;brief&#x3D;true\&quot; is used in the query string.
     * @param email Optional, email address. (optional)
     * @param emailDomain Optional, email domain. (optional)
     * @param tag Optional, a single tag. (optional)
     * @param phoneNumber Optional, phone number. (optional)
     * @param organisationName Optional, name of the organisation. (optional)
     * @param city Optional, name of the city from organisation address. (optional)
     * @param state Optional, state from the organisation address. (optional)
     * @param postcode Optional, postal code from the organisation address. (optional)
     * @param country Optional, name of the country from organisation address. (optional)
     * @param updatedAfterUtc Optional, earliest date when organisation was last updated. (optional)
     * @param brief Optional, true if response should only contain top level properties of the organisation. (optional, default to false)
     * @param skip Optional, number of organisations to skip. (optional)
     * @param top Optional, maximum number of organisations to return in the response. (optional)
     * @param countTotal Optional, true if total number of records should be returned in the response headers. (optional, default to false)
     * @return ApiResponse&lt;List&lt;Organisation&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Organisation>> getOrganisationsBySearchWithHttpInfo(String email, String emailDomain, String tag, String phoneNumber, String organisationName, String city, String state, String postcode, String country, Date updatedAfterUtc, Boolean brief, Integer skip, Integer top, Boolean countTotal) throws ApiException {
        com.squareup.okhttp.Call call = getOrganisationsBySearchCall(email, emailDomain, tag, phoneNumber, organisationName, city, state, postcode, country, updatedAfterUtc, brief, skip, top, countTotal, null, null);
        Type localVarReturnType = new TypeToken<List<Organisation>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a filtered list of Organisations. (asynchronously)
     * Only one optional parameter (excluding brief, top, skip and count_total) can be specified. Simple object graphs (excluding ADDRESSES, CONTACTINFOS, etc.) are returned if \&quot;brief&#x3D;true\&quot; is used in the query string.
     * @param email Optional, email address. (optional)
     * @param emailDomain Optional, email domain. (optional)
     * @param tag Optional, a single tag. (optional)
     * @param phoneNumber Optional, phone number. (optional)
     * @param organisationName Optional, name of the organisation. (optional)
     * @param city Optional, name of the city from organisation address. (optional)
     * @param state Optional, state from the organisation address. (optional)
     * @param postcode Optional, postal code from the organisation address. (optional)
     * @param country Optional, name of the country from organisation address. (optional)
     * @param updatedAfterUtc Optional, earliest date when organisation was last updated. (optional)
     * @param brief Optional, true if response should only contain top level properties of the organisation. (optional, default to false)
     * @param skip Optional, number of organisations to skip. (optional)
     * @param top Optional, maximum number of organisations to return in the response. (optional)
     * @param countTotal Optional, true if total number of records should be returned in the response headers. (optional, default to false)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getOrganisationsBySearchAsync(String email, String emailDomain, String tag, String phoneNumber, String organisationName, String city, String state, String postcode, String country, Date updatedAfterUtc, Boolean brief, Integer skip, Integer top, Boolean countTotal, final ApiCallback<List<Organisation>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getOrganisationsBySearchCall(email, emailDomain, tag, phoneNumber, organisationName, city, state, postcode, country, updatedAfterUtc, brief, skip, top, countTotal, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Organisation>>(){}.getType();
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
        String localVarPath = "/Organisations/{id}/Tasks".replaceAll("\\{format\\}","json")
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
     * Gets a list of Organisation&#39;s Tasks
     * 
     * @param id An Organisation&#39;s ID (required)
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
     * Gets a list of Organisation&#39;s Tasks
     * 
     * @param id An Organisation&#39;s ID (required)
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
     * Gets a list of Organisation&#39;s Tasks (asynchronously)
     * 
     * @param id An Organisation&#39;s ID (required)
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
    /* Build call for updateAddress */
    private com.squareup.okhttp.Call updateAddressCall(Long id, APIAddress apiAddress, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = apiAddress;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateAddress(Async)");
        }
        
        // verify the required parameter 'apiAddress' is set
        if (apiAddress == null) {
            throw new ApiException("Missing the required parameter 'apiAddress' when calling updateAddress(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Organisations/{id}/Addresses".replaceAll("\\{format\\}","json")
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
     * Updates an Address
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param apiAddress The Address to update (just include the JSON object in the request body) (required)
     * @return Address
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Address updateAddress(Long id, APIAddress apiAddress) throws ApiException {
        ApiResponse<Address> resp = updateAddressWithHttpInfo(id, apiAddress);
        return resp.getData();
    }

    /**
     * Updates an Address
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param apiAddress The Address to update (just include the JSON object in the request body) (required)
     * @return ApiResponse&lt;Address&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Address> updateAddressWithHttpInfo(Long id, APIAddress apiAddress) throws ApiException {
        com.squareup.okhttp.Call call = updateAddressCall(id, apiAddress, null, null);
        Type localVarReturnType = new TypeToken<Address>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Updates an Address (asynchronously)
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param apiAddress The Address to update (just include the JSON object in the request body) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateAddressAsync(Long id, APIAddress apiAddress, final ApiCallback<Address> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateAddressCall(id, apiAddress, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Address>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updateContactInfo */
    private com.squareup.okhttp.Call updateContactInfoCall(Long id, APIContactInfo apiContactInfo, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = apiContactInfo;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateContactInfo(Async)");
        }
        
        // verify the required parameter 'apiContactInfo' is set
        if (apiContactInfo == null) {
            throw new ApiException("Missing the required parameter 'apiContactInfo' when calling updateContactInfo(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Organisations/{id}/ContactInfos".replaceAll("\\{format\\}","json")
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
     * Updates a Contact Info
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param apiContactInfo The Contact Info to add (just include the JSON object in the request body) (required)
     * @return ContactInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ContactInfo updateContactInfo(Long id, APIContactInfo apiContactInfo) throws ApiException {
        ApiResponse<ContactInfo> resp = updateContactInfoWithHttpInfo(id, apiContactInfo);
        return resp.getData();
    }

    /**
     * Updates a Contact Info
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param apiContactInfo The Contact Info to add (just include the JSON object in the request body) (required)
     * @return ApiResponse&lt;ContactInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ContactInfo> updateContactInfoWithHttpInfo(Long id, APIContactInfo apiContactInfo) throws ApiException {
        com.squareup.okhttp.Call call = updateContactInfoCall(id, apiContactInfo, null, null);
        Type localVarReturnType = new TypeToken<ContactInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Updates a Contact Info (asynchronously)
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param apiContactInfo The Contact Info to add (just include the JSON object in the request body) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateContactInfoAsync(Long id, APIContactInfo apiContactInfo, final ApiCallback<ContactInfo> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateContactInfoCall(id, apiContactInfo, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ContactInfo>(){}.getType();
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
        String localVarPath = "/Organisations/{id}/CustomFields".replaceAll("\\{format\\}","json")
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
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param apiCustomField The Custom Field to edit (just include the JSON object in the request body) (required)
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
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param apiCustomField The Custom Field to edit (just include the JSON object in the request body) (required)
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
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param apiCustomField The Custom Field to edit (just include the JSON object in the request body) (required)
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
    /* Build call for updateDate */
    private com.squareup.okhttp.Call updateDateCall(Long id, APIOrganisationDate apiDate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = apiDate;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateDate(Async)");
        }
        
        // verify the required parameter 'apiDate' is set
        if (apiDate == null) {
            throw new ApiException("Missing the required parameter 'apiDate' when calling updateDate(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Organisations/{id}/Dates".replaceAll("\\{format\\}","json")
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
     * Updates an Organisation Date
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param apiDate The Organisation Date to add (just include the JSON object in the request body) (required)
     * @return OrganisationDate
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OrganisationDate updateDate(Long id, APIOrganisationDate apiDate) throws ApiException {
        ApiResponse<OrganisationDate> resp = updateDateWithHttpInfo(id, apiDate);
        return resp.getData();
    }

    /**
     * Updates an Organisation Date
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param apiDate The Organisation Date to add (just include the JSON object in the request body) (required)
     * @return ApiResponse&lt;OrganisationDate&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OrganisationDate> updateDateWithHttpInfo(Long id, APIOrganisationDate apiDate) throws ApiException {
        com.squareup.okhttp.Call call = updateDateCall(id, apiDate, null, null);
        Type localVarReturnType = new TypeToken<OrganisationDate>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Updates an Organisation Date (asynchronously)
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param apiDate The Organisation Date to add (just include the JSON object in the request body) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateDateAsync(Long id, APIOrganisationDate apiDate, final ApiCallback<OrganisationDate> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateDateCall(id, apiDate, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OrganisationDate>(){}.getType();
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
        String localVarPath = "/Organisations/{id}/Image/{filename}".replaceAll("\\{format\\}","json")
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
     * Updates an Organisation&#39;s Image
     * This action will replace any existing Image attached to the Organisation. Image file contents should be sent as binary data in request payload. See our &lt;a href&#x3D;\&quot;http://github.com/Insightly\&quot; target&#x3D;\&quot;_blank\&quot;&gt;client libraries&lt;/a&gt; for an example of how this is done.
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param filename Name of Image File to be attached to Organisation (required)
     * @param file File to upload (required)
     * @return Organisation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Organisation updateImage(Long id, String filename, byte[] file) throws ApiException {
        ApiResponse<Organisation> resp = updateImageWithHttpInfo(id, filename, file);
        return resp.getData();
    }

    /**
     * Updates an Organisation&#39;s Image
     * This action will replace any existing Image attached to the Organisation. Image file contents should be sent as binary data in request payload. See our &lt;a href&#x3D;\&quot;http://github.com/Insightly\&quot; target&#x3D;\&quot;_blank\&quot;&gt;client libraries&lt;/a&gt; for an example of how this is done.
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param filename Name of Image File to be attached to Organisation (required)
     * @param file File to upload (required)
     * @return ApiResponse&lt;Organisation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Organisation> updateImageWithHttpInfo(Long id, String filename, byte[] file) throws ApiException {
        com.squareup.okhttp.Call call = updateImageCall(id, filename, file, null, null);
        Type localVarReturnType = new TypeToken<Organisation>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Updates an Organisation&#39;s Image (asynchronously)
     * This action will replace any existing Image attached to the Organisation. Image file contents should be sent as binary data in request payload. See our &lt;a href&#x3D;\&quot;http://github.com/Insightly\&quot; target&#x3D;\&quot;_blank\&quot;&gt;client libraries&lt;/a&gt; for an example of how this is done.
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param filename Name of Image File to be attached to Organisation (required)
     * @param file File to upload (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateImageAsync(Long id, String filename, byte[] file, final ApiCallback<Organisation> callback) throws ApiException {

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
        Type localVarReturnType = new TypeToken<Organisation>(){}.getType();
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
        String localVarPath = "/Organisations/{id}/Links".replaceAll("\\{format\\}","json")
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
     * Updates a Link
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param apiLink The Link to add (just include the JSON object in the request body) (required)
     * @return Link
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Link updateLink(Long id, APILink apiLink) throws ApiException {
        ApiResponse<Link> resp = updateLinkWithHttpInfo(id, apiLink);
        return resp.getData();
    }

    /**
     * Updates a Link
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param apiLink The Link to add (just include the JSON object in the request body) (required)
     * @return ApiResponse&lt;Link&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Link> updateLinkWithHttpInfo(Long id, APILink apiLink) throws ApiException {
        com.squareup.okhttp.Call call = updateLinkCall(id, apiLink, null, null);
        Type localVarReturnType = new TypeToken<Link>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Updates a Link (asynchronously)
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param apiLink The Link to add (just include the JSON object in the request body) (required)
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
    /* Build call for updateOrganisation */
    private com.squareup.okhttp.Call updateOrganisationCall(APIOrganisation apiOrganisation, Boolean brief, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = apiOrganisation;
        
        // verify the required parameter 'apiOrganisation' is set
        if (apiOrganisation == null) {
            throw new ApiException("Missing the required parameter 'apiOrganisation' when calling updateOrganisation(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Organisations".replaceAll("\\{format\\}","json");

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
     * Updates an Organisation
     * If you have trouble updating an organisation, try accessing the organisation via the GET request to inspect its fields and sub-elements. A common source of            problems with write/update requests occurs when users either omit required fields, or insert invalid data into a field (for example, by referring a            CATEGORY_ID or LINK_ID which does not exist.
     * @param apiOrganisation An Organisation (just include JSON object as request body) (required)
     * @param brief Optional, true if you wish to do a partial update containing only top level properties of the Organisation. When true, all sub-collections are ignored. (optional, default to false)
     * @return Organisation
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Organisation updateOrganisation(APIOrganisation apiOrganisation, Boolean brief) throws ApiException {
        ApiResponse<Organisation> resp = updateOrganisationWithHttpInfo(apiOrganisation, brief);
        return resp.getData();
    }

    /**
     * Updates an Organisation
     * If you have trouble updating an organisation, try accessing the organisation via the GET request to inspect its fields and sub-elements. A common source of            problems with write/update requests occurs when users either omit required fields, or insert invalid data into a field (for example, by referring a            CATEGORY_ID or LINK_ID which does not exist.
     * @param apiOrganisation An Organisation (just include JSON object as request body) (required)
     * @param brief Optional, true if you wish to do a partial update containing only top level properties of the Organisation. When true, all sub-collections are ignored. (optional, default to false)
     * @return ApiResponse&lt;Organisation&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Organisation> updateOrganisationWithHttpInfo(APIOrganisation apiOrganisation, Boolean brief) throws ApiException {
        com.squareup.okhttp.Call call = updateOrganisationCall(apiOrganisation, brief, null, null);
        Type localVarReturnType = new TypeToken<Organisation>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Updates an Organisation (asynchronously)
     * If you have trouble updating an organisation, try accessing the organisation via the GET request to inspect its fields and sub-elements. A common source of            problems with write/update requests occurs when users either omit required fields, or insert invalid data into a field (for example, by referring a            CATEGORY_ID or LINK_ID which does not exist.
     * @param apiOrganisation An Organisation (just include JSON object as request body) (required)
     * @param brief Optional, true if you wish to do a partial update containing only top level properties of the Organisation. When true, all sub-collections are ignored. (optional, default to false)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateOrganisationAsync(APIOrganisation apiOrganisation, Boolean brief, final ApiCallback<Organisation> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateOrganisationCall(apiOrganisation, brief, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Organisation>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updateOrganisationLink */
    private com.squareup.okhttp.Call updateOrganisationLinkCall(Long id, APIOrganisationLink apiLink, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = apiLink;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateOrganisationLink(Async)");
        }
        
        // verify the required parameter 'apiLink' is set
        if (apiLink == null) {
            throw new ApiException("Missing the required parameter 'apiLink' when calling updateOrganisationLink(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Organisations/{id}/OrganisationLinks".replaceAll("\\{format\\}","json")
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
     * Updates an Organisation Link
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param apiLink The Organisation Link to add (just include the JSON object in the request body) (required)
     * @return OrganisationLink
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public OrganisationLink updateOrganisationLink(Long id, APIOrganisationLink apiLink) throws ApiException {
        ApiResponse<OrganisationLink> resp = updateOrganisationLinkWithHttpInfo(id, apiLink);
        return resp.getData();
    }

    /**
     * Updates an Organisation Link
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param apiLink The Organisation Link to add (just include the JSON object in the request body) (required)
     * @return ApiResponse&lt;OrganisationLink&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<OrganisationLink> updateOrganisationLinkWithHttpInfo(Long id, APIOrganisationLink apiLink) throws ApiException {
        com.squareup.okhttp.Call call = updateOrganisationLinkCall(id, apiLink, null, null);
        Type localVarReturnType = new TypeToken<OrganisationLink>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Updates an Organisation Link (asynchronously)
     * 
     * @param id An Organisation&#39;s ID (ORGANISATION_ID) (required)
     * @param apiLink The Organisation Link to add (just include the JSON object in the request body) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateOrganisationLinkAsync(Long id, APIOrganisationLink apiLink, final ApiCallback<OrganisationLink> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateOrganisationLinkCall(id, apiLink, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<OrganisationLink>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
