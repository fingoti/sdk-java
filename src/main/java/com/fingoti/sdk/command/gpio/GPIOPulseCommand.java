package com.fingoti.sdk.command.gpio;

import com.fingoti.sdk.models.RequestOperation;

public class GPIOPulseCommand {
    public String property = "gpioPulse";
    public RequestOperation operation = RequestOperation.WRITE;
    public GPIOPulsePayload payload = null;

    public GPIOPulseCommand(GPIOPulsePayload _payload) {
        payload = _payload;
    }
}
