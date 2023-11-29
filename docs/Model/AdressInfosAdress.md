# AdressInfosAdress

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**logo** | **string** | Url du logo (uniquement pour les expéditeurs) | [optional] 
**civilite** | **string** | Civilité du contact | [optional] 
**nom** | **string** | Nom du contact (doit être rempli si societe est vide) | [optional] 
**prenom** | **string** | Prénom du contact | [optional] 
**societe** | **string** | Société du contact (doit être rempli si le nom est vide) | [optional] 
**adresse1** | **string** | Première ligne de l&#x27;adresse (exemple : la rue) | [optional] 
**adresse2** | **string** | Seconde ligne de l&#x27;adresse (exemple : le lieu-dit) | [optional] 
**adresse3** | **string** | Troisième ligne de l&#x27;adresse (exemple : la boite postale) | [optional] 
**cp** | **string** | Code postal de l&#x27;adresse | 
**ville** | **string** | Ville de l&#x27;adresse | 
**pays** | **string** | Pays avec une orthographe conforme (cf. getCountry) | 
**phone** | **string** | Le téléphone mobile du destinataire en cas d&#x27;envoi de recommandé électronique avec OTP SMS (format +33628749452) | [optional] 
**email** | **string** | Adesse email du destinataire ou de l&#x27;expéditeur en cas d&#x27;envoi de recommandé électronique | [optional] 
**consent** | **int** | Pour le destinataire dans le cas d&#x27;un envoi de recommandé électronique, il s&#x27;agit du consentement donné par le destinataire (doit être &#x3D;1 pour permettre l&#x27;envoi d&#x27;un recommandé électronique) | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

