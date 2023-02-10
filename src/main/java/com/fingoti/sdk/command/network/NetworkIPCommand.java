package com.fingoti.sdk.command.network;

import com.fingoti.sdk.models.RequestOperation;

public class NetworkIPCommand {
    public String property = "networkIp";
    public RequestOperation operation;
    public NetworkIPPayload payload;

    public NetworkIPCommand() {
        operation = RequestOperation.READ;
    }

    public NetworkIPCommand(NetworkIPPayload _payload) {
        operation = RequestOperation.WRITE;
        payload = _payload;
    }
}