package com.fingoti.sdk.command.device;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

public class DeviceBlinkPayload {
    public BlinkSpeed state;

    public DeviceBlinkPayload(BlinkSpeed speed) {
        state = speed;
    }

    @JsonAdapter(BlinkSpeed.Adapter.class)
    public enum BlinkSpeed 
    {
        OFF(0),
        SLOW(1),
        MEDIUM(2),
        FAST(3),
        FASTEST(4);

        private Integer value;

        BlinkSpeed(Integer value) {
          this.value = value;
        }
      
        public Integer getValue() {
          return value;
        }
      
        @Override
        public String toString() {
          return String.valueOf(value);
        }
      
        public static BlinkSpeed  fromValue(Integer value) {
          for (BlinkSpeed  b : BlinkSpeed.values()) {
            if (b.value.equals(value)) {
              return b;
            }
          }
          throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
      
        public static class Adapter extends TypeAdapter<BlinkSpeed> {
          @Override
          public void write(final JsonWriter jsonWriter, final BlinkSpeed  enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
          }
      
          @Override
          public BlinkSpeed read(final JsonReader jsonReader) throws IOException {
            Integer value = jsonReader.nextInt();
            return BlinkSpeed.fromValue(value);
          }
        }
    }
}
