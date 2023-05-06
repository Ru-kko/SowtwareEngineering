package structs.Clase17;

public class LinkedList<K> {
  private Node<K> tail;
  private Integer size = 0;
   
  public void push(K val) {
    Node<K> newNode = new Node<>(val);
    if (tail != null) {
      newNode.setNext(tail);
    }
    
    this.size ++;
    this.tail = newNode;
  }

  public void pop() {
    if (this.tail != null) {  
      this.tail = this.tail.next();
      this.size --;
    }
  }

  public K getValue() {
    if (this.tail == null) return null;
    K res = this.tail.get();
    this.pop();
    return res;
  }

  public void print() {
    Node<K> actual = this.tail;
    while(actual != null) {
      System.out.println(actual.get());
      actual = actual.next();
    }
  }

  static class Node<T> {
    private T info;
    private Node<T> next;

    public Node(T info) {
      this.info = info;
    }
    public Node(){}

    public void set(T info) {
      this.info = info;      
    }

    public T get() {
      return this.info;
    }

    public Node<T> next() {
      return this.next;
    }

    public void setNext(Node<T> nw) {
      this.next = nw;
    }
  }

  public Integer size() {
    return this.size;
  }
  
  public Boolean isEmpty() {
    return this.size == 0;
  }

  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();

    list.push(12);
    list.push(43);
    list.push(74);
    list.push(86);

    System.out.println("Size: " + list.size());
    list.print();

    System.out.println(list.getValue() + " extratcted");    
    System.out.println("Size: " + list.size());
    list.print();
  }
}