package com.fingoti.sdk.command.device;

import com.fingoti.sdk.models.RequestOperation;

public class DeviceBlinkCommand {
    public String property = "deviceBlink";
    public RequestOperation operation;
    public DeviceBlinkPayload payload = null;

    public DeviceBlinkCommand() {
        operation = RequestOperation.READ;
    }

    public DeviceBlinkCommand(DeviceBlinkPayload _payload) {
        operation = RequestOperation.WRITE;
        payload = _payload;
    }
}
