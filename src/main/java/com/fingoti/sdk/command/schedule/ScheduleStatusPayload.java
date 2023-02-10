package com.fingoti.sdk.command.schedule;

public class ScheduleStatusPayload {
    public int slot;
    public Boolean enabled = null;

    public ScheduleStatusPayload(int _slot, Boolean _enabled) {
        slot = _slot;
        enabled = _enabled;
    }
}
