package products;

public class Pelicula extends Producto {
  private static Integer totalPeliculas = 0;
  private String director;

  
  public Pelicula(String nombre, String descripcion, Double precio, String director) {
    super(nombre, descripcion, precio);
    this.director = director;
    Pelicula.totalPeliculas ++;
  }
  
  public String getDirector() {
    return director;
  }

  public static Integer getTotalPeliculas() {
    return totalPeliculas;
  }

  @Override
  public void print() {
    super.print();
    System.out.println("director=" + director);
  }
}
