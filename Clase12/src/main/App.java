package main;

import main.facturacion.profresolv.Factura;
import main.facturacion.profresolv.FacturaIVA;

public class App {
  public static void main(String[] args) throws Exception {
    Factura base = new Factura(1, 100000d);
    FacturaIVA conIva = new FacturaIVA(2, 100000d, 19d);

    base.mostrarFactura();
    System.out.println("<- Con IVA ->");
    conIva.mostrarFactura();
  }
}