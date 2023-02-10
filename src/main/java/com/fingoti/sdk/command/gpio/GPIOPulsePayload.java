package com.fingoti.sdk.command.gpio;

public class GPIOPulsePayload {
    public int gpio;
    public int duration;

    public GPIOPulsePayload(int _gpio, int _duration) {
        gpio = _gpio;
        duration = _duration;
    }
}
