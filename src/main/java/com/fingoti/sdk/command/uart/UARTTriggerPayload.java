package com.fingoti.sdk.command.uart;

public class UARTTriggerPayload {
  public Integer length = null;
  public Integer[] terminator = null;

  public UARTTriggerPayload(Integer _length) {
    length = _length;
  }

  public UARTTriggerPayload(Integer[] _terminator) {
    terminator = _terminator;
  }
}