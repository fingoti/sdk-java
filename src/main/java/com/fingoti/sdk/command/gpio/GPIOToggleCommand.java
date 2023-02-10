package com.fingoti.sdk.command.gpio;

import com.fingoti.sdk.models.RequestOperation;

public class GPIOToggleCommand {
    public String property = "gpioToggle";
    public RequestOperation operation = RequestOperation.WRITE;
    public GPIOTogglePayload payload = null;

    public GPIOToggleCommand(GPIOTogglePayload _payload) {
        payload = _payload;
    }
}

