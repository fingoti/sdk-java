package com.fingoti.sdk.command.schedule;

import com.fingoti.sdk.models.RequestOperation;

public class ScheduleRequestCommand {
    public String property = "scheduleRequest";
    public RequestOperation operation;
    public ScheduleRequestPayload payload;

    public ScheduleRequestCommand (int slot) {
        operation = RequestOperation.READ;
        payload = new ScheduleRequestPayload (slot, null);
    }

    public ScheduleRequestCommand (ScheduleRequestPayload  _payload) {
        operation = RequestOperation.WRITE;
        payload = _payload;
    }
}
