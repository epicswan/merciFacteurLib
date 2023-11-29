# MerciFacteurApi\Client\GetTokenApi

All URIs are relative to *https://www.merci-facteur.com/api/1.2/prod/service*

| Method                                  | HTTP request      | Description             |
| --------------------------------------- | ----------------- | ----------------------- |
| [**getToken**](GetTokenApi.md#gettoken) | **GET** /getToken | Obtenir un access token |

# **getToken**

> \MerciFacteurApi\Client\Model\InlineResponse200 getToken($ww_service_signature, $ww_timestamp, $ww_service_id, $ww_authorized_ip)

Obtenir un access token

IMPORTANT : - Ne demander un access token qu'une seule fois par tranche de 24h. Après execution de getToken, stockez en local l'access token obtenu et refaites une demande lorsqu'il est expiré. - Ne jamais faire transiter votre Secret Key non hashée. [`En savoir plus sur le hashage de la private key`](https://github.com/MerciFacteur/Merci-facteur-API/tree/master/hash-secret-key)

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new MerciFacteurApi\Client\Api\GetTokenApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$ww_service_signature = "\"hashedSignatureWithSha256\""; // string | Votre clé secrète hashée (ne jamais transmettre non hashé).
$ww_timestamp = "\"1539700479\""; // string | Le timestamp identique à celui utilisé pour hasher la clé secrète.
$ww_service_id = "\"yourIdService\""; // string | Votre service Id
$ww_authorized_ip = "\"111.111.111;222.222.222;333.333.333\""; // string | La ou les adresses IP des serveurs autorisés, séparées par des points-virgules. (si la restriction d'ip a été levée pour votre compte, passez une IP random, comme par exemple 111.111.111).

try {
    $result = $apiInstance->getToken($ww_service_signature, $ww_timestamp, $ww_service_id, $ww_authorized_ip);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling GetTokenApi->getToken: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

| Name                     | Type       | Description                                                                                                                                                                                       | Notes |
| ------------------------ | ---------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----- |
| **ww_service_signature** | **string** | Votre clé secrète hashée (ne jamais transmettre non hashé).                                                                                                                                       |
| **ww_timestamp**         | **string** | Le timestamp identique à celui utilisé pour hasher la clé secrète.                                                                                                                                |
| **ww_service_id**        | **string** | Votre service Id                                                                                                                                                                                  |
| **ww_authorized_ip**     | **string** | La ou les adresses IP des serveurs autorisés, séparées par des points-virgules. (si la restriction d&#x27;ip a été levée pour votre compte, passez une IP random, comme par exemple 111.111.111). |

### Return type

[**\MerciFacteurApi\Client\Model\InlineResponse200**](../Model/InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)
