package parcial;

import products.Libro;
import products.Pelicula;

public class Main {
  public static void main(String[] args) {
    Libro libroObj = new Libro("100 años de soledad", "Relatos de la familia buendia", 40000d, "Gabriel garcia");
    Pelicula peliculaObj = new Pelicula("End game", "Muere ironman", 15000d, "Hermanos washusky");

    libroObj.print();
    peliculaObj.print();

    System.out.println("Total libros=" + Libro.getTotalLibros() + ", Total peliculas=" + Pelicula.getTotalPeliculas()
        + ", Total productos=" + Libro.getTotalVendidos());
  }
}
