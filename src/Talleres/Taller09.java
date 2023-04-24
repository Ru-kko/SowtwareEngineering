package Talleres;

import java.util.stream.IntStream;

/**
 * @author Jose Sebastian Vera Galeano
 */
public class Taller09 {
  Integer[] arr;
  Integer lenght, count;

  public Taller09(Integer lenght) {
    this.lenght = lenght;
    this.arr = new Integer[lenght];
  }

  public void hashFuc(Integer[] arrChain) {
    for (int i = 0; i < arr.length; i++) {
      Integer elment = arrChain[i];
      Integer arrIndex = Math.abs(elment % 23);
      while (this.arr[arrIndex] != null) {
        arrIndex++;
        arrIndex %= lenght;
      }
      arr[arrIndex] = elment;
    }
  }

  public Integer findKey(Integer elm) {
    Integer arrayIndex = Math.abs(elm % 23);
    Integer count = 0;
    while (this.arr[arrayIndex] != null) {
      if (this.arr[arrayIndex] == elm) {
        System.out.println("Elemento " + elm + " encotrado en el indice " + arrayIndex);
        return this.arr[arrayIndex];
      }
      arrayIndex++;
      arrayIndex %= this.lenght;
      count++;
      if (count > 23) {
        break;
      }
    }
    return null;
  }

  /**
   * Ahora hace uso de un numero primo mas grande y esta adaptado a la insercion
   * de cualquien tipo de numero entero y no string
   */
  public static void main(String[] args) {
    var obj = new Taller09(23);
    // Genera un array consecutivo de numeros del -10 al 12 
    Integer[] elemts = IntStream.range(-10, 13).boxed().toArray(Integer[]::new);

    obj.hashFuc(elemts);
    Integer buscando = obj.findKey(-2);

    if (buscando == null) {
      System.out.println("Elemento no se encuentra");
    } else {
      System.out.println(buscando);
    }
  }
}