package structs.Clase14;

import java.util.Arrays;

public class TablasdeHash {
  String[] arr;
  Integer lenght, count;

  public TablasdeHash(Integer lenght) {
    this.lenght = lenght;
    this.arr = new String[lenght];

    Arrays.fill(arr, "-1");
  }

  public void hashFuc(String[] arrChain, String[] arr) {
    for (int i = 0; i < arr.length; i++) {
      String elment = arrChain[i];
      Integer arrIndex = Integer.parseInt(elment) % 7;
      System.out.println("Indice " + arrIndex + " para el emento " + elment);
      while (arr[arrIndex] != "-1") {
        arrIndex++;
        System.out.println("Ocurrio una colicion " + (arrIndex - 1) + " nuevo indice " + arrIndex);
        arrIndex %= lenght;
      }
      arr[arrIndex] = elment;
    }
  }

  public String findKey(String elm) {
    Integer arrayIndex = Integer.parseInt(elm) % 7;
    Integer count = 0;
    while (this.arr[arrayIndex] != "-1") {
      if (this.arr[arrayIndex] == elm) {
        System.out.println("Elemento " + elm + " encotrado en el indice " + arrayIndex);
        return this.arr[arrayIndex];
      }
      arrayIndex++;
      arrayIndex %= this.lenght;
      count++;
      if (count > 7) {
        break;
      }
    }
    return null;
  }

  public static void main(String[] args) {
    var obj = new TablasdeHash(10);
    String[] elemts = { "21", "32", "14", "88", "56", "76", "99", "98", "1", "2" };
    obj.hashFuc(elemts, obj.arr);
    String buscando = obj.findKey("2");

    if (buscando == null) {
      System.out.println("Elemento no se encuentra");
    } else {
      System.out.println(buscando);
    }
  }
}
