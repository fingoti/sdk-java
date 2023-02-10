package com.fingoti.sdk.command.gpio;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

@JsonAdapter(GPIODirection.Adapter.class)
public enum GPIODirection {
    OUTPUT(0),
    INPUT(1);

    private Integer value;

    GPIODirection(Integer value) {
      this.value = value;
    }
  
    public Integer getValue() {
      return value;
    }
  
    @Override
    public String toString() {
      return String.valueOf(value);
    }
  
    public static GPIODirection fromValue(Integer value) {
      for (GPIODirection  b : GPIODirection.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  
    public static class Adapter extends TypeAdapter<GPIODirection> {
      @Override
      public void write(final JsonWriter jsonWriter, final GPIODirection enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }
  
      @Override
      public GPIODirection read(final JsonReader jsonReader) throws IOException {
        Integer value = jsonReader.nextInt();
        return GPIODirection.fromValue(value);
      }
    }

}
