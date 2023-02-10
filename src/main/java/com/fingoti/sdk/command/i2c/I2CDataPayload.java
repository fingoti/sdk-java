package com.fingoti.sdk.command.i2c;

public class I2CDataPayload {
    public int address;
    public String[] profile;

    public I2CDataPayload(int _address, String[] _profile) {
        address = _address;
        profile = _profile;
    }
}
