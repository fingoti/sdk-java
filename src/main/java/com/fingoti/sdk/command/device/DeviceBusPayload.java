package com.fingoti.sdk.command.device;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

public class DeviceBusPayload {
    public BusMode protocol = null;

    public DeviceBusPayload(BusMode _protocol) {
        protocol = _protocol;
    }

    @JsonAdapter(BusMode.Adapter.class)
    public enum BusMode {
        UART(0),
        I2C(1);

        private Integer value;

        BusMode(Integer value) {
          this.value = value;
        }
      
        public Integer getValue() {
          return value;
        }
      
        @Override
        public String toString() {
          return String.valueOf(value);
        }
      
        public static BusMode fromValue(Integer value) {
          for (BusMode  b : BusMode.values()) {
            if (b.value.equals(value)) {
              return b;
            }
          }
          throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
      
        public static class Adapter extends TypeAdapter<BusMode> {
          @Override
          public void write(final JsonWriter jsonWriter, final BusMode enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
          }
      
          @Override
          public BusMode read(final JsonReader jsonReader) throws IOException {
            Integer value = jsonReader.nextInt();
            return BusMode.fromValue(value);
          }
        }
    }
}
