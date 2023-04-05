package main.facturacion;

public class FacturaIVA extends Factura {
  private Double iva;

  public FacturaIVA(Integer id,Double precio, Integer iva) {
    super(id, precio);
    this.iva = (iva / 100) + 1d;
  }


  @Override
  public void totalAPagar() {
    System.out.println("Total a pagar de la factura " + super.getId() + " es: " + super.precio * this.iva);
  }
}
