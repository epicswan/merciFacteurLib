# MerciFacteurApi\Client\AdressApi

All URIs are relative to *https://www.merci-facteur.com/api/1.2/prod/service*

| Method                                            | HTTP request             | Description                                                                                                                                                                      |
| ------------------------------------------------- | ------------------------ | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [**deleteAdress**](AdressApi.md#deleteadress)     | **DELETE** /deleteAdress | Supprimer une adresse                                                                                                                                                            |
| [**getAdressInfos**](AdressApi.md#getadressinfos) | **GET** /getAdressInfos  | Obtenir les infos complètes d&#x27;une ou plusieurs adresse(s) à partir de leurs adresse Id (destinataire ou expéditeur).                                                        |
| [**getCountry**](AdressApi.md#getcountry)         | **GET** /getCountry      | Obtenir la liste des pays valides                                                                                                                                                |
| [**listAdress**](AdressApi.md#listadress)         | **GET** /listAdress      | Lister les adresses du carnet d&#x27;adresses d&#x27;un utilisateur. Limité à 500 adresses. Pour plus de précision dans la recherche utilisez le paramètre \&quot;search\&quot;. |
| [**setNewAdress**](AdressApi.md#setnewadress)     | **POST** /setNewAdress   | Créer une nouvelle adresse dans le carnet d&#x27;adresses (non obligatoire pour l&#x27;envoi d&#x27;un courrier)                                                                 |
| [**updateAdress**](AdressApi.md#updateadress)     | **POST** /updateAdress   | Modifier une adresse dans le carnet d&#x27;adresses                                                                                                                              |

# **deleteAdress**

> \MerciFacteurApi\Client\Model\InlineResponse2002 deleteAdress($ww_service_id, $ww_access_token, $id_adress)

Supprimer une adresse

Supprime une adresse du carnet d'adresses. Attention, opération irrémédiable.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new MerciFacteurApi\Client\Api\AdressApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$ww_service_id = "\"yourIdService\""; // string | Votre service Id
$ww_access_token = "\"ValidAccessToken\""; // string | Un access token valide
$id_adress = 56; // int | ID de l'adresse à supprimer

try {
    $result = $apiInstance->deleteAdress($ww_service_id, $ww_access_token, $id_adress);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdressApi->deleteAdress: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

| Name                | Type       | Description                      | Notes |
| ------------------- | ---------- | -------------------------------- | ----- |
| **ww_service_id**   | **string** | Votre service Id                 |
| **ww_access_token** | **string** | Un access token valide           |
| **id_adress**       | **int**    | ID de l&#x27;adresse à supprimer |

### Return type

[**\MerciFacteurApi\Client\Model\InlineResponse2002**](../Model/InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getAdressInfos**

> \MerciFacteurApi\Client\Model\InlineResponse2007 getAdressInfos($ww_service_id, $ww_access_token, $id_adress)

Obtenir les infos complètes d'une ou plusieurs adresse(s) à partir de leurs adresse Id (destinataire ou expéditeur).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new MerciFacteurApi\Client\Api\AdressApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$ww_service_id = "\"yourIdService\""; // string | Votre service Id
$ww_access_token = "\"ValidAccessToken\""; // string | Un access token valide
$id_adress = array(56); // int[] | Les adresse Id des adresses dont vous souhaitez extraire les informations (maximum 50 adresses à la fois).

try {
    $result = $apiInstance->getAdressInfos($ww_service_id, $ww_access_token, $id_adress);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdressApi->getAdressInfos: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

| Name                | Type                         | Description                                                                                                | Notes |
| ------------------- | ---------------------------- | ---------------------------------------------------------------------------------------------------------- | ----- |
| **ww_service_id**   | **string**                   | Votre service Id                                                                                           |
| **ww_access_token** | **string**                   | Un access token valide                                                                                     |
| **id_adress**       | [**int[]**](../Model/int.md) | Les adresse Id des adresses dont vous souhaitez extraire les informations (maximum 50 adresses à la fois). |

### Return type

[**\MerciFacteurApi\Client\Model\InlineResponse2007**](../Model/InlineResponse2007.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getCountry**

> \MerciFacteurApi\Client\Model\InlineResponse2004 getCountry($ww_service_id, $ww_access_token, $zone)

Obtenir la liste des pays valides

Vous permet d'avoir la liste des pays disponibles, avec leur orthographe normalisée. Au sujet des zones géographiques : fr = France métropolitaine om1 = GUADELOUPE, GUYANE FRANCAISE, MARTINIQUE, MAYOTTE, REUNION, SAINT BARTHELEMY, SAINT MARTIN, ST-PIERRE-MIQUELON om2 = CLIPPERTON, NOUVELLE CALEDONIE, POLYNESIE FRANCAISE, TERRES AUSTRALES FR, WALLIS ET FUTUNA z1 : UE sauf France z2 : Reste du monde

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new MerciFacteurApi\Client\Api\AdressApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$ww_service_id = "\"yourIdService\""; // string | Votre service Id
$ww_access_token = "\"ValidAccessToken\""; // string | Un access token valide
$zone = array("zone_example"); // string[] | Les zones à extraire : fr,z1,z2,om1,om2

try {
    $result = $apiInstance->getCountry($ww_service_id, $ww_access_token, $zone);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdressApi->getCountry: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

| Name                | Type                               | Description                             | Notes |
| ------------------- | ---------------------------------- | --------------------------------------- | ----- |
| **ww_service_id**   | **string**                         | Votre service Id                        |
| **ww_access_token** | **string**                         | Un access token valide                  |
| **zone**            | [**string[]**](../Model/string.md) | Les zones à extraire : fr,z1,z2,om1,om2 |

### Return type

[**\MerciFacteurApi\Client\Model\InlineResponse2004**](../Model/InlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **listAdress**

> \MerciFacteurApi\Client\Model\InlineResponse2006 listAdress($ww_service_id, $ww_access_token, $id_user, $type, $search)

Lister les adresses du carnet d'adresses d'un utilisateur. Limité à 500 adresses. Pour plus de précision dans la recherche utilisez le paramètre \"search\".

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new MerciFacteurApi\Client\Api\AdressApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$ww_service_id = "\"yourIdService\""; // string | Votre service Id
$ww_access_token = "\"ValidAccessToken\""; // string | Un access token valide
$id_user = 56; // int | User Id de l'utilisateur propriétaire de cette adresse.
$type = "\"dest\""; // string | Type d'adresse : Expéditeur (exp) ou destinataire (dest)
$search = "\"{\\\"nom\\\":\\\"Dupont\\\",\\\"societe\\\":\\\"\\\",\\\"cp\\\":\\\"\\\",\\\"ville\\\":\\\"paris\\\"}\""; // string | Recherche d'une adresse précise (de la forme {\"nom\":\"\",\"societe\":\"\",\"cp\":\"\",\"ville\":\"\"}).

try {
    $result = $apiInstance->listAdress($ww_service_id, $ww_access_token, $id_user, $type, $search);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdressApi->listAdress: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

| Name                | Type       | Description                                                                                                                                                                                    | Notes      |
| ------------------- | ---------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **ww_service_id**   | **string** | Votre service Id                                                                                                                                                                               |
| **ww_access_token** | **string** | Un access token valide                                                                                                                                                                         |
| **id_user**         | **int**    | User Id de l&#x27;utilisateur propriétaire de cette adresse.                                                                                                                                   |
| **type**            | **string** | Type d&#x27;adresse : Expéditeur (exp) ou destinataire (dest)                                                                                                                                  |
| **search**          | **string** | Recherche d&#x27;une adresse précise (de la forme {\&quot;nom\&quot;:\&quot;\&quot;,\&quot;societe\&quot;:\&quot;\&quot;,\&quot;cp\&quot;:\&quot;\&quot;,\&quot;ville\&quot;:\&quot;\&quot;}). | [optional] |

### Return type

[**\MerciFacteurApi\Client\Model\InlineResponse2006**](../Model/InlineResponse2006.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **setNewAdress**

> \MerciFacteurApi\Client\Model\InlineResponse2005 setNewAdress($ww_service_id, $ww_access_token, $id_user, $type, $adress)

Créer une nouvelle adresse dans le carnet d'adresses (non obligatoire pour l'envoi d'un courrier)

Cela peut-être une adresse d'expéditeur ou de destinataire. Les adresses sont liées à un utilisateur précis. Vous ne pouvez pas créer plusieurs fois la même adresse, mais réutiliser les adresses créées. Sont obligatoires : (nom et/ou société), (cp), (ville), (pays) Pays doit être avec une orthographe conforme cf. getCountry() Si une infos est inutilisée, tout de même l'envoyer en string vide. Si vous ne souhaitez pas utiliser de carnet d'adresses, vous pouvez intégrer directement les adresses dans l'envoi des courriers, sans avoir recours à cette fonction avant.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new MerciFacteurApi\Client\Api\AdressApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$ww_service_id = "\"yourIdService\""; // string | Votre service Id
$ww_access_token = "\"ValidAccessToken\""; // string | Un access token valide
$id_user = 56; // int | User Id de l'utilisateur propriétaire de cette adresse.
$type = "\"dest\""; // string | Type d'adresse : Expéditeur (exp) ou destinataire (dest)
$adress = new \MerciFacteurApi\Client\Model\AdressInfosAdress(); // \MerciFacteurApi\Client\Model\AdressInfosAdress |

try {
    $result = $apiInstance->setNewAdress($ww_service_id, $ww_access_token, $id_user, $type, $adress);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdressApi->setNewAdress: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

| Name                | Type                                                         | Description                                                   | Notes      |
| ------------------- | ------------------------------------------------------------ | ------------------------------------------------------------- | ---------- |
| **ww_service_id**   | **string**                                                   | Votre service Id                                              |
| **ww_access_token** | **string**                                                   | Un access token valide                                        |
| **id_user**         | **int**                                                      | User Id de l&#x27;utilisateur propriétaire de cette adresse.  |
| **type**            | **string**                                                   | Type d&#x27;adresse : Expéditeur (exp) ou destinataire (dest) |
| **adress**          | [**\MerciFacteurApi\Client\Model\AdressInfosAdress**](../Model/.md) |                                                               | [optional] |

### Return type

[**\MerciFacteurApi\Client\Model\InlineResponse2005**](../Model/InlineResponse2005.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateAdress**

> \MerciFacteurApi\Client\Model\InlineResponse2002 updateAdress($ww_service_id, $ww_access_token, $id_adress, $adress)

Modifier une adresse dans le carnet d'adresses

Cela peut-être une adresse d'expéditeur ou de destinataire. Sont obligatoires : (nom et/ou société), (cp), (ville), (pays) / pays doit être avec une orthographe conforme cf. getCountry() / Si une infos est inutilisée, tout de même l'envoyer en string vide.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new MerciFacteurApi\Client\Api\AdressApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$ww_service_id = "\"yourIdService\""; // string | Votre service Id
$ww_access_token = "\"ValidAccessToken\""; // string | Un access token valide
$id_adress = 56; // int | Id de l'adresse à modifier.
$adress = new \MerciFacteurApi\Client\Model\AdressInfosAdress(); // \MerciFacteurApi\Client\Model\AdressInfosAdress |

try {
    $result = $apiInstance->updateAdress($ww_service_id, $ww_access_token, $id_adress, $adress);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AdressApi->updateAdress: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

| Name                | Type                                                         | Description                      | Notes      |
| ------------------- | ------------------------------------------------------------ | -------------------------------- | ---------- |
| **ww_service_id**   | **string**                                                   | Votre service Id                 |
| **ww_access_token** | **string**                                                   | Un access token valide           |
| **id_adress**       | **int**                                                      | Id de l&#x27;adresse à modifier. |
| **adress**          | [**\MerciFacteurApi\Client\Model\AdressInfosAdress**](../Model/.md) |                                  | [optional] |

### Return type

[**\MerciFacteurApi\Client\Model\InlineResponse2002**](../Model/InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)
