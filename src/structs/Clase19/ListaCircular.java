package structs.Clase19;

public class ListaCircular {
  class Nodo {
    Integer valor;
    Nodo siguiente, anterior;

    public Nodo(Integer valor) {
      this.valor = valor;
    }
  }

  public Nodo raiz;

  public void insertarPrimero(Integer value) {
    Nodo nuevo = new Nodo(value);

    if (raiz == null) {
      nuevo.siguiente = nuevo;
      nuevo.anterior = nuevo;
      raiz = nuevo;
      return;
    }
    Nodo ultimo = this.raiz.anterior;
    nuevo.siguiente = raiz;
    nuevo.anterior = ultimo;
    raiz.anterior = nuevo;
    ultimo.siguiente = nuevo;
    raiz = nuevo;
  }

  public void insertarUltimo(Integer value) {
    Nodo nuevo = new Nodo(value);

    if (raiz == null) {
      nuevo.siguiente = nuevo;
      nuevo.anterior = nuevo;
      raiz = nuevo;
      return;
    }
    Nodo ultimo = raiz.anterior;

    nuevo.siguiente = raiz;
    nuevo.anterior = ultimo;
    raiz.anterior = nuevo;
    ultimo.siguiente = nuevo;
    // raiz = nuevo;
  }

  public void print() {
    String sout = "";
    if (raiz != null) {
      Nodo recorrido = raiz;
      do {
        sout = sout +  " -> " + recorrido.valor;
        recorrido = recorrido.siguiente;
      } while (recorrido != raiz && recorrido != null);
    }

    System.out.println(sout);
  }

  public static void main(String[] args) {
    ListaCircular lista = new ListaCircular();

    lista.insertarPrimero(5);
    lista.insertarPrimero(4);
    lista.insertarPrimero(3);
    lista.insertarPrimero(2);
    lista.insertarPrimero(1);

    lista.print();

    lista.insertarUltimo(6);
    lista.insertarUltimo(7);
    lista.insertarUltimo(8);
    lista.insertarUltimo(9);
    lista.insertarUltimo(10);

    lista.print();
  }
}
