package App;

import App.abs.MetodoDePago;
import App.impl.PagoEfectivo;
import App.impl.TargetaDeCredito;

public class PaymentSystem {
  public static void main(String[] args) throws Exception {
    Double productValue = 150000d;

    MetodoDePago efectivo = new PagoEfectivo(productValue, 200000d);
    MetodoDePago tarjeta = new TargetaDeCredito(productValue, "123456789111213", "12/24", 4f);

    efectivo.mostarDetalles();
    efectivo.realizarPago();

    System.out.println();
    
    tarjeta.mostarDetalles();
    tarjeta.realizarPago();
  }
}
