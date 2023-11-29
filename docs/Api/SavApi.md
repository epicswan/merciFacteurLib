# MerciFacteurApi\Client\SavApi

All URIs are relative to *https://www.merci-facteur.com/api/1.2/prod/service*

| Method                                       | HTTP request            | Description                                  |
| -------------------------------------------- | ----------------------- | -------------------------------------------- |
| [**openSavTicket**](SavApi.md#opensavticket) | **POST** /openSavTicket | Ouvrir un ticket SAV auprès de Merci facteur |

# **openSavTicket**

> \MerciFacteurApi\Client\Model\InlineResponse20015 openSavTicket($ww_service_id, $ww_access_token, $your_service_name, $email, $reference_courrier, $sujet, $message_texte)

Ouvrir un ticket SAV auprès de Merci facteur

Si vous avez besoin de déléguer du SAV lié aux envois de courriers, vous pouvez le faire dans une certaine mesure en ouvrant des tickets SAV.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new MerciFacteurApi\Client\Api\SavApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$ww_service_id = "\"yourIdService\""; // string | Votre service Id
$ww_access_token = "\"ValidAccessToken\""; // string | Un access token valide
$your_service_name = "your_service_name_example"; // string |
$email = "email_example"; // string |
$reference_courrier = "reference_courrier_example"; // string |
$sujet = "sujet_example"; // string |
$message_texte = "message_texte_example"; // string |

try {
    $result = $apiInstance->openSavTicket($ww_service_id, $ww_access_token, $your_service_name, $email, $reference_courrier, $sujet, $message_texte);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SavApi->openSavTicket: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

| Name                   | Type       | Description            | Notes      |
| ---------------------- | ---------- | ---------------------- | ---------- |
| **ww_service_id**      | **string** | Votre service Id       |
| **ww_access_token**    | **string** | Un access token valide |
| **your_service_name**  | **string** |                        | [optional] |
| **email**              | **string** |                        | [optional] |
| **reference_courrier** | **string** |                        | [optional] |
| **sujet**              | **string** |                        | [optional] |
| **message_texte**      | **string** |                        | [optional] |

### Return type

[**\MerciFacteurApi\Client\Model\InlineResponse20015**](../Model/InlineResponse20015.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)
