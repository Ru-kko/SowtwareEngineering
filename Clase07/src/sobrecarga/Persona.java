package sobrecarga;

public class Persona {
  String nombre;
  String idetificacion;
  Integer edad;

  public Persona(String nombre, String identificacion) {
    this.idetificacion = identificacion;
    this.nombre = nombre;
  }

  public Persona(String nombre, Integer edad) {
    this.nombre = nombre;
    this.edad = edad;
  }

  public void hablarUnIdioma() {
    System.out.println("Mi nombre es " + this.nombre +
        " y mi eddad es " + this.edad +
        " y estoy hablando español");
  }

  public void hablarUnIdioma(String idioma) {
    System.out.println("My name is " + this.nombre +
        ", my id is: " + this.idetificacion +
        " and i'm speaking " + idioma);
  }
}
