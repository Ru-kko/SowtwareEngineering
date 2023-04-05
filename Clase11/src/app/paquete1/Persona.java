package app.paquete1;

public class Persona {
  private String Nombre;
  private String Apellido;
  private Integer Eddad;
  
  public Persona(String nombre, String apellido, Integer eddad) {
    Nombre = nombre;
    Apellido = apellido;
    Eddad = eddad;
  }

  public String getNombre() {
    return Nombre;
  }

  public String getApellido() {
    return Apellido;
  }

  public Integer getEddad() {
    return Eddad;
  } 
}
