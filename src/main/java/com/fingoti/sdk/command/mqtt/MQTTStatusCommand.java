package com.fingoti.sdk.command.mqtt;

import com.fingoti.sdk.models.RequestOperation;

public class MQTTStatusCommand {
    public String property = "mqttStatus";
    public RequestOperation operation;
    public MQTTStatusPayload payload = null;

    public MQTTStatusCommand() {
        operation = RequestOperation.READ;
    }

    public MQTTStatusCommand(MQTTStatusPayload _payload) {
        operation = RequestOperation.WRITE;
        payload = _payload;
    }
}
