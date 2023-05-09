package structs.Clase18;

class Node<T> {
  private Node<T> front;
  private Node<T> back;
  private T value;

  Node(T value) {
    this.value = value;
  }

  Node<T> getFront() {
    return front;
  }

  void setFront(Node<T> front) {
    this.front = front;
  }

  Node<T> getBack() {
    return back;
  }

  void setBack(Node<T> back) {
    this.back = back;
  }

  T getValue() {
    return value;
  }

  void setValue(T value) {
    this.value = value;
  }
}