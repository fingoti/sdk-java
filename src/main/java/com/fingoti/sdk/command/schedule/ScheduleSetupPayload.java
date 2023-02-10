package com.fingoti.sdk.command.schedule;

public class ScheduleSetupPayload {
    public int slot;
    public Boolean clear = null;

    public ScheduleSetupPayload(int _slot, Boolean _clear) {
        slot = _slot;
        clear = _clear;
    }
}
