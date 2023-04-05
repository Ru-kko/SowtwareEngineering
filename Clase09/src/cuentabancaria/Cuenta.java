package cuentabancaria;

public class Cuenta {
  private String nombreTitualar;
  private String numeroCuenta;
  private Double saldo;

  public static enum Action {
    Consignar,
    Retirar
  }
  
  public static interface ComplexAction {
    public Double config(Double actual);
  }

  public Cuenta(String nombreTitualar, String numeroCuenta, Double saldo) {
    this.nombreTitualar = nombreTitualar;
    this.numeroCuenta = numeroCuenta;
    this.saldo = saldo;
  }

  public String getNombreTitualar() {
    return nombreTitualar;
  }

  public void setNombreTitualar(String nombreTitualar) {
    this.nombreTitualar = nombreTitualar;
  }

  
  public String getNumeroCuenta() {
    return numeroCuenta;
  }

  public void setNumeroCuenta(String numeroCuenta) {
    this.numeroCuenta = numeroCuenta;
  }

  public Double getSaldo() {
    return saldo;
  }

  public void setSaldo(Double saldo) {
    this.saldo += saldo;
  }

  public void setSaldo(Action action, Double money) {
    switch (action) {
      case Consignar:
        this.saldo += money;
        break;
      case Retirar: 
        this.saldo -= money;
        break;
    }
  }

  public void setSaldo(ComplexAction action) {
    this.saldo = action.config(this.saldo);
  }
  @Override
  public String toString() {
    return "titualar = " + nombreTitualar + ", numero de cuenta = " + numeroCuenta + ", saldo = " + saldo;
  }
}
