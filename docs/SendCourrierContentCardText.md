# MerciFacteurApi.SendCourrierContentCardText

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Type de visuel : html (code html), base64 (image), customimg (image) | [optional] 
**value** | **String** | Si type&#x3D;html, alors value&#x3D;html contenant le texte à imprimer sur le dos la carte. Si type&#x3D;base64, alors value&#x3D;une base64 contenant une image à imprimer sur le dos de la carte. Si type&#x3D;customimg, alors value&#x3D;une URL d&#x27;une image à imprimer sur le dos de la carte. | [optional] 

<a name="TypeEnum"></a>
## Enum: TypeEnum

* `html` (value: `"html"`)
* `customimg` (value: `"customimg"`)
* `base64` (value: `"base64"`)

