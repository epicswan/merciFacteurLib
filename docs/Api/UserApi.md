# MerciFacteurApi\Client\UserApi

All URIs are relative to *https://www.merci-facteur.com/api/1.2/prod/service*

| Method                                  | HTTP request           | Description                                     |
| --------------------------------------- | ---------------------- | ----------------------------------------------- |
| [**deleteUser**](UserApi.md#deleteuser) | **DELETE** /deleteUser | Supprimer un utilisateur                        |
| [**getUserId**](UserApi.md#getuserid)   | **GET** /getUserId     | Récupérer le user ID d&#x27;un utilisateur      |
| [**setUser**](UserApi.md#setuser)       | **POST** /setUser      | Créer un nouvel utilisateur                     |
| [**updateUser**](UserApi.md#updateuser) | **POST** /updateUser   | Modifier les informations d&#x27;un utilisateur |

# **deleteUser**

> \MerciFacteurApi\Client\Model\InlineResponse2002 deleteUser($ww_service_id, $ww_access_token, $id_user)

Supprimer un utilisateur

Attention, opération irrémédiable. Cela ne supprimera pas ses adresses, ni ses courriers qui sont conservés sur votre compte Merci facteur Pro

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new MerciFacteurApi\Client\Api\UserApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$ww_service_id = "\"yourIdService\""; // string | Votre service Id
$ww_access_token = "\"ValidAccessToken\""; // string | Un access token valide
$id_user = 56; // int | User ID de l'utilisateur à supprimer

try {
    $result = $apiInstance->deleteUser($ww_service_id, $ww_access_token, $id_user);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserApi->deleteUser: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

| Name                | Type       | Description                               | Notes |
| ------------------- | ---------- | ----------------------------------------- | ----- |
| **ww_service_id**   | **string** | Votre service Id                          |
| **ww_access_token** | **string** | Un access token valide                    |
| **id_user**         | **int**    | User ID de l&#x27;utilisateur à supprimer |

### Return type

[**\MerciFacteurApi\Client\Model\InlineResponse2002**](../Model/InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getUserId**

> \MerciFacteurApi\Client\Model\InlineResponse2003 getUserId($ww_service_id, $ww_access_token, $email_user)

Récupérer le user ID d'un utilisateur

Récupérer le user ID à partir de l'adresse email. Pour utiliser cette fonction le moins possible, stockez les userId en local.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new MerciFacteurApi\Client\Api\UserApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$ww_service_id = "\"yourIdService\""; // string | Votre service Id
$ww_access_token = "\"ValidAccessToken\""; // string | Un access token valide
$email_user = "email_user_example"; // string | Email de l'utilisateur

try {
    $result = $apiInstance->getUserId($ww_service_id, $ww_access_token, $email_user);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserApi->getUserId: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

| Name                | Type       | Description                 | Notes |
| ------------------- | ---------- | --------------------------- | ----- |
| **ww_service_id**   | **string** | Votre service Id            |
| **ww_access_token** | **string** | Un access token valide      |
| **email_user**      | **string** | Email de l&#x27;utilisateur |

### Return type

[**\MerciFacteurApi\Client\Model\InlineResponse2003**](../Model/InlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **setUser**

> \MerciFacteurApi\Client\Model\InlineResponse2001 setUser($email_user, $first_name, $last_name, $ww_service_id, $ww_access_token)

Créer un nouvel utilisateur

Chaque utilisateur aura un carnet d'adresses et un historique des envois. Vous retrouverez ces utilisateurs dans votre interface Merci facteur Pro. L'email indiqué doit être unique et vous permettre d'identifier l'utilisateur. Nous vous conseillons d'enregistrer en local les id d'utilisateurs retournés dans la réonse pour plus de confort d'utilisation de l'API.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new MerciFacteurApi\Client\Api\UserApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$email_user = "email_user_example"; // string |
$first_name = "first_name_example"; // string |
$last_name = "last_name_example"; // string |
$ww_service_id = "\"yourIdService\""; // string | Votre service Id
$ww_access_token = "\"ValidAccessToken\""; // string | Un access token valide

try {
    $result = $apiInstance->setUser($email_user, $first_name, $last_name, $ww_service_id, $ww_access_token);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserApi->setUser: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

| Name                | Type       | Description            | Notes |
| ------------------- | ---------- | ---------------------- | ----- |
| **email_user**      | **string** |                        |
| **first_name**      | **string** |                        |
| **last_name**       | **string** |                        |
| **ww_service_id**   | **string** | Votre service Id       |
| **ww_access_token** | **string** | Un access token valide |

### Return type

[**\MerciFacteurApi\Client\Model\InlineResponse2001**](../Model/InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **updateUser**

> \MerciFacteurApi\Client\Model\InlineResponse2002 updateUser($email_user, $first_name, $last_name, $ww_service_id, $ww_access_token, $id_user)

Modifier les informations d'un utilisateur

Attention, toutes les informations doivent être envoyées, même si il n'y a pas des modifications sur toutes.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new MerciFacteurApi\Client\Api\UserApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$email_user = "email_user_example"; // string |
$first_name = "first_name_example"; // string |
$last_name = "last_name_example"; // string |
$ww_service_id = "\"yourIdService\""; // string | Votre service Id
$ww_access_token = "\"ValidAccessToken\""; // string | Un access token valide
$id_user = 56; // int | User ID de l'utilisateur à modifier

try {
    $result = $apiInstance->updateUser($email_user, $first_name, $last_name, $ww_service_id, $ww_access_token, $id_user);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserApi->updateUser: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

| Name                | Type       | Description                              | Notes |
| ------------------- | ---------- | ---------------------------------------- | ----- |
| **email_user**      | **string** |                                          |
| **first_name**      | **string** |                                          |
| **last_name**       | **string** |                                          |
| **ww_service_id**   | **string** | Votre service Id                         |
| **ww_access_token** | **string** | Un access token valide                   |
| **id_user**         | **int**    | User ID de l&#x27;utilisateur à modifier |

### Return type

[**\MerciFacteurApi\Client\Model\InlineResponse2002**](../Model/InlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)
