package com.fingoti.sdk.command.timer;

import com.fingoti.sdk.models.RequestOperation;

public class TimerStatusCommand {
  public String property = "timerStatus";
  public RequestOperation operation;
  public TimerStatusPayload payload;

  public TimerStatusCommand() {
    operation = RequestOperation.READ;
  }

  public TimerStatusCommand(TimerStatusPayload  _payload) {
    operation = RequestOperation.WRITE;
    payload = _payload;
  }
}
