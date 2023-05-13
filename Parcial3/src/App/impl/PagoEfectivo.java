package App.impl;

import App.abs.MetodoDePago;

public class PagoEfectivo extends MetodoDePago {
  private Double cantidad;

  public PagoEfectivo(Double valor, Double cantidad) throws Exception {
    super(valor, "Pago en efectivo");
    this.cantidad = cantidad;
    if (valor > cantidad)
      throw new Exception("Hace falta dinero");
  }

  public Double calcularCambio() {
    return this.cantidad - super.getValor();
  }

  @Override
  public void realizarPago() {
    System.out.println("paga un total de " + this.cantidad + " y se le devuelve un valor de " + this.calcularCambio());
  }
}
