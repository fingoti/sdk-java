package com.fingoti.sdk.command.timer;

import com.fingoti.sdk.models.RequestOperation;

public class TimerIntervalCommand {
  public String property = "timerInterval";
  public RequestOperation operation;
  public TimerIntervalPayload payload;

  public TimerIntervalCommand() {
    operation = RequestOperation.READ;
  }

  public TimerIntervalCommand(TimerIntervalPayload  _payload) {
    operation = RequestOperation.WRITE;
    payload = _payload;
  }
}
