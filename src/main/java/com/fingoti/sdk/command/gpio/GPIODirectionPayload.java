package com.fingoti.sdk.command.gpio;

public class GPIODirectionPayload {
    public int gpio;
    public GPIODirection value;
    public Boolean save;

    public GPIODirectionPayload(int _gpio, GPIODirection _direction, Boolean _save) {
        gpio = _gpio;
        value = _direction;
        save = _save;
    }
}
