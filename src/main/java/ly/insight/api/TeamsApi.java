

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

import ly.insight.model.APITeam;
import ly.insight.model.APITeamMember;
import java.util.Date;
import ly.insight.model.Team;
import ly.insight.model.TeamMember;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TeamsApi {
    private ApiClient apiClient;

    public TeamsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TeamsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for addTeam */
    private com.squareup.okhttp.Call addTeamCall(APITeam apiTeam, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = apiTeam;
        
        // verify the required parameter 'apiTeam' is set
        if (apiTeam == null) {
            throw new ApiException("Missing the required parameter 'apiTeam' when calling addTeam(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Teams".replaceAll("\\{format\\}","json");

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
     * Adds a Team
     * TEAM_NAME is required when creating a Team with ANONYMOUS_TEAM set to \&quot;false\&quot;. When creating Anonymous Teams, e.g. ANONYMOUS_TEAM&#x3D;true, you must include all the Team Members that should be part of the team. A minimum of one Team Member is required.             For more details, please refer to GET /Teams above.
     * @param apiTeam The Team to add (just include JSON object as request body) (required)
     * @return Team
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Team addTeam(APITeam apiTeam) throws ApiException {
        ApiResponse<Team> resp = addTeamWithHttpInfo(apiTeam);
        return resp.getData();
    }

    /**
     * Adds a Team
     * TEAM_NAME is required when creating a Team with ANONYMOUS_TEAM set to \&quot;false\&quot;. When creating Anonymous Teams, e.g. ANONYMOUS_TEAM&#x3D;true, you must include all the Team Members that should be part of the team. A minimum of one Team Member is required.             For more details, please refer to GET /Teams above.
     * @param apiTeam The Team to add (just include JSON object as request body) (required)
     * @return ApiResponse&lt;Team&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Team> addTeamWithHttpInfo(APITeam apiTeam) throws ApiException {
        com.squareup.okhttp.Call call = addTeamCall(apiTeam, null, null);
        Type localVarReturnType = new TypeToken<Team>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Adds a Team (asynchronously)
     * TEAM_NAME is required when creating a Team with ANONYMOUS_TEAM set to \&quot;false\&quot;. When creating Anonymous Teams, e.g. ANONYMOUS_TEAM&#x3D;true, you must include all the Team Members that should be part of the team. A minimum of one Team Member is required.             For more details, please refer to GET /Teams above.
     * @param apiTeam The Team to add (just include JSON object as request body) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addTeamAsync(APITeam apiTeam, final ApiCallback<Team> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addTeamCall(apiTeam, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Team>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for addTeamMember */
    private com.squareup.okhttp.Call addTeamMemberCall(Long id, APITeamMember apiTeamMember, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = apiTeamMember;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling addTeamMember(Async)");
        }
        
        // verify the required parameter 'apiTeamMember' is set
        if (apiTeamMember == null) {
            throw new ApiException("Missing the required parameter 'apiTeamMember' when calling addTeamMember(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Teams/{id}/TeamMembers".replaceAll("\\{format\\}","json")
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
     * Adds a Team Member
     * 
     * @param id A Team&#39;s ID (TEAM_ID) (required)
     * @param apiTeamMember The Team Member to add (just include JSON object as request body) (required)
     * @return TeamMember
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TeamMember addTeamMember(Long id, APITeamMember apiTeamMember) throws ApiException {
        ApiResponse<TeamMember> resp = addTeamMemberWithHttpInfo(id, apiTeamMember);
        return resp.getData();
    }

    /**
     * Adds a Team Member
     * 
     * @param id A Team&#39;s ID (TEAM_ID) (required)
     * @param apiTeamMember The Team Member to add (just include JSON object as request body) (required)
     * @return ApiResponse&lt;TeamMember&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TeamMember> addTeamMemberWithHttpInfo(Long id, APITeamMember apiTeamMember) throws ApiException {
        com.squareup.okhttp.Call call = addTeamMemberCall(id, apiTeamMember, null, null);
        Type localVarReturnType = new TypeToken<TeamMember>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Adds a Team Member (asynchronously)
     * 
     * @param id A Team&#39;s ID (TEAM_ID) (required)
     * @param apiTeamMember The Team Member to add (just include JSON object as request body) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addTeamMemberAsync(Long id, APITeamMember apiTeamMember, final ApiCallback<TeamMember> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addTeamMemberCall(id, apiTeamMember, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TeamMember>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for deleteTeam */
    private com.squareup.okhttp.Call deleteTeamCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteTeam(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Teams/{id}".replaceAll("\\{format\\}","json")
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
     * Deletes a Team
     * 
     * @param id A Team&#39;s ID (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteTeam(Long id) throws ApiException {
        deleteTeamWithHttpInfo(id);
    }

    /**
     * Deletes a Team
     * 
     * @param id A Team&#39;s ID (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteTeamWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = deleteTeamCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes a Team (asynchronously)
     * 
     * @param id A Team&#39;s ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteTeamAsync(Long id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteTeamCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for deleteTeamMember */
    private com.squareup.okhttp.Call deleteTeamMemberCall(Long id, Long permissionId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteTeamMember(Async)");
        }
        
        // verify the required parameter 'permissionId' is set
        if (permissionId == null) {
            throw new ApiException("Missing the required parameter 'permissionId' when calling deleteTeamMember(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Teams/{id}/TeamMembers/{permissionId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
        .replaceAll("\\{" + "permissionId" + "\\}", apiClient.escapeString(permissionId.toString()));

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
     * 
     * @param id A Team&#39;s ID (TEAM_ID) (required)
     * @param permissionId A Team Members&#39;s ID (PERMISSION_ID) (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteTeamMember(Long id, Long permissionId) throws ApiException {
        deleteTeamMemberWithHttpInfo(id, permissionId);
    }

    /**
     * Deletes a Team Member
     * 
     * @param id A Team&#39;s ID (TEAM_ID) (required)
     * @param permissionId A Team Members&#39;s ID (PERMISSION_ID) (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteTeamMemberWithHttpInfo(Long id, Long permissionId) throws ApiException {
        com.squareup.okhttp.Call call = deleteTeamMemberCall(id, permissionId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes a Team Member (asynchronously)
     * 
     * @param id A Team&#39;s ID (TEAM_ID) (required)
     * @param permissionId A Team Members&#39;s ID (PERMISSION_ID) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteTeamMemberAsync(Long id, Long permissionId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteTeamMemberCall(id, permissionId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for getTeam */
    private com.squareup.okhttp.Call getTeamCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getTeam(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Teams/{id}".replaceAll("\\{format\\}","json")
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
     * Gets a Team
     * 
     * @param id A Team&#39;s ID (required)
     * @return Team
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Team getTeam(Long id) throws ApiException {
        ApiResponse<Team> resp = getTeamWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Gets a Team
     * 
     * @param id A Team&#39;s ID (required)
     * @return ApiResponse&lt;Team&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Team> getTeamWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = getTeamCall(id, null, null);
        Type localVarReturnType = new TypeToken<Team>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a Team (asynchronously)
     * 
     * @param id A Team&#39;s ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTeamAsync(Long id, final ApiCallback<Team> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTeamCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Team>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getTeams */
    private com.squareup.okhttp.Call getTeamsCall(Boolean brief, Integer skip, Integer top, Boolean countTotal, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/Teams".replaceAll("\\{format\\}","json");

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
     * Gets a list of Teams.
     * Simple object graphs (excluding TEAMMEMBERS) are returned if \&quot;brief&#x3D;true\&quot; is used in the query string.            &lt;br /&gt; The API responses may contain two types of Teams: a) regular Teams configured via System Settings and b) so called Anonymous Teams which are created by the system when you set a record permission visible to Individuals.            You can differentiate these two types on Teams by the ANONYMOUS_TEAM property. Anonymous Teams are a bit more restricted when it comes to modifying them via the API, they can only be created/updated/deleted via the root /Teams endpoint.
     * @param brief Optional, true if response should only contain top level properties of the team. (optional, default to false)
     * @param skip Optional, number of teams to skip. (optional)
     * @param top Optional, maximum number of teams to return in the response. (optional)
     * @param countTotal Optional, true if total number of records should be returned in the response headers. (optional, default to false)
     * @return List&lt;Team&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Team> getTeams(Boolean brief, Integer skip, Integer top, Boolean countTotal) throws ApiException {
        ApiResponse<List<Team>> resp = getTeamsWithHttpInfo(brief, skip, top, countTotal);
        return resp.getData();
    }

    /**
     * Gets a list of Teams.
     * Simple object graphs (excluding TEAMMEMBERS) are returned if \&quot;brief&#x3D;true\&quot; is used in the query string.            &lt;br /&gt; The API responses may contain two types of Teams: a) regular Teams configured via System Settings and b) so called Anonymous Teams which are created by the system when you set a record permission visible to Individuals.            You can differentiate these two types on Teams by the ANONYMOUS_TEAM property. Anonymous Teams are a bit more restricted when it comes to modifying them via the API, they can only be created/updated/deleted via the root /Teams endpoint.
     * @param brief Optional, true if response should only contain top level properties of the team. (optional, default to false)
     * @param skip Optional, number of teams to skip. (optional)
     * @param top Optional, maximum number of teams to return in the response. (optional)
     * @param countTotal Optional, true if total number of records should be returned in the response headers. (optional, default to false)
     * @return ApiResponse&lt;List&lt;Team&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Team>> getTeamsWithHttpInfo(Boolean brief, Integer skip, Integer top, Boolean countTotal) throws ApiException {
        com.squareup.okhttp.Call call = getTeamsCall(brief, skip, top, countTotal, null, null);
        Type localVarReturnType = new TypeToken<List<Team>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a list of Teams. (asynchronously)
     * Simple object graphs (excluding TEAMMEMBERS) are returned if \&quot;brief&#x3D;true\&quot; is used in the query string.            &lt;br /&gt; The API responses may contain two types of Teams: a) regular Teams configured via System Settings and b) so called Anonymous Teams which are created by the system when you set a record permission visible to Individuals.            You can differentiate these two types on Teams by the ANONYMOUS_TEAM property. Anonymous Teams are a bit more restricted when it comes to modifying them via the API, they can only be created/updated/deleted via the root /Teams endpoint.
     * @param brief Optional, true if response should only contain top level properties of the team. (optional, default to false)
     * @param skip Optional, number of teams to skip. (optional)
     * @param top Optional, maximum number of teams to return in the response. (optional)
     * @param countTotal Optional, true if total number of records should be returned in the response headers. (optional, default to false)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTeamsAsync(Boolean brief, Integer skip, Integer top, Boolean countTotal, final ApiCallback<List<Team>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTeamsCall(brief, skip, top, countTotal, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Team>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getTeamsBySearch */
    private com.squareup.okhttp.Call getTeamsBySearchCall(String teamName, Date updatedAfterUtc, Boolean brief, Integer skip, Integer top, Boolean countTotal, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/Teams/Search".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (teamName != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "team_name", teamName));
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
     * Gets a filtered list of Teams.
     * Only one optional parameter (excluding brief, top, skip and count_total) can be specified. Simple object graphs (excluding TEAMMEMBERS) are returned if \&quot;brief&#x3D;true\&quot; is used in the query string.             &lt;br /&gt; The API responses may contain two types of Teams: a) regular Teams configured via System Settings and b) so called Anonymous Teams which are created by the system when you set a record permission visible to Individuals.            You can differentiate these two types on Teams by the ANONYMOUS_TEAM property. Anonymous Teams are a bit more restricted when it comes to modifying them via the API, they can only be created/updated/deleted via the /Teams endpoint.
     * @param teamName Optional, name of the team. (optional)
     * @param updatedAfterUtc Optional, earliest date when team was last updated. (optional)
     * @param brief Optional, true if response should only contain top level properties of the team. (optional, default to false)
     * @param skip Optional, number of teams to skip. (optional)
     * @param top Optional, maximum number of teams to return in the response. (optional)
     * @param countTotal Optional, true if total number of records should be returned in the response headers. (optional, default to false)
     * @return List&lt;Team&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Team> getTeamsBySearch(String teamName, Date updatedAfterUtc, Boolean brief, Integer skip, Integer top, Boolean countTotal) throws ApiException {
        ApiResponse<List<Team>> resp = getTeamsBySearchWithHttpInfo(teamName, updatedAfterUtc, brief, skip, top, countTotal);
        return resp.getData();
    }

    /**
     * Gets a filtered list of Teams.
     * Only one optional parameter (excluding brief, top, skip and count_total) can be specified. Simple object graphs (excluding TEAMMEMBERS) are returned if \&quot;brief&#x3D;true\&quot; is used in the query string.             &lt;br /&gt; The API responses may contain two types of Teams: a) regular Teams configured via System Settings and b) so called Anonymous Teams which are created by the system when you set a record permission visible to Individuals.            You can differentiate these two types on Teams by the ANONYMOUS_TEAM property. Anonymous Teams are a bit more restricted when it comes to modifying them via the API, they can only be created/updated/deleted via the /Teams endpoint.
     * @param teamName Optional, name of the team. (optional)
     * @param updatedAfterUtc Optional, earliest date when team was last updated. (optional)
     * @param brief Optional, true if response should only contain top level properties of the team. (optional, default to false)
     * @param skip Optional, number of teams to skip. (optional)
     * @param top Optional, maximum number of teams to return in the response. (optional)
     * @param countTotal Optional, true if total number of records should be returned in the response headers. (optional, default to false)
     * @return ApiResponse&lt;List&lt;Team&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Team>> getTeamsBySearchWithHttpInfo(String teamName, Date updatedAfterUtc, Boolean brief, Integer skip, Integer top, Boolean countTotal) throws ApiException {
        com.squareup.okhttp.Call call = getTeamsBySearchCall(teamName, updatedAfterUtc, brief, skip, top, countTotal, null, null);
        Type localVarReturnType = new TypeToken<List<Team>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a filtered list of Teams. (asynchronously)
     * Only one optional parameter (excluding brief, top, skip and count_total) can be specified. Simple object graphs (excluding TEAMMEMBERS) are returned if \&quot;brief&#x3D;true\&quot; is used in the query string.             &lt;br /&gt; The API responses may contain two types of Teams: a) regular Teams configured via System Settings and b) so called Anonymous Teams which are created by the system when you set a record permission visible to Individuals.            You can differentiate these two types on Teams by the ANONYMOUS_TEAM property. Anonymous Teams are a bit more restricted when it comes to modifying them via the API, they can only be created/updated/deleted via the /Teams endpoint.
     * @param teamName Optional, name of the team. (optional)
     * @param updatedAfterUtc Optional, earliest date when team was last updated. (optional)
     * @param brief Optional, true if response should only contain top level properties of the team. (optional, default to false)
     * @param skip Optional, number of teams to skip. (optional)
     * @param top Optional, maximum number of teams to return in the response. (optional)
     * @param countTotal Optional, true if total number of records should be returned in the response headers. (optional, default to false)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTeamsBySearchAsync(String teamName, Date updatedAfterUtc, Boolean brief, Integer skip, Integer top, Boolean countTotal, final ApiCallback<List<Team>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTeamsBySearchCall(teamName, updatedAfterUtc, brief, skip, top, countTotal, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Team>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updateTeam */
    private com.squareup.okhttp.Call updateTeamCall(APITeam apiTeam, Boolean brief, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = apiTeam;
        
        // verify the required parameter 'apiTeam' is set
        if (apiTeam == null) {
            throw new ApiException("Missing the required parameter 'apiTeam' when calling updateTeam(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Teams".replaceAll("\\{format\\}","json");

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
     * Updates a Team
     * When updating Anonymous Teams, the brief parameter has no effect and you must include all the Team Members that should be part of the team. A minimum of one Team Member is required.  For more details, please refer to GET /Teams above.
     * @param apiTeam The Team to update (just include JSON object as request body) (required)
     * @param brief Optional, true if you wish to do a partial update containing only top level properties of the Team. When true, all sub-collections are ignored. (optional, default to false)
     * @return Team
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Team updateTeam(APITeam apiTeam, Boolean brief) throws ApiException {
        ApiResponse<Team> resp = updateTeamWithHttpInfo(apiTeam, brief);
        return resp.getData();
    }

    /**
     * Updates a Team
     * When updating Anonymous Teams, the brief parameter has no effect and you must include all the Team Members that should be part of the team. A minimum of one Team Member is required.  For more details, please refer to GET /Teams above.
     * @param apiTeam The Team to update (just include JSON object as request body) (required)
     * @param brief Optional, true if you wish to do a partial update containing only top level properties of the Team. When true, all sub-collections are ignored. (optional, default to false)
     * @return ApiResponse&lt;Team&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Team> updateTeamWithHttpInfo(APITeam apiTeam, Boolean brief) throws ApiException {
        com.squareup.okhttp.Call call = updateTeamCall(apiTeam, brief, null, null);
        Type localVarReturnType = new TypeToken<Team>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Updates a Team (asynchronously)
     * When updating Anonymous Teams, the brief parameter has no effect and you must include all the Team Members that should be part of the team. A minimum of one Team Member is required.  For more details, please refer to GET /Teams above.
     * @param apiTeam The Team to update (just include JSON object as request body) (required)
     * @param brief Optional, true if you wish to do a partial update containing only top level properties of the Team. When true, all sub-collections are ignored. (optional, default to false)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateTeamAsync(APITeam apiTeam, Boolean brief, final ApiCallback<Team> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateTeamCall(apiTeam, brief, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Team>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
