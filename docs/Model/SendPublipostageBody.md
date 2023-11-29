# SendPublipostageBody

## Properties

| Name           | Type                                                                         | Description                                                                                                                                                                                               | Notes      |
| -------------- | ---------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **id_envoi**   | **int**                                                                      | Identifiant de l&#x27;envoi qui vous a été retourné par \\sourcePublipostage                                                                                                                              | [optional] |
| **id_exp**     | **int**                                                                      | Id de l&#x27;adresse d&#x27;expéditeur (créée auparavant avec /setNewAdress) - si vous utilisez \&quot;idExp\&quot;, laissez vide \&quot;jsonExp\&quot;.                                                  | [optional] |
| **json_exp**   | **string**                                                                   | json contenant l&#x27;adresse d&#x27;expéditeur (si vous ne souhaitez pas créer l&#x27;adresse auparavant avec /setNewAdress) - si vous utilisez \&quot;jsonExp\&quot;, laissez vide \&quot;idExp\&quot;. | [optional] |
| **mode_envoi** | **string**                                                                   | Mode d&#x27;envoi du courrier : suivi, lrar, lrare, ou normal                                                                                                                                             | [optional] |
| **anonymize**  | [**\MerciFacteurApi\Client\Model\SendCourrierAnonymize**](SendCourrierAnonymize.md) |                                                                                                                                                                                                           | [optional] |

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)
