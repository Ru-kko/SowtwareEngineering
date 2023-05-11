package structs.Clase19;

public class ListaCircularSimple<T> {
  private Node<T> raiz;
  private Node<T> actual;

  public ListaCircularSimple() {}

  public ListaCircularSimple(T initial) {
    Node<T> base = new Node<>(initial);
    base.setNext(base);

    this.actual = base;
    this.raiz = base;
  }

  private static class Node<K> {
    private Node<K> next;
    private K value;

    public Node(K value) {
      this.value = value;
    }

    public Node<K> getNext() {
      return next;
    }
    
    public void setNext(Node<K> next) {
      this.next = next;
    }

    public K getValue() {
      return value;
    }
    public void setValue(K value) {
      this.value = value;
    }
  }

  public void add(T val) {
    Node<T> new_ = new Node<>(val);

    if (actual == null) {
      new_.setNext(new_);
      this.raiz = new_;
    } else {
      new_.setNext(this.raiz);
      this.actual.setNext(new_);
    }

    this.actual = new_;
  }

  public T getActual() {
    return this.actual != null ? this.actual.getValue() : null;
  }


}