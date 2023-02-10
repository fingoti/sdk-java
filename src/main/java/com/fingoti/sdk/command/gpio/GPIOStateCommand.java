package com.fingoti.sdk.command.gpio;

import com.fingoti.sdk.models.RequestOperation;

public class GPIOStateCommand {
    public String property = "gpioState";
    public RequestOperation operation;
    public Object payload = null;

    public GPIOStateCommand() {
        operation = RequestOperation.READ;
    }

    public GPIOStateCommand(GPIOAllStatePayload _payload) {
        operation = RequestOperation.WRITE;
        payload = _payload;
    }

    public GPIOStateCommand(GPIOStatePayload _payload) {
        operation = RequestOperation.WRITE;
        payload = _payload;
    }

    public GPIOStateCommand(GPIOSavePayload _payload) {
        operation = RequestOperation.WRITE;
        payload = _payload;
    }
}
