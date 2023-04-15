package staticmethods;

public class Operaciones {
  private static Double PI = Math.PI;

  public static Double celsiusToFarenheeit(Double C) {
    return (1.8 * C) + 32;
  }

  public static Double farenheitToCelsius(Double F) {
    return (F - 32) / 1.8;
  }

  public static Double circleArea(Double rad) {
    return PI * (rad*rad);
  }

  public static Double circlePerimeter(Double radius) {
    return 2 * PI * radius;
  }

  public static Double hypotenuse(Double opposite, Double adjacent) {
    return Math.sqrt(Math.pow(opposite, 2) + Math.pow(adjacent, 2));
  }
}
