package com.fingoti.sdk.command.timer;

public class TimerStatusPayload {
  public Boolean enabled;
  public Boolean repeat;

  public TimerStatusPayload(Boolean _enabled, Boolean _repeat) {
      enabled = _enabled;
      repeat = _repeat;
  }
}
