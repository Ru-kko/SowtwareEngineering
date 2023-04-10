package structs.utils;

public class Sorter<T> {
  private T[] list;

  public Sorter(T[] list) {
    this.list = list;
  }

  public interface Comparator<K> {
    public Boolean compare(K a, K b);
  }

  public T[] getList() {
    return this.list;
  }

  public T[] sort(Comparator<T> comparator) {
    for (int i = 0; i < this.list.length - 1; i++) {
      for (int j = 0; j < this.list.length - 1; j++) {
        if (comparator.compare(list[j], list[j + 1])) {
          T aux = list[j];
          list[j] = list[j + 1];
          list[j + 1] = aux;
        }
      }
    }
    return this.list;
  }
}
