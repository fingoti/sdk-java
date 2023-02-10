/*
 * Fingoti API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.fingoti.sdk.api;

import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.models.ClaimRequest;
import com.fingoti.sdk.models.ClaimResult;
import com.fingoti.sdk.models.ClaimedDeviceResponse;
import com.fingoti.sdk.models.ClaimedDevicesDto;
import com.fingoti.sdk.models.DeviceNodesResponse;
import com.fingoti.sdk.models.DeviceRequest;
import com.fingoti.sdk.models.ModelDefault;
import com.fingoti.sdk.models.MqttDeviceResponse;
import java.time.OffsetDateTime;
import com.fingoti.sdk.models.PatchGateway;
import com.fingoti.sdk.models.UpdateRequest;
import com.fingoti.sdk.models.UpdateResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DeviceApi
 */
@Disabled
public class DeviceApiTest {

    private final DeviceApi api = new DeviceApi();

    /**
     * Unclaim a Fingoti device.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteDeviceIdTest() throws ApiException {
        String id = null;
        UpdateResponse response = api.deleteDeviceId(id);
        // TODO: test validations
    }

    /**
     * Get all devices.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDeviceTest() throws ApiException {
        OffsetDateTime lastUpdated = null;
        ClaimedDevicesDto response = api.getDevice(lastUpdated);
        // TODO: test validations
    }

    /**
     * Get specified device.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDeviceIdTest() throws ApiException {
        String id = null;
        ClaimedDeviceResponse response = api.getDeviceId(id);
        // TODO: test validations
    }

    /**
     * Get all nodes latched to a gateway.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDeviceIdNodesTest() throws ApiException {
        String id = null;
        DeviceNodesResponse response = api.getDeviceIdNodes(id);
        // TODO: test validations
    }

    /**
     * Update your Fingoti device.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void patchDeviceIdTest() throws ApiException {
        String id = null;
        PatchGateway patchGateway = null;
        ModelDefault response = api.patchDeviceId(id, patchGateway);
        // TODO: test validations
    }

    /**
     * Claim a new Fingoti device.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postDeviceTest() throws ApiException {
        ClaimRequest claimRequest = null;
        ClaimResult response = api.postDevice(claimRequest);
        // TODO: test validations
    }

    /**
     * Send a request to a Fingoti device.
     *
     * The payload object varies depending on the property used, please refer to our protocol documentation &lt;a href&#x3D;\&quot;https://help.fingoti.com\&quot;&gt;here&lt;/a&gt; for more infomation. &lt;br /&gt;   Multiple objects can be sent in the request array and will be executed in order.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postDeviceSendrequestTest() throws ApiException {
        DeviceRequest deviceRequest = null;
        MqttDeviceResponse response = api.postDeviceSendrequest(deviceRequest);
        // TODO: test validations
    }

    /**
     * Initiate a device update.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postDeviceUpdateTest() throws ApiException {
        UpdateRequest updateRequest = null;
        MqttDeviceResponse response = api.postDeviceUpdate(updateRequest);
        // TODO: test validations
    }

}