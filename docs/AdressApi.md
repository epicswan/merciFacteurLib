# MerciFacteurApi.AdressApi

All URIs are relative to *https://www.merci-facteur.com/api/1.2/prod/service*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAdress**](AdressApi.md#deleteAdress) | **DELETE** /deleteAdress | Supprimer une adresse
[**getAdressInfos**](AdressApi.md#getAdressInfos) | **GET** /getAdressInfos | Obtenir les infos complètes d&#x27;une ou plusieurs adresse(s) à partir de leurs adresse Id (destinataire ou expéditeur).
[**getCountry**](AdressApi.md#getCountry) | **GET** /getCountry | Obtenir la liste des pays valides
[**listAdress**](AdressApi.md#listAdress) | **GET** /listAdress | Lister les adresses du carnet d&#x27;adresses d&#x27;un utilisateur. Limité à 500 adresses. Pour plus de précision dans la recherche utilisez le paramètre \&quot;search\&quot;.
[**setNewAdress**](AdressApi.md#setNewAdress) | **POST** /setNewAdress | Créer une nouvelle adresse dans le carnet d&#x27;adresses (non obligatoire pour l&#x27;envoi d&#x27;un courrier)
[**updateAdress**](AdressApi.md#updateAdress) | **POST** /updateAdress | Modifier une adresse dans le carnet d&#x27;adresses

<a name="deleteAdress"></a>
# **deleteAdress**
> InlineResponse2002 deleteAdress(wwServiceId, wwAccessToken, idAdress)

Supprimer une adresse

Supprime une adresse du carnet d&#x27;adresses. Attention, opération irrémédiable.

### Example
```javascript
import {MerciFacteurApi} from 'merci_facteur_api';

let apiInstance = new MerciFacteurApi.AdressApi();
let wwServiceId = "\"yourIdService\""; // String | Votre service Id
let wwAccessToken = "\"ValidAccessToken\""; // String | Un access token valide
let idAdress = 56; // Number | ID de l'adresse à supprimer

apiInstance.deleteAdress(wwServiceId, wwAccessToken, idAdress, (error, data, response) => {
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
 **idAdress** | **Number**| ID de l&#x27;adresse à supprimer | 

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAdressInfos"></a>
# **getAdressInfos**
> InlineResponse2007 getAdressInfos(wwServiceId, wwAccessToken, idAdress)

Obtenir les infos complètes d&#x27;une ou plusieurs adresse(s) à partir de leurs adresse Id (destinataire ou expéditeur).

### Example
```javascript
import {MerciFacteurApi} from 'merci_facteur_api';

let apiInstance = new MerciFacteurApi.AdressApi();
let wwServiceId = "\"yourIdService\""; // String | Votre service Id
let wwAccessToken = "\"ValidAccessToken\""; // String | Un access token valide
let idAdress = [3.4]; // [Number] | Les adresse Id des adresses dont vous souhaitez extraire les informations (maximum 50 adresses à la fois).

apiInstance.getAdressInfos(wwServiceId, wwAccessToken, idAdress, (error, data, response) => {
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
 **idAdress** | [**[Number]**](Number.md)| Les adresse Id des adresses dont vous souhaitez extraire les informations (maximum 50 adresses à la fois). | 

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCountry"></a>
# **getCountry**
> InlineResponse2004 getCountry(wwServiceId, wwAccessToken, zone)

Obtenir la liste des pays valides

Vous permet d&#x27;avoir la liste des pays disponibles, avec leur orthographe normalisée.     Au sujet des zones géographiques :   fr &#x3D; France métropolitaine  om1 &#x3D; GUADELOUPE, GUYANE FRANCAISE, MARTINIQUE, MAYOTTE, REUNION, SAINT BARTHELEMY, SAINT MARTIN, ST-PIERRE-MIQUELON  om2 &#x3D; CLIPPERTON, NOUVELLE CALEDONIE, POLYNESIE FRANCAISE, TERRES AUSTRALES FR, WALLIS ET FUTUNA  z1 : UE sauf France  z2 : Reste du monde

### Example
```javascript
import {MerciFacteurApi} from 'merci_facteur_api';

let apiInstance = new MerciFacteurApi.AdressApi();
let wwServiceId = "\"yourIdService\""; // String | Votre service Id
let wwAccessToken = "\"ValidAccessToken\""; // String | Un access token valide
let zone = ["zone_example"]; // [String] | Les zones à extraire : fr,z1,z2,om1,om2

apiInstance.getCountry(wwServiceId, wwAccessToken, zone, (error, data, response) => {
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
 **zone** | [**[String]**](String.md)| Les zones à extraire : fr,z1,z2,om1,om2 | 

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listAdress"></a>
# **listAdress**
> InlineResponse2006 listAdress(wwServiceId, wwAccessToken, idUser, type, opts)

Lister les adresses du carnet d&#x27;adresses d&#x27;un utilisateur. Limité à 500 adresses. Pour plus de précision dans la recherche utilisez le paramètre \&quot;search\&quot;.

### Example
```javascript
import {MerciFacteurApi} from 'merci_facteur_api';

let apiInstance = new MerciFacteurApi.AdressApi();
let wwServiceId = "\"yourIdService\""; // String | Votre service Id
let wwAccessToken = "\"ValidAccessToken\""; // String | Un access token valide
let idUser = 56; // Number | User Id de l'utilisateur propriétaire de cette adresse.
let type = "\"dest\""; // String | Type d'adresse : Expéditeur (exp) ou destinataire (dest)
let opts = { 
  'search': "\"{\\\"nom\\\":\\\"Dupont\\\",\\\"societe\\\":\\\"\\\",\\\"cp\\\":\\\"\\\",\\\"ville\\\":\\\"paris\\\"}\"" // String | Recherche d'une adresse précise (de la forme {\"nom\":\"\",\"societe\":\"\",\"cp\":\"\",\"ville\":\"\"}).
};
apiInstance.listAdress(wwServiceId, wwAccessToken, idUser, type, opts, (error, data, response) => {
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
 **idUser** | **Number**| User Id de l&#x27;utilisateur propriétaire de cette adresse. | 
 **type** | **String**| Type d&#x27;adresse : Expéditeur (exp) ou destinataire (dest) | 
 **search** | **String**| Recherche d&#x27;une adresse précise (de la forme {\&quot;nom\&quot;:\&quot;\&quot;,\&quot;societe\&quot;:\&quot;\&quot;,\&quot;cp\&quot;:\&quot;\&quot;,\&quot;ville\&quot;:\&quot;\&quot;}). | [optional] 

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="setNewAdress"></a>
# **setNewAdress**
> InlineResponse2005 setNewAdress(wwServiceId, wwAccessToken, idUser, type, opts)

Créer une nouvelle adresse dans le carnet d&#x27;adresses (non obligatoire pour l&#x27;envoi d&#x27;un courrier)

Cela peut-être une adresse d&#x27;expéditeur ou de destinataire. Les adresses sont liées à un utilisateur précis.  Vous ne pouvez pas créer plusieurs fois la même adresse, mais réutiliser les adresses créées.  Sont obligatoires : (nom et/ou société), (cp), (ville), (pays)  Pays doit être avec une orthographe conforme cf. getCountry()  Si une infos est inutilisée, tout de même l&#x27;envoyer en string vide.  Si vous ne souhaitez pas utiliser de carnet d&#x27;adresses, vous pouvez intégrer directement les adresses dans l&#x27;envoi des courriers, sans avoir recours à cette fonction avant.

### Example
```javascript
import {MerciFacteurApi} from 'merci_facteur_api';

let apiInstance = new MerciFacteurApi.AdressApi();
let wwServiceId = "\"yourIdService\""; // String | Votre service Id
let wwAccessToken = "\"ValidAccessToken\""; // String | Un access token valide
let idUser = 56; // Number | User Id de l'utilisateur propriétaire de cette adresse.
let type = "\"dest\""; // String | Type d'adresse : Expéditeur (exp) ou destinataire (dest)
let opts = { 
  'adress': new MerciFacteurApi.AdressInfosAdress() // AdressInfosAdress | 
};
apiInstance.setNewAdress(wwServiceId, wwAccessToken, idUser, type, opts, (error, data, response) => {
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
 **idUser** | **Number**| User Id de l&#x27;utilisateur propriétaire de cette adresse. | 
 **type** | **String**| Type d&#x27;adresse : Expéditeur (exp) ou destinataire (dest) | 
 **adress** | [**AdressInfosAdress**](.md)|  | [optional] 

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="updateAdress"></a>
# **updateAdress**
> InlineResponse2002 updateAdress(wwServiceId, wwAccessToken, idAdress, opts)

Modifier une adresse dans le carnet d&#x27;adresses

Cela peut-être une adresse d&#x27;expéditeur ou de destinataire. Sont obligatoires : (nom et/ou société), (cp), (ville), (pays) / pays doit être avec une orthographe conforme cf. getCountry() / Si une infos est inutilisée, tout de même l&#x27;envoyer en string vide.

### Example
```javascript
import {MerciFacteurApi} from 'merci_facteur_api';

let apiInstance = new MerciFacteurApi.AdressApi();
let wwServiceId = "\"yourIdService\""; // String | Votre service Id
let wwAccessToken = "\"ValidAccessToken\""; // String | Un access token valide
let idAdress = 56; // Number | Id de l'adresse à modifier.
let opts = { 
  'adress': new MerciFacteurApi.AdressInfosAdress() // AdressInfosAdress | 
};
apiInstance.updateAdress(wwServiceId, wwAccessToken, idAdress, opts, (error, data, response) => {
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
 **idAdress** | **Number**| Id de l&#x27;adresse à modifier. | 
 **adress** | [**AdressInfosAdress**](.md)|  | [optional] 

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

