package package1;

public class CalculadorDeSalario {
  public static void main(String[] args) throws Exception {
    TrabajadorGeneral empleado1 = new TrabajadorTiempoCompleto("Willson", 1000000d, 1000000d);
    TrabajadorGeneral empleado2 = new TrabajadorTiempoParcial("", 1000000d, 20, 33000d);

    System.out.println("El salario de un empleado de tiempo completo es: " + empleado1.calcularSalario());
    System.out.println("El salario de un empleado de tiempo parcial es: " + empleado2.calcularSalario());
  }
}
