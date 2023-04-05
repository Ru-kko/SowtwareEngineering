package Talleres;

import java.util.Scanner;
import java.util.Stack;

public class Taller01 {
  public static void main(String[] args) {
    // Ejercico 01
    // Ejercicio01 ejercicio1 = new Ejercicio01();

    // ejercicio1.printAll();

    // Ejercicio 2
    Ejercicio02 ejercicio02 = new Ejercicio02();
    System.out.println(ejercicio02);

  }

  /**
   * Un empleado requiere guardar los sueldos de 15 operarios. Realizar una pila
   * tipo vector para acceder a cada elemento por medio del indice
   */
  static class Ejercicio01 {
    private Scanner teclado;
    private Stack<Double> pila;

    public Ejercicio01() {
      teclado = new Scanner(System.in);

      for (Integer i = 0; i < 15; i++) {
        System.out.println("Inserte el salario del empleado no " + (i + 1));
        pila.push(teclado.nextDouble());
      }
      teclado.close();
    }

    public void printAll() {
      for (Integer i = 0; i < pila.size(); i++) {
        System.out.println("El salario del empleado " + (i + 1) + " es: " + pila.get(i));
      }
    }

    public void printOne(Integer i) {
      System.out.println("El salario del empleado " + i + " es: " + pila.get(i - 1));
    }
  }

  /**
   * La secretaria nesesita saber cuantos empleados son mas altos que el promedio
   * y cuantos mas bajos. Definir un vector de 20 componentestipo float
   * que representen las alturas de los empleados
   */
  static class Ejercicio02 {
    private Float[] alturas;
    private Scanner teclado;
    private Float average;

    /**
     * Calcular el promedio automaticamente con base a los empleados
     */
    public Ejercicio02() {
      this.teclado = new Scanner(System.in);
      this.alturas = new Float[20];

      for (Integer i = 0; i < this.alturas.length; i++) {
        System.out.println("Inserte la altura del empleado " + (i + 1) + ": ");

        this.alturas[i] = this.teclado.nextFloat();
      }

      // Calcule average
      Float sum = 0f;
      for (Float i : this.alturas) {
        sum += i;
      }
      this.average = sum / this.alturas.length;
    }

    /**
     * en base a un promedi global
     * 
     * @param average promedio global
     */
    public Ejercicio02(Float average) {
      this();
      this.average = average;
    }

    public Integer masAltos() {
      Integer res = 0;
      for (Float i : this.alturas) {
        if (i >= this.average) {
          res++;
        }
      }
      return res;
    }

    public Integer masBajos() {
      Integer res = 0;
      for (Float i : this.alturas) {
        if (i <= this.average) {
          res++;
        }
      }
      return res;
    }

    @Override
    public String toString() {
      return "Ejercicio2 [promedio: " + this.average + ",  mas altos: " + this.masAltos() + ", mas bajos: "
          + this.masBajos() + " ]";
    }

  }
}
