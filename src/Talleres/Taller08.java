package Talleres;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Talleres.Taller08.Finder.Equals;

/**
 * Realice un programa en java (NetBeans) que tenga un arreglo sin ordenar con
 * tres parámetros así, nombre, apellidos y apellidobusqueda. El programa debe
 * imprimir los nombres de todas las personas con apellidobusqueda, o bien el
 * mensaje NINGUNO si no hay apellido.
 * 
 * @author Jose Sebastian Vera Galeano
 */
public class Taller08 {

  /**
   * Cada una de las clases creadas en este proyecto podrian ir en un archivo
   * *.java aparte, pero lo ago de esta menera para solo enviar este
   * 
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Empleado[] array = new Empleado[5];

    for (int i = 0; i < array.length; i++) {
      System.out.printf("Ingrese el nombre y apellido separados por espacio: ");
      String nombre = sc.nextLine();
      String[] format = nombre.split(" ");

      if (format.length != 2) {
        array[i] = null;
        continue;
      }

      array[i] = new Empleado(format[0], format[1]);
    }

    System.out.println("Ingrese el apellido a buscar: ");
    String toFind = sc.nextLine();

    Equals<Empleado> comparator = (a) -> a.apellido.equals(toFind);

    List<Empleado> res = Finder.find(array, comparator, Empleado.class);

    System.out.println(res.toString());
    sc.close();
  }

  /**
   * Estructura empleado
   */
  static class Empleado {
    private String nombre;
    private String apellido;

    public Empleado(String nombre, String apellido) {
      this.nombre = nombre;
      this.apellido = apellido;
    }

    public String getNombre() {
      return nombre;
    }

    public String getApellido() {
      return apellido;
    }

    @Override
    public String toString() {
      return "\n[nombre=" + nombre + ", apellido=" + apellido + "]";
    }
  }

  /**
   * Metodo secuencial
   */
  static class Finder {
    public static interface Equals<T> {
      public boolean isEquals(T a);
    }

    /**
     * Usa tipos genericos para su reutilizacion en diferentes tipose de objetos
     * 
     * @param <T>
     * @param arr        array con los objetos a filtrar
     * @param value      valor a buscar
     * @param comparator metodo que devuelve un boleano si es aceptable
     * @return
     */
    public static <T> List<T> find(T[] arr, Equals<T> comparator, Class<T> clazz) {
      List<T> res = new ArrayList<>();

      for (T i : arr) {
        if (i != null && comparator.isEquals(i)) {
          res.add(i);
        }
      }

      return res;
    }
  }
}