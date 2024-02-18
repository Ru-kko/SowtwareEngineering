package datastructs.taller1;

import java.util.Scanner;

import datastructs.exercise.IExercise;
import datastructs.exercise.Point01;
import datastructs.exercise.Point02;
import datastructs.exercise.Point03;
import datastructs.exercise.Point05;
import datastructs.exercise.point04.Point04;
import datastructs.util.Common;

public class Main {
  private final Scanner sc = new Scanner(System.in);
  private final IExercise[] EXERCISES = {
      new Point01(),
      new Point02(),
      new Point03(),
      new Point04(),
      new Point05(),
  };

  public static void main(String[] args) {
    System.out.println("Bienvenido!");
    new Main().run();
  }

  public void run() {
    for (int i = 0; i < this.EXERCISES.length; i++) {
      System.out.println((i + 1) + ". " + this.EXERCISES[i].getInfo());
    }
    System.out.println("Elija una opcion: ");

    final int opt = Common.getInteger(sc);

    if (opt > EXERCISES.length || opt < 1) {
      System.out.println("Opcion no valida, elija nuevamente");
      Common.ClearConsole();
      run();
    }

    Common.ClearConsole();
    this.EXERCISES[opt - 1].run();

    System.out.println("Precione enter para continuar");
    sc.nextLine();

    Common.ClearConsole();
    this.run();
  }

}