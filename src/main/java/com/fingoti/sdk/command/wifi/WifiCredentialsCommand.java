package com.fingoti.sdk.command.wifi;

import com.fingoti.sdk.models.RequestOperation;

public class WifiCredentialsCommand {
  public String property = "wifiCredentials";
  public RequestOperation operation;
  public WifiCredentialsPayload payload;

  public WifiCredentialsCommand () {
    operation = RequestOperation.READ;
  }

  public WifiCredentialsCommand (WifiCredentialsPayload _payload) {
      operation = RequestOperation.WRITE;
      payload = _payload;
  }
}
