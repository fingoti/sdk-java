package com.fingoti.sdk.command.device;

import com.fingoti.sdk.models.RequestOperation;

public class DeviceColourCommand {
    public String property = "deviceColour";
    public RequestOperation operation;
    public DeviceColourPayload payload = null;

    public DeviceColourCommand() {
        operation = RequestOperation.READ;
    }

    public DeviceColourCommand(DeviceColourPayload _payload) {
        operation = RequestOperation.WRITE;
        payload = _payload;
    }
}
