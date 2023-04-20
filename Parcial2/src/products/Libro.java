package products;

public class Libro extends Producto {
  private static Integer totalLibros = 0;
  private String autor;

  public Libro(String nombre, String descripcion, Double precio, String autor) {
    super(nombre, descripcion, precio);
    this.autor = autor;
    Libro.totalLibros++;
  }

  public String getAutor() {
    return autor;
  }
  
  public static Integer getTotalLibros() {
    return totalLibros;
  }

  @Override
  public void print() {
    super.print();
    System.out.println("autor=" + autor);
  }
}
