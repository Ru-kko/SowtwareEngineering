package structs.Clase12;

import java.util.stream.IntStream;

public class BinarySearch2 {
  public static int search(int vec[], Integer value) {
    Integer n = vec.length;
    Integer center, inf = 0, sup = n - 1;
    Integer operations = 0;

    while (inf <= sup) {
      operations ++;
      center = (sup + inf) / 2;
      if (vec[center] == value) {
        System.out.println(operations);
        return center;
      }

      if (value < vec[center]) {
        sup = center - 1;
      } else {
        inf = center + 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] numbers =  IntStream.range(0, 1000).toArray();
    Integer findedIndex = BinarySearch2.search(numbers, 0);

    System.out.println("finded index " + findedIndex);
    if (findedIndex != -1)  
      System.out.println("Value at finded index " + numbers[findedIndex]);
  }
}