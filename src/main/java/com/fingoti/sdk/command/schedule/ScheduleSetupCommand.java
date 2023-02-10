package com.fingoti.sdk.command.schedule;

import com.fingoti.sdk.models.RequestOperation;

public class ScheduleSetupCommand {
    public String property = "scheduleSetup";
    public RequestOperation operation;
    public ScheduleSetupPayload payload;

    public ScheduleSetupCommand (int slot) {
        operation = RequestOperation.READ;
        payload = new ScheduleSetupPayload (slot, null);
    }

    public ScheduleSetupCommand (ScheduleSetupPayload _payload) {
        operation = RequestOperation.WRITE;
        payload = _payload;
    }
}
