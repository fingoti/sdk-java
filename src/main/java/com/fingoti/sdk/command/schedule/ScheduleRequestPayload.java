package com.fingoti.sdk.command.schedule;

import com.fingoti.sdk.models.Command;

public class ScheduleRequestPayload {
    public int slot;
    public Command[] request;

    public ScheduleRequestPayload(int _slot, Command[] _request) {
        slot = _slot;
        request = _request;
    }
}
