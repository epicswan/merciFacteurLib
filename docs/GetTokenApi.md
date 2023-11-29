# MerciFacteurApi.GetTokenApi

All URIs are relative to *https://www.merci-facteur.com/api/1.2/prod/service*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getToken**](GetTokenApi.md#getToken) | **GET** /getToken | Obtenir un access token

<a name="getToken"></a>
# **getToken**
> InlineResponse200 getToken(wwServiceSignature, wwTimestamp, wwServiceId, wwAuthorizedIp)

Obtenir un access token

IMPORTANT :   - Ne demander un access token qu&#x27;une seule fois par tranche de 24h. Après execution de getToken, stockez en local l&#x27;access token obtenu et refaites une demande lorsqu&#x27;il est expiré.  - Ne jamais faire transiter votre Secret Key non hashée.  [&#x60;En savoir plus sur le hashage de la private key&#x60;](https://github.com/MerciFacteur/Merci-facteur-API/tree/master/hash-secret-key)

### Example
```javascript
import {MerciFacteurApi} from 'merci_facteur_api';

let apiInstance = new MerciFacteurApi.GetTokenApi();
let wwServiceSignature = "\"hashedSignatureWithSha256\""; // String | Votre clé secrète hashée (ne jamais transmettre non hashé).
let wwTimestamp = "\"1539700479\""; // String | Le timestamp identique à celui utilisé pour hasher la clé secrète.
let wwServiceId = "\"yourIdService\""; // String | Votre service Id
let wwAuthorizedIp = "\"111.111.111;222.222.222;333.333.333\""; // String | La ou les adresses IP des serveurs autorisés, séparées par des points-virgules. (si la restriction d'ip a été levée pour votre compte, passez une IP random, comme par exemple 111.111.111).

apiInstance.getToken(wwServiceSignature, wwTimestamp, wwServiceId, wwAuthorizedIp, (error, data, response) => {
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
 **wwServiceSignature** | **String**| Votre clé secrète hashée (ne jamais transmettre non hashé). | 
 **wwTimestamp** | **String**| Le timestamp identique à celui utilisé pour hasher la clé secrète. | 
 **wwServiceId** | **String**| Votre service Id | 
 **wwAuthorizedIp** | **String**| La ou les adresses IP des serveurs autorisés, séparées par des points-virgules. (si la restriction d&#x27;ip a été levée pour votre compte, passez une IP random, comme par exemple 111.111.111). | 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

