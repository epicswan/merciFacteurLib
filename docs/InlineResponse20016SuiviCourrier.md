# MerciFacteurApi.InlineResponse20016SuiviCourrier

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dest** | **String** | Nom et/ou société du destinataire | [optional] 
**refCourrier** | **String** | Référence Merci facteur du courrier | [optional] 
**refTracking** | **String** | Référence de suivi postal | [optional] 
**modeEnvoi** | **String** | Mode d&#x27;envoi du courrier (lrar, lrare, suivi ou normal) | [optional] 
**lastState** | **String** | Dernier état connu de l&#x27;acheminement | [optional] 
**historique** | **String** | Historique complet de l&#x27;acheminement | [optional] 
**pnd** | **String** | 1 en cas de pli non distribuable, sinon 0. Est égale à null si le courrier n&#x27;a pas de suivi. | [optional] 
**areBase64Jpeg** | **String** | Si vous avez envyé ce courrier en lrare, \&quot;pending\&quot; si l&#x27;accusé de réception n&#x27;est pas encore disponible, ou la base64 de l&#x27;AR numérisé (format jpeg) si il est disponible. Est égale à null le mode d&#x27;envoi du courrier n&#x27;est pas lrare. | [optional] 
