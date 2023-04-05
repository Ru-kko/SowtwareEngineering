package Talleres;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Jose Sebastian Vera
 */
public class Teller02 {
  public static void main(String[] args) {
    // Ejercicio 1
    Ejercicio01 ejercicio01 = new Ejercicio01();
    ejercicio01.print();
    
    // Ejercicio 2
    Ejercicio02 ejercicio02 = new Ejercicio02();
    ejercicio02.read();
    ejercicio02.result();
  }

  /**
   * Realizar una pila con los sueldos de unos empleados, cuado se ejecute
   * el programa debe pedir la cantidad de los sueldos a ingresar
   */
  static class Ejercicio01 {
    private Stack<Float> pila;
    private Scanner teclado;
    private Integer numero;
    
    public Ejercicio01() {
      this.teclado = new Scanner(System.in);
      
      System.out.println("Cuantos empleados se van a ingresar ");
      this.numero = this.teclado.nextInt();

      // Read
      for (int i = 0; i < numero; i++) {
        System.out.println("ingrese el sueldo del empleado No° " + (i + 1));
        this.pila.add(this.teclado.nextFloat());
      }
    }
    
    public void print() {
      for (int i = 0; i < numero; i++) {
        System.out.println("El sueldo del empleado  No° " + (i + 1) + "es: " + this.pila.pop());
      }
    }
  }

  /**
   * Efectuar un programa en java, que permita ingresar una pila de n elementos
   * por teclado. Luego imprimir la suma de todos sus elementos
   */
  static class Ejercicio02 {
    private Scanner teclado;
    private Stack<Integer> pila;
    private Integer count;

    public Ejercicio02() {
      this.teclado = new Scanner(System.in);
      this.pila = new Stack<>();
      
      System.out.println("Ingrese la cantidad de numeros a sumar");
      this.count = this.teclado.nextInt();
    }

    public void read() {
      for (int i = 0; i < this.count; i++) {
        System.out.println("Ingrese el " + (i + 1) + " numero:");
        this.pila.add(count);
      }
    }

    public void result() {
      Integer sum = 0;

      for (Integer i: this.pila) {
        sum += i;
      }
      System.out.println("La suma es: " + sum);
    }
  }
}
