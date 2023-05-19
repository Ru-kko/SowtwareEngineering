package Talleres;

/**
 * Se tiene una lista de estudiantes de una universidad de Bogotá, se solicita
 * que ordene la lista por apellido. Realizar un programa en Java con el fin de
 * saber si existe un apellido repetido, contar los estudiantes, insertar un
 * estudiante nuevo, eliminar de la lista un estudiante que perdió el curso y a
 * la vez imprima el resultado.
 * 
 * @author Jose Sebastian Vera
 * @see Taller10.LinkedList
 * @see Taller10.LinkedListSorter
 */
public class Taller10 {

  /**
   * Entidad estudiante con nombre y apellido
   */
  public static class Student {
    private String name;
    private String surname;

    public Student(String name, String surname) {
      this.name = name;
      this.surname = surname;
    }

    public String getName() {
      return name;
    }

    public String getSurname() {
      return surname;
    }

    @Override
    public String toString() {
      return String.format("|%10s|%10s|", name, surname);
    }
  }

  public static void main(String[] args) {
    LinkedList<Student> list = new LinkedList<>();

    list.push(new Student("jane", "Doe"));
    list.push(new Student("Pepe", "Pog"));
    list.push(new Student("Jonh", "Eod"));
    list.push(new Student("Raul", "Arturo"));

    LinkedListSorter<Student> sorter = new LinkedListSorter<>(list);
    sorter.sort((a, b) -> a.surname.compareTo(b.surname) >= 0);

    System.out.println("La lista de los " + list.getSize() + " estudiantes ordenada por apellido es: ");
    sorter.list.print();
  }

  /**
   * Lista simplemete enlazada la cual permite Editar, Borrar, Crear y Agregar
   * valores
   */
  static class LinkedList<T> {
    private static class Node<V> {
      private V value;

      private Node<V> next;

      Node(V value) {
        this.value = value;
      }

      public void setValue(V value) {
        this.value = value;
      }

      public V getValue() {
        return value;
      }

      public Node<V> getNext() {
        return next;
      }

      public void setNext(Node<V> next) {
        this.next = next;
      }

    }

    private Node<T> head;
    private Node<T> tail;
    private Integer size = 0;

    public Integer getSize() {
      return this.size;
    }

    public void push(T val) {
      var node = new Node<T>(val);
      size++;
      if (head == null) {
        head = node;
        tail = node;
        return;
      }

      this.tail.setNext(node);
      this.tail = node;
    }

    public T get(Integer position) {
      return this.getNode(position).getValue();
    }

    private Node<T> getNode(Integer position) {
      if (position >= size || position < 0) {
        throw new IndexOutOfBoundsException(String.format("%d outs of %d", position, size - 1));
      }
      Integer count = 0;
      Node<T> actual = this.head;

      while (count != position) {
        count++;
        actual = actual.getNext();
      }

      return actual;
    }

    public void remove(Integer position) {
      if (position == 1) {
        if (this.size == 1) {
          this.head = null;
          this.tail = null;
        } else {
          this.head = this.head.getNext();
        }
        this.size--;
        return;
      }

      Node<T> previous = this.getNode(position - 1);

      if (position == size) {
        previous.setNext(null);
        this.tail = previous;
        this.size--;
        return;
      }

      previous.setNext(previous.getNext().getNext());
      this.size--;
    }

    public void set(T value, Integer position) {
      getNode(position).setValue(value);
    }

    public void print() {
      Node<T> actual = this.head;
      while (actual != null) {
        System.out.println(actual.value);
        actual = actual.getNext();
      }
    }
  }

  /**
   * Ordenador generico usando metodo burbuja
   */
  static class LinkedListSorter<T> {

    public interface Comparator<K> {
      public Boolean compare(K a, K b);
    }

    private LinkedList<T> list;

    public LinkedListSorter(LinkedList<T> list) {
      this.list = list;
    }

    public void sort(Comparator<T> comp) {
      for (int i = 0; i < this.list.getSize() - 1; i++) {
        for (int j = 0; j < this.list.getSize() - 1; j++) {
          T actual = this.list.get(j);
          T next = this.list.get(j + 1);
          if (comp.compare(actual, next)) {
            this.list.set(next, j);
            this.list.set(actual, j + 1);
          }
        }
      }
    }
  }
}
