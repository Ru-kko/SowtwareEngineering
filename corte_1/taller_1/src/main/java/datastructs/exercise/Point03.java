package datastructs.exercise;

import java.util.List;

import datastructs.util.IParser;
import datastructs.util.ReadList;

public class Point03 implements IExercise {
  private static final String INFO = "Crear un programa que lea una lista de "
      + "temperaturas en grados centígrados los "
      + "convierta en grados Fahrenheit. Después, el "
      + "programa debe mostrar la lista de "
      + "temperaturas ingresadas y las conversiones.";
  private final ReadList<Float> reader;

  public Point03() {
    final IParser<Float> parser = s -> Float.parseFloat(s);
    this.reader = new ReadList<>(parser, true);
  }
  @Override
  public String getInfo() {
    return Point03.INFO;
  }

  @Override
  public void run() {
    System.out.println("Incerte las temperaturas en grados centigrados(°C): ");

    List<Float> degrees = this.reader.read();

    System.out.println("Los resultados en grados Fahrenheit(°F) son: ");
    for (Float degree : degrees) {
      System.out.println(degree + "°C -> " + convert(degree) + "°F"); 
    }
  }

  private Float convert(Float centigrade) {
    return (centigrade * 1.8f) + 32f; 
  }
}
