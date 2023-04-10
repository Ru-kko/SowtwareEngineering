package structs;

import java.util.Scanner;

public class Clase03 {
  /**
   * Scanner use to insert elemets of an array
   */
  public static int[] ejemplo01() {
    var keyboard = new Scanner(System.in);

    System.out.println("Insert the array length: ");
    var length = keyboard.nextInt();

    int[] array = new int[length];

    for (int i = 0; i < array.length; i++) {
      System.out.println("Insert a number betwen 0 and 10 for index " + (i + 1) + " :");
      var num = keyboard.nextInt();

      while (!(num >= 0 && num <= 10)) {
        System.out.println("Opss that number is incorrect please try again: ");
        num = keyboard.nextInt();
      }

      array[i] = num;
    }

    keyboard.close();

    System.out.println("|Index|Value|");
    for (int i = 0; i < array.length; i++) {
      System.out.printf("|%5d|%5d|\n", i + 1, array[i]);
    }

    return array;
  }
  
  public static void ejemplo02() {
    var keyboard = new Scanner(System.in);
    
    System.out.println("Insert the array length: ");
    var length = keyboard.nextInt();

    int[] array = new int[length];

    for (int i = 0; i < array.length; i++) {
      System.out.println("Insert a number betwen 0 and 10 for index " + (i + 1) + " :");
      var num = keyboard.nextInt();

      array[i] = num;
    }

    keyboard.close();

    int sum = 0;
    for (int i = 0; i < array.length; i++) {
      sum += array[i]; 
    }

    double average = sum/array.length;

    System.out.println("The sume is: " + sum);
    System.out.println("Average value is:" + average);
  }
}