

# CallLogDto


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**webhookId** | **UUID** |  |  [optional] |
|**webhookNumber** | **String** |  |  [optional] |
|**status** | **WebhookStatus** |  |  [optional] |
|**timestamp** | **OffsetDateTime** |  |  [optional] |
|**requestUrl** | **String** |  |  [optional] |
|**requestHeaders** | [**List&lt;WebhookHeaders&gt;**](WebhookHeaders.md) |  |  [optional] |
|**requestBody** | **Object** |  |  [optional] |
|**count** | **Integer** |  |  [optional] [readonly] |
|**attempts** | [**List&lt;WebhookAttempts&gt;**](WebhookAttempts.md) |  |  [optional] |



