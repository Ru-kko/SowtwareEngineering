package app.impl;

import app.Rueda;
import app.Silla;

public class Automovil implements Rueda, Silla {

  @Override
  public void avanzar() {
    System.out.println("El auto avanza con una velocidad de " + Rueda.velocidad + "Km/h");
  }

  @Override
  public void detener() {
    System.out.println("El auto se detiene");
  }

  @Override
  public void sentar() {
    System.out.println("Sentarse en una silla comoda");
  }
  
}
