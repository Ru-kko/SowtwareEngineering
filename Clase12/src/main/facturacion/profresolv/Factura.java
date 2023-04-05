package main.facturacion.profresolv;

public class Factura {
  private Integer id;
  private Double valor;

  public Factura(Integer id, Double valor) {
    this.id = id;
    this.valor = valor;
  }

  public void mostrarFactura() {
    System.out.println("El numero de factura es " + this.id);
    System.out.println("El valor de la factura es " + this.valor);
  }

  public Double getValor() {
    return this.valor;
  }
}
