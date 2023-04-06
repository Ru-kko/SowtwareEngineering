package Talleres;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Taller 5 estructuras de datos
 * 
 * Se utiliza una clase generica para adaptarse a tanto a tipos string como
 * numeros entre otros
 * 
 * @author Jose Sebastian Vera
 */
public class Taller05<T> {

  public static void main(String[] args) {
    Taller05.Ejercicio01();
    Taller05.Ejercicio02();
  }

  /**
   * Ordenar un vector de 20 posiciones por el método Shell, que contiene nombres
   * de usuarios.
   */
  static void Ejercicio01() {
    Scanner sc = new Scanner(System.in);
    String[] nombres = new String[20];

    for (int i = 0; i < 20; i++) {
      System.out.println("Inserte el nombre para el estudiante no " + (i + 1));
      nombres[i] = sc.nextLine();
    }

    Taller05<String> sorter = new Taller05<>(nombres);

    sorter.sort((a, b) -> a.compareTo(b) > 0);
    sorter.print();
    sc.close();
  }

  /**
   * En el siguiente vector: [5, 16, 20, 12, 3, 8, 9, 17, 19, 7] ¿Cuál de las
   * siguientes respuestas ilustra el contenido de la lista después de que todo el
   * intercambio está completo para un tamaño de brecha de 3?
   */
  static void Ejercicio02() {
    Integer[] testList = { 5, 16, 20, 12, 3, 8, 9, 17, 19, 7 };
    Taller05<Integer> sorter = new Taller05<>(testList, 3);

    sorter.sort((a, b) -> a >= b);
    System.out.println("Por lo tanto la respua correcta es la A");
  }

  // Implenetacion de los problemas
  private T[] list;
  private Integer gapSize;

  @SuppressWarnings("unchecked")
  public Taller05(T[] list) {
    this.list = (T[]) new Object[list.length + 1];
    System.arraycopy(list, 0, this.list, 1, list.length);
  }

  /**
   * Segundo conauctor para haser log del tamaño de brecha si es nesesario
   * 
   * @param list
   * @param gapSize tamaño de brecha
   */
  public Taller05(T[] list, Integer gapSize) {
    this(list);
    this.gapSize = gapSize;
  }

  public interface Comparator<K> {
    Boolean compare(K a, K b);
  }

  public void sort(Comparator<T> comparator) {
    Integer increment, lenght;
    T aux;

    lenght = this.list.length - 1;
    increment = this.gapSize != null ? this.gapSize : lenght / 2;

    while (increment > 0) {
      for (int i = increment + 1; i <= lenght; i++) {
        Integer j = i - increment;
        while (j > 0) {
          if (comparator.compare(this.list[j], this.list[j + increment])) {
            aux = this.list[j];
            this.list[j] = this.list[j + increment];
            this.list[j + increment] = aux;
          } else {
            j = 0;
          }
          j = j - increment;
        }
      }
      if (increment == this.gapSize)
        System.out.println("Tamaño de brecha " + this.gapSize + " es " + Arrays.toString(list));
      increment = increment / 2;
    }
  }

  public void print() {
    System.out.println(Arrays.toString(this.list));
  }
}
