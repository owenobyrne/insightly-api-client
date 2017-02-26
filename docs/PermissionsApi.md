# PermissionsApi

All URIs are relative to *https://api.insight.ly/v2.2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPermissions**](PermissionsApi.md#getPermissions) | **GET** /Permissions | Gets the Permissions for a User


<a name="getPermissions"></a>
# **getPermissions**
> APIPermissions getPermissions()

Gets the Permissions for a User

Permissions determine if an individual user can read, edit, delete, or create records of a given object type.

### Example
```java
// Import classes:
//import ly.insight.ApiException;
//import ly.insight.api.PermissionsApi;


PermissionsApi apiInstance = new PermissionsApi();
try {
    APIPermissions result = apiInstance.getPermissions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PermissionsApi#getPermissions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**APIPermissions**](APIPermissions.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

