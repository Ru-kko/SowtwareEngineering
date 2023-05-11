package package1;

abstract public class TrabajadorGeneral implements Trabajador {
  private String name;
  private Double salarioBase;
  
  public TrabajadorGeneral(String name, Double salarioBase) {
    this.name = name;
    this.salarioBase = salarioBase;
  }
  
  public String getName() {
    return name;
  }

  public Double getSalarioBase() {
    return salarioBase;
  }
}