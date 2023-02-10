package com.fingoti.sdk.command.device;

import com.fingoti.sdk.models.RequestOperation;

public class DeviceActivityCommand {
    public String property = "deviceActivity";
    public RequestOperation operation;
    public DeviceActivityPayload payload = null;

    public DeviceActivityCommand() {
        operation = RequestOperation.READ;
    }

    public DeviceActivityCommand(DeviceActivityPayload _payload) {
        operation = RequestOperation.WRITE;
        payload = _payload;
    }
}
