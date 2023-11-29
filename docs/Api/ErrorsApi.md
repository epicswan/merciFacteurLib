# MerciFacteurApi\Client\ErrorsApi

All URIs are relative to *https://www.merci-facteur.com/api/1.2/prod/service*

| Method                                    | HTTP request        | Description                                                          |
| ----------------------------------------- | ------------------- | -------------------------------------------------------------------- |
| [**listErrors**](ErrorsApi.md#listerrors) | **GET** /listErrors | Obtenir la liste des erreurs possiblement retournées par l&#x27;API. |

# **listErrors**

> \MerciFacteurApi\Client\Model\InlineResponse20020 listErrors($ww_service_id, $ww_access_token)

Obtenir la liste des erreurs possiblement retournées par l'API.

Vous pouvez personnaliser tous les messages d'erreur en fonction des codes d'erreur retournés par l'API. Chaque erreur est identifiée par un code d'erreur qui ne changera jamais. Ce code d'erreur est retourné dans l'entête (en erreur 400 ou 401), ainsi que dans le résultat tel que result[error][code].

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new MerciFacteurApi\Client\Api\ErrorsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$ww_service_id = "\"yourIdService\""; // string | Votre service Id
$ww_access_token = "\"ValidAccessToken\""; // string | Un access token valide

try {
    $result = $apiInstance->listErrors($ww_service_id, $ww_access_token);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling ErrorsApi->listErrors: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

| Name                | Type       | Description            | Notes |
| ------------------- | ---------- | ---------------------- | ----- |
| **ww_service_id**   | **string** | Votre service Id       |
| **ww_access_token** | **string** | Un access token valide |

### Return type

[**\MerciFacteurApi\Client\Model\InlineResponse20020**](../Model/InlineResponse20020.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)
