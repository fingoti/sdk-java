package com.fingoti.sdk.command.uart;

import com.fingoti.sdk.models.RequestOperation;

public class UARTSessionCommand {
    public String property = "uartSession";
    public RequestOperation operation;
    public UARTSessionPayload  payload = null;

    public UARTSessionCommand() {
        operation = RequestOperation.READ;
    }

    public UARTSessionCommand(UARTSessionPayload _payload) {
        operation = RequestOperation.WRITE;
        payload = _payload;
    }
}
