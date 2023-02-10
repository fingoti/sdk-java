package com.fingoti.sdk.command.uart;

import java.io.IOException;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

public class UARTSetupPayload {
    public UARTParity parity = null;
    public UARTStopbits stopbits = null;
    public Integer baudrate = null;
    public Integer databits = null;

    public UARTSetupPayload(UARTParity _parity, UARTStopbits _stopbits, Integer _baudrate, Integer _databits) {
        parity = _parity;
        stopbits = _stopbits;
        baudrate = _baudrate;
        databits = _databits;
    }

    @JsonAdapter(UARTParity.Adapter.class)
    public enum UARTParity {
        None(0),
        Odd(1),
        Even(2);

        private Integer value;

        UARTParity(Integer value) {
          this.value = value;
        }
      
        public Integer getValue() {
          return value;
        }
      
        @Override
        public String toString() {
          return String.valueOf(value);
        }
      
        public static UARTParity fromValue(Integer value) {
          for (UARTParity b : UARTParity.values()) {
            if (b.value.equals(value)) {
              return b;
            }
          }
          throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
      
        public static class Adapter extends TypeAdapter<UARTParity> {
          @Override
          public void write(final JsonWriter jsonWriter, final UARTParity enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
          }
      
          @Override
          public UARTParity read(final JsonReader jsonReader) throws IOException {
            Integer value = jsonReader.nextInt();
            return UARTParity.fromValue(value);
          }
        }
    }

    @JsonAdapter(UARTStopbits.Adapter.class)
    public enum UARTStopbits {
        One(0),
        OneHalf(1),
        Two(2);

        private Integer value;

        UARTStopbits(Integer value) {
          this.value = value;
        }
      
        public Integer getValue() {
          return value;
        }
      
        @Override
        public String toString() {
          return String.valueOf(value);
        }
      
        public static UARTStopbits fromValue(Integer value) {
          for (UARTStopbits  b : UARTStopbits.values()) {
            if (b.value.equals(value)) {
              return b;
            }
          }
          throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
      
        public static class Adapter extends TypeAdapter<UARTStopbits> {
          @Override
          public void write(final JsonWriter jsonWriter, final UARTStopbits enumeration) throws IOException {
            jsonWriter.value(enumeration.getValue());
          }
      
          @Override
          public UARTStopbits read(final JsonReader jsonReader) throws IOException {
            Integer value = jsonReader.nextInt();
            return UARTStopbits.fromValue(value);
          }
        }
    }
}