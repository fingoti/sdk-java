

# EngineWebhookDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**organisationId** | **UUID** |  |  [optional] |
|**disabled** | **Boolean** |  |  [optional] |
|**webhookNumber** | **String** |  |  [optional] |
|**createdBy** | **UUID** |  |  [optional] |
|**createdOn** | **OffsetDateTime** |  |  [optional] |
|**triggers** | **Integer** |  |  [optional] |
|**properties** | **List&lt;String&gt;** |  |  [optional] |
|**webhookUrl** | **String** |  |  [optional] |
|**webhookHeaders** | [**List&lt;WebhookHeaders&gt;**](WebhookHeaders.md) |  |  [optional] |
|**devices** | **List&lt;String&gt;** |  |  [optional] |
|**count** | **Long** |  |  [optional] |
|**pageNumber** | **Long** |  |  [optional] |
|**lastCall** | **OffsetDateTime** |  |  [optional] |
|**calls** | [**List&lt;WebhookCallDto&gt;**](WebhookCallDto.md) |  |  [optional] |



