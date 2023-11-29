# MerciFacteurApi.SourcePublipostageSource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Type de source envoyée (\&quot;file\&quot; pour une URL vers un fichier CSV ou TXT, \&quot;base64\&quot; pour un fichier CSV ou TXT encodé en base64, ou \&quot;json\&quot; pour un json). | [optional] 
**value** | **String** | Si type&#x3D;\&quot;file\&quot;, l&#x27;URL du fichier. Si type&#x3D;\&quot;base64\&quot;, la base64. Si type&#x3D;\&quot;json\&quot;, un json contenant les données sources ([{destinataire 1},{destinataire 2},etc...]) | [optional] 

<a name="TypeEnum"></a>
## Enum: TypeEnum

* `file` (value: `"file"`)
* `base64` (value: `"base64"`)
* `json` (value: `"json"`)

