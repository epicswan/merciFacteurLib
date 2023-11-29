# MerciFacteurApi\Client\CourrierApi

All URIs are relative to *https://www.merci-facteur.com/api/1.2/prod/service*

| Method                                                | HTTP request             | Description                                                                                                                                        |
| ----------------------------------------------------- | ------------------------ | -------------------------------------------------------------------------------------------------------------------------------------------------- |
| [**deleteEnvoi**](CourrierApi.md#deleteenvoi)         | **DELETE** /deleteEnvoi  | Annuler un envoi et son contenu                                                                                                                    |
| [**getEnvoi**](CourrierApi.md#getenvoi)               | **GET** /getEnvoi        | Lister les courriers d&#x27;un envoi en particulier                                                                                                |
| [**getPostagePrice**](CourrierApi.md#getpostageprice) | **GET** /getPostagePrice | Obtenir le montant d&#x27;un ou plusieurs courriers (non nécessaire à l&#x27;envoi)                                                                |
| [**getProof**](CourrierApi.md#getproof)               | **GET** /getProof        | Obtenir les documents preuves d&#x27;un courrier (preuve de dépôt, preuve de réception, preuve de télechargement, etc.)                            |
| [**getSuiviEnvoi**](CourrierApi.md#getsuivienvoi)     | **GET** /getSuiviEnvoi   | Obtenir le suivi et l&#x27;état des courriers d&#x27;un envoi                                                                                      |
| [**listEnvois**](CourrierApi.md#listenvois)           | **GET** /listEnvois      | Lister les 50 derniers envois d&#x27;un utilisateur                                                                                                |
| [**sendCourrier**](CourrierApi.md#sendcourrier)       | **POST** /sendCourrier   | Valider l&#x27;envoi d&#x27;un courrier                                                                                                            |
| [**uploadFile**](CourrierApi.md#uploadfile)           | **POST** /uploadFile     | Charger des fichiers dans un token pour les envoyer dans un courrier (facultatif) - uniquement disponible pour l&#x27;envoi de photos actuellement |

# **deleteEnvoi**

> \MerciFacteurApi\Client\Model\InlineResponse2002 deleteEnvoi($ww_service_id, $ww_access_token, $id_envoi)

Annuler un envoi et son contenu

Attention, opération irrémédiable. Selon le statut actuel des courriers, une demande d'annulation d'envoi pourra être rejetée immédiatement, rejetée après un certain délai, rejetée partiellement (annulation de l'envoi mais facturation partiellement annulée), ou acceptée intégralement (annulation de l'envoi et annulation intégrale de la facturation de cet envoi).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new MerciFacteurApi\Client\Api\CourrierApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$ww_service_id = "\"yourIdService\""; // string | Votre service Id
$ww_access_token = "\"ValidAccessToken\""; // string | Un access token valide
$id_envoi = 56; // int | Id de l'envoi contenant les courriers à annuler (Id retourné par /sendCourrier)

try {
    $result = $apiInstance->deleteEnvoi($ww_service_id, $ww_access_token, $id_envoi);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CourrierApi->deleteEnvoi: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

| Name                | Type       | Description                                                                          | Notes |
| ------------------- | ---------- | ------------------------------------------------------------------------------------ | ----- |
| **ww_service_id**   | **string** | Votre service Id                                                                     |
| **ww_access_token** | **string** | Un access token valide                                                               |
| **id_envoi**        | **int**    | Id de l&#x27;envoi contenant les courriers à annuler (Id retourné par /sendCourrier) |

### Return type

[**\MerciFacteurApi\Client\Model\InlineResponse2002**](../Model/InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getEnvoi**

> \MerciFacteurApi\Client\Model\InlineResponse20012 getEnvoi($ww_service_id, $ww_access_token, $id_envoi)

Lister les courriers d'un envoi en particulier

Cette opération entre dans le détail des informations d'un envoi précis. Un envoi peut etre composé de plusieurs destinataires (une lettre identique envoyée a des destinataires différents). Un envoi peut donc contenir plusieurs courriers.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new MerciFacteurApi\Client\Api\CourrierApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$ww_service_id = "\"yourIdService\""; // string | Votre service Id
$ww_access_token = "\"ValidAccessToken\""; // string | Un access token valide
$id_envoi = 56; // int | Id de l'envoi dont on veut extraire les détails.

try {
    $result = $apiInstance->getEnvoi($ww_service_id, $ww_access_token, $id_envoi);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CourrierApi->getEnvoi: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

| Name                | Type       | Description                                           | Notes |
| ------------------- | ---------- | ----------------------------------------------------- | ----- |
| **ww_service_id**   | **string** | Votre service Id                                      |
| **ww_access_token** | **string** | Un access token valide                                |
| **id_envoi**        | **int**    | Id de l&#x27;envoi dont on veut extraire les détails. |

### Return type

[**\MerciFacteurApi\Client\Model\InlineResponse20012**](../Model/InlineResponse20012.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getPostagePrice**

> \MerciFacteurApi\Client\Model\InlineResponse20010 getPostagePrice($ww_service_id, $ww_access_token, $mode_envoi, $card_format, $card_papier, $card_coin, $letter_page_number, $photo_number, $pays_destinataire, $id_destinataire, $letter_print_sides)

Obtenir le montant d'un ou plusieurs courriers (non nécessaire à l'envoi)

Vous permet d'avoir le montant de l'affranchissement et du contenu d'un courrier en fonction de son contenu, de son mode d'envoi et de sa destination. Vous n'avez pas besoin d'utiliser cette fonction pour envoyer un courrier, mais vous pouvez l'utiliser si vous avez besoin de cette information avant d'envoyer un courrier (par exemple pour des raisons de facturation). Le montant retourné est un montant HT. La partie \"affranchissement\" n'est pas soumise à la TVA.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new MerciFacteurApi\Client\Api\CourrierApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$ww_service_id = "\"yourIdService\""; // string | Votre service Id
$ww_access_token = "\"ValidAccessToken\""; // string | Un access token valide
$mode_envoi = array("mode_envoi_example"); // string[] | Mode d'envoi du courrier : normal, suivi, lrar ou lrare
$card_format = array("card_format_example"); // string[] | Format de la carte (laisser vide si pas de carte)
$card_papier = array("card_papier_example"); // string[] | Papier de la carte (laisser vide si pas de carte)
$card_coin = array("card_coin_example"); // string[] | Coins de la carte (laisser vide si pas de carte)
$letter_page_number = 0; // int | Nombre de page(s) de lettre (indiquer 0 si pas de lettre)
$photo_number = 0; // int | Nombre de photo(s) (indiquer 0 si pas de lettre)
$pays_destinataire = array("pays_destinataire_example"); // string[] | Tableau de pays de destination, avec une orthographe conforme via /getCountry  (indiquez soit paysDestinataire, soit idDestinataire).
$id_destinataire = array(56); // int[] | Tableau d'id de destinataire(s) déjà créé (indiquez soit paysDestinataire, soit idDestinataire).
$letter_print_sides = "recto"; // string | rectoverso pour une lettre imprimée recto-verso, recto pour une lettre imprimée en recto simple.

try {
    $result = $apiInstance->getPostagePrice($ww_service_id, $ww_access_token, $mode_envoi, $card_format, $card_papier, $card_coin, $letter_page_number, $photo_number, $pays_destinataire, $id_destinataire, $letter_print_sides);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CourrierApi->getPostagePrice: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

| Name                   | Type                               | Description                                                                                                                          | Notes                         |
| ---------------------- | ---------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------ | ----------------------------- |
| **ww_service_id**      | **string**                         | Votre service Id                                                                                                                     |
| **ww_access_token**    | **string**                         | Un access token valide                                                                                                               |
| **mode_envoi**         | [**string[]**](../Model/string.md) | Mode d&#x27;envoi du courrier : normal, suivi, lrar ou lrare                                                                         |
| **card_format**        | [**string[]**](../Model/string.md) | Format de la carte (laisser vide si pas de carte)                                                                                    |
| **card_papier**        | [**string[]**](../Model/string.md) | Papier de la carte (laisser vide si pas de carte)                                                                                    |
| **card_coin**          | [**string[]**](../Model/string.md) | Coins de la carte (laisser vide si pas de carte)                                                                                     |
| **letter_page_number** | **int**                            | Nombre de page(s) de lettre (indiquer 0 si pas de lettre)                                                                            | [default to 0]                |
| **photo_number**       | **int**                            | Nombre de photo(s) (indiquer 0 si pas de lettre)                                                                                     | [default to 0]                |
| **pays_destinataire**  | [**string[]**](../Model/string.md) | Tableau de pays de destination, avec une orthographe conforme via /getCountry (indiquez soit paysDestinataire, soit idDestinataire). | [optional]                    |
| **id_destinataire**    | [**int[]**](../Model/int.md)       | Tableau d&#x27;id de destinataire(s) déjà créé (indiquez soit paysDestinataire, soit idDestinataire).                                | [optional]                    |
| **letter_print_sides** | **string**                         | rectoverso pour une lettre imprimée recto-verso, recto pour une lettre imprimée en recto simple.                                     | [optional] [default to recto] |

### Return type

[**\MerciFacteurApi\Client\Model\InlineResponse20010**](../Model/InlineResponse20010.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getProof**

> \MerciFacteurApi\Client\Model\InlineResponse20017 getProof($ww_service_id, $ww_access_token, $tracking_number, $document)

Obtenir les documents preuves d'un courrier (preuve de dépôt, preuve de réception, preuve de télechargement, etc.)

Cela vous permet de récepérer les fichiers de preuves de vos courriers. Uniquement possible pour les courriers envoyés en Suivi, Recommandés avec avis de réception, ou Recommandé électroniques. Vous pourrez récupérer les preuves de dépôt (pour les suivi, les recommandés et les recommandés électroniques), les avis de réception (pour les recommandés avec avis de réception numérisé et les recommandés électropniques), ainsi que les preuves de télechargements (pour les recommandés électroniques). Les documents récupérés sont au format PDF ou JPEG.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new MerciFacteurApi\Client\Api\CourrierApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$ww_service_id = "\"yourIdService\""; // string | Votre service Id
$ww_access_token = "\"ValidAccessToken\""; // string | Un access token valide
$tracking_number = "tracking_number_example"; // string | Numéro de suivi du courrier.
$document = "\"depot\""; // string | Le document de preuve souhaité : depot (preuve de dépôt), reception (avis de réception), ou telechargement (preuve de téléchargement).

try {
    $result = $apiInstance->getProof($ww_service_id, $ww_access_token, $tracking_number, $document);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CourrierApi->getProof: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

| Name                | Type       | Description                                                                                                                            | Notes |
| ------------------- | ---------- | -------------------------------------------------------------------------------------------------------------------------------------- | ----- |
| **ww_service_id**   | **string** | Votre service Id                                                                                                                       |
| **ww_access_token** | **string** | Un access token valide                                                                                                                 |
| **tracking_number** | **string** | Numéro de suivi du courrier.                                                                                                           |
| **document**        | **string** | Le document de preuve souhaité : depot (preuve de dépôt), reception (avis de réception), ou telechargement (preuve de téléchargement). |

### Return type

[**\MerciFacteurApi\Client\Model\InlineResponse20017**](../Model/InlineResponse20017.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getSuiviEnvoi**

> \MerciFacteurApi\Client\Model\InlineResponse20016 getSuiviEnvoi($ww_service_id, $ww_access_token, $id_envoi)

Obtenir le suivi et l'état des courriers d'un envoi

Cette opération vous permet d'obtenir à n'importe quel moment l'état de courriers qui composent un envoi. Cet état correspond à l'état de l'impression du courrier jusqu'à sa remise à La Poste, et dans le cas des envois en LRAR ou en SUIVI, également l'historique du suivi de l'acheminement des courriers de la prise en charge par La Poste jusqu'à la distribution au destinataire.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new MerciFacteurApi\Client\Api\CourrierApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$ww_service_id = "\"yourIdService\""; // string | Votre service Id
$ww_access_token = "\"ValidAccessToken\""; // string | Un access token valide
$id_envoi = 56; // int | Id de l'envoi dont on veut extraire le suivi.

try {
    $result = $apiInstance->getSuiviEnvoi($ww_service_id, $ww_access_token, $id_envoi);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CourrierApi->getSuiviEnvoi: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

| Name                | Type       | Description                                        | Notes |
| ------------------- | ---------- | -------------------------------------------------- | ----- |
| **ww_service_id**   | **string** | Votre service Id                                   |
| **ww_access_token** | **string** | Un access token valide                             |
| **id_envoi**        | **int**    | Id de l&#x27;envoi dont on veut extraire le suivi. |

### Return type

[**\MerciFacteurApi\Client\Model\InlineResponse20016**](../Model/InlineResponse20016.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **listEnvois**

> \MerciFacteurApi\Client\Model\InlineResponse20011 listEnvois($ww_service_id, $ww_access_token, $id_user)

Lister les 50 derniers envois d'un utilisateur

Cette opération liste les envois, sans entrer dans le détail de chaque envoi.Un envoi peut etre composé de plusieurs destinataires (une lettre identique envoyée a des destinataires différents). Un envoi peut donc contenir plusieurs courriers.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new MerciFacteurApi\Client\Api\CourrierApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$ww_service_id = "\"yourIdService\""; // string | Votre service Id
$ww_access_token = "\"ValidAccessToken\""; // string | Un access token valide
$id_user = 56; // int | User Id de l'utilisateur dont on veut lister les envois.

try {
    $result = $apiInstance->listEnvois($ww_service_id, $ww_access_token, $id_user);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CourrierApi->listEnvois: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

| Name                | Type       | Description                                                   | Notes |
| ------------------- | ---------- | ------------------------------------------------------------- | ----- |
| **ww_service_id**   | **string** | Votre service Id                                              |
| **ww_access_token** | **string** | Un access token valide                                        |
| **id_user**         | **int**    | User Id de l&#x27;utilisateur dont on veut lister les envois. |

### Return type

[**\MerciFacteurApi\Client\Model\InlineResponse20011**](../Model/InlineResponse20011.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **sendCourrier**

> \MerciFacteurApi\Client\Model\InlineResponse2009 sendCourrier($id_user, $mode_envoi, $adress, $date_envoi, $designation, $anonymize, $content, $ww_service_id, $ww_access_token)

Valider l'envoi d'un courrier

ATTENTION, cette opération génère un courrier qui sera débité de votre compte, imprimé et posté. Pour effectuer vos tests d'intégration, n'hésitez pas à contacter notre service client pour ouvrir un compte \"Sandbox\".

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new MerciFacteurApi\Client\Api\CourrierApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$id_user = 56; // int |
$mode_envoi = "mode_envoi_example"; // string |
$adress = new \MerciFacteurApi\Client\Model\AdressSendCourrier(); // \MerciFacteurApi\Client\Model\AdressSendCourrier |
$date_envoi = "date_envoi_example"; // string |
$designation = "designation_example"; // string |
$anonymize = new \MerciFacteurApi\Client\Model\SendCourrierAnonymize(); // \MerciFacteurApi\Client\Model\SendCourrierAnonymize |
$content = new \MerciFacteurApi\Client\Model\SendCourrierContent(); // \MerciFacteurApi\Client\Model\SendCourrierContent |
$ww_service_id = "\"yourIdService\""; // string | Votre service Id
$ww_access_token = "\"ValidAccessToken\""; // string | Un access token valide

try {
    $result = $apiInstance->sendCourrier($id_user, $mode_envoi, $adress, $date_envoi, $designation, $anonymize, $content, $ww_service_id, $ww_access_token);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CourrierApi->sendCourrier: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

| Name                | Type                                                             | Description            | Notes |
| ------------------- | ---------------------------------------------------------------- | ---------------------- | ----- |
| **id_user**         | **int**                                                          |                        |
| **mode_envoi**      | **string**                                                       |                        |
| **adress**          | [**\MerciFacteurApi\Client\Model\AdressSendCourrier**](../Model/.md)    |                        |
| **date_envoi**      | **string**                                                       |                        |
| **designation**     | **string**                                                       |                        |
| **anonymize**       | [**\MerciFacteurApi\Client\Model\SendCourrierAnonymize**](../Model/.md) |                        |
| **content**         | [**\MerciFacteurApi\Client\Model\SendCourrierContent**](../Model/.md)   |                        |
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

# **uploadFile**

> \MerciFacteurApi\Client\Model\InlineResponse2008 uploadFile($id_user, $token, $product, $type, $file, $ww_service_id, $ww_access_token)

Charger des fichiers dans un token pour les envoyer dans un courrier (facultatif) - uniquement disponible pour l'envoi de photos actuellement

Vous pouvez charger des fichiers (photos) dans un Token avec /uploadFile. Utile si vous envoyez plusieurs fois le même contenu, ou si vous envoyez beaucoup de fichiers (surtout en base64). A la première utilisation, un token est créé et vous est retourné. Le Token peut être ensuite utilisé pour plusieurs envois.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new MerciFacteurApi\Client\Api\CourrierApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$id_user = 56; // int |
$token = "token_example"; // string |
$product = "product_example"; // string |
$type = "type_example"; // string |
$file = "file_example"; // string |
$ww_service_id = "\"yourIdService\""; // string | Votre service Id
$ww_access_token = "\"ValidAccessToken\""; // string | Un access token valide

try {
    $result = $apiInstance->uploadFile($id_user, $token, $product, $type, $file, $ww_service_id, $ww_access_token);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CourrierApi->uploadFile: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

| Name                | Type       | Description            | Notes |
| ------------------- | ---------- | ---------------------- | ----- |
| **id_user**         | **int**    |                        |
| **token**           | **string** |                        |
| **product**         | **string** |                        |
| **type**            | **string** |                        |
| **file**            | **string** |                        |
| **ww_service_id**   | **string** | Votre service Id       |
| **ww_access_token** | **string** | Un access token valide |

### Return type

[**\MerciFacteurApi\Client\Model\InlineResponse2008**](../Model/InlineResponse2008.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)
