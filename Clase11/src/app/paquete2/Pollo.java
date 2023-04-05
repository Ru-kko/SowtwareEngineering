package app.paquete2;

public class Pollo extends Animal {
  public Pollo(String nombre) {
    super(nombre);
  }
  
  @Override
  public void comunicar() {
    super.comunicar();
    System.out.println(nombre + "hace Pio Pio");
  }
}
