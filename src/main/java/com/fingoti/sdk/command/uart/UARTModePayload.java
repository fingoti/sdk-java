package com.fingoti.sdk.command.uart;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

public class UARTModePayload {
    public UARTMode mode = null;

    public UARTModePayload(UARTMode _mode) {
        mode = _mode;
    }

    @JsonAdapter(UARTMode.Adapter.class)
    public enum UARTMode {
        Interpreter(0),
        Passthrough(1);

        private Integer value;

        UARTMode(Integer value) {
          this.value = value;
        }
      
        public Integer getValue() {
          return value;
        }
      
        @Override
        public String toString() {
          return String.valueOf(value);
        }
      
        public static UARTMode fromValue(Integer value) {
          for (UARTMode  b : UARTMode.values()) {
            if (b.value.equals(value)) {
              return b;
            }
          }
          throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
      
        public static class Adapter extends TypeAdapter<UARTMode> {
          @Override
          public void write(final JsonWriter jsonWriter, final UARTMode enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
          }
      
          @Override
          public UARTMode read(final JsonReader jsonReader) throws IOException {
            Integer value = jsonReader.nextInt();
            return UARTMode.fromValue(value);
          }
        }
    }
}