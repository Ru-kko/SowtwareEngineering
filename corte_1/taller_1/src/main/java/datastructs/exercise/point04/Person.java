package datastructs.exercise.point04;

import java.text.ParseException;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
  private String name;
  private Integer age;
  private Float weigth;

  @SneakyThrows
  public static Person parse(String str) {
    String[] splited = str.split("-");

    if (splited.length != 3) throw new ParseException("Can't creat a person object", 0);

    String name = splited[0];
    Integer age = Integer.parseInt(splited[1]);
    Float weight = Float.parseFloat(splited[2]);

    return new Person(name, age, weight);
  }
}
