package App.impl;

import App.abs.MetodoDePago;

public class TargetaDeCredito extends MetodoDePago {
  private String numeroDeTargeta;
  private String expDate;
  private final Float intereces;

  public TargetaDeCredito(Double valor, String numeroDeTargeta, String expDate, Float intereces) {
    super(valor, "Targeta de credito");
    this.numeroDeTargeta = numeroDeTargeta;
    this.intereces = intereces;
    this.expDate = expDate;
  }

  public String getExpDate() {
    return this.expDate;
  }

  public String getNumeroDeTargeta() {
    return numeroDeTargeta;
  }

  public Double calcularInteres() {
    return super.getValor() * this.intereces / 100f;
  }

  

  @Override
  public void mostarDetalles() {
    super.mostarDetalles();
    System.out.println("Targeta no° " + this.numeroDeTargeta + " expira el " + this.expDate);
  }

  @Override
  public void realizarPago() {
    System.out.println("Con un interese de " + calcularInteres() + ", dando un total de " + (calcularInteres() + getValor()));
  }
}
