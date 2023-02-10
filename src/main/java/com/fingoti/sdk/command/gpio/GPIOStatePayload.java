package com.fingoti.sdk.command.gpio;

public class GPIOStatePayload {
    public int gpio;
    public GPIOState value;
    public Boolean save;

    public GPIOStatePayload(int _gpio, GPIOState _state, Boolean _save) {
        gpio = _gpio;
        value = _state;
        save = _save;
    }
}
