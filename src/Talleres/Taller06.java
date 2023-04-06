package Talleres;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Jose Sebastian Vera
 */
public class Taller06<T> {
  private T[] list;
  private Comparator<T> comparator;

  public static void main(String[] args) {
    System.out.println("Ejercicio 1");
    Ejercicio01();
    System.out.println("Ejercicio 2");
    Ejercicio02();
  }

  /**
   * En un colegio de Bogotá se requiere ordenar una lista de alumnos por el
   * primer nombre, realizar un programa en java, utilizando el método por
   * mezclas.
   */
  public static void Ejercicio01() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Inserte la cantidad de alumnos a ingresar");

    String[] list = new String[sc.nextInt()];

    for (int i = 0; i < list.length; i++) {
      System.out.println("inserte el nombre del alumno N°" + (i + 1));
      list[i] = sc.nextLine();
    }

    Taller06<String> sorter = new Taller06<>(list, (a, b) -> a.compareTo(b) < 0);
    sorter.sort();
    sorter.print();

    sc.close();
  }

  /**
   * Dada la siguiente lista de números:
   * [21, 1, 26, 45, 29, 28, 2, 9, 16, 49, 39, 27, 43, 34, 46, 40]
   * ¿Cuál de las siguientes respuestas corresponde a la lista que será ordenada
   * después de 3 llamadas recursivas a ordenamiento Por Mezcla?
   */
  public static void Ejercicio02() {
    Integer[] list = { 21, 1, 26, 45, 29, 28, 2, 9, 16, 49, 39, 27, 43, 34, 46, 40 };
    Taller06<Integer> sorter = new Taller06<>(list, (a, b) -> a < b);
    sorter.sort();
    System.out.println("Despues de llamarse a si misma 3 veses el vector resultante deveria ser de longitud 2 por lo tanto la respuesta correcta el la B");
    sorter.print();
  }

  public static interface Comparator<K> {
    public Boolean compare(K a, K b);
  }

  public Taller06(T[] list, Comparator<T> comparator) {
    this.list = list;
    this.comparator = comparator;
  }

  public void sort() {
    quickSort(0, this.list.length - 1);
  }

  private void quickSort(Integer left, Integer right) {
    if (left < right) {
      Integer partitionIndex = partition(left, right);
      quickSort(left, partitionIndex);
      quickSort(partitionIndex + 1, right);
    }
  }
  
  private Integer partition(Integer left, Integer right) {
    T pivot = this.list[left];
    
    while (true) {
      while (this.comparator.compare(this.list[left], pivot)) {
        left++;
      }
      while (this.comparator.compare(pivot, this.list[right])) {
        right--;
      }
      if (left >= right) {
        return right;
      } else {
        T aux = this.list[left];
        this.list[left] = this.list[right];
        this.list[right] = aux;
        left++;
        right--;
      }
    }
  }

  public void print() {
    System.out.println(Arrays.toString(this.list));
  }
}
