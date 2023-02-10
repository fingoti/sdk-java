package com.fingoti.sdk.command.device;

import com.fingoti.sdk.models.Payload;

public class DeviceColourPayload implements Payload {
    public int[] colour = new int[3];

    public DeviceColourPayload(int r, int g, int b) {
        colour[0] = r;
        colour[1] = g;
        colour[2] = b;
    }
}