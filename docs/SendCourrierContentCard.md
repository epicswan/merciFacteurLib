# MerciFacteurApi.SendCourrierContentCard

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**format** | **String** | Format de la carte : postcard, naked-postcard, classic, folded, large, large-a4 | [optional] 
**visuel** | [**SendCourrierContentCardVisuel**](SendCourrierContentCardVisuel.md) |  | [optional] 
**text** | [**SendCourrierContentCardText**](SendCourrierContentCardText.md) |  | [optional] 
**coin** | **String** | Type de coins de la carte (arrondi ou carre) | [optional] 
**papier** | **String** | Type de papier de la carte (classic, nacre ou creation) | [optional] 

<a name="FormatEnum"></a>
## Enum: FormatEnum

* `postcard` (value: `"postcard"`)
* `nakedPostcard` (value: `"naked-postcard"`)
* `classic` (value: `"classic"`)
* `folded` (value: `"folded"`)
* `large` (value: `"large"`)
* `largeA4` (value: `"large-a4"`)


<a name="CoinEnum"></a>
## Enum: CoinEnum

* `arrondi` (value: `"arrondi"`)
* `carre` (value: `"carre"`)


<a name="PapierEnum"></a>
## Enum: PapierEnum

* `classic` (value: `"classic"`)
* `nacre` (value: `"nacre"`)
* `creation` (value: `"creation"`)

