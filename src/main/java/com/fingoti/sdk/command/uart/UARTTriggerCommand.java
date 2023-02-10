package com.fingoti.sdk.command.uart;

import com.fingoti.sdk.models.RequestOperation;

public class UARTTriggerCommand {
    public String property = "uartTrigger";
    public RequestOperation operation;
    public UARTTriggerPayload payload = null;

    public UARTTriggerCommand() {
        operation = RequestOperation.READ;
    }

    public UARTTriggerCommand(UARTTriggerPayload _payload) {
        operation = RequestOperation.WRITE;
        payload = _payload;
    }
}
