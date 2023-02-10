package com.fingoti.sdk.command.mqtt;

import com.fingoti.sdk.models.RequestOperation;

public class MQTTSetupCommand {
    public String property = "mqttSetup";
    public RequestOperation operation;
    public MQTTSetupPayload payload = null;

    public MQTTSetupCommand() {
        operation = RequestOperation.READ;
    }

    public MQTTSetupCommand(MQTTSetupPayload _payload) {
        operation = RequestOperation.WRITE;
        payload = _payload;
    }
}
