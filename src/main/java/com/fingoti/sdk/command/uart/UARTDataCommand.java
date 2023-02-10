package com.fingoti.sdk.command.uart;

import com.fingoti.sdk.models.RequestOperation;

public class UARTDataCommand {
  public String property = "uartData";
  public RequestOperation operation = RequestOperation.WRITE;
  public UARTDataPayload payload;

  public UARTDataCommand (UARTDataPayload _payload) {
      payload = _payload;
  }
}
