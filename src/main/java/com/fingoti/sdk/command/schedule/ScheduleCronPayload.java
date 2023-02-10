package com.fingoti.sdk.command.schedule;

public class ScheduleCronPayload {
    public int slot;
    public String cron;

    public ScheduleCronPayload(int _slot, String _cron) {
        slot = _slot;
        cron = _cron;
    } 
}
