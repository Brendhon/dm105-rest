# CategoriesApi

All URIs are relative to *https://api.spotify.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getACategoriesPlaylists**](CategoriesApi.md#getACategoriesPlaylists) | **GET** /browse/categories/{category_id}/playlists | Get Category&#x27;s Playlists 
[**getACategory**](CategoriesApi.md#getACategory) | **GET** /browse/categories/{category_id} | Get Single Browse Category 
[**getCategories**](CategoriesApi.md#getCategories) | **GET** /browse/categories | Get Several Browse Categories 

<a name="getACategoriesPlaylists"></a>
# **getACategoriesPlaylists**
> PagingFeaturedPlaylistObject getACategoriesPlaylists(categoryId, country, limit, offset)

Get Category&#x27;s Playlists 

Get a list of Spotify playlists tagged with a particular category. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CategoriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

CategoriesApi apiInstance = new CategoriesApi();
String categoryId = "categoryId_example"; // String | 
String country = "country_example"; // String | 
Integer limit = 20; // Integer | 
Integer offset = 0; // Integer | 
try {
    PagingFeaturedPlaylistObject result = apiInstance.getACategoriesPlaylists(categoryId, country, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoriesApi#getACategoriesPlaylists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **String**|  |
 **country** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional] [default to 20] [enum: 1, 50]
 **offset** | **Integer**|  | [optional] [default to 0]

### Return type

[**PagingFeaturedPlaylistObject**](PagingFeaturedPlaylistObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getACategory"></a>
# **getACategory**
> CategoryObject getACategory(categoryId, country, locale)

Get Single Browse Category 

Get a single category used to tag items in Spotify (on, for example, the Spotify player’s “Browse” tab). 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CategoriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

CategoriesApi apiInstance = new CategoriesApi();
String categoryId = "categoryId_example"; // String | 
String country = "country_example"; // String | 
String locale = "locale_example"; // String | 
try {
    CategoryObject result = apiInstance.getACategory(categoryId, country, locale);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoriesApi#getACategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **String**|  |
 **country** | **String**|  | [optional]
 **locale** | **String**|  | [optional]

### Return type

[**CategoryObject**](CategoryObject.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCategories"></a>
# **getCategories**
> InlineResponse2009 getCategories(country, locale, limit, offset)

Get Several Browse Categories 

Get a list of categories used to tag items in Spotify (on, for example, the Spotify player’s “Browse” tab). 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CategoriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth_2_0
OAuth oauth_2_0 = (OAuth) defaultClient.getAuthentication("oauth_2_0");
oauth_2_0.setAccessToken("YOUR ACCESS TOKEN");

CategoriesApi apiInstance = new CategoriesApi();
String country = "country_example"; // String | 
String locale = "locale_example"; // String | 
Integer limit = 20; // Integer | 
Integer offset = 0; // Integer | 
try {
    InlineResponse2009 result = apiInstance.getCategories(country, locale, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CategoriesApi#getCategories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | **String**|  | [optional]
 **locale** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional] [default to 20] [enum: 1, 50]
 **offset** | **Integer**|  | [optional] [default to 0]

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

[oauth_2_0](../README.md#oauth_2_0)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

