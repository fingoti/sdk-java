package com.fingoti.sdk.command.uart;

import com.fingoti.sdk.models.RequestOperation;

public class UARTSetupCommand {
    public String property = "uartSetup";
    public RequestOperation operation;
    public UARTSetupPayload payload = null;

    public UARTSetupCommand() {
        operation = RequestOperation.READ;
    }

    public UARTSetupCommand(UARTSetupPayload _payload) {
        operation = RequestOperation.WRITE;
        payload = _payload;
    }
}
