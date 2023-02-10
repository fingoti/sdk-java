package com.fingoti.sdk.command.mqtt;

public class MQTTCertiticatePayload {
    public String pem = null;
    public Boolean clear = null;

    public MQTTCertiticatePayload(String _pem, Boolean _clear) {
        pem = _pem;
        clear = _clear;
    }
}
