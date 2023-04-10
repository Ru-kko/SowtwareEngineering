package structs;

public class Clase12 {

  public static void main(String[] args) throws Exception {
    Integer[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19 };
    Integer toFind = 10;
    System.out.println(Clase12.Find(toFind, array));
  }

  public static Integer Find(Integer num, Integer[] array) {
    Integer frist, center, last, centerValue;

    frist = 0;
    last = array.length - 1;

    while (frist <= last) {
      center = (frist + last) / 2;
      centerValue = array[center];

      if (num == centerValue) return center;

      if (num < centerValue){

        last = center - 1;
      } else {
        frist = center + 1;
      }

    }

    return -1;
  }
}
