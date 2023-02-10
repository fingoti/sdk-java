package com.fingoti.sdk.command.i2c;

import com.fingoti.sdk.models.RequestOperation;

public class I2CDataCommand {
    public String property = "i2cData";
    public RequestOperation operation = RequestOperation.WRITE;
    public I2CDataPayload payload = null;

    public I2CDataCommand(I2CDataPayload _payload) {
        payload = _payload;
    }
}
