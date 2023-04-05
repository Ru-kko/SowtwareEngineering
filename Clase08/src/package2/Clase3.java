package package2;

import package1.Clase1;

public class Clase3 {
  public static void main(String[] args) {
    Clase1 objeto2 = new Clase1();

    objeto2.setAttribute1(20);

    System.out.println("Atributo1 es igual a: " + objeto2.getAttribute1());
  } 
}
