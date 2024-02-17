package datastructs.exercise.point04;

import java.util.List;

import datastructs.exercise.IExercise;
import datastructs.util.ReadList;

public class Point04 implements IExercise {
  private static final String INFO = "Crear un programa que lea una lista mínima "
      + "de 5 personas con nombre, edad y "
      + "peso.Calcular el peso y edad promedio, "
      + "adicionalmente mostrar en forma de tabla "
      + "todos los datos ordenados por la edad.";
  private final ReadList<Person> reader;

  public Point04() {
    this.reader = new ReadList<>(Person::parse);
    this.reader.setLeftLimit(2);
  }

  @Override
  public String getInfo() {
    return Point04.INFO;
  }

  @Override
  public void run() {
    System.out.println("Incerte la lista de personas de en el siguiente fromato: ");
    System.out.println("nombre-edad-peso");

    List<Person> data = this.reader.read();
    Person[] arr = data.toArray(new Person[data.size()]);
    Sorter<Person> sorter = new Sorter<Person>(arr, (a, b) -> a.getAge() < b.getAge());

    sorter.sort();
    arr = sorter.getList();

    Integer avAge = 0;
    Float avWeigth = 0f;

    System.out.println("Resultados");
    System.out.printf("|%10s|%5s|%10s|\n", "nombre", "edad", "peso");
    for (Person p : arr) {
      System.out.printf("|%10s|%5d|%10f|\n", p.getName(), p.getAge(), p.getWeigth());
      avAge += p.getAge();
      avWeigth += p.getWeigth();
    }

    avAge /= data.size();
    avWeigth /= data.size();

    System.out.println("Peso promedio = " + avWeigth);
    System.out.println("Edad promedio = " + avAge);
  }

}
