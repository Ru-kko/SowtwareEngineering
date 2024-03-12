package com.readfile;

import java.text.ParseException;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person {
  private String cc;
  private String name;
  private String detail;

  public static Person parse(String data) throws ParseException {
    String[] info = data.trim().split("-");

    if (info.length != 3) throw new ParseException("El formato ingresado es incorrecto", 0);

    return new Person(info[0], info[1], info[2]);
  }
}
