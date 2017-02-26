

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
import ly.insight.model.APIContact;
import ly.insight.model.APIContactDate;
import ly.insight.model.APIContactInfo;
import ly.insight.model.APIContactLink;
import ly.insight.model.APICustomField;
import ly.insight.model.APILink;
import ly.insight.model.APINote;
import ly.insight.model.APITag;
import ly.insight.model.Address;
import ly.insight.model.CalendarEvent;
import ly.insight.model.Contact;
import ly.insight.model.ContactDate;
import ly.insight.model.ContactInfo;
import ly.insight.model.ContactLink;
import ly.insight.model.CustomField;
import java.util.Date;
import ly.insight.model.Email;
import java.io.File;
import ly.insight.model.FileAttachment;
import ly.insight.model.Follow;
import ly.insight.model.Link;
import ly.insight.model.Note;
import ly.insight.model.Tag;
import ly.insight.model.Task;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContactsApi {
    private ApiClient apiClient;

    public ContactsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ContactsApi(ApiClient apiClient) {
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
        String localVarPath = "/Contacts/{id}/ActivitySetAssignment".replaceAll("\\{format\\}","json")
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
     * Adds an Activity Set to a Contact
     * 
     * @param id A Contact&#39;s ID (required)
     * @param apiActivitySetAssignment The Activity Set Assignment object which contains the configuration information for the Activity Set (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void addActivitySetAssignment(Long id, APIActivitySetAssignment apiActivitySetAssignment) throws ApiException {
        addActivitySetAssignmentWithHttpInfo(id, apiActivitySetAssignment);
    }

    /**
     * Adds an Activity Set to a Contact
     * 
     * @param id A Contact&#39;s ID (required)
     * @param apiActivitySetAssignment The Activity Set Assignment object which contains the configuration information for the Activity Set (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> addActivitySetAssignmentWithHttpInfo(Long id, APIActivitySetAssignment apiActivitySetAssignment) throws ApiException {
        com.squareup.okhttp.Call call = addActivitySetAssignmentCall(id, apiActivitySetAssignment, null, null);
        return apiClient.execute(call);
    }

    /**
     * Adds an Activity Set to a Contact (asynchronously)
     * 
     * @param id A Contact&#39;s ID (required)
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
        String localVarPath = "/Contacts/{id}/Addresses".replaceAll("\\{format\\}","json")
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
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
     * @param apiAddress The Address to add (just include JSON object as request body) (required)
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
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
     * @param apiAddress The Address to add (just include JSON object as request body) (required)
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
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
     * @param apiAddress The Address to add (just include JSON object as request body) (required)
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
    /* Build call for addContact */
    private com.squareup.okhttp.Call addContactCall(APIContact apiContact, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = apiContact;
        
        // verify the required parameter 'apiContact' is set
        if (apiContact == null) {
            throw new ApiException("Missing the required parameter 'apiContact' when calling addContact(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Contacts".replaceAll("\\{format\\}","json");

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
     * Adds a Contact
     * If you have trouble with creating a contact, try creating contacts via the web interface, and then access those contacts via the API. This way you            can see examples of the fields and sub-elements attached to the object. A common source of problems during write/update request is caused when users omit            required fields, or insert invalid data in a field (e.g. reference a CATEGORY_ID that does not exist in the user&#39;s Insightly instance.
     * @param apiContact The Contact to add (just include the JSON object as the request body) (required)
     * @return Contact
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Contact addContact(APIContact apiContact) throws ApiException {
        ApiResponse<Contact> resp = addContactWithHttpInfo(apiContact);
        return resp.getData();
    }

    /**
     * Adds a Contact
     * If you have trouble with creating a contact, try creating contacts via the web interface, and then access those contacts via the API. This way you            can see examples of the fields and sub-elements attached to the object. A common source of problems during write/update request is caused when users omit            required fields, or insert invalid data in a field (e.g. reference a CATEGORY_ID that does not exist in the user&#39;s Insightly instance.
     * @param apiContact The Contact to add (just include the JSON object as the request body) (required)
     * @return ApiResponse&lt;Contact&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Contact> addContactWithHttpInfo(APIContact apiContact) throws ApiException {
        com.squareup.okhttp.Call call = addContactCall(apiContact, null, null);
        Type localVarReturnType = new TypeToken<Contact>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Adds a Contact (asynchronously)
     * If you have trouble with creating a contact, try creating contacts via the web interface, and then access those contacts via the API. This way you            can see examples of the fields and sub-elements attached to the object. A common source of problems during write/update request is caused when users omit            required fields, or insert invalid data in a field (e.g. reference a CATEGORY_ID that does not exist in the user&#39;s Insightly instance.
     * @param apiContact The Contact to add (just include the JSON object as the request body) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addContactAsync(APIContact apiContact, final ApiCallback<Contact> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addContactCall(apiContact, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Contact>(){}.getType();
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
        String localVarPath = "/Contacts/{id}/ContactInfos".replaceAll("\\{format\\}","json")
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
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
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
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
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
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
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
    /* Build call for addContactLink */
    private com.squareup.okhttp.Call addContactLinkCall(Long id, APIContactLink apiLink, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = apiLink;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling addContactLink(Async)");
        }
        
        // verify the required parameter 'apiLink' is set
        if (apiLink == null) {
            throw new ApiException("Missing the required parameter 'apiLink' when calling addContactLink(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Contacts/{id}/ContactLinks".replaceAll("\\{format\\}","json")
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
     * Adds a Contact Link
     * 
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
     * @param apiLink The Contact Link to add (just include the JSON object as request body) (required)
     * @return ContactLink
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ContactLink addContactLink(Long id, APIContactLink apiLink) throws ApiException {
        ApiResponse<ContactLink> resp = addContactLinkWithHttpInfo(id, apiLink);
        return resp.getData();
    }

    /**
     * Adds a Contact Link
     * 
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
     * @param apiLink The Contact Link to add (just include the JSON object as request body) (required)
     * @return ApiResponse&lt;ContactLink&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ContactLink> addContactLinkWithHttpInfo(Long id, APIContactLink apiLink) throws ApiException {
        com.squareup.okhttp.Call call = addContactLinkCall(id, apiLink, null, null);
        Type localVarReturnType = new TypeToken<ContactLink>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Adds a Contact Link (asynchronously)
     * 
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
     * @param apiLink The Contact Link to add (just include the JSON object as request body) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addContactLinkAsync(Long id, APIContactLink apiLink, final ApiCallback<ContactLink> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addContactLinkCall(id, apiLink, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ContactLink>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for addDate */
    private com.squareup.okhttp.Call addDateCall(Long id, APIContactDate apiContactDate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = apiContactDate;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling addDate(Async)");
        }
        
        // verify the required parameter 'apiContactDate' is set
        if (apiContactDate == null) {
            throw new ApiException("Missing the required parameter 'apiContactDate' when calling addDate(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Contacts/{id}/Dates".replaceAll("\\{format\\}","json")
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
     * Adds a Contact Date
     * 
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
     * @param apiContactDate The Contact Date to add (just include JSON object as request body) (required)
     * @return ContactDate
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ContactDate addDate(Long id, APIContactDate apiContactDate) throws ApiException {
        ApiResponse<ContactDate> resp = addDateWithHttpInfo(id, apiContactDate);
        return resp.getData();
    }

    /**
     * Adds a Contact Date
     * 
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
     * @param apiContactDate The Contact Date to add (just include JSON object as request body) (required)
     * @return ApiResponse&lt;ContactDate&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ContactDate> addDateWithHttpInfo(Long id, APIContactDate apiContactDate) throws ApiException {
        com.squareup.okhttp.Call call = addDateCall(id, apiContactDate, null, null);
        Type localVarReturnType = new TypeToken<ContactDate>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Adds a Contact Date (asynchronously)
     * 
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
     * @param apiContactDate The Contact Date to add (just include JSON object as request body) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addDateAsync(Long id, APIContactDate apiContactDate, final ApiCallback<ContactDate> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addDateCall(id, apiContactDate, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ContactDate>(){}.getType();
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
        String localVarPath = "/Contacts/{id}/FileAttachments".replaceAll("\\{format\\}","json")
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
     * Adds a File Attachment to a Contact
     * This endpoint expects multipart/form-data as the request payload. See Stack Overflow for examples of how to generate multipart requests, or see our &lt;a href&#x3D;\&quot;http://github.com/Insightly\&quot; target&#x3D;\&quot;_blank\&quot;&gt;client libraries&lt;/a&gt; for an example of how this is generated. Only one file can be added per request.
     * @param id Contact ID (required)
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
     * Adds a File Attachment to a Contact
     * This endpoint expects multipart/form-data as the request payload. See Stack Overflow for examples of how to generate multipart requests, or see our &lt;a href&#x3D;\&quot;http://github.com/Insightly\&quot; target&#x3D;\&quot;_blank\&quot;&gt;client libraries&lt;/a&gt; for an example of how this is generated. Only one file can be added per request.
     * @param id Contact ID (required)
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
     * Adds a File Attachment to a Contact (asynchronously)
     * This endpoint expects multipart/form-data as the request payload. See Stack Overflow for examples of how to generate multipart requests, or see our &lt;a href&#x3D;\&quot;http://github.com/Insightly\&quot; target&#x3D;\&quot;_blank\&quot;&gt;client libraries&lt;/a&gt; for an example of how this is generated. Only one file can be added per request.
     * @param id Contact ID (required)
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
        String localVarPath = "/Contacts/{id}/Follow".replaceAll("\\{format\\}","json")
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
     * Start following a Contact
     * 
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
     * @return Follow
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Follow addFollow(Long id) throws ApiException {
        ApiResponse<Follow> resp = addFollowWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Start following a Contact
     * 
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
     * @return ApiResponse&lt;Follow&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Follow> addFollowWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = addFollowCall(id, null, null);
        Type localVarReturnType = new TypeToken<Follow>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Start following a Contact (asynchronously)
     * 
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
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
        String localVarPath = "/Contacts/{id}/Links".replaceAll("\\{format\\}","json")
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
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
     * @param apiLink The Link to add (just include JSON object as request body) (required)
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
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
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
     * Adds a Link (asynchronously)
     * 
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
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
        String localVarPath = "/Contacts/{id}/Notes".replaceAll("\\{format\\}","json")
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
     * Adds a Note to a Contact
     * 
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
     * @param apiNote The Note to add (required)
     * @return Note
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Note addNote(Long id, APINote apiNote) throws ApiException {
        ApiResponse<Note> resp = addNoteWithHttpInfo(id, apiNote);
        return resp.getData();
    }

    /**
     * Adds a Note to a Contact
     * 
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
     * @param apiNote The Note to add (required)
     * @return ApiResponse&lt;Note&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Note> addNoteWithHttpInfo(Long id, APINote apiNote) throws ApiException {
        com.squareup.okhttp.Call call = addNoteCall(id, apiNote, null, null);
        Type localVarReturnType = new TypeToken<Note>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Adds a Note to a Contact (asynchronously)
     * 
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
     * @param apiNote The Note to add (required)
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
        String localVarPath = "/Contacts/{id}/Tags".replaceAll("\\{format\\}","json")
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
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
     * @param apiTag The Tag to add (just include the JSON object as the request body) (required)
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
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
     * @param apiTag The Tag to add (just include the JSON object as the request body) (required)
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
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
     * @param apiTag The Tag to add (just include the JSON object as the request body) (required)
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
        String localVarPath = "/Contacts/{id}/Addresses/{addressId}".replaceAll("\\{format\\}","json")
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
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
     * @param addressId An Address&#39; ID (ADDRESS_ID) (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteAddress(Long id, Long addressId) throws ApiException {
        deleteAddressWithHttpInfo(id, addressId);
    }

    /**
     * Deletes an Address
     * 
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
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
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
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
    /* Build call for deleteContact */
    private com.squareup.okhttp.Call deleteContactCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteContact(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Contacts/{id}".replaceAll("\\{format\\}","json")
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
     * Deletes a Contact
     * 
     * @param id A Contact&#39;s ID (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteContact(Long id) throws ApiException {
        deleteContactWithHttpInfo(id);
    }

    /**
     * Deletes a Contact
     * 
     * @param id A Contact&#39;s ID (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteContactWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = deleteContactCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes a Contact (asynchronously)
     * 
     * @param id A Contact&#39;s ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteContactAsync(Long id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteContactCall(id, progressListener, progressRequestListener);
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
        String localVarPath = "/Contacts/{id}/ContactInfos/{contactInfoId}".replaceAll("\\{format\\}","json")
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
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
     * @param contactInfoId A Contact Info&#39;s ID (CONTAC_INFO_ID) (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteContactInfo(Long id, Long contactInfoId) throws ApiException {
        deleteContactInfoWithHttpInfo(id, contactInfoId);
    }

    /**
     * Deletes a Contact Info
     * 
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
     * @param contactInfoId A Contact Info&#39;s ID (CONTAC_INFO_ID) (required)
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
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
     * @param contactInfoId A Contact Info&#39;s ID (CONTAC_INFO_ID) (required)
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
    /* Build call for deleteContactLink */
    private com.squareup.okhttp.Call deleteContactLinkCall(Long id, Long linkId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteContactLink(Async)");
        }
        
        // verify the required parameter 'linkId' is set
        if (linkId == null) {
            throw new ApiException("Missing the required parameter 'linkId' when calling deleteContactLink(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Contacts/{id}/ContactLinks/{linkId}".replaceAll("\\{format\\}","json")
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
     * Deletes a Contact Link
     * 
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
     * @param linkId A Contact Link&#39;s ID (CONTACT_LINK_ID) (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteContactLink(Long id, Long linkId) throws ApiException {
        deleteContactLinkWithHttpInfo(id, linkId);
    }

    /**
     * Deletes a Contact Link
     * 
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
     * @param linkId A Contact Link&#39;s ID (CONTACT_LINK_ID) (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteContactLinkWithHttpInfo(Long id, Long linkId) throws ApiException {
        com.squareup.okhttp.Call call = deleteContactLinkCall(id, linkId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes a Contact Link (asynchronously)
     * 
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
     * @param linkId A Contact Link&#39;s ID (CONTACT_LINK_ID) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteContactLinkAsync(Long id, Long linkId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteContactLinkCall(id, linkId, progressListener, progressRequestListener);
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
        String localVarPath = "/Contacts/{id}/CustomFields/{customFieldId}".replaceAll("\\{format\\}","json")
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
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
     * @param customFieldId A Custom Field&#39;s ID (CUSTOM_FIELD_ID) (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteCustomField(Long id, String customFieldId) throws ApiException {
        deleteCustomFieldWithHttpInfo(id, customFieldId);
    }

    /**
     * Deletes a Custom Field
     * 
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
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
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
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
        String localVarPath = "/Contacts/{id}/Dates/{dateId}".replaceAll("\\{format\\}","json")
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
     * Deletes a Contact Date
     * 
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
     * @param dateId A Contact Date&#39;s ID (DATE_ID) (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteDate(Long id, Long dateId) throws ApiException {
        deleteDateWithHttpInfo(id, dateId);
    }

    /**
     * Deletes a Contact Date
     * 
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
     * @param dateId A Contact Date&#39;s ID (DATE_ID) (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteDateWithHttpInfo(Long id, Long dateId) throws ApiException {
        com.squareup.okhttp.Call call = deleteDateCall(id, dateId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes a Contact Date (asynchronously)
     * 
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
     * @param dateId A Contact Date&#39;s ID (DATE_ID) (required)
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
        String localVarPath = "/Contacts/{id}/Follow".replaceAll("\\{format\\}","json")
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
     * Stop following a Contact
     * 
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteFollow(Long id) throws ApiException {
        deleteFollowWithHttpInfo(id);
    }

    /**
     * Stop following a Contact
     * 
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteFollowWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = deleteFollowCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Stop following a Contact (asynchronously)
     * 
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
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
        String localVarPath = "/Contacts/{id}/Image".replaceAll("\\{format\\}","json")
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
     * Deletes a Contact&#39;s Image
     * 
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteImage(Long id) throws ApiException {
        deleteImageWithHttpInfo(id);
    }

    /**
     * Deletes a Contact&#39;s Image
     * 
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteImageWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = deleteImageCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes a Contact&#39;s Image (asynchronously)
     * 
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
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
        String localVarPath = "/Contacts/{id}/Links/{linkId}".replaceAll("\\{format\\}","json")
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
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
     * @param linkId A Link&#39;s ID (LINK_ID) (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteLink(Long id, Long linkId) throws ApiException {
        deleteLinkWithHttpInfo(id, linkId);
    }

    /**
     * Deletes a Link
     * 
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
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
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
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
        String localVarPath = "/Contacts/{id}/Tags/{tagName}".replaceAll("\\{format\\}","json")
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
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
     * @param tagName A Tag&#39;s name (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteTag(Long id, String tagName) throws ApiException {
        deleteTagWithHttpInfo(id, tagName);
    }

    /**
     * Deletes a Tag
     * 
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
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
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
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
    /* Build call for getContact */
    private com.squareup.okhttp.Call getContactCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getContact(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Contacts/{id}".replaceAll("\\{format\\}","json")
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
     * Gets a Contact
     * 
     * @param id A Contact&#39;s ID (required)
     * @return Contact
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Contact getContact(Long id) throws ApiException {
        ApiResponse<Contact> resp = getContactWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Gets a Contact
     * 
     * @param id A Contact&#39;s ID (required)
     * @return ApiResponse&lt;Contact&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Contact> getContactWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = getContactCall(id, null, null);
        Type localVarReturnType = new TypeToken<Contact>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a Contact (asynchronously)
     * 
     * @param id A Contact&#39;s ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getContactAsync(Long id, final ApiCallback<Contact> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getContactCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Contact>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getContacts */
    private com.squareup.okhttp.Call getContactsCall(Boolean brief, Integer skip, Integer top, Boolean countTotal, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/Contacts".replaceAll("\\{format\\}","json");

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
     * Gets a list of Contacts.
     * Simple object graphs (excluding ADDRESSES, CONTACTINFOS, etc.) are returned if \&quot;brief&#x3D;true\&quot; is used in the query string.
     * @param brief Optional, true if response should only contain top level properties of the contact. (optional, default to false)
     * @param skip Optional, number of contacts to skip. (optional)
     * @param top Optional, maximum number of contacts to return in the response. (optional)
     * @param countTotal Optional,true if total number of records should be returned in the response headers. (optional, default to false)
     * @return List&lt;Contact&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Contact> getContacts(Boolean brief, Integer skip, Integer top, Boolean countTotal) throws ApiException {
        ApiResponse<List<Contact>> resp = getContactsWithHttpInfo(brief, skip, top, countTotal);
        return resp.getData();
    }

    /**
     * Gets a list of Contacts.
     * Simple object graphs (excluding ADDRESSES, CONTACTINFOS, etc.) are returned if \&quot;brief&#x3D;true\&quot; is used in the query string.
     * @param brief Optional, true if response should only contain top level properties of the contact. (optional, default to false)
     * @param skip Optional, number of contacts to skip. (optional)
     * @param top Optional, maximum number of contacts to return in the response. (optional)
     * @param countTotal Optional,true if total number of records should be returned in the response headers. (optional, default to false)
     * @return ApiResponse&lt;List&lt;Contact&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Contact>> getContactsWithHttpInfo(Boolean brief, Integer skip, Integer top, Boolean countTotal) throws ApiException {
        com.squareup.okhttp.Call call = getContactsCall(brief, skip, top, countTotal, null, null);
        Type localVarReturnType = new TypeToken<List<Contact>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a list of Contacts. (asynchronously)
     * Simple object graphs (excluding ADDRESSES, CONTACTINFOS, etc.) are returned if \&quot;brief&#x3D;true\&quot; is used in the query string.
     * @param brief Optional, true if response should only contain top level properties of the contact. (optional, default to false)
     * @param skip Optional, number of contacts to skip. (optional)
     * @param top Optional, maximum number of contacts to return in the response. (optional)
     * @param countTotal Optional,true if total number of records should be returned in the response headers. (optional, default to false)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getContactsAsync(Boolean brief, Integer skip, Integer top, Boolean countTotal, final ApiCallback<List<Contact>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getContactsCall(brief, skip, top, countTotal, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Contact>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getContactsBySearch */
    private com.squareup.okhttp.Call getContactsBySearchCall(String email, String tag, String phoneNumber, String firstName, String lastName, String city, String state, String postcode, String country, String organisation, Date updatedAfterUtc, Boolean brief, Integer skip, Integer top, Boolean countTotal, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/Contacts/Search".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (email != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));
        if (tag != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "tag", tag));
        if (phoneNumber != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "phone_number", phoneNumber));
        if (firstName != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "first_name", firstName));
        if (lastName != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "last_name", lastName));
        if (city != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "city", city));
        if (state != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "state", state));
        if (postcode != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "postcode", postcode));
        if (country != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "country", country));
        if (organisation != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "organisation", organisation));
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
     * Gets a filtered list of Contacts.
     * Only one optional parameter (excluding brief, top, skip and count_total) can be specified. Simple object graphs (excluding ADDRESSES, CONTACTINFOS, etc.) are returned if \&quot;brief&#x3D;true\&quot; is used in the query string.
     * @param email Optional, email address. (optional)
     * @param tag Optional, a single tag. Performs an exact match. (optional)
     * @param phoneNumber Optional, phone number. (optional)
     * @param firstName Optional, first name of the contact. (optional)
     * @param lastName Optional, last name of the contact. (optional)
     * @param city Optional, name of the city from contact address. (optional)
     * @param state Optional, state from the contact address. (optional)
     * @param postcode Optional, postal code from the contact address. (optional)
     * @param country Optional, name of the country from contact address. (optional)
     * @param organisation Optional, name of the default organisation. (optional)
     * @param updatedAfterUtc Optional, earliest date when contact was last updated. (optional)
     * @param brief Optional, true if response should only contain top level properties of the contact. (optional, default to false)
     * @param skip Optional, number of contacts to skip. (optional)
     * @param top Optional, maximum number of contacts to return in the response. (optional)
     * @param countTotal Optional, true if total number of records should be returned in the response headers. (optional, default to false)
     * @return List&lt;Contact&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Contact> getContactsBySearch(String email, String tag, String phoneNumber, String firstName, String lastName, String city, String state, String postcode, String country, String organisation, Date updatedAfterUtc, Boolean brief, Integer skip, Integer top, Boolean countTotal) throws ApiException {
        ApiResponse<List<Contact>> resp = getContactsBySearchWithHttpInfo(email, tag, phoneNumber, firstName, lastName, city, state, postcode, country, organisation, updatedAfterUtc, brief, skip, top, countTotal);
        return resp.getData();
    }

    /**
     * Gets a filtered list of Contacts.
     * Only one optional parameter (excluding brief, top, skip and count_total) can be specified. Simple object graphs (excluding ADDRESSES, CONTACTINFOS, etc.) are returned if \&quot;brief&#x3D;true\&quot; is used in the query string.
     * @param email Optional, email address. (optional)
     * @param tag Optional, a single tag. Performs an exact match. (optional)
     * @param phoneNumber Optional, phone number. (optional)
     * @param firstName Optional, first name of the contact. (optional)
     * @param lastName Optional, last name of the contact. (optional)
     * @param city Optional, name of the city from contact address. (optional)
     * @param state Optional, state from the contact address. (optional)
     * @param postcode Optional, postal code from the contact address. (optional)
     * @param country Optional, name of the country from contact address. (optional)
     * @param organisation Optional, name of the default organisation. (optional)
     * @param updatedAfterUtc Optional, earliest date when contact was last updated. (optional)
     * @param brief Optional, true if response should only contain top level properties of the contact. (optional, default to false)
     * @param skip Optional, number of contacts to skip. (optional)
     * @param top Optional, maximum number of contacts to return in the response. (optional)
     * @param countTotal Optional, true if total number of records should be returned in the response headers. (optional, default to false)
     * @return ApiResponse&lt;List&lt;Contact&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Contact>> getContactsBySearchWithHttpInfo(String email, String tag, String phoneNumber, String firstName, String lastName, String city, String state, String postcode, String country, String organisation, Date updatedAfterUtc, Boolean brief, Integer skip, Integer top, Boolean countTotal) throws ApiException {
        com.squareup.okhttp.Call call = getContactsBySearchCall(email, tag, phoneNumber, firstName, lastName, city, state, postcode, country, organisation, updatedAfterUtc, brief, skip, top, countTotal, null, null);
        Type localVarReturnType = new TypeToken<List<Contact>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a filtered list of Contacts. (asynchronously)
     * Only one optional parameter (excluding brief, top, skip and count_total) can be specified. Simple object graphs (excluding ADDRESSES, CONTACTINFOS, etc.) are returned if \&quot;brief&#x3D;true\&quot; is used in the query string.
     * @param email Optional, email address. (optional)
     * @param tag Optional, a single tag. Performs an exact match. (optional)
     * @param phoneNumber Optional, phone number. (optional)
     * @param firstName Optional, first name of the contact. (optional)
     * @param lastName Optional, last name of the contact. (optional)
     * @param city Optional, name of the city from contact address. (optional)
     * @param state Optional, state from the contact address. (optional)
     * @param postcode Optional, postal code from the contact address. (optional)
     * @param country Optional, name of the country from contact address. (optional)
     * @param organisation Optional, name of the default organisation. (optional)
     * @param updatedAfterUtc Optional, earliest date when contact was last updated. (optional)
     * @param brief Optional, true if response should only contain top level properties of the contact. (optional, default to false)
     * @param skip Optional, number of contacts to skip. (optional)
     * @param top Optional, maximum number of contacts to return in the response. (optional)
     * @param countTotal Optional, true if total number of records should be returned in the response headers. (optional, default to false)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getContactsBySearchAsync(String email, String tag, String phoneNumber, String firstName, String lastName, String city, String state, String postcode, String country, String organisation, Date updatedAfterUtc, Boolean brief, Integer skip, Integer top, Boolean countTotal, final ApiCallback<List<Contact>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getContactsBySearchCall(email, tag, phoneNumber, firstName, lastName, city, state, postcode, country, organisation, updatedAfterUtc, brief, skip, top, countTotal, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Contact>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
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
        String localVarPath = "/Contacts/{id}/Emails".replaceAll("\\{format\\}","json")
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
     * Gets a list of Contact&#39;s Emails
     * 
     * @param id A Contact&#39;s ID (required)
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
     * Gets a list of Contact&#39;s Emails
     * 
     * @param id A Contact&#39;s ID (required)
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
     * Gets a list of Contact&#39;s Emails (asynchronously)
     * 
     * @param id A Contact&#39;s ID (required)
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
        String localVarPath = "/Contacts/{id}/Events".replaceAll("\\{format\\}","json")
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
     * Gets a Contact&#39;s Events
     * 
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
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
     * Gets a Contact&#39;s Events
     * 
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
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
     * Gets a Contact&#39;s Events (asynchronously)
     * 
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
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
        String localVarPath = "/Contacts/{id}/FileAttachments".replaceAll("\\{format\\}","json")
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
     * Gets a Contact&#39;s File Attachments
     * 
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
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
     * Gets a Contact&#39;s File Attachments
     * 
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
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
     * Gets a Contact&#39;s File Attachments (asynchronously)
     * 
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
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
        String localVarPath = "/Contacts/{id}/Follow".replaceAll("\\{format\\}","json")
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
     * Gets a Follow record for the Contact
     * 
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
     * @return Follow
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Follow getFollow(Long id) throws ApiException {
        ApiResponse<Follow> resp = getFollowWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Gets a Follow record for the Contact
     * 
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
     * @return ApiResponse&lt;Follow&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Follow> getFollowWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = getFollowCall(id, null, null);
        Type localVarReturnType = new TypeToken<Follow>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a Follow record for the Contact (asynchronously)
     * 
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
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
        String localVarPath = "/Contacts/{id}/Image".replaceAll("\\{format\\}","json")
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
     * Gets a Contact&#39;s Image
     * 
     * @param id A Contact&#39;s ID (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getImage(Long id) throws ApiException {
        getImageWithHttpInfo(id);
    }

    /**
     * Gets a Contact&#39;s Image
     * 
     * @param id A Contact&#39;s ID (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getImageWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = getImageCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Gets a Contact&#39;s Image (asynchronously)
     * 
     * @param id A Contact&#39;s ID (required)
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
        String localVarPath = "/Contacts/{id}/Notes".replaceAll("\\{format\\}","json")
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
     * Gets a Contact&#39;s Notes
     * 
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
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
     * Gets a Contact&#39;s Notes
     * 
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
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
     * Gets a Contact&#39;s Notes (asynchronously)
     * 
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
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
    /* Build call for getTasks */
    private com.squareup.okhttp.Call getTasksCall(Long id, Date updatedAfterUtc, Integer top, Integer skip, Boolean brief, Boolean countTotal, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getTasks(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Contacts/{id}/Tasks".replaceAll("\\{format\\}","json")
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
     * Gets a list of Contact&#39;s Tasks
     * 
     * @param id A Contact&#39;s ID (required)
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
     * Gets a list of Contact&#39;s Tasks
     * 
     * @param id A Contact&#39;s ID (required)
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
     * Gets a list of Contact&#39;s Tasks (asynchronously)
     * 
     * @param id A Contact&#39;s ID (required)
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
        String localVarPath = "/Contacts/{id}/Addresses".replaceAll("\\{format\\}","json")
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
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
     * @param apiAddress The Address to update (just include the JSON object as the request body) (required)
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
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
     * @param apiAddress The Address to update (just include the JSON object as the request body) (required)
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
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
     * @param apiAddress The Address to update (just include the JSON object as the request body) (required)
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
    /* Build call for updateContact */
    private com.squareup.okhttp.Call updateContactCall(APIContact apiContact, Boolean brief, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = apiContact;
        
        // verify the required parameter 'apiContact' is set
        if (apiContact == null) {
            throw new ApiException("Missing the required parameter 'apiContact' when calling updateContact(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Contacts".replaceAll("\\{format\\}","json");

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
     * Updates a Contact
     * If you have trouble updating a contact, try accessing the contact via the GET request to inspect its fields and sub-elements. A common source of            problems with write/update requests occurs when users either omit required fields, or insert invalid data into a field (for example, by referring a            CATEGORY_ID or LINK_ID which does not exist.
     * @param apiContact A Contact, just include the JSON object as the request body (required)
     * @param brief Optional, true if you wish to do a partial update containing only top level properties of the Contact. When true, all sub-collections are ignored. (optional, default to false)
     * @return Contact
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Contact updateContact(APIContact apiContact, Boolean brief) throws ApiException {
        ApiResponse<Contact> resp = updateContactWithHttpInfo(apiContact, brief);
        return resp.getData();
    }

    /**
     * Updates a Contact
     * If you have trouble updating a contact, try accessing the contact via the GET request to inspect its fields and sub-elements. A common source of            problems with write/update requests occurs when users either omit required fields, or insert invalid data into a field (for example, by referring a            CATEGORY_ID or LINK_ID which does not exist.
     * @param apiContact A Contact, just include the JSON object as the request body (required)
     * @param brief Optional, true if you wish to do a partial update containing only top level properties of the Contact. When true, all sub-collections are ignored. (optional, default to false)
     * @return ApiResponse&lt;Contact&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Contact> updateContactWithHttpInfo(APIContact apiContact, Boolean brief) throws ApiException {
        com.squareup.okhttp.Call call = updateContactCall(apiContact, brief, null, null);
        Type localVarReturnType = new TypeToken<Contact>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Updates a Contact (asynchronously)
     * If you have trouble updating a contact, try accessing the contact via the GET request to inspect its fields and sub-elements. A common source of            problems with write/update requests occurs when users either omit required fields, or insert invalid data into a field (for example, by referring a            CATEGORY_ID or LINK_ID which does not exist.
     * @param apiContact A Contact, just include the JSON object as the request body (required)
     * @param brief Optional, true if you wish to do a partial update containing only top level properties of the Contact. When true, all sub-collections are ignored. (optional, default to false)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateContactAsync(APIContact apiContact, Boolean brief, final ApiCallback<Contact> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateContactCall(apiContact, brief, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Contact>(){}.getType();
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
        String localVarPath = "/Contacts/{id}/ContactInfos".replaceAll("\\{format\\}","json")
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
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
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
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
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
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
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
    /* Build call for updateContactLink */
    private com.squareup.okhttp.Call updateContactLinkCall(Long id, APIContactLink apiLink, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = apiLink;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateContactLink(Async)");
        }
        
        // verify the required parameter 'apiLink' is set
        if (apiLink == null) {
            throw new ApiException("Missing the required parameter 'apiLink' when calling updateContactLink(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Contacts/{id}/ContactLinks".replaceAll("\\{format\\}","json")
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
     * Updates a Contact Link
     * 
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
     * @param apiLink The Contact Link to add (just include the JSON object as request body) (required)
     * @return ContactLink
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ContactLink updateContactLink(Long id, APIContactLink apiLink) throws ApiException {
        ApiResponse<ContactLink> resp = updateContactLinkWithHttpInfo(id, apiLink);
        return resp.getData();
    }

    /**
     * Updates a Contact Link
     * 
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
     * @param apiLink The Contact Link to add (just include the JSON object as request body) (required)
     * @return ApiResponse&lt;ContactLink&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ContactLink> updateContactLinkWithHttpInfo(Long id, APIContactLink apiLink) throws ApiException {
        com.squareup.okhttp.Call call = updateContactLinkCall(id, apiLink, null, null);
        Type localVarReturnType = new TypeToken<ContactLink>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Updates a Contact Link (asynchronously)
     * 
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
     * @param apiLink The Contact Link to add (just include the JSON object as request body) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateContactLinkAsync(Long id, APIContactLink apiLink, final ApiCallback<ContactLink> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateContactLinkCall(id, apiLink, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ContactLink>(){}.getType();
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
        String localVarPath = "/Contacts/{id}/CustomFields".replaceAll("\\{format\\}","json")
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
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
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
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
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
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
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
    /* Build call for updateDate */
    private com.squareup.okhttp.Call updateDateCall(Long id, APIContactDate apiContactDate, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = apiContactDate;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateDate(Async)");
        }
        
        // verify the required parameter 'apiContactDate' is set
        if (apiContactDate == null) {
            throw new ApiException("Missing the required parameter 'apiContactDate' when calling updateDate(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Contacts/{id}/Dates".replaceAll("\\{format\\}","json")
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
     * Updates a Contact Date
     * 
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
     * @param apiContactDate The Contact Date to add (just include the JSON object as request body) (required)
     * @return ContactDate
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ContactDate updateDate(Long id, APIContactDate apiContactDate) throws ApiException {
        ApiResponse<ContactDate> resp = updateDateWithHttpInfo(id, apiContactDate);
        return resp.getData();
    }

    /**
     * Updates a Contact Date
     * 
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
     * @param apiContactDate The Contact Date to add (just include the JSON object as request body) (required)
     * @return ApiResponse&lt;ContactDate&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ContactDate> updateDateWithHttpInfo(Long id, APIContactDate apiContactDate) throws ApiException {
        com.squareup.okhttp.Call call = updateDateCall(id, apiContactDate, null, null);
        Type localVarReturnType = new TypeToken<ContactDate>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Updates a Contact Date (asynchronously)
     * 
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
     * @param apiContactDate The Contact Date to add (just include the JSON object as request body) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateDateAsync(Long id, APIContactDate apiContactDate, final ApiCallback<ContactDate> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateDateCall(id, apiContactDate, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ContactDate>(){}.getType();
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
        String localVarPath = "/Contacts/{id}/Image/{filename}".replaceAll("\\{format\\}","json")
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
     * Updates a Contact&#39;s Image
     * This action will replace any existing Image attached to the Contact. The contents of the image data should be sent as binary data in the request payload. See our &lt;a href&#x3D;\&quot;http://github.com/Insightly\&quot; target&#x3D;\&quot;_blank\&quot;&gt;client libraries&lt;/a&gt; for an example of how this is done.
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
     * @param filename Name of Image File to be attached to Contact (required)
     * @param file File to upload (required)
     * @return Contact
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Contact updateImage(Long id, String filename, byte[] file) throws ApiException {
        ApiResponse<Contact> resp = updateImageWithHttpInfo(id, filename, file);
        return resp.getData();
    }

    /**
     * Updates a Contact&#39;s Image
     * This action will replace any existing Image attached to the Contact. The contents of the image data should be sent as binary data in the request payload. See our &lt;a href&#x3D;\&quot;http://github.com/Insightly\&quot; target&#x3D;\&quot;_blank\&quot;&gt;client libraries&lt;/a&gt; for an example of how this is done.
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
     * @param filename Name of Image File to be attached to Contact (required)
     * @param file File to upload (required)
     * @return ApiResponse&lt;Contact&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Contact> updateImageWithHttpInfo(Long id, String filename, byte[] file) throws ApiException {
        com.squareup.okhttp.Call call = updateImageCall(id, filename, file, null, null);
        Type localVarReturnType = new TypeToken<Contact>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Updates a Contact&#39;s Image (asynchronously)
     * This action will replace any existing Image attached to the Contact. The contents of the image data should be sent as binary data in the request payload. See our &lt;a href&#x3D;\&quot;http://github.com/Insightly\&quot; target&#x3D;\&quot;_blank\&quot;&gt;client libraries&lt;/a&gt; for an example of how this is done.
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
     * @param filename Name of Image File to be attached to Contact (required)
     * @param file File to upload (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateImageAsync(Long id, String filename, byte[] file, final ApiCallback<Contact> callback) throws ApiException {

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
        Type localVarReturnType = new TypeToken<Contact>(){}.getType();
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
        String localVarPath = "/Contacts/{id}/Links".replaceAll("\\{format\\}","json")
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
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
     * @param apiLink The Link to add (just include JSON object as request body) (required)
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
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
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
     * Updates a Link (asynchronously)
     * 
     * @param id A Contact&#39;s ID (CONTACT_ID) (required)
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
}
