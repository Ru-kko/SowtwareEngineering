package structs.Clase16;

class Nodo<T extends Object> {
  private T data;
  private Nodo<?> next;

  public Nodo(T data) {
    this.data = data;
  }

  void setNext(Nodo<?> next) {
    this.next = next;
  }

  void setNext(T data) {
    this.next = new Nodo<>(data);
  }

  Nodo<?> getNext() {
    return this.next;
  }

  public T getData() {
    return this.data;
  }
}
