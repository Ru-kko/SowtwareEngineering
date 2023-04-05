package app.paquete2;

@SuppressWarnings("all")
public class Animal {
  protected String nombre;

  public Animal(String nombre) {
    this.nombre = nombre;
  }

  public void comunicar() {
    System.out.println(this.nombre + " comunicandose");
  } 
}
