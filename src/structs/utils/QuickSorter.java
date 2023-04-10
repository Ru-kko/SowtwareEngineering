package structs.utils;

@SuppressWarnings("all")
public class QuickSorter<T> {
  private T[] list;
  Comparator<T> comparator;

  private QuickSorter(T[] list, Comparator<T> comparator) {
    this.comparator = comparator;
    this.list = list;
  }

  public void sort() {
    
  }

  private void quickSort(T[] array, Integer izquierda, Integer derecha) {
    if (izquierda < derecha) {
      Integer partitionIndex = particion(array, izquierda, derecha);
      quickSort(array, izquierda, partitionIndex);
      quickSort(array, partitionIndex + 1, derecha);
    }
    this.list = array;
  }

  interface Comparator<K> {
    public boolean compare(K a, K b);
  }

  private Integer particion(T array[], Integer izquierda, Integer derecha) {
    T pivote = array[izquierda];

    while (true) {
      while (this.comparator.compare(array[izquierda], pivote)) {
        izquierda++;
      }
      while (this.comparator.compare(array[derecha], pivote)) {
        derecha--;
      }

      if (izquierda >= derecha) {
        return derecha;
      } else {
        T aux = array[izquierda];
        array[izquierda] = array[derecha];
        array[derecha] = aux;
        izquierda++;
        derecha--;
      }
    }
  }

  public T[] getList() {
    return this.list;
  }
}
