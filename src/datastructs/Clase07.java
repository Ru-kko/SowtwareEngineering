package datastructs;

import java.util.Scanner;

public class Clase07 {
  public Scanner teclado;
  public String[] nombres;
  private Integer[] numeros;

  public static void main(String[] args) {
    Clase07 ejercicio = new Clase07();
    ejercicio.load();
    ejercicio.sort();
    ejercicio.print();
  }

  public void load() {
    teclado = new Scanner(System.in);
    nombres = new String[5];
    numeros = new Integer[5];

    for (Integer i = 0; i < nombres.length; i++) {
      System.out.println("Ingrese el nombre");
      this.nombres[i] = teclado.next();
      System.out.println("Digite el numero");
      this.numeros[i] = teclado.nextInt(); 
    }
  }

  public void sort() {
    for (Integer i = 0; i < nombres.length - 1; i++) {
      for (Integer j = 0; j < nombres.length - 1; j++) {
        if(numeros[j] > numeros[j + 1]) {
          var aux = numeros[j];

          numeros[j] = numeros[j +1];
          numeros[j + 1] = aux;
        // } 
        // if(nombres[j].compareTo(nombres[j + 1]) > 0 ) {
          var auxName = nombres[j];

          nombres[j] = nombres[j +1];
          nombres[j + 1] = auxName;
        }
      }
    }
  }

  public void print() {
    System.out.println("Este es el resultado de ordenamiento nombre y numero");
    String res = "";
    String resName = "";
    for (Integer i = 0; i < nombres.length; i++) {
      res += numeros[i] + " -> ";
      resName += nombres[i] + " -> "; 
    }

    System.out.println(res + "\n" + resName);
  }
}