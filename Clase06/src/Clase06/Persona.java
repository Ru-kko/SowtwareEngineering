package Clase06;

public class Persona {
  String nombre;
  Integer edad;


  public Persona(String nombre, Integer edad) {
    this.nombre = nombre;
    this.edad = edad;
  }

  public void mostarDatos() {
    System.out.println("La edad es: " + this.edad);
    System.out.println("El nombre es: " + this.nombre);
  }
  
}