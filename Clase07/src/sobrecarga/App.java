package sobrecarga;

public class App {
  public static void main(String[] args) throws Exception {
    Persona persona1 = new Persona("Harrison", 26);
    
    persona1.hablarUnIdioma();

    Persona persona2 = new Persona("Jimmy", "AB900123");
    
    persona2.hablarUnIdioma("English");
  }
}
