# MerciFacteurApi.SavApi

All URIs are relative to *https://www.merci-facteur.com/api/1.2/prod/service*

Method | HTTP request | Description
------------- | ------------- | -------------
[**openSavTicket**](SavApi.md#openSavTicket) | **POST** /openSavTicket | Ouvrir un ticket SAV auprès de Merci facteur

<a name="openSavTicket"></a>
# **openSavTicket**
> InlineResponse20015 openSavTicket(wwServiceId, wwAccessToken, opts)

Ouvrir un ticket SAV auprès de Merci facteur

Si vous avez besoin de déléguer du SAV lié aux envois de courriers, vous pouvez le faire dans une certaine mesure en ouvrant des tickets SAV.

### Example
```javascript
import {MerciFacteurApi} from 'merci_facteur_api';

let apiInstance = new MerciFacteurApi.SavApi();
let wwServiceId = "\"yourIdService\""; // String | Votre service Id
let wwAccessToken = "\"ValidAccessToken\""; // String | Un access token valide
let opts = { 
  'yourServiceName': "yourServiceName_example", // String | 
  'email': "email_example", // String | 
  'referenceCourrier': "referenceCourrier_example", // String | 
  'sujet': "sujet_example", // String | 
  'messageTexte': "messageTexte_example" // String | 
};
apiInstance.openSavTicket(wwServiceId, wwAccessToken, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wwServiceId** | **String**| Votre service Id | 
 **wwAccessToken** | **String**| Un access token valide | 
 **yourServiceName** | **String**|  | [optional] 
 **email** | **String**|  | [optional] 
 **referenceCourrier** | **String**|  | [optional] 
 **sujet** | **String**|  | [optional] 
 **messageTexte** | **String**|  | [optional] 

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

