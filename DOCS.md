## Documentation for API Endpoints

All URIs are relative to *https://api.fingoti.com*

| Class             | Method                                                                                     | HTTP request                               | Description                                                                              |
| ----------------- | ------------------------------------------------------------------------------------------ | ------------------------------------------ | ---------------------------------------------------------------------------------------- |
| _DeviceApi_       | [**deleteDeviceId**](docs/DeviceApi.md#deleteDeviceId)                                     | **DELETE** /v1/device/{id}                 | Unclaim a Fingoti device.                                                                |
| _DeviceApi_       | [**getDevice**](docs/DeviceApi.md#getDevice)                                               | **GET** /v1/device                         | Get all devices.                                                                         |
| _DeviceApi_       | [**getDeviceId**](docs/DeviceApi.md#getDeviceId)                                           | **GET** /v1/device/{id}                    | Get specified device.                                                                    |
| _DeviceApi_       | [**getDeviceIdNodes**](docs/DeviceApi.md#getDeviceIdNodes)                                 | **GET** /v1/device/{id}/nodes              | Get all nodes latched to a gateway.                                                      |
| _DeviceApi_       | [**patchDeviceId**](docs/DeviceApi.md#patchDeviceId)                                       | **PATCH** /v1/device/{id}                  | Update your Fingoti device.                                                              |
| _DeviceApi_       | [**postDevice**](docs/DeviceApi.md#postDevice)                                             | **POST** /v1/device                        | Claim a new Fingoti device.                                                              |
| _DeviceApi_       | [**postDeviceSendrequest**](docs/DeviceApi.md#postDeviceSendrequest)                       | **POST** /v1/device/sendrequest            | Send a request to a Fingoti device.                                                      |
| _DeviceApi_       | [**postDeviceUpdate**](docs/DeviceApi.md#postDeviceUpdate)                                 | **POST** /v1/device/update                 | Initiate a device update.                                                                |
| _FollowingsApi_   | [**deleteFollowingsId**](docs/FollowingsApi.md#deleteFollowingsId)                         | **DELETE** /v1/followings/{id}             | Delete a Pin Following. This is not recoverable.                                         |
| _FollowingsApi_   | [**getFollowings**](docs/FollowingsApi.md#getFollowings)                                   | **GET** /v1/followings                     | Get all pin followings.                                                                  |
| _FollowingsApi_   | [**getFollowingsId**](docs/FollowingsApi.md#getFollowingsId)                               | **GET** /v1/followings/{id}                | Get specified pin following.                                                             |
| _FollowingsApi_   | [**patchFollowingsId**](docs/FollowingsApi.md#patchFollowingsId)                           | **PATCH** /v1/followings/{id}              | Update pin following.                                                                    |
| _FollowingsApi_   | [**postFollowings**](docs/FollowingsApi.md#postFollowings)                                 | **POST** /v1/followings                    | Create a new pin following.                                                              |
| _OrganisationApi_ | [**deleteOrganisationAddressesId**](docs/OrganisationApi.md#deleteOrganisationAddressesId) | **DELETE** /v1/organisation/addresses/{id} | Delete an address. This is not recoverable.                                              |
| _OrganisationApi_ | [**deleteOrganisationPresetsId**](docs/OrganisationApi.md#deleteOrganisationPresetsId)     | **DELETE** /v1/organisation/presets/{id}   | Delete specified preset.                                                                 |
| _OrganisationApi_ | [**deleteOrganisationRolesId**](docs/OrganisationApi.md#deleteOrganisationRolesId)         | **DELETE** /v1/organisation/roles/{id}     | Delete a role. Role must not be assigned to any users. This is not recoverable.          |
| _OrganisationApi_ | [**deleteOrganisationTokensId**](docs/OrganisationApi.md#deleteOrganisationTokensId)       | **DELETE** /v1/organisation/tokens/{id}    | Delete a Token. Token will no longer authenticate API requests. This is not recoverable. |
| _OrganisationApi_ | [**deleteOrganisationUsersId**](docs/OrganisationApi.md#deleteOrganisationUsersId)         | **DELETE** /v1/organisation/users/{id}     | Remove a user from the organisation.                                                     |
| _OrganisationApi_ | [**getOrganisation**](docs/OrganisationApi.md#getOrganisation)                             | **GET** /v1/organisation                   | Get your Fingoti organisaiton information.                                               |
| _OrganisationApi_ | [**getOrganisationAddresses**](docs/OrganisationApi.md#getOrganisationAddresses)           | **GET** /v1/organisation/addresses         | Get all addresses.                                                                       |
| _OrganisationApi_ | [**getOrganisationAddressesId**](docs/OrganisationApi.md#getOrganisationAddressesId)       | **GET** /v1/organisation/addresses/{id}    | Get specified address.                                                                   |
| _OrganisationApi_ | [**getOrganisationPartner**](docs/OrganisationApi.md#getOrganisationPartner)               | **GET** /v1/organisation/partner           | Get partner information.                                                                 |
| _OrganisationApi_ | [**getOrganisationPresets**](docs/OrganisationApi.md#getOrganisationPresets)               | **GET** /v1/organisation/presets           | Get all presets.                                                                         |
| _OrganisationApi_ | [**getOrganisationPresetsId**](docs/OrganisationApi.md#getOrganisationPresetsId)           | **GET** /v1/organisation/presets/{id}      | Get specified preset.                                                                    |
| _OrganisationApi_ | [**getOrganisationRoles**](docs/OrganisationApi.md#getOrganisationRoles)                   | **GET** /v1/organisation/roles             | Get all roles.                                                                           |
| _OrganisationApi_ | [**getOrganisationRolesId**](docs/OrganisationApi.md#getOrganisationRolesId)               | **GET** /v1/organisation/roles/{id}        | Get specified role.                                                                      |
| _OrganisationApi_ | [**getOrganisationTenants**](docs/OrganisationApi.md#getOrganisationTenants)               | **GET** /v1/organisation/tenants           | Get all tenants.                                                                         |
| _OrganisationApi_ | [**getOrganisationTokens**](docs/OrganisationApi.md#getOrganisationTokens)                 | **GET** /v1/organisation/tokens            | Get all API tokens.                                                                      |
| _OrganisationApi_ | [**getOrganisationTokensId**](docs/OrganisationApi.md#getOrganisationTokensId)             | **GET** /v1/organisation/tokens/{id}       | Get specified token.                                                                     |
| _OrganisationApi_ | [**getOrganisationUsers**](docs/OrganisationApi.md#getOrganisationUsers)                   | **GET** /v1/organisation/users             | Get all users.                                                                           |
| _OrganisationApi_ | [**getOrganisationUsersId**](docs/OrganisationApi.md#getOrganisationUsersId)               | **GET** /v1/organisation/users/{id}        | Get specidfied user.                                                                     |
| _OrganisationApi_ | [**patchOrganisation**](docs/OrganisationApi.md#patchOrganisation)                         | **PATCH** /v1/organisation                 | Update your Fingoti organisation.                                                        |
| _OrganisationApi_ | [**patchOrganisationAddressesId**](docs/OrganisationApi.md#patchOrganisationAddressesId)   | **PATCH** /v1/organisation/addresses/{id}  | Update organisation address.                                                             |
| _OrganisationApi_ | [**patchOrganisationPresetsId**](docs/OrganisationApi.md#patchOrganisationPresetsId)       | **PATCH** /v1/organisation/presets/{id}    | Update organisation preset.                                                              |
| _OrganisationApi_ | [**patchOrganisationRolesId**](docs/OrganisationApi.md#patchOrganisationRolesId)           | **PATCH** /v1/organisation/roles/{id}      | Update organisation role.                                                                |
| _OrganisationApi_ | [**patchOrganisationTokensId**](docs/OrganisationApi.md#patchOrganisationTokensId)         | **PATCH** /v1/organisation/tokens/{id}     | Update API token.                                                                        |
| _OrganisationApi_ | [**patchOrganisationUsersId**](docs/OrganisationApi.md#patchOrganisationUsersId)           | **PATCH** /v1/organisation/users/{id}      | Update organisation user.                                                                |
| _OrganisationApi_ | [**postOrganisation**](docs/OrganisationApi.md#postOrganisation)                           | **POST** /v1/organisation                  | Register a new Fingoti organisation.                                                     |
| _OrganisationApi_ | [**postOrganisationAddresses**](docs/OrganisationApi.md#postOrganisationAddresses)         | **POST** /v1/organisation/addresses        | Create a new address.                                                                    |
| _OrganisationApi_ | [**postOrganisationPresets**](docs/OrganisationApi.md#postOrganisationPresets)             | **POST** /v1/organisation/presets          | Create a new preset.                                                                     |
| _OrganisationApi_ | [**postOrganisationRoles**](docs/OrganisationApi.md#postOrganisationRoles)                 | **POST** /v1/organisation/roles            | Create a new role.                                                                       |
| _OrganisationApi_ | [**postOrganisationTenants**](docs/OrganisationApi.md#postOrganisationTenants)             | **POST** /v1/organisation/tenants          | Create new tenant. This is only available to partner organisations.                      |
| _OrganisationApi_ | [**postOrganisationTokens**](docs/OrganisationApi.md#postOrganisationTokens)               | **POST** /v1/organisation/tokens           | Generate new API token.                                                                  |
| _OrganisationApi_ | [**postOrganisationUsers**](docs/OrganisationApi.md#postOrganisationUsers)                 | **POST** /v1/organisation/users            | Invite a new user to the organisation.                                                   |
| _ReportApi_       | [**getReportIdCommands**](docs/ReportApi.md#getReportIdCommands)                           | **GET** /v1/report/{id}/commands           | Retrieve command log                                                                     |
| _ReportApi_       | [**getReportUsage**](docs/ReportApi.md#getReportUsage)                                     | **GET** /v1/report/usage                   | Retrieve property usage statistics per day per device                                    |
| _UserApi_         | [**deleteUserTokensId**](docs/UserApi.md#deleteUserTokensId)                               | **DELETE** /v1/user/tokens/{id}            | Delete a Token. Token will no longer authenticate API requests. This is not recoverable. |
| _UserApi_         | [**getUser**](docs/UserApi.md#getUser)                                                     | **GET** /v1/user                           | Get your Fingoti user.                                                                   |
| _UserApi_         | [**getUserOrganisations**](docs/UserApi.md#getUserOrganisations)                           | **GET** /v1/user/organisations             | Get all organisations you are a member of.                                               |
| _UserApi_         | [**getUserSessions**](docs/UserApi.md#getUserSessions)                                     | **GET** /v1/user/sessions                  | Get all user sessions.                                                                   |
| _UserApi_         | [**getUserTokens**](docs/UserApi.md#getUserTokens)                                         | **GET** /v1/user/tokens                    | Get all API tokens.                                                                      |
| _UserApi_         | [**getUserTokensId**](docs/UserApi.md#getUserTokensId)                                     | **GET** /v1/user/tokens/{id}               | Get specified token.                                                                     |
| _UserApi_         | [**patchUser**](docs/UserApi.md#patchUser)                                                 | **PATCH** /v1/user                         | Update Fingoti user.                                                                     |
| _UserApi_         | [**patchUserTokensId**](docs/UserApi.md#patchUserTokensId)                                 | **PATCH** /v1/user/tokens/{id}             | Update API token.                                                                        |
| _UserApi_         | [**postUser**](docs/UserApi.md#postUser)                                                   | **POST** /v1/user                          | Register a new Fingoti user.                                                             |
| _UserApi_         | [**postUserTokens**](docs/UserApi.md#postUserTokens)                                       | **POST** /v1/user/tokens                   | Generate new API token.                                                                  |
| _WebhookApi_      | [**deleteWebhookId**](docs/WebhookApi.md#deleteWebhookId)                                  | **DELETE** /v1/webhook/{id}                | Delete a Webhook. This is not recoverable.                                               |
| _WebhookApi_      | [**getWebhook**](docs/WebhookApi.md#getWebhook)                                            | **GET** /v1/webhook                        | Get all registered webhooks.                                                             |
| _WebhookApi_      | [**getWebhookId**](docs/WebhookApi.md#getWebhookId)                                        | **GET** /v1/webhook/{id}                   | Get specified webhook.                                                                   |
| _WebhookApi_      | [**getWebhookLogs**](docs/WebhookApi.md#getWebhookLogs)                                    | **GET** /v1/webhook/logs                   | Get all registered webhooks with call logs.                                              |
| _WebhookApi_      | [**patchWebhookId**](docs/WebhookApi.md#patchWebhookId)                                    | **PATCH** /v1/webhook/{id}                 | Update Fingoti webhook.                                                                  |
| _WebhookApi_      | [**postWebhook**](docs/WebhookApi.md#postWebhook)                                          | **POST** /v1/webhook                       | Register a new webhook.                                                                  |
| _WebhookApi_      | [**postWebhookRetry**](docs/WebhookApi.md#postWebhookRetry)                                | **POST** /v1/webhook/retry                 | Retry a webhook.                                                                         |

## Documentation for Models

- [AddAddressRequest](docs/AddAddressRequest.md)
- [AddFollowDto](docs/AddFollowDto.md)
- [AddPresetRequest](docs/AddPresetRequest.md)
- [AddPresetResult](docs/AddPresetResult.md)
- [AddRoleRequest](docs/AddRoleRequest.md)
- [AddWebhookDto](docs/AddWebhookDto.md)
- [AddWebhookResult](docs/AddWebhookResult.md)
- [AllWebhooksDto](docs/AllWebhooksDto.md)
- [AzureMessage](docs/AzureMessage.md)
- [AzureMessageContent](docs/AzureMessageContent.md)
- [CallLogDto](docs/CallLogDto.md)
- [ClaimRequest](docs/ClaimRequest.md)
- [ClaimResult](docs/ClaimResult.md)
- [ClaimedDeviceResponse](docs/ClaimedDeviceResponse.md)
- [ClaimedDevicesDto](docs/ClaimedDevicesDto.md)
- [CloudReason](docs/CloudReason.md)
- [CommandDirection](docs/CommandDirection.md)
- [CommandLogResponse](docs/CommandLogResponse.md)
- [DataLogResponse](docs/DataLogResponse.md)
- [DefaultWithId](docs/DefaultWithId.md)
- [DefaultWithToken](docs/DefaultWithToken.md)
- [DeviceBlink](docs/DeviceBlink.md)
- [DeviceBus](docs/DeviceBus.md)
- [DeviceCloud](docs/DeviceCloud.md)
- [DeviceLocation](docs/DeviceLocation.md)
- [DeviceNodesResponse](docs/DeviceNodesResponse.md)
- [DevicePeblDto](docs/DevicePeblDto.md)
- [DevicePower](docs/DevicePower.md)
- [DeviceRequest](docs/DeviceRequest.md)
- [DeviceSession](docs/DeviceSession.md)
- [DeviceSupport](docs/DeviceSupport.md)
- [DeviceUptime](docs/DeviceUptime.md)
- [DeviceVersion](docs/DeviceVersion.md)
- [DeviceVyneDto](docs/DeviceVyneDto.md)
- [EngineWebhookDto](docs/EngineWebhookDto.md)
- [EngineWebhookResponse](docs/EngineWebhookResponse.md)
- [EngineWebhooksResponse](docs/EngineWebhooksResponse.md)
- [GatewayClaim](docs/GatewayClaim.md)
- [GatewayGpio](docs/GatewayGpio.md)
- [GatewayI2c](docs/GatewayI2c.md)
- [GatewayMqtt](docs/GatewayMqtt.md)
- [GatewayNetwork](docs/GatewayNetwork.md)
- [GatewayNode](docs/GatewayNode.md)
- [GatewaySchedule](docs/GatewaySchedule.md)
- [GatewayTimer](docs/GatewayTimer.md)
- [GatewayUart](docs/GatewayUart.md)
- [GatewayWifi](docs/GatewayWifi.md)
- [GetProfileResponse](docs/GetProfileResponse.md)
- [I2cSetup](docs/I2cSetup.md)
- [InviteUserDto](docs/InviteUserDto.md)
- [LocationPort](docs/LocationPort.md)
- [MessageType](docs/MessageType.md)
- [ModelDefault](docs/ModelDefault.md)
- [MqttDeviceResponse](docs/MqttDeviceResponse.md)
- [MqttSetup](docs/MqttSetup.md)
- [MqttStatus](docs/MqttStatus.md)
- [NetworkIp](docs/NetworkIp.md)
- [NetworkMac](docs/NetworkMac.md)
- [NewOrganisationTokenDto](docs/NewOrganisationTokenDto.md)
- [NewUserTokenDto](docs/NewUserTokenDto.md)
- [NodeAddress](docs/NodeAddress.md)
- [NodeData](docs/NodeData.md)
- [NodeDetect](docs/NodeDetect.md)
- [NodeLocation](docs/NodeLocation.md)
- [OrganisationAddressResponse](docs/OrganisationAddressResponse.md)
- [OrganisationAddressesDto](docs/OrganisationAddressesDto.md)
- [OrganisationFollowing](docs/OrganisationFollowing.md)
- [OrganisationFollowingResponse](docs/OrganisationFollowingResponse.md)
- [OrganisationPartnerResponse](docs/OrganisationPartnerResponse.md)
- [OrganisationPresetResponse](docs/OrganisationPresetResponse.md)
- [OrganisationPresetsDto](docs/OrganisationPresetsDto.md)
- [OrganisationResponse](docs/OrganisationResponse.md)
- [OrganisationRoleResponse](docs/OrganisationRoleResponse.md)
- [OrganisationRolesDto](docs/OrganisationRolesDto.md)
- [OrganisationTenantDto](docs/OrganisationTenantDto.md)
- [OrganisationTenantsResponse](docs/OrganisationTenantsResponse.md)
- [OrganisationUserResponse](docs/OrganisationUserResponse.md)
- [OrganisationUsersDto](docs/OrganisationUsersDto.md)
- [PartnerAddress](docs/PartnerAddress.md)
- [PartnerContact](docs/PartnerContact.md)
- [PatchAddressRequest](docs/PatchAddressRequest.md)
- [PatchDevice](docs/PatchDevice.md)
- [PatchFollowRequest](docs/PatchFollowRequest.md)
- [PatchGateway](docs/PatchGateway.md)
- [PatchOrganisationRequest](docs/PatchOrganisationRequest.md)
- [PatchOrganisationTokenRequest](docs/PatchOrganisationTokenRequest.md)
- [PatchPresetRequest](docs/PatchPresetRequest.md)
- [PatchRoleRequest](docs/PatchRoleRequest.md)
- [PatchUserRequest](docs/PatchUserRequest.md)
- [PatchUserTokenRequest](docs/PatchUserTokenRequest.md)
- [PatchWebhookRequest](docs/PatchWebhookRequest.md)
- [PeblDevice](docs/PeblDevice.md)
- [PeblGateway](docs/PeblGateway.md)
- [PortalUserOrganisationsDto](docs/PortalUserOrganisationsDto.md)
- [RegiserOrganisationDto](docs/RegiserOrganisationDto.md)
- [RegiserTenantDto](docs/RegiserTenantDto.md)
- [RegisterOrganisationResult](docs/RegisterOrganisationResult.md)
- [RegisterUserDto](docs/RegisterUserDto.md)
- [RequestOperation](docs/RequestOperation.md)
- [ScheduleSetup](docs/ScheduleSetup.md)
- [ScheduleStatus](docs/ScheduleStatus.md)
- [TimerRequest](docs/TimerRequest.md)
- [TimerStatus](docs/TimerStatus.md)
- [TokenSuccessResponse](docs/TokenSuccessResponse.md)
- [UartSetup](docs/UartSetup.md)
- [UartTrigger](docs/UartTrigger.md)
- [UpdateRequest](docs/UpdateRequest.md)
- [UpdateResponse](docs/UpdateResponse.md)
- [UpdateUserRole](docs/UpdateUserRole.md)
- [UsageTracking](docs/UsageTracking.md)
- [UsageTrackingResponse](docs/UsageTrackingResponse.md)
- [UserOrganisationsDto](docs/UserOrganisationsDto.md)
- [UserSessionsDto](docs/UserSessionsDto.md)
- [UserSessionsResponse](docs/UserSessionsResponse.md)
- [UserTokenDto](docs/UserTokenDto.md)
- [UserTokenResponse](docs/UserTokenResponse.md)
- [VyneDevice](docs/VyneDevice.md)
- [VyneGateway](docs/VyneGateway.md)
- [VyneNode](docs/VyneNode.md)
- [WebhookAttempts](docs/WebhookAttempts.md)
- [WebhookCallDto](docs/WebhookCallDto.md)
- [WebhookHeaders](docs/WebhookHeaders.md)
- [WebhookLogsResponse](docs/WebhookLogsResponse.md)
- [WebhookRetry](docs/WebhookRetry.md)
- [WebhookRetryRequest](docs/WebhookRetryRequest.md)
- [WebhookStatus](docs/WebhookStatus.md)
- [WifiDetect](docs/WifiDetect.md)
- [WifiSlot](docs/WifiSlot.md)
- [WifiStatus](docs/WifiStatus.md)
