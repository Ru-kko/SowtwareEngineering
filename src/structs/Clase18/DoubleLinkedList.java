package structs.Clase18;

public class DoubleLinkedList<T> {
  private Node<T> frist;
  private Node<T> actual;
  private Node<T> last;
  private Integer size = 0;

  public static void main(String[] args) {
    var linked = new DoubleLinkedList<Integer>();
    linked.insertFrist(0);
    linked.insertFrist(1);
    linked.insertFrist(2);
    linked.insertFrist(3);
    linked.insertFrist(4);
    linked.insertFrist(5);

    while (linked.moveRight() != null) {
      System.out.println(linked.get());
    }
  }

  public Integer size() {
    return this.size;
  }

  public DoubleLinkedList<T> moveRight() {
    if (this.actual != null && this.actual.getFront() != null) {
      this.actual = actual.getFront();
      return this;
    }

    return null;
  }  
  
  public DoubleLinkedList<T> moveLeft() {
    if (this.actual != null && this.actual.getBack() != null) {
      this.actual = actual.getFront();
      return this;
    }

    return null;
  }

  public void insertLast(T value) {
    Node<T> new_ = new Node<>(value);

    this.size ++;

    if (actual == null) {
      actual = new_;
      frist = new_;
      last = new_;
      return;
    }

    if (this.actual.getBack() == null) {
      this.actual.setBack(new_);
      new_.setFront(this.last);
      this.last = new_;
      return;
    }

    new_.setFront(this.last);
    this.last.setBack(new_);
    this.last = new_;
  }

  public void insertFrist(T value) {
    Node<T> new_ = new Node<>(value);

    this.size ++;

    if (actual == null) {
      actual = new_;
      last = new_;
      frist = new_;
      return;
    }

    if (this.actual.getFront() == null) {
      this.actual.setFront(new_);
      new_.setBack(actual);
      this.frist = new_;
      return;
    }

    new_.setBack(this.frist);
    this.frist.setFront(new_);
    this.frist = new_;
  }

  public T get() {
    return this.actual == null ? null : this.actual.getValue();
  }
}