package com.fingoti.sdk.command.wifi;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

public class WifiCredentialsPayload {
  public WifiSlot slot;
  public String ssid = null;
  public String password = null;

  public WifiCredentialsPayload(WifiSlot _slot, String _ssid, String _password) {
    slot = _slot;
    ssid = _ssid;
    password = _password;
  }

  @JsonAdapter(WifiSlot.Adapter.class)
  public enum WifiSlot {
    Primary(0),
    Secondary(1);

    private Integer value;

    WifiSlot(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WifiSlot fromValue(Integer value) {
      for (WifiSlot b : WifiSlot.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<WifiSlot> {
      @Override
      public void write(final JsonWriter jsonWriter, final WifiSlot enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WifiSlot read(final JsonReader jsonReader) throws IOException {
        Integer value = jsonReader.nextInt();
        return WifiSlot.fromValue(value);
      }
    }
  }

}
