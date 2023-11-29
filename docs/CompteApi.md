# MerciFacteurApi.CompteApi

All URIs are relative to *https://www.merci-facteur.com/api/1.2/prod/service*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getQuotaCompte**](CompteApi.md#getQuotaCompte) | **GET** /getQuotaCompte | Obtenir les infos des quotas liés au compte Merci facteur Pro.
[**getWebhookEndpoint**](CompteApi.md#getWebhookEndpoint) | **GET** /getWebhookEndpoint | Obtenir l&#x27;URL de webhook parametrée sur le compte.
[**setWebhookEndpoint**](CompteApi.md#setWebhookEndpoint) | **POST** /setWebhookEndpoint | Définir l&#x27;URL du endpoint sur laquelle les évènements liés à vos courriers seront envoyés via webhooks

<a name="getQuotaCompte"></a>
# **getQuotaCompte**
> InlineResponse20018 getQuotaCompte(wwServiceId, wwAccessToken)

Obtenir les infos des quotas liés au compte Merci facteur Pro.

Obtenir le montant restant sur le compte, la date d&#x27;expiration du plan, ainsi que le nombre de pages envoyées dans le mois.

### Example
```javascript
import {MerciFacteurApi} from 'merci_facteur_api';

let apiInstance = new MerciFacteurApi.CompteApi();
let wwServiceId = "\"yourIdService\""; // String | Votre service Id
let wwAccessToken = "\"ValidAccessToken\""; // String | Un access token valide

apiInstance.getQuotaCompte(wwServiceId, wwAccessToken, (error, data, response) => {
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

[**InlineResponse20018**](InlineResponse20018.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWebhookEndpoint"></a>
# **getWebhookEndpoint**
> InlineResponse20019 getWebhookEndpoint(wwServiceId, wwAccessToken)

Obtenir l&#x27;URL de webhook parametrée sur le compte.

Obtenir l&#x27;URL de webhook parametrée sur le compte (URL sur laquelle seront envoyé les évènements liés à vos courriers). Si aucune URL webhook n&#x27;est renseigné, vous recevrez une chaine de caractères vide. 

### Example
```javascript
import {MerciFacteurApi} from 'merci_facteur_api';

let apiInstance = new MerciFacteurApi.CompteApi();
let wwServiceId = "\"yourIdService\""; // String | Votre service Id
let wwAccessToken = "\"ValidAccessToken\""; // String | Un access token valide

apiInstance.getWebhookEndpoint(wwServiceId, wwAccessToken, (error, data, response) => {
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

[**InlineResponse20019**](InlineResponse20019.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setWebhookEndpoint"></a>
# **setWebhookEndpoint**
> InlineResponse2002 setWebhookEndpoint(url, wwServiceId, wwAccessToken)

Définir l&#x27;URL du endpoint sur laquelle les évènements liés à vos courriers seront envoyés via webhooks

Définir l&#x27;URL du endpoint sur laquelle les évènements liés à vos courriers seront envoyés via webhooks. Pour supprimer l&#x27;URL et ne plus recevoir les évènement, envoyez une chaine vide dans \&quot;url\&quot;.

### Example
```javascript
import {MerciFacteurApi} from 'merci_facteur_api';

let apiInstance = new MerciFacteurApi.CompteApi();
let url = "url_example"; // String | 
let wwServiceId = "\"yourIdService\""; // String | Votre service Id
let wwAccessToken = "\"ValidAccessToken\""; // String | Un access token valide

apiInstance.setWebhookEndpoint(url, wwServiceId, wwAccessToken, (error, data, response) => {
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
 **url** | **String**|  | 
 **wwServiceId** | **String**| Votre service Id | 
 **wwAccessToken** | **String**| Un access token valide | 

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

