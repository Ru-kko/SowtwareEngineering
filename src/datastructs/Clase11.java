package datastructs;

import datastructs.utils.Sorter;

/**
 * Binery sorting
 */
public class Clase11 {
  private Integer[] list;

  public Clase11(Integer[] list) {
    this.list = list;
  }

  public static void main(String[] args) {
    Integer[] array = { 2, 5, 4, 8, 9, 41, 6, 445, 23, 45 };
    Sorter<Integer> sorter = new Sorter<>(array);
    sorter.sort((a, b) -> a <= b);
    array = sorter.getList();
  }

  Integer find(Integer i) throws Exception {
    Integer mid = Math.round(this.list.length / 2);

    if (this.list[mid] == i)
      return this.list[mid];

    if (this.list[mid] < i) {
      throw new Exception();
    }
    return 1;
  }
}