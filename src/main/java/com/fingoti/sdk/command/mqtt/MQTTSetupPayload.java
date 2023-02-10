package com.fingoti.sdk.command.mqtt;

public class MQTTSetupPayload {
    public String host;
    public int port;
    public int qos;
    public Boolean secure;
    public Boolean retain;

    public MQTTSetupPayload(String _host, int _port, int _qos, Boolean _secure, Boolean _retain) {
        host = _host;
        port = _port;
        qos = _qos;
        secure = _secure;
        retain = _retain;
    }
}
