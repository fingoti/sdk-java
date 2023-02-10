package com.fingoti.sdk.command.i2c;


public class I2CSetupPayload {
    public int speed;
    public Boolean scan;

    public I2CSetupPayload(int _speed, Boolean _scan) {
        speed = _speed;
        scan = _scan;
    }
}
