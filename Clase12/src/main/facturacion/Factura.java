package main.facturacion;

public class Factura {
  private Integer id;
  protected Double precio;

  public Factura(Integer id, Double precio) {
    this.id = id;
    this.precio = precio;
  }

  public Integer getId() {
    return id;
  }

  public void totalAPagar() {
    System.out.println("Total a pagar de la factura " + this.getId() + " es: " + precio);
  }
}
