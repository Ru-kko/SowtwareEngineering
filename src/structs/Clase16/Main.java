package structs.Clase16;

class Main {
  public static void main(String[] args) {
    Nodo<?> head = new Nodo<>(10);
    Nodo<?> second = new Nodo<>("test");
    Nodo<?> third = new Nodo<>(100d);

    head.setNext(second);
    second.setNext(third);

    Nodo<?> aux = head;
    while (aux != null) {
      System.out.println(aux.getData());
      aux = aux.getNext();
    }
  }
}
