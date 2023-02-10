package com.fingoti.sdk.command.wifi;

import com.fingoti.sdk.models.RequestOperation;

public class WifiStatusCommand {
  public String property = "wifiStatus";
  public RequestOperation operation;
  public WifiStatusPayload payload;

  public WifiStatusCommand() {
    operation = RequestOperation.READ;
  }

  public WifiStatusCommand(WifiStatusPayload _payload) {
    operation = RequestOperation.WRITE;
    payload = _payload;
  }
}
