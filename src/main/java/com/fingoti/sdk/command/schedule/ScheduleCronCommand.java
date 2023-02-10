package com.fingoti.sdk.command.schedule;

import com.fingoti.sdk.models.RequestOperation;

public class ScheduleCronCommand {
    public String property = "scheduleCron";
    public RequestOperation operation;
    public ScheduleCronPayload payload;

    public ScheduleCronCommand (int slot) {
        operation = RequestOperation.READ;
        payload = new ScheduleCronPayload(slot, null);
    }

    public ScheduleCronCommand (ScheduleCronPayload _payload) {
        operation = RequestOperation.WRITE;
        payload = _payload;
    }
}
