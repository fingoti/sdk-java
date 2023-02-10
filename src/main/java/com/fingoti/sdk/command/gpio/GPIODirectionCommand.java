package com.fingoti.sdk.command.gpio;

import com.fingoti.sdk.models.RequestOperation;

public class GPIODirectionCommand {
    public String property = "gpioDirection";
    public RequestOperation operation;
    public Object payload = null;

    public GPIODirectionCommand() {
        operation = RequestOperation.READ;
    }

    public GPIODirectionCommand(GPIOAllDirectionPayload _payload) {
        operation = RequestOperation.WRITE;
        payload = _payload;
    }

    public GPIODirectionCommand(GPIODirectionPayload _payload) {
        operation = RequestOperation.WRITE;
        payload = _payload;
    }

    public GPIODirectionCommand(GPIOSavePayload _payload) {
        operation = RequestOperation.WRITE;
        payload = _payload;
    }
}
