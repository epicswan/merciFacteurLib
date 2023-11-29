# MerciFacteurApi\Client\PublipostageApi

All URIs are relative to *https://www.merci-facteur.com/api/1.2/prod/service*

| Method                                                              | HTTP request                   | Description                                        |
| ------------------------------------------------------------------- | ------------------------------ | -------------------------------------------------- |
| [**sendPublipostage**](PublipostageApi.md#sendpublipostage)         | **POST** /sendPublipostage     | Envoi de la source de données du publipostage      |
| [**sourcePublipostage**](PublipostageApi.md#sourcepublipostage)     | **POST** /sourcePublipostage   | Envoi de la source de données du publipostage      |
| [**templatePublipostage**](PublipostageApi.md#templatepublipostage) | **POST** /templatePublipostage | Envoi du template de la lettre à envoyer en nombre |

# **sendPublipostage**

> \MerciFacteurApi\Client\Model\InlineResponse2009 sendPublipostage($id_envoi, $id_exp, $json_exp, $mode_envoi, $anonymize, $ww_service_id, $ww_access_token)

Envoi de la source de données du publipostage

Validation de l'envoi d'un publipostage. Cela enclenche la fusion des données, la mise en production, l'impression et l'envoi de l'ensemble des lettres du publipostage.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new MerciFacteurApi\Client\Api\PublipostageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$id_envoi = 56; // int |
$id_exp = 56; // int |
$json_exp = "json_exp_example"; // string |
$mode_envoi = "mode_envoi_example"; // string |
$anonymize = new \MerciFacteurApi\Client\Model\SendCourrierAnonymize(); // \MerciFacteurApi\Client\Model\SendCourrierAnonymize |
$ww_service_id = "\"yourIdService\""; // string | Votre service Id
$ww_access_token = "\"ValidAccessToken\""; // string | Un access token valide

try {
    $result = $apiInstance->sendPublipostage($id_envoi, $id_exp, $json_exp, $mode_envoi, $anonymize, $ww_service_id, $ww_access_token);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PublipostageApi->sendPublipostage: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

| Name                | Type                                                             | Description            | Notes |
| ------------------- | ---------------------------------------------------------------- | ---------------------- | ----- |
| **id_envoi**        | **int**                                                          |                        |
| **id_exp**          | **int**                                                          |                        |
| **json_exp**        | **string**                                                       |                        |
| **mode_envoi**      | **string**                                                       |                        |
| **anonymize**       | [**\MerciFacteurApi\Client\Model\SendCourrierAnonymize**](../Model/.md) |                        |
| **ww_service_id**   | **string**                                                       | Votre service Id       |
| **ww_access_token** | **string**                                                       | Un access token valide |

### Return type

[**\MerciFacteurApi\Client\Model\InlineResponse2009**](../Model/InlineResponse2009.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **sourcePublipostage**

> \MerciFacteurApi\Client\Model\InlineResponse20014 sourcePublipostage($id_user, $template_validation, $source, $ww_service_id, $ww_access_token)

Envoi de la source de données du publipostage

La source de donnée contient les informations de vos destinataires. Elle peut être au format CSV/TXT (; entre les champs, et saut de ligne entre les lignes, la première ligne doit contenir les champs de fusion), ou au format json (de la forme [{\"prenom\":\"Jean-Marc\", \"ville\":\"Paris\", \"champ_de_fusion\":\"valeur\"},{\"prenom\":\"Julie\", \"ville\":\"Lyon\", \"champ_de_fusion\":\"valeur\"}]). Votre fichier source doit au minimum contenir les champs de fusion suivants : \"nom\" ou \"societe\", \"cp\", \"ville\", \"pays\". Dans le cas d'un fichier CSV ou TXT, la premi&egrave;re ligne doit &ecirc;tre : civilite;nom;prenom;societe;adresse1;adresse2;adresse3;cp;ville;pays

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new MerciFacteurApi\Client\Api\PublipostageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$id_user = 56; // int |
$template_validation = new \stdClass; // object |
$source = new \MerciFacteurApi\Client\Model\SourcePublipostageSource(); // \MerciFacteurApi\Client\Model\SourcePublipostageSource |
$ww_service_id = "\"yourIdService\""; // string | Votre service Id
$ww_access_token = "\"ValidAccessToken\""; // string | Un access token valide

try {
    $result = $apiInstance->sourcePublipostage($id_user, $template_validation, $source, $ww_service_id, $ww_access_token);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PublipostageApi->sourcePublipostage: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

| Name                    | Type                                                                | Description            | Notes |
| ----------------------- | ------------------------------------------------------------------- | ---------------------- | ----- |
| **id_user**             | **int**                                                             |                        |
| **template_validation** | [**object**](../Model/.md)                                          |                        |
| **source**              | [**\MerciFacteurApi\Client\Model\SourcePublipostageSource**](../Model/.md) |                        |
| **ww_service_id**       | **string**                                                          | Votre service Id       |
| **ww_access_token**     | **string**                                                          | Un access token valide |

### Return type

[**\MerciFacteurApi\Client\Model\InlineResponse20014**](../Model/InlineResponse20014.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **templatePublipostage**

> \MerciFacteurApi\Client\Model\InlineResponse20013 templatePublipostage($type_template, $template, $ww_service_id, $ww_access_token)

Envoi du template de la lettre à envoyer en nombre

Le template doit être un fichier au format DOCX, il peut contenir des zones de remplacement (ou champs de fusion) qui seront remplacés par des données contenues dans la source de données. Les champs de fusion dans le template doivent être de la forme ${prenom} (avec uniquement des lettres, chiffres et le caractère \_).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new MerciFacteurApi\Client\Api\PublipostageApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$type_template = "type_template_example"; // string |
$template = "template_example"; // string |
$ww_service_id = "\"yourIdService\""; // string | Votre service Id
$ww_access_token = "\"ValidAccessToken\""; // string | Un access token valide

try {
    $result = $apiInstance->templatePublipostage($type_template, $template, $ww_service_id, $ww_access_token);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PublipostageApi->templatePublipostage: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

| Name                | Type       | Description            | Notes |
| ------------------- | ---------- | ---------------------- | ----- |
| **type_template**   | **string** |                        |
| **template**        | **string** |                        |
| **ww_service_id**   | **string** | Votre service Id       |
| **ww_access_token** | **string** | Un access token valide |

### Return type

[**\MerciFacteurApi\Client\Model\InlineResponse20013**](../Model/InlineResponse20013.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)
