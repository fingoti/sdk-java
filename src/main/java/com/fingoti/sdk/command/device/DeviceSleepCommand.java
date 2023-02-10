package com.fingoti.sdk.command.device;

import com.fingoti.sdk.models.RequestOperation;

public class DeviceSleepCommand {
    public String property = "deviceSleep";
    public RequestOperation operation;
    public DeviceSleepPayload payload = null;

    public DeviceSleepCommand() {
        operation = RequestOperation.READ;
    }

    public DeviceSleepCommand(DeviceSleepPayload _payload) {
        operation = RequestOperation.WRITE;
        payload = _payload;
    }
}
