package Talleres;

import java.util.Scanner;

/**
 * Realizar un programa que permita cargarn los nombres de 5 alumnos y sus notas
 * respectivas. Luego ordenar las notas de mayor a menor. imprimir las notas y
 * los nombres de los alumnos
 */
public class Taller04 {
  private String[] nombres;
  private Integer[] notas;

  public Taller04(String[] nombres, Integer[] notas) {
    this.nombres = nombres;
    this.notas = notas;
  }

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    String[] nombres = new String[5];
    Integer[] notas = new Integer[5];

    for (int i = 0; i < nombres.length; i++) {
      System.out.print("\nIngrese el nombre del alumno No°" + (i + 1) + ": ");
      nombres[i] = teclado.next();
      System.out.print("\nIngrese la nota del alumno " + nombres[i] + ": ");
      notas[i] = teclado.nextInt();
    }
    teclado.close();
    Taller04 taller = new Taller04(nombres, notas);
    taller.sort();
    taller.imprimir();
    taller.sort();

  }

  public void sort() {
    for (Integer i = 0; i < nombres.length - 1; i++) {
      for (Integer j = 0; j < nombres.length - 1; j++) {
        if (notas[j] < notas[j + 1]) {
          var aux = notas[j];

          notas[j] = notas[j + 1];
          notas[j + 1] = aux;
          var auxName = nombres[j];

          nombres[j] = nombres[j + 1];
          nombres[j + 1] = auxName;
        }
      }
    }
  }

  public void imprimir() {
    for (int i = 0; i < nombres.length; i++) {
      System.out.printf("|%3d|%10s|%5d|\n", i + 1, nombres[i], notas[i]);
    }
  }
}
