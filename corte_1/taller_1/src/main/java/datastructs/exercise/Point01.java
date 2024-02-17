package datastructs.exercise;

import datastructs.util.IParser;
import datastructs.util.ReadList;

public class Point01 implements IExercise {
  private final static String INFO = "Crear un programa que almacene " +
      "una serie de números en un array y " +
      "calcule la suma, el promedio, el " +
      "número mayor y el número menor.";
  private ReadList<Integer> readList;

  public Point01() {
    IParser<Integer> parser = str -> Integer.parseInt(str);
    this.readList = new ReadList<>(parser, true);
  }

  @Override
  public void run() {
    System.out.println("Inserte los numeros: ");

    final var arr = readList.read();

    Integer higher = Integer.MIN_VALUE,
        lower = Integer.MAX_VALUE,
        average = 0;

    for (Integer v : arr) {
      if (v <= lower)
        lower = v;

      if (v >= higher)
        higher = v;
      
      average += v;
    }

    try {
      average /= arr.size();
    } catch (ArithmeticException e) {
      average = 0;
    }

    System.out.println("Promedio = " + average);
    System.out.println("Mayor = " + higher);
    System.out.println("Menor = " + lower);
  }

  @Override
  public String getInfo() {
    return Point01.INFO;
  }

}
