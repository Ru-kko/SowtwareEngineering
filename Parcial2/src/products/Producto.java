package products;

class Producto {
  protected static Integer totalVendidos = 0; 
  private String nombre;
  private String descripcion;
  private Double precio;

  public Producto(String nombre, String descripcion, Double precio) {
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.precio = precio;

    Producto.totalVendidos ++;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public Double getPrecio() {
    return precio;
  }

  public void setPrecio(Double precio) {
    this.precio = precio;
  }

  public static Integer getTotalVendidos() {
    return totalVendidos;
  }

  public void print() {
    System.out.println( "nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio);
  }
}
