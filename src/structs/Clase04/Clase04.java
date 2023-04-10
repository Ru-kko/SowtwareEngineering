package structs.Clase04;
import java.util.Stack;;

// Pilas LIFO
public class Clase04 {
  public static void ejercicio01() {
    Stack<Object> pila = new Stack<>();
    
    pila.push(55);
    pila.push(17);
    pila.push("string");

    System.out.println("the las element is: " + pila.peek());

    while (!pila.empty()) {
      System.out.println("Deleting " + pila.pop());
    }
  }
}
