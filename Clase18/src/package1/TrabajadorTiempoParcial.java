package package1;

public class TrabajadorTiempoParcial extends TrabajadorGeneral {
  private Integer diasTrabajadas;
  private Double salarioDia;
   

  public TrabajadorTiempoParcial(String name, Double salarioBase, Integer diasTrabajadas, Double salarioDia) {
    super(name, salarioBase);
    this.diasTrabajadas = diasTrabajadas;
    this.salarioDia = salarioDia;
  }


  @Override
  public Double calcularSalario() {
    return super.getSalarioBase() + (diasTrabajadas * salarioDia);
  }  
}
