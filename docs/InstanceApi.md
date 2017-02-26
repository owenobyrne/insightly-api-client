# InstanceApi

All URIs are relative to *https://api.insight.ly/v2.2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getInstance**](InstanceApi.md#getInstance) | **GET** /Instance | Gets the Instance


<a name="getInstance"></a>
# **getInstance**
> APIInstance getInstance()

Gets the Instance

### Example
```java
// Import classes:
//import ly.insight.ApiException;
//import ly.insight.api.InstanceApi;


InstanceApi apiInstance = new InstanceApi();
try {
    APIInstance result = apiInstance.getInstance();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstanceApi#getInstance");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**APIInstance**](APIInstance.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

