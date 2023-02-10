package com.fingoti.sdk.command.schedule;

import com.fingoti.sdk.models.RequestOperation;

public class ScheduleStatusCommand {
    public String property = "scheduleStatus";
    public RequestOperation operation;
    public ScheduleStatusPayload payload;

    public ScheduleStatusCommand (int slot) {
        operation = RequestOperation.READ;
        payload = new ScheduleStatusPayload(slot, null);
    }

    public ScheduleStatusCommand (ScheduleStatusPayload _payload) {
        operation = RequestOperation.WRITE;
        payload = _payload;
    }
}
