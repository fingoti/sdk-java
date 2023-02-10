package com.fingoti.sdk.command.mqtt;

import com.fingoti.sdk.models.RequestOperation;

public class MQTTSessionCommand {
    public String property = "mqttSession";
    public RequestOperation operation;
    public MQTTSessionPayload payload = null;

    public MQTTSessionCommand() {
        operation = RequestOperation.READ;
    }

    public MQTTSessionCommand(MQTTSessionPayload _payload) {
        operation = RequestOperation.WRITE;
        payload = _payload;
    }
}
