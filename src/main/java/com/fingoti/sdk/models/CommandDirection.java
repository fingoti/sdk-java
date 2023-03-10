/*
 * Fingoti API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.fingoti.sdk.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets CommandDirection
 */
@JsonAdapter(CommandDirection.Adapter.class)
public enum CommandDirection {
  
  NUMBER_0(0),
  
  NUMBER_1(1);

  private Integer value;

  CommandDirection(Integer value) {
    this.value = value;
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CommandDirection fromValue(Integer value) {
    for (CommandDirection b : CommandDirection.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CommandDirection> {
    @Override
    public void write(final JsonWriter jsonWriter, final CommandDirection enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CommandDirection read(final JsonReader jsonReader) throws IOException {
      Integer value = jsonReader.nextInt();
      return CommandDirection.fromValue(value);
    }
  }
}

