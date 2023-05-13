package App.abs;

public abstract class MetodoDePago implements IPago {
  private Double valor;
  protected String nombre;

  public MetodoDePago(Double valor, String nombre) {
    this.valor = valor;
    this.nombre = nombre;
  }

  public Double getValor() {
    return valor;
  }

  public void mostarDetalles() {
    System.out.println("Se pago por medio de " + this.nombre + " con un valor de " + this.valor);
  }
}
