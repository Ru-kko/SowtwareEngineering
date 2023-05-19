package Talleres;

import java.util.Scanner;

/**
 * El codigo esta separado en dos clase para que se pueda refractorizar en
 * multiples archivos
 * 
 * @author Jose Sebastian Vera
 */
public class Taller11 {
  public static void main(String[] args) {
    new Ejercicio().init();
  }

  /**
   * Lista generica circular
   */
  private static class CircularList<T> {
    private Node<T> actual;
    private Integer sz = 0;

    private class Node<K> {
      private Node<K> next;
      private K value;

      public Node(K value) {
        this.value = value;
      }

      public K getValue() {
        return value;
      }

      public Node<K> getNext() {
        return next;
      }

      public void setNext(Node<K> next) {
        this.next = next;
      }
    }

    public Integer size() {
      return this.sz;
    }

    public void push(T val) {
      Node<T> newNode = new Node<>(val);

      if (this.actual == null) {
        newNode.setNext(newNode);
      } else {
        newNode.setNext(this.actual.getNext());
        this.actual.setNext(newNode);
      }

      this.actual = newNode;
      this.sz++;
    }

    public T get() {
      return this.actual != null ? this.actual.getValue() : null;
    }

    public void delete() {
      if (this.sz <= 1) {
        this.sz--;
        this.actual = null;
        return;
      }
      Node<T> nextNode = this.actual.getNext();
      Node<T> prevNode = null;

      for (int i = 0; i < this.sz - 1; i++) {
        prevNode = nextNode;
        nextNode = nextNode.getNext();
      }

      prevNode.setNext(nextNode.getNext());

      this.actual = nextNode.getNext();
      this.sz--;
    }

    public void print() {
      Node<T> last = this.actual;
      for (int i = 0; i < size(); i++) {
        System.out.println(last.getValue());
        last = last.getNext();
      }
    }
  }

  /**
   * Crear una lista circular con palabras leídas desde el teclado.
   * 
   * El programa debe tener un conjunto de opciones:
   * 
   * • Mostrar las cadenas que forman la lista.
   * 
   * • Borrar una palabra dada.
   * 
   * • Al terminar la ejecución, recorrer la lista eliminando los nodos.
   */
  private static class Ejercicio {
    private CircularList<String> list;
    private Scanner sc;
    private final static String OPCIONES = "Opciones: \n (1) agregar, (2) eliminar,"
        + "(3) imprimir, (4) salir, (h) mostar este mensaje";

    public Ejercicio() {
      this.list = new CircularList<>();
      this.sc = new Scanner(System.in);
      System.out.println(OPCIONES);
    }

    public void init() {
      System.out.println("Ingrese una opcion: ");

      String option = this.sc.nextLine();

      switch (option) {
        case "1":
          this.add();
          break;
        case "2":
          this.eliminar();
          break;
        case "3":
          System.out.println("Imprimiendo lista");
          this.list.print();
          init();
          break;
        case "4":
          this.end();
          break;
        case "h":
          System.out.println(OPCIONES);
          init();
          break;
        default:
          System.out.println("Opcion no valida ingrese de nuevo");
          init();
      }
    }

    private void add() {
      System.out.println("Ingrese una palabra");
      String word = this.sc.nextLine();
      this.list.push(word);
      this.init();
    }

    private void end() {
      System.out.println("Eliminando todo ");
      while (this.list.size() > 0) {
        this.list.delete();
      }

      this.list.print();
    }

    private void eliminar() {
      System.out.println("Eliminando " + this.list.get());
      this.list.delete();
      this.init();
    }
  }
}