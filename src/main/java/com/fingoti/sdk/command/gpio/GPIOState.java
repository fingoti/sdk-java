package com.fingoti.sdk.command.gpio;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

@JsonAdapter(GPIOState.Adapter.class)
public enum GPIOState {
    OFF(0),
    ON(1);

    private Integer value;

    GPIOState(Integer value) {
      this.value = value;
    }
  
    public Integer getValue() {
      return value;
    }
  
    @Override
    public String toString() {
      return String.valueOf(value);
    }
  
    public static GPIOState fromValue(Integer value) {
      for (GPIOState  b : GPIOState.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  
    public static class Adapter extends TypeAdapter<GPIOState> {
      @Override
      public void write(final JsonWriter jsonWriter, final GPIOState enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }
  
      @Override
      public GPIOState read(final JsonReader jsonReader) throws IOException {
        Integer value = jsonReader.nextInt();
        return GPIOState.fromValue(value);
      }
    }

}
