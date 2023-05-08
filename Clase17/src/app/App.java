package app;

import app.impl.Automovil;
import app.impl.Bicicleta;

public class App {
  public static void main(String[] args) throws Exception {
    Bicicleta bici = new Bicicleta();
    Automovil auto = new Automovil();


    App.actions(bici);
    App.actions(auto);
  }

  public static <T extends Rueda & Silla > void actions(T obj) {
    obj.sentar();
    obj.avanzar();
    obj.detener();
  }
}