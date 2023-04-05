package app.paquete1;

public class Estudiante extends Persona {
  private Integer codigoEstudiante;
  private Integer notaFinal;

  public Estudiante(String nombre, String apellido, Integer eddad, Integer codigoEstudiante, Integer notaFinal) {
    super(nombre, apellido, eddad);
    this.codigoEstudiante = codigoEstudiante;
    this.notaFinal = notaFinal;
  }

  public void mostarDatos() {
    System.out.println(
        "El estudiante se llama " + super.getNombre() + " " + super.getApellido() + 
        " su codigo es " + this.codigoEstudiante + 
        " y su nota final es " + this.notaFinal);
  }
}