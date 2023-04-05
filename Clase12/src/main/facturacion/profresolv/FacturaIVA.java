package main.facturacion.profresolv;

public class FacturaIVA extends Factura {
  private Double valorIVA;

  public FacturaIVA(Integer id, Double valor, Double valorIVA) {
    super(id, valor);
    this.valorIVA = valorIVA;
  }

  public Double getValorIVA() {
    return super.getValor() * (this.valorIVA / 100);
  }

  @Override
  public void mostrarFactura() {
    super.mostrarFactura();
    System.out.println("El valor del IVA es " + this.valorIVA);
    System.out.println("El valor del iva aplicado es " + (this.getValorIVA() + super.getValor()));
  }
}
