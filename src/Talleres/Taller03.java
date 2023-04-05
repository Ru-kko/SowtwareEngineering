package Talleres;

import java.util.Scanner;

/**
 * Los dos ejercicios estan basados en la misma clase {@code Sorter}
 * que usa un tipo generico y una exprecion lambda para hacer comparaciones
 * 
 * @author Jose Sebastian Vera
 */
public class Taller03 {

  private Scanner teclado;

  public Taller03() {
    this.teclado = new Scanner(System.in);
  }

  public static void main(String[] args) {
    Taller03 taller = new Taller03();

    System.out.println("Ejercicio 1");
    taller.ejercicio01();

    System.out.println("Ejercicio 2");
    taller.ejercicio02();
  }

  /**
   * Realize un programa en java donde se crea un vector denomina para almcenar 10
   * sueldos. Ordenar elvector de menor a mayor
   */
  public void ejercicio01() {
    Integer[] sueldos = new Integer[10];

    System.out.println("Inserte los sueldos");
    for (int i = 0; i < sueldos.length; i++) {
      sueldos[i] = teclado.nextInt();
    }

    Sorter<Integer> ordenador = new Sorter<>(sueldos);

    ordenador.sort((a, b) -> a > b);

    System.out.println("El orden de los sueldos es: ");
    ordenador.imprimir();
  }

  /**
   * Realize un programa en java donde se crea un vector donde se almacena los
   * nombres de 5 paises. Ordenar el vector de forma alfabetica
   */
  public void ejercicio02() {
    String[] nombres = new String[5];

    System.out.println("Ingrese el nombre de los paises");
    for (int i = 0; i < nombres.length; i++) {
      nombres[i] = this.teclado.nextLine();
    }

    Sorter<String> sorter = new Sorter<>(nombres);

    sorter.sort((a , b) -> a.compareTo(b) > 0);

    sorter.imprimir();
  }

  /**
   * Clase que ordena
   * 
   * @apiNote esto deveria ir en otro paquete pero solo se puede pasar un archivo
   * @author Jose Sebastian Vera
   */
  class Sorter<T> {
    private T[] list;

    public Sorter(T[] list) {
      this.list = list;
    }

    /**
     * Solo tiene un metodo para que funcione como una exprecion lambda
     */
    interface Comparator<K> {
      /**
       * @param a
       * @param b
       * @return {@code True} para el valor que deveria ir mas a la izquierda
       */
      public Boolean compare(K a, K b);
    }

    /**
     * Metodo para ordenar cualquier tipo de dato
     * 
     * @param comparator
     * @return
     */
    public T[] sort(Comparator<T> comparator) {
      for (int i = 0; i < this.list.length - 1; i++) {
        for (int j = 0; j < this.list.length - 1; j++) {
          if (comparator.compare(list[j], list[j + 1])) {
            T aux = list[j];
            list[j] = list[j + 1];
            list[j + 1] = aux;
          }
        }
      }
      return this.list;
    }

    public void imprimir() {
      for (T i : this.list) {
        System.out.print(i + " -> ");
      }
    }
  }
}