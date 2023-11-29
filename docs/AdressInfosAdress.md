# MerciFacteurApi.AdressInfosAdress

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**logo** | **String** | Url du logo (uniquement pour les expéditeurs) | [optional] 
**civilite** | **String** | Civilité du contact | [optional] 
**nom** | **String** | Nom du contact (doit être rempli si societe est vide) | [optional] 
**prenom** | **String** | Prénom du contact | [optional] 
**societe** | **String** | Société du contact (doit être rempli si le nom est vide) | [optional] 
**adresse1** | **String** | Première ligne de l&#x27;adresse (exemple : la rue) | [optional] 
**adresse2** | **String** | Seconde ligne de l&#x27;adresse (exemple : le lieu-dit) | [optional] 
**adresse3** | **String** | Troisième ligne de l&#x27;adresse (exemple : la boite postale) | [optional] 
**cp** | **String** | Code postal de l&#x27;adresse | 
**ville** | **String** | Ville de l&#x27;adresse | 
**pays** | **String** | Pays avec une orthographe conforme (cf. getCountry) | 
**phone** | **String** | Le téléphone mobile du destinataire en cas d&#x27;envoi de recommandé électronique avec OTP SMS (format +33628749452) | [optional] 
**email** | **String** | Adesse email du destinataire ou de l&#x27;expéditeur en cas d&#x27;envoi de recommandé électronique | [optional] 
**consent** | **Number** | Pour le destinataire dans le cas d&#x27;un envoi de recommandé électronique, il s&#x27;agit du consentement donné par le destinataire (doit être &#x3D;1 pour permettre l&#x27;envoi d&#x27;un recommandé électronique) | [optional] 
