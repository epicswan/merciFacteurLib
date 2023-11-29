# InlineResponse20011Envois

## Properties

| Name           | Type                                                                                   | Description                                                         | Notes      |
| -------------- | -------------------------------------------------------------------------------------- | ------------------------------------------------------------------- | ---------- |
| **id_envoi**   | **int**                                                                                | Id de l&#x27;envoi                                                  | [optional] |
| **statut**     | **string**                                                                             | Statut de l&#x27;envoi                                              | [optional] |
| **nb_page**    | **int**                                                                                | Nb page de chaque courrier de l&#x27;envoi                          | [optional] |
| **nb_dest**    | **int**                                                                                | Nombre de destinataires de l&#x27;envoi (&#x3D;nombre de courriers) | [optional] |
| **mode_envoi** | **string**                                                                             | Mode d&#x27;envoi (lrar, lrare, suivi, normal)                      | [optional] |
| **date**       | **int**                                                                                | Date de l&#x27;envoi au format timestamp                            | [optional] |
| **id_exp**     | **int**                                                                                | adresse Id de l&#x27;adresse d&#x27;expéditeur                      | [optional] |
| **id_dest**    | **int[]**                                                                              | adresse Id de/des l&#x27;adresse(s) de destinataire(s)              | [optional] |
| **amount**     | [**\MerciFacteurApi\Client\Model\InlineResponse20011Amount[]**](InlineResponse20011Amount.md) | Résumé du montant facturé par Merci facteur                         | [optional] |

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)
