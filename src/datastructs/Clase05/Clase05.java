package datastructs.Clase05;

import java.util.Scanner;
import java.util.Stack;

// Colas
public class Clase05 {
  public static void main(String[] args) {
    // ejemplo();

    // Ejercicio
  
    Prueba cola = new Prueba();

    cola.cargar();
    cola.print();
  }
  
  static void ejemplo() {
    Stack<Integer> STACK = new Stack<>();
  
    STACK.push(15);
    STACK.push(16);
    STACK.push(17);
    STACK.push(18); 
  
    System.out.println("Inicio de la cola: " + STACK.firstElement());
  
    System.out.println("El elemento superior es: " + STACK.peek()); 
    
    System.out.println("final de la cola: " + STACK);

  }

  static class Prueba {
    private Scanner teclado;
    private Integer[] sueldo;

    public Prueba() {
      this.teclado = new Scanner(System.in);
      this.sueldo = new Integer[5];
    }

    public void cargar() {
      for (int i = 0; i < this.sueldo.length; i++) {
        System.out.println("Ingrese el sueldo");
        this.sueldo[i] = teclado.nextInt();
      }
    }

    public void print() {
      for (int i: this.sueldo) {
        System.out.print(i + " - ");
      }
    }
  }
}