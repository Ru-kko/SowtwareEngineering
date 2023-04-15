package Talleres;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jose Sebastian Vera
 */
public class Taller07 {
  private String[] list;

  public static void main(String[] args) {
    Taller07.Ejercicio01();
  }
  
  /**
   * Un colegio de Bogotá tiene el siguiente arreglo de estudiantes, por el
   * sistema de busque binaria realice un programa en java que encuentre al
   * siguiente estudiante por el nombre
   */
  public static void Ejercicio01() {
    String[] list = {
        "Marlon Ubeimar",
        "Jose Manuel",
        "Daniel Alexander",
        "Jeisson Fabian",
        "Martin Alejandro",
        "Deiby Andres",
        "Luis Jonnathan",
        "David Santiago",
        "Martin",
        "Michael Steven",
        "Yeraldin",
        "Mateo",
        "Juan Sebastian Camilo",
        "Jose Sebastian",
        "Cristian Mateo",
        "Kevin Steven",
        "Karen Juliana",
        "Jhoan David",
        "Albeiro De Jesus",
        "Marlon David"
    };

    // Organize
    var toSort = new ArrayList<String>(List.of(list));
    toSort.sort((a,b) -> a.compareTo(b));
    String[] sorted = toSort.toArray(String[]::new);

    // Find
    Taller07 finder = new Taller07(sorted);
    Integer index = finder.find("Mateo");

    if (index > 0) {
      System.out.println("Student Mateo found on index " + index + " of sorted list");
      System.out.println(sorted[index]);
      return;
    }

    System.out.println("student don't found");
  }

  public Taller07(String[] list) {
    this.list = list;
  }

  public Integer find(String toFind) {
    Integer n = this.list.length;
    Integer center, inf = 0, sup = n - 1;
    Integer operations = 0;

    while (inf <= sup) {
      operations++;
      center = (sup + inf) / 2;
      if (this.list[center].equals(toFind)) {
        return center;
      }

      if (toFind.compareTo(this.list[center]) < 0) {
        sup = center - 1;
      } else {
        inf = center + 1;
      }
    }
    return -1;
  }
}
