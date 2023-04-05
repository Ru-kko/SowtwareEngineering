package datastructs;

import java.util.Scanner;

/**
 * Bubble sorting
 */
public class Clase06<K> {
  private K[] list;

  public Clase06(K[] list) {
    this.list = list;
  }

  public static String[] loadArray() {
    Scanner keyboard = new Scanner(System.in);
    String[] list = new String[25];
  
    System.out.println("Inserte los nombres ");
    for (int i = 0; i < list.length; i++) {
      System.out.print( (i + 1) + ": ");
      list[i] = keyboard.nextLine();
    }
    keyboard.close();
    return list;
  }
  
  public static void main(String[] args) {
    String[] list = loadArray();

    Clase06<String> sorter = new Clase06<>(list);
    sorter.sort((a, b) -> a.compareTo(b) > 0);
    sorter.print();
    
    System.out.println();
    sorter.sort((a, b) -> a.compareTo(b) < 0);
    sorter.print();
  }

  public void sort(Comparator<K> comparator) {
    for (int i = 0; i < this.list.length - 1; i++) {
      for (int j = 0; j < this.list.length - 1; j++) {
        if (comparator.compare(list[j], list[j + 1])) {
          K aux = list[j];
          list[j] = list[j + 1];
          list[j + 1] = aux;
        }
      }
    }
  }

  public void print() {
    for (K i : this.list) {
      System.out.print(i + " -> ");
    }
  }

  interface Comparator<T> {
    public Boolean compare(T frist, T second);
  }
}