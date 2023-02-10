package com.fingoti.sdk.command.i2c;

import com.fingoti.sdk.models.RequestOperation;

public class I2CSetupCommand {
    public String property = "i2cSetup";
    public RequestOperation operation;
    public I2CSetupPayload payload = null;

    public I2CSetupCommand() {
        operation = RequestOperation.READ;
    }

    public I2CSetupCommand(I2CSetupPayload _payload) {
        operation = RequestOperation.WRITE;
        payload = _payload;
    }

}
