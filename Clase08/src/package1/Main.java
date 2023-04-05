package package1;

public class Main {
  public static void main(String[] args) {
    Persona obj1 = new Persona();

    System.out.println("La edad es: " + obj1.getNombre());

    obj1.setEdad(31);
    
    System.out.println("La edad nueva es: " + obj1.getEdad());
    System.out.println("El nombre es: " + obj1.getNombre());
  }
}
