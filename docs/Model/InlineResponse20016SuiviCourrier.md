# InlineResponse20016SuiviCourrier

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dest** | **string** | Nom et/ou société du destinataire | [optional] 
**ref_courrier** | **string** | Référence Merci facteur du courrier | [optional] 
**ref_tracking** | **string** | Référence de suivi postal | [optional] 
**mode_envoi** | **string** | Mode d&#x27;envoi du courrier (lrar, lrare, suivi ou normal) | [optional] 
**last_state** | **string** | Dernier état connu de l&#x27;acheminement | [optional] 
**historique** | **string** | Historique complet de l&#x27;acheminement | [optional] 
**pnd** | **string** | 1 en cas de pli non distribuable, sinon 0. Est égale à null si le courrier n&#x27;a pas de suivi. | [optional] 
**are_base64_jpeg** | **string** | Si vous avez envyé ce courrier en lrare, \&quot;pending\&quot; si l&#x27;accusé de réception n&#x27;est pas encore disponible, ou la base64 de l&#x27;AR numérisé (format jpeg) si il est disponible. Est égale à null le mode d&#x27;envoi du courrier n&#x27;est pas lrare. | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

