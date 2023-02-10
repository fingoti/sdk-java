package com.fingoti.sdk.command.uart;

import com.fingoti.sdk.models.RequestOperation;

public class UARTModeCommand {
    public String property = "uartMode";
    public RequestOperation operation;
    public UARTModePayload payload = null;

    public UARTModeCommand() {
        operation = RequestOperation.READ;
    }

    public UARTModeCommand(UARTModePayload _payload) {
        operation = RequestOperation.WRITE;
        payload = _payload;
    }
}
