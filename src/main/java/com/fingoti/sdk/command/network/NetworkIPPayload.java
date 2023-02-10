package com.fingoti.sdk.command.network;

public class NetworkIPPayload {
    public Boolean dhcp;
    public String local = null;
    public String mask = null;
    public String gateway = null;
    public String dns = null;

    public NetworkIPPayload(Boolean _dhcp, String _local, String _mask, String _gateway, String _dns) {
        dhcp = _dhcp;
        local = _local;
        mask = _mask;
        gateway = _gateway;
        dns = _dns;
    }
}
