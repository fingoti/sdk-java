package com.fingoti.sdk.command.gpio;

public class GPIOAllStatePayload {
    public GPIOState[] state;
    public Boolean save;

    public GPIOAllStatePayload(GPIOState[] _state, Boolean _save) {
        state = _state;
        save = _save;
    }
}
