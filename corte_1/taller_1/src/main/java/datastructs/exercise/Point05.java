package datastructs.exercise;

public class Point05 implements IExercise {

  @Override
  public String getInfo() {
    return "Salir";
  }

  @Override
  public void run() {
    System.out.println("Adios!");
    System.exit(0);
  } 
}
