# MerciFacteurApi.ErrorsApi

All URIs are relative to *https://www.merci-facteur.com/api/1.2/prod/service*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listErrors**](ErrorsApi.md#listErrors) | **GET** /listErrors | Obtenir la liste des erreurs possiblement retournées par l&#x27;API.

<a name="listErrors"></a>
# **listErrors**
> InlineResponse20020 listErrors(wwServiceId, wwAccessToken)

Obtenir la liste des erreurs possiblement retournées par l&#x27;API.

Vous pouvez personnaliser tous les messages d&#x27;erreur en fonction des codes d&#x27;erreur retournés par l&#x27;API. Chaque erreur est identifiée par un code d&#x27;erreur qui ne changera jamais. Ce code d&#x27;erreur est retourné dans l&#x27;entête (en erreur 400 ou 401), ainsi que dans le résultat tel que result[error][code].

### Example
```javascript
import {MerciFacteurApi} from 'merci_facteur_api';

let apiInstance = new MerciFacteurApi.ErrorsApi();
let wwServiceId = "\"yourIdService\""; // String | Votre service Id
let wwAccessToken = "\"ValidAccessToken\""; // String | Un access token valide

apiInstance.listErrors(wwServiceId, wwAccessToken, (error, data, response) => {
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

### Return type

[**InlineResponse20020**](InlineResponse20020.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

