# MerciFacteurApi\Client\CompteApi

All URIs are relative to *https://www.merci-facteur.com/api/1.2/prod/service*

| Method                                                    | HTTP request                 | Description                                                                                                 |
| --------------------------------------------------------- | ---------------------------- | ----------------------------------------------------------------------------------------------------------- |
| [**getQuotaCompte**](CompteApi.md#getquotacompte)         | **GET** /getQuotaCompte      | Obtenir les infos des quotas liés au compte Merci facteur Pro.                                              |
| [**getWebhookEndpoint**](CompteApi.md#getwebhookendpoint) | **GET** /getWebhookEndpoint  | Obtenir l&#x27;URL de webhook parametrée sur le compte.                                                     |
| [**setWebhookEndpoint**](CompteApi.md#setwebhookendpoint) | **POST** /setWebhookEndpoint | Définir l&#x27;URL du endpoint sur laquelle les évènements liés à vos courriers seront envoyés via webhooks |

# **getQuotaCompte**

> \MerciFacteurApi\Client\Model\InlineResponse20018 getQuotaCompte($ww_service_id, $ww_access_token)

Obtenir les infos des quotas liés au compte Merci facteur Pro.

Obtenir le montant restant sur le compte, la date d'expiration du plan, ainsi que le nombre de pages envoyées dans le mois.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new MerciFacteurApi\Client\Api\CompteApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$ww_service_id = "\"yourIdService\""; // string | Votre service Id
$ww_access_token = "\"ValidAccessToken\""; // string | Un access token valide

try {
    $result = $apiInstance->getQuotaCompte($ww_service_id, $ww_access_token);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CompteApi->getQuotaCompte: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

| Name                | Type       | Description            | Notes |
| ------------------- | ---------- | ---------------------- | ----- |
| **ww_service_id**   | **string** | Votre service Id       |
| **ww_access_token** | **string** | Un access token valide |

### Return type

[**\MerciFacteurApi\Client\Model\InlineResponse20018**](../Model/InlineResponse20018.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getWebhookEndpoint**

> \MerciFacteurApi\Client\Model\InlineResponse20019 getWebhookEndpoint($ww_service_id, $ww_access_token)

Obtenir l'URL de webhook parametrée sur le compte.

Obtenir l'URL de webhook parametrée sur le compte (URL sur laquelle seront envoyé les évènements liés à vos courriers). Si aucune URL webhook n'est renseigné, vous recevrez une chaine de caractères vide.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new MerciFacteurApi\Client\Api\CompteApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$ww_service_id = "\"yourIdService\""; // string | Votre service Id
$ww_access_token = "\"ValidAccessToken\""; // string | Un access token valide

try {
    $result = $apiInstance->getWebhookEndpoint($ww_service_id, $ww_access_token);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CompteApi->getWebhookEndpoint: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

| Name                | Type       | Description            | Notes |
| ------------------- | ---------- | ---------------------- | ----- |
| **ww_service_id**   | **string** | Votre service Id       |
| **ww_access_token** | **string** | Un access token valide |

### Return type

[**\MerciFacteurApi\Client\Model\InlineResponse20019**](../Model/InlineResponse20019.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **setWebhookEndpoint**

> \MerciFacteurApi\Client\Model\InlineResponse2002 setWebhookEndpoint($url, $ww_service_id, $ww_access_token)

Définir l'URL du endpoint sur laquelle les évènements liés à vos courriers seront envoyés via webhooks

Définir l'URL du endpoint sur laquelle les évènements liés à vos courriers seront envoyés via webhooks. Pour supprimer l'URL et ne plus recevoir les évènement, envoyez une chaine vide dans \"url\".

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new MerciFacteurApi\Client\Api\CompteApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$url = "url_example"; // string |
$ww_service_id = "\"yourIdService\""; // string | Votre service Id
$ww_access_token = "\"ValidAccessToken\""; // string | Un access token valide

try {
    $result = $apiInstance->setWebhookEndpoint($url, $ww_service_id, $ww_access_token);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CompteApi->setWebhookEndpoint: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

| Name                | Type       | Description            | Notes |
| ------------------- | ---------- | ---------------------- | ----- |
| **url**             | **string** |                        |
| **ww_service_id**   | **string** | Votre service Id       |
| **ww_access_token** | **string** | Un access token valide |

### Return type

[**\MerciFacteurApi\Client\Model\InlineResponse2002**](../Model/InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)
