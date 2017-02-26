

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

import ly.insight.model.APITeamMember;
import ly.insight.model.TeamMember;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TeamMembersApi {
    private ApiClient apiClient;

    public TeamMembersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TeamMembersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for addTeamMember */
    private com.squareup.okhttp.Call addTeamMemberCall(APITeamMember apiTeamMember, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = apiTeamMember;
        
        // verify the required parameter 'apiTeamMember' is set
        if (apiTeamMember == null) {
            throw new ApiException("Missing the required parameter 'apiTeamMember' when calling addTeamMember(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/TeamMembers".replaceAll("\\{format\\}","json");

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
     * Adds a new Team Member
     * Note: Team Members of Anonymous Teams can only be created via the /Teams endpoint.
     * @param apiTeamMember The Team Member to add (just include JSON object as request body) (required)
     * @return TeamMember
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TeamMember addTeamMember(APITeamMember apiTeamMember) throws ApiException {
        ApiResponse<TeamMember> resp = addTeamMemberWithHttpInfo(apiTeamMember);
        return resp.getData();
    }

    /**
     * Adds a new Team Member
     * Note: Team Members of Anonymous Teams can only be created via the /Teams endpoint.
     * @param apiTeamMember The Team Member to add (just include JSON object as request body) (required)
     * @return ApiResponse&lt;TeamMember&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TeamMember> addTeamMemberWithHttpInfo(APITeamMember apiTeamMember) throws ApiException {
        com.squareup.okhttp.Call call = addTeamMemberCall(apiTeamMember, null, null);
        Type localVarReturnType = new TypeToken<TeamMember>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Adds a new Team Member (asynchronously)
     * Note: Team Members of Anonymous Teams can only be created via the /Teams endpoint.
     * @param apiTeamMember The Team Member to add (just include JSON object as request body) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addTeamMemberAsync(APITeamMember apiTeamMember, final ApiCallback<TeamMember> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addTeamMemberCall(apiTeamMember, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TeamMember>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for deleteTeamMember */
    private com.squareup.okhttp.Call deleteTeamMemberCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteTeamMember(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/TeamMembers/{id}".replaceAll("\\{format\\}","json")
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
     * Deletes a Team Member
     * Note: Team Members of Anonymous Teams can only be deleted via the /Teams endpoint.
     * @param id A Team Member&#39;s ID (PERMISSION_ID) (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteTeamMember(Long id) throws ApiException {
        deleteTeamMemberWithHttpInfo(id);
    }

    /**
     * Deletes a Team Member
     * Note: Team Members of Anonymous Teams can only be deleted via the /Teams endpoint.
     * @param id A Team Member&#39;s ID (PERMISSION_ID) (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteTeamMemberWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = deleteTeamMemberCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes a Team Member (asynchronously)
     * Note: Team Members of Anonymous Teams can only be deleted via the /Teams endpoint.
     * @param id A Team Member&#39;s ID (PERMISSION_ID) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteTeamMemberAsync(Long id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteTeamMemberCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for getTeamMember */
    private com.squareup.okhttp.Call getTeamMemberCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getTeamMember(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/TeamMembers/{id}".replaceAll("\\{format\\}","json")
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
     * Gets a Team Member
     * 
     * @param id A Team Member&#39;s ID (PERMISSION_ID) (required)
     * @return TeamMember
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TeamMember getTeamMember(Long id) throws ApiException {
        ApiResponse<TeamMember> resp = getTeamMemberWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Gets a Team Member
     * 
     * @param id A Team Member&#39;s ID (PERMISSION_ID) (required)
     * @return ApiResponse&lt;TeamMember&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TeamMember> getTeamMemberWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = getTeamMemberCall(id, null, null);
        Type localVarReturnType = new TypeToken<TeamMember>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a Team Member (asynchronously)
     * 
     * @param id A Team Member&#39;s ID (PERMISSION_ID) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTeamMemberAsync(Long id, final ApiCallback<TeamMember> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTeamMemberCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TeamMember>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getTeamMembers */
    private com.squareup.okhttp.Call getTeamMembersCall(Integer skip, Integer top, Boolean countTotal, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/TeamMembers".replaceAll("\\{format\\}","json");

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
     * Gets a list of Team Members
     * 
     * @param skip Optional, number of team members to skip. (optional)
     * @param top Optional, maximum number of team members to return in the response. (optional)
     * @param countTotal Optional, true if total number of records should be returned in the response headers. (optional, default to false)
     * @return List&lt;TeamMember&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<TeamMember> getTeamMembers(Integer skip, Integer top, Boolean countTotal) throws ApiException {
        ApiResponse<List<TeamMember>> resp = getTeamMembersWithHttpInfo(skip, top, countTotal);
        return resp.getData();
    }

    /**
     * Gets a list of Team Members
     * 
     * @param skip Optional, number of team members to skip. (optional)
     * @param top Optional, maximum number of team members to return in the response. (optional)
     * @param countTotal Optional, true if total number of records should be returned in the response headers. (optional, default to false)
     * @return ApiResponse&lt;List&lt;TeamMember&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<TeamMember>> getTeamMembersWithHttpInfo(Integer skip, Integer top, Boolean countTotal) throws ApiException {
        com.squareup.okhttp.Call call = getTeamMembersCall(skip, top, countTotal, null, null);
        Type localVarReturnType = new TypeToken<List<TeamMember>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a list of Team Members (asynchronously)
     * 
     * @param skip Optional, number of team members to skip. (optional)
     * @param top Optional, maximum number of team members to return in the response. (optional)
     * @param countTotal Optional, true if total number of records should be returned in the response headers. (optional, default to false)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTeamMembersAsync(Integer skip, Integer top, Boolean countTotal, final ApiCallback<List<TeamMember>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTeamMembersCall(skip, top, countTotal, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<TeamMember>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
