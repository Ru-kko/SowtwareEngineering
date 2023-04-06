package datastructs;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Shell sort
 */
public class Clase09 {
  static Scanner teclado;
  public static void main(String[] args) {
    teclado = new Scanner(System.in);
    Integer increment, aux, j, lenght, i;
    Integer[] array;

    System.out.println("Ingrese el tamaño del vector");
    lenght = teclado.nextInt();
    array = new Integer[lenght + 1];

    for (i = 1; i <= lenght; i++) {
      System.out.println("Inserte el " + i + " numero: ");
      array[i] = teclado.nextInt();
    }
    increment = lenght / 2;
    teclado.close();

    while (increment > 0) {
      System.out.println(Arrays.toString(array));
      for (i = increment + 1; i <= lenght; i++) {
        j = i - increment;
        while (j > 0) {
          if (array[j] >= array[j + increment]) {
            aux = array[j];
            array[j] = array[j + increment];
            array[j + increment] = aux;
          } else {
            j = 0;
          }
          j = j - increment;
        }
      }
      increment = increment / 2;
    }
    System.out.println(Arrays.toString(array));
  }
}