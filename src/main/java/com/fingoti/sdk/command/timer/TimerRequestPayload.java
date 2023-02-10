package com.fingoti.sdk.command.timer;

import com.fingoti.sdk.models.Command;

public class TimerRequestPayload {
  public Command[] request;

  public TimerRequestPayload(Command[] _request) {
      request = _request;
  }
}
