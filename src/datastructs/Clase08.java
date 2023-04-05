package datastructs;

import java.util.Arrays;

public class Clase08 {
  public static void main(String[] args) {
    Integer[] numeros = { 5, 6, 1, 7, 85, 15454, 215, 1445, 84 };
    System.out.println("Vector Original " + Arrays.toString(numeros));

    quickSort(numeros, 0, numeros.length - 1);

    System.out.println("Este es el vector ordenado " + Arrays.toString(numeros));

    String[] nombres = { "foo", "bar", "fizz", "buzz" };
    System.out.println("Vector Original" + Arrays.toString(nombres));

    quickSort(nombres, 0, nombres.length - 1);

    System.out.println("Este es el vector ordenado " + Arrays.toString(nombres));

  }

  private static Integer particion(Integer[] array, Integer izquierda, Integer derecha) {
    Integer pivote = array[izquierda];

    while (true) {
      while (array[izquierda] < pivote) {
        izquierda++;
      }
      while (array[derecha] > pivote) {
        derecha--;
      }

      if (izquierda >= derecha) {
        return derecha;
      } else {
        Integer aux = array[izquierda];
        array[izquierda] = array[derecha];
        array[derecha] = aux;
        izquierda++;
        derecha--;
      }
    }
  }

  public static void quickSort(Integer[] array, Integer izquierda, Integer derecha) {
    if (izquierda < derecha) {
      Integer partitionIndex = particion(array, izquierda, derecha);
      quickSort(array, izquierda, partitionIndex);
      quickSort(array, partitionIndex + 1, derecha);
    }
  }

  private static Integer particion(String array[], Integer izquierda, Integer derecha) {
    String pivote = array[izquierda];

    while (true) {
      while (array[izquierda].compareTo(pivote) > 0) {
        izquierda++;
      }
      while (array[derecha].compareTo(pivote) > 0) {
        derecha--;
      }

      if (izquierda >= derecha) {
        return derecha;
      } else {
        String aux = array[izquierda];
        array[izquierda] = array[derecha];
        array[derecha] = aux;
        izquierda++;
        derecha--;
      }
    }
  }

  public static void quickSort(String[] array, Integer izquierda, Integer derecha) {
    if (izquierda < derecha) {
      Integer partitionIndex = particion(array, izquierda, derecha);
      quickSort(array, izquierda, partitionIndex);
      quickSort(array, partitionIndex + 1, derecha);
    }
  }
}