package com.fingoti.sdk.command.mqtt;

import com.fingoti.sdk.models.RequestOperation;

public class MQTTCertificateCommand {
    public String property = "mqttCertificate";
    public RequestOperation operation;
    public MQTTCertiticatePayload payload = null;

    public MQTTCertificateCommand () {
        operation = RequestOperation.READ;
    }

    public MQTTCertificateCommand (MQTTCertiticatePayload _payload) {
        operation = RequestOperation.WRITE;
        payload = _payload;
    }

}
