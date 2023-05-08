package app.impl;

import app.Rueda;
import app.Silla;

public class Bicicleta implements Rueda, Silla {
  @Override
  public void avanzar() {
    System.out.println("La bicicleta avanza al pedalear");
  }

  @Override
  public void detener() {
    System.out.println("La bicicleta se detiene");
  }

  @Override
  public void sentar() {
    System.out.println("Sentarse en un sillin");
  }

}