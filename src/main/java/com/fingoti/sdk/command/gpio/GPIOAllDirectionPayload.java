package com.fingoti.sdk.command.gpio;

public class GPIOAllDirectionPayload {
    public GPIODirection[] direction;
    public Boolean save;

    public GPIOAllDirectionPayload(GPIODirection[] _direction, Boolean _save) {
        direction = _direction;
        save = _save;
    }
}
