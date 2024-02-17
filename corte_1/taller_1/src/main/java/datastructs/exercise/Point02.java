package datastructs.exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Point02 implements IExercise {
  private final Scanner sc;
  private static final String INFO = "Crear un programa que lea una cadena de "
      + "caracteres y determine cuántas veces aparece "
      + "cada una de las vocales.";

  public Point02() {
    this.sc = new Scanner(System.in);
  }

  @Override
  public String getInfo() {
    return Point02.INFO;
  }

  @Override
  public void run() {
    System.out.println("Incerte una frace o palabra: ");
    String sentence = this.sc.nextLine().trim().toLowerCase();

    Map<Character, Integer> letters = new HashMap<>();

    letters.put('a', 0);
    letters.put('e', 0);
    letters.put('i', 0);
    letters.put('o', 0);
    letters.put('u', 0);


    for (int i = 0; i < sentence.length(); i++) {
      Character ch = sentence.charAt(i);
      Integer count = letters.get(ch);
      if (count != null) {
        letters.put(ch, count + 1);
      }
    }

    System.out.println("Cuenta de vocales: ");
    for (var etr : letters.entrySet()) {
      System.out.println(etr.getKey() + ": " + etr.getValue());
    }
  }
}
