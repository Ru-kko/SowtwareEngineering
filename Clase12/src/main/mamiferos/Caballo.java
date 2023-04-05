package main.mamiferos;

public class Caballo extends Mamifero {
  @Override
  public void comer() {
    super.comer();
    System.out.println("Estoy comiendo en cuatro patas heno");
  }
}
