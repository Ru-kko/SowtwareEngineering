package app;

import app.paquete2.Animal;
import app.paquete2.Pollo;

public class App {
  public static void main(String[] args) throws Exception {
    Animal animal = new Animal("animal en general");
    animal.comunicar();

    Animal pollo = new Pollo("Perdro");
    pollo.comunicar();
  }
}
