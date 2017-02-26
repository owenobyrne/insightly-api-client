# CurrenciesApi

All URIs are relative to *https://api.insight.ly/v2.2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCurrencies**](CurrenciesApi.md#getCurrencies) | **GET** /Currencies | Gets a list of Currencies used by Insightly


<a name="getCurrencies"></a>
# **getCurrencies**
> List&lt;APICurrency&gt; getCurrencies()

Gets a list of Currencies used by Insightly

This read only endpoint returns a list of the currencies and currency symbols currently recognized by Insightly.

### Example
```java
// Import classes:
//import ly.insight.ApiException;
//import ly.insight.api.CurrenciesApi;


CurrenciesApi apiInstance = new CurrenciesApi();
try {
    List<APICurrency> result = apiInstance.getCurrencies();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CurrenciesApi#getCurrencies");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;APICurrency&gt;**](APICurrency.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

