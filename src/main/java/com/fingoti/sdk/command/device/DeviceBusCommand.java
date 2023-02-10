package com.fingoti.sdk.command.device;

import com.fingoti.sdk.models.RequestOperation;

public class DeviceBusCommand {
    public String property = "deviceBus";
    public RequestOperation operation;
    public DeviceBusPayload payload = null;

    public DeviceBusCommand() {
        operation = RequestOperation.READ;
    }

    public DeviceBusCommand(DeviceBusPayload _payload) {
        operation = RequestOperation.WRITE;
        payload = _payload;
    }
}
