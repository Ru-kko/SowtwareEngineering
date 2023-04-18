package structs.Clase14;

import java.util.Scanner;

public class BusquedaSecuencial {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Integer[] list;
    System.out.println("Ingrese el tamaño de la lista:");
    Integer lenght = sc.nextInt();
    list = new Integer[lenght];

    for (int i = 0; i < list.length; i++) {
      System.out.println("Digite en numero en el indice " + i);
      list[i] = sc.nextInt();
    }

    System.out.println("ingrese un numero a buscar");
    Integer toFind = sc.nextInt();
    Integer foundIndex = BusquedaSecuencial.find(list, toFind);

    if (foundIndex < 0) {
      System.out.println("No se encontro el numero " + toFind +  " en la lista");
    }

    sc.close();
  }

  public static Integer find(Integer[] arr, Integer num) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == num) {
        System.out.println("El numero " + num + " esta en el indice " + i);
        return i;
      }
    }
    return -1;
  }
}
