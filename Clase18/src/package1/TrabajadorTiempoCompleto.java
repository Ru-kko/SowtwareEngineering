package package1;

public class TrabajadorTiempoCompleto extends TrabajadorGeneral {
  private Double salarioAnual;

  public TrabajadorTiempoCompleto(String name, Double salarioBase, Double salarioAnual) {
    super(name, salarioBase); 
    this.salarioAnual = salarioAnual;
  }

  @Override
  public Double calcularSalario() {
    return super.getSalarioBase() + (this.salarioAnual/meseseLaborales);
  }
}
