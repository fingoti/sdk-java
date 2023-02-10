package com.fingoti.sdk.command.timer;

import com.fingoti.sdk.models.RequestOperation;

public class TimerRequestCommand {
  public String property = "timerRequest";
  public RequestOperation operation;
  public TimerRequestPayload payload;

  public TimerRequestCommand() {
    operation = RequestOperation.READ;
  }

  public TimerRequestCommand(TimerRequestPayload  _payload) {
    operation = RequestOperation.WRITE;
    payload = _payload;
  }
}
