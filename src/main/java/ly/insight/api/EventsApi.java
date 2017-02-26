

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

import ly.insight.model.APICalendarEvent;
import ly.insight.model.APIEventLink;
import ly.insight.model.CalendarEvent;
import java.util.Date;
import ly.insight.model.EventLink;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventsApi {
    private ApiClient apiClient;

    public EventsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EventsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for addEvent */
    private com.squareup.okhttp.Call addEventCall(APICalendarEvent apiEvent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = apiEvent;
        
        // verify the required parameter 'apiEvent' is set
        if (apiEvent == null) {
            throw new ApiException("Missing the required parameter 'apiEvent' when calling addEvent(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Events".replaceAll("\\{format\\}","json");

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
     * Adds a Calendar Event
     * 
     * @param apiEvent The Event to add (just include JSON object as request body) (required)
     * @return CalendarEvent
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CalendarEvent addEvent(APICalendarEvent apiEvent) throws ApiException {
        ApiResponse<CalendarEvent> resp = addEventWithHttpInfo(apiEvent);
        return resp.getData();
    }

    /**
     * Adds a Calendar Event
     * 
     * @param apiEvent The Event to add (just include JSON object as request body) (required)
     * @return ApiResponse&lt;CalendarEvent&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CalendarEvent> addEventWithHttpInfo(APICalendarEvent apiEvent) throws ApiException {
        com.squareup.okhttp.Call call = addEventCall(apiEvent, null, null);
        Type localVarReturnType = new TypeToken<CalendarEvent>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Adds a Calendar Event (asynchronously)
     * 
     * @param apiEvent The Event to add (just include JSON object as request body) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addEventAsync(APICalendarEvent apiEvent, final ApiCallback<CalendarEvent> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addEventCall(apiEvent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CalendarEvent>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for addEventLink */
    private com.squareup.okhttp.Call addEventLinkCall(Long id, APIEventLink apiLink, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = apiLink;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling addEventLink(Async)");
        }
        
        // verify the required parameter 'apiLink' is set
        if (apiLink == null) {
            throw new ApiException("Missing the required parameter 'apiLink' when calling addEventLink(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Events/{id}/EventLinks".replaceAll("\\{format\\}","json")
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
     * Adds an Event Link
     * 
     * @param id An Event&#39;s ID (EVENT_ID) (required)
     * @param apiLink The Event Link to add (just include JSON object as request body) (required)
     * @return EventLink
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EventLink addEventLink(Long id, APIEventLink apiLink) throws ApiException {
        ApiResponse<EventLink> resp = addEventLinkWithHttpInfo(id, apiLink);
        return resp.getData();
    }

    /**
     * Adds an Event Link
     * 
     * @param id An Event&#39;s ID (EVENT_ID) (required)
     * @param apiLink The Event Link to add (just include JSON object as request body) (required)
     * @return ApiResponse&lt;EventLink&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EventLink> addEventLinkWithHttpInfo(Long id, APIEventLink apiLink) throws ApiException {
        com.squareup.okhttp.Call call = addEventLinkCall(id, apiLink, null, null);
        Type localVarReturnType = new TypeToken<EventLink>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Adds an Event Link (asynchronously)
     * 
     * @param id An Event&#39;s ID (EVENT_ID) (required)
     * @param apiLink The Event Link to add (just include JSON object as request body) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addEventLinkAsync(Long id, APIEventLink apiLink, final ApiCallback<EventLink> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addEventLinkCall(id, apiLink, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EventLink>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for deleteEvent */
    private com.squareup.okhttp.Call deleteEventCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteEvent(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Events/{id}".replaceAll("\\{format\\}","json")
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
     * Deletes a Calendar Event
     * 
     * @param id An Event&#39;s ID (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteEvent(Long id) throws ApiException {
        deleteEventWithHttpInfo(id);
    }

    /**
     * Deletes a Calendar Event
     * 
     * @param id An Event&#39;s ID (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteEventWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = deleteEventCall(id, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes a Calendar Event (asynchronously)
     * 
     * @param id An Event&#39;s ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteEventAsync(Long id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteEventCall(id, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for deleteEventLink */
    private com.squareup.okhttp.Call deleteEventLinkCall(Long id, Long linkId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling deleteEventLink(Async)");
        }
        
        // verify the required parameter 'linkId' is set
        if (linkId == null) {
            throw new ApiException("Missing the required parameter 'linkId' when calling deleteEventLink(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Events/{id}/EventLinks/{linkId}".replaceAll("\\{format\\}","json")
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
     * Deletes an Event Link
     * 
     * @param id An Event&#39;s ID (EVENT_ID) (required)
     * @param linkId A EVENT Link&#39;s ID (EVENT_LINK_ID) (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteEventLink(Long id, Long linkId) throws ApiException {
        deleteEventLinkWithHttpInfo(id, linkId);
    }

    /**
     * Deletes an Event Link
     * 
     * @param id An Event&#39;s ID (EVENT_ID) (required)
     * @param linkId A EVENT Link&#39;s ID (EVENT_LINK_ID) (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteEventLinkWithHttpInfo(Long id, Long linkId) throws ApiException {
        com.squareup.okhttp.Call call = deleteEventLinkCall(id, linkId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Deletes an Event Link (asynchronously)
     * 
     * @param id An Event&#39;s ID (EVENT_ID) (required)
     * @param linkId A EVENT Link&#39;s ID (EVENT_LINK_ID) (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteEventLinkAsync(Long id, Long linkId, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteEventLinkCall(id, linkId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for getEvent */
    private com.squareup.okhttp.Call getEventCall(Long id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getEvent(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Events/{id}".replaceAll("\\{format\\}","json")
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
     * Gets a Calendar Event
     * 
     * @param id An Event&#39;s ID (required)
     * @return CalendarEvent
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CalendarEvent getEvent(Long id) throws ApiException {
        ApiResponse<CalendarEvent> resp = getEventWithHttpInfo(id);
        return resp.getData();
    }

    /**
     * Gets a Calendar Event
     * 
     * @param id An Event&#39;s ID (required)
     * @return ApiResponse&lt;CalendarEvent&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CalendarEvent> getEventWithHttpInfo(Long id) throws ApiException {
        com.squareup.okhttp.Call call = getEventCall(id, null, null);
        Type localVarReturnType = new TypeToken<CalendarEvent>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a Calendar Event (asynchronously)
     * 
     * @param id An Event&#39;s ID (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEventAsync(Long id, final ApiCallback<CalendarEvent> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getEventCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CalendarEvent>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getEvents */
    private com.squareup.okhttp.Call getEventsCall(Boolean brief, Integer skip, Integer top, Boolean countTotal, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/Events".replaceAll("\\{format\\}","json");

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
     * Gets a list of Calendar Events.
     * Simple object graphs (excluding EVENTLINKS) are returned if \&quot;brief&#x3D;true\&quot; is used in the query string.
     * @param brief Optional, true if response should only contain top level properties of the event. (optional, default to false)
     * @param skip Optional, number of events to skip. (optional)
     * @param top Optional, maximum number of events to return in the response. (optional)
     * @param countTotal Optional, true if total number of records should be returned in the response headers. (optional, default to false)
     * @return List&lt;CalendarEvent&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<CalendarEvent> getEvents(Boolean brief, Integer skip, Integer top, Boolean countTotal) throws ApiException {
        ApiResponse<List<CalendarEvent>> resp = getEventsWithHttpInfo(brief, skip, top, countTotal);
        return resp.getData();
    }

    /**
     * Gets a list of Calendar Events.
     * Simple object graphs (excluding EVENTLINKS) are returned if \&quot;brief&#x3D;true\&quot; is used in the query string.
     * @param brief Optional, true if response should only contain top level properties of the event. (optional, default to false)
     * @param skip Optional, number of events to skip. (optional)
     * @param top Optional, maximum number of events to return in the response. (optional)
     * @param countTotal Optional, true if total number of records should be returned in the response headers. (optional, default to false)
     * @return ApiResponse&lt;List&lt;CalendarEvent&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<CalendarEvent>> getEventsWithHttpInfo(Boolean brief, Integer skip, Integer top, Boolean countTotal) throws ApiException {
        com.squareup.okhttp.Call call = getEventsCall(brief, skip, top, countTotal, null, null);
        Type localVarReturnType = new TypeToken<List<CalendarEvent>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a list of Calendar Events. (asynchronously)
     * Simple object graphs (excluding EVENTLINKS) are returned if \&quot;brief&#x3D;true\&quot; is used in the query string.
     * @param brief Optional, true if response should only contain top level properties of the event. (optional, default to false)
     * @param skip Optional, number of events to skip. (optional)
     * @param top Optional, maximum number of events to return in the response. (optional)
     * @param countTotal Optional, true if total number of records should be returned in the response headers. (optional, default to false)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEventsAsync(Boolean brief, Integer skip, Integer top, Boolean countTotal, final ApiCallback<List<CalendarEvent>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getEventsCall(brief, skip, top, countTotal, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<CalendarEvent>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getEventsBySearch */
    private com.squareup.okhttp.Call getEventsBySearchCall(String title, Long ownerUserId, Date startDateUtc, Date endDateUtc, Date updatedAfterUtc, Boolean brief, Integer skip, Integer top, Boolean countTotal, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/Events/Search".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (title != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "title", title));
        if (ownerUserId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "owner_user_id", ownerUserId));
        if (startDateUtc != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "start_date_utc", startDateUtc));
        if (endDateUtc != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_date_utc", endDateUtc));
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
     * Gets a filtered list of Calendar Events.
     * Only one optional parameter (excluding top, skip and count_total) can be specified. Simple object graphs (excluding EVENTLINKS) are returned if \&quot;brief&#x3D;true\&quot; is used in the query string.
     * @param title Optional, event title. (optional)
     * @param ownerUserId Optional, id of the owner user. (optional)
     * @param startDateUtc Optional, start date of the event. Only the date is considered, not the time. (optional)
     * @param endDateUtc Optional, end date of the event. Only the date is considered, not the time. (optional)
     * @param updatedAfterUtc Optional, earliest date when event was last updated. Date and time are considered. (optional)
     * @param brief Optional, true if response should only contain top level properties of the event. (optional, default to false)
     * @param skip Optional, number of events to skip. (optional)
     * @param top Optional, maximum number of events to return in the response. (optional)
     * @param countTotal Optional, true if total number of records should be returned in the response headers. (optional, default to false)
     * @return List&lt;CalendarEvent&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<CalendarEvent> getEventsBySearch(String title, Long ownerUserId, Date startDateUtc, Date endDateUtc, Date updatedAfterUtc, Boolean brief, Integer skip, Integer top, Boolean countTotal) throws ApiException {
        ApiResponse<List<CalendarEvent>> resp = getEventsBySearchWithHttpInfo(title, ownerUserId, startDateUtc, endDateUtc, updatedAfterUtc, brief, skip, top, countTotal);
        return resp.getData();
    }

    /**
     * Gets a filtered list of Calendar Events.
     * Only one optional parameter (excluding top, skip and count_total) can be specified. Simple object graphs (excluding EVENTLINKS) are returned if \&quot;brief&#x3D;true\&quot; is used in the query string.
     * @param title Optional, event title. (optional)
     * @param ownerUserId Optional, id of the owner user. (optional)
     * @param startDateUtc Optional, start date of the event. Only the date is considered, not the time. (optional)
     * @param endDateUtc Optional, end date of the event. Only the date is considered, not the time. (optional)
     * @param updatedAfterUtc Optional, earliest date when event was last updated. Date and time are considered. (optional)
     * @param brief Optional, true if response should only contain top level properties of the event. (optional, default to false)
     * @param skip Optional, number of events to skip. (optional)
     * @param top Optional, maximum number of events to return in the response. (optional)
     * @param countTotal Optional, true if total number of records should be returned in the response headers. (optional, default to false)
     * @return ApiResponse&lt;List&lt;CalendarEvent&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<CalendarEvent>> getEventsBySearchWithHttpInfo(String title, Long ownerUserId, Date startDateUtc, Date endDateUtc, Date updatedAfterUtc, Boolean brief, Integer skip, Integer top, Boolean countTotal) throws ApiException {
        com.squareup.okhttp.Call call = getEventsBySearchCall(title, ownerUserId, startDateUtc, endDateUtc, updatedAfterUtc, brief, skip, top, countTotal, null, null);
        Type localVarReturnType = new TypeToken<List<CalendarEvent>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Gets a filtered list of Calendar Events. (asynchronously)
     * Only one optional parameter (excluding top, skip and count_total) can be specified. Simple object graphs (excluding EVENTLINKS) are returned if \&quot;brief&#x3D;true\&quot; is used in the query string.
     * @param title Optional, event title. (optional)
     * @param ownerUserId Optional, id of the owner user. (optional)
     * @param startDateUtc Optional, start date of the event. Only the date is considered, not the time. (optional)
     * @param endDateUtc Optional, end date of the event. Only the date is considered, not the time. (optional)
     * @param updatedAfterUtc Optional, earliest date when event was last updated. Date and time are considered. (optional)
     * @param brief Optional, true if response should only contain top level properties of the event. (optional, default to false)
     * @param skip Optional, number of events to skip. (optional)
     * @param top Optional, maximum number of events to return in the response. (optional)
     * @param countTotal Optional, true if total number of records should be returned in the response headers. (optional, default to false)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEventsBySearchAsync(String title, Long ownerUserId, Date startDateUtc, Date endDateUtc, Date updatedAfterUtc, Boolean brief, Integer skip, Integer top, Boolean countTotal, final ApiCallback<List<CalendarEvent>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getEventsBySearchCall(title, ownerUserId, startDateUtc, endDateUtc, updatedAfterUtc, brief, skip, top, countTotal, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<CalendarEvent>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updateEvent */
    private com.squareup.okhttp.Call updateEventCall(APICalendarEvent apiEvent, Boolean brief, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = apiEvent;
        
        // verify the required parameter 'apiEvent' is set
        if (apiEvent == null) {
            throw new ApiException("Missing the required parameter 'apiEvent' when calling updateEvent(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/Events".replaceAll("\\{format\\}","json");

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
     * Updates a Calendar Event
     * 
     * @param apiEvent The Event to update (just include JSON object as request body) (required)
     * @param brief Optional, true if you wish to do a partial update containing only top level properties of the Event. When true, all sub-collections are ignored. (optional, default to false)
     * @return CalendarEvent
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CalendarEvent updateEvent(APICalendarEvent apiEvent, Boolean brief) throws ApiException {
        ApiResponse<CalendarEvent> resp = updateEventWithHttpInfo(apiEvent, brief);
        return resp.getData();
    }

    /**
     * Updates a Calendar Event
     * 
     * @param apiEvent The Event to update (just include JSON object as request body) (required)
     * @param brief Optional, true if you wish to do a partial update containing only top level properties of the Event. When true, all sub-collections are ignored. (optional, default to false)
     * @return ApiResponse&lt;CalendarEvent&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CalendarEvent> updateEventWithHttpInfo(APICalendarEvent apiEvent, Boolean brief) throws ApiException {
        com.squareup.okhttp.Call call = updateEventCall(apiEvent, brief, null, null);
        Type localVarReturnType = new TypeToken<CalendarEvent>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Updates a Calendar Event (asynchronously)
     * 
     * @param apiEvent The Event to update (just include JSON object as request body) (required)
     * @param brief Optional, true if you wish to do a partial update containing only top level properties of the Event. When true, all sub-collections are ignored. (optional, default to false)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateEventAsync(APICalendarEvent apiEvent, Boolean brief, final ApiCallback<CalendarEvent> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateEventCall(apiEvent, brief, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CalendarEvent>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
