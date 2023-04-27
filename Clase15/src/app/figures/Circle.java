package app.figures;

public class Circle extends AbstracFigure {
  private Double radius; 

  public Circle(Double radius) {
    this.radius = radius;
  }

  @Override
  public Double getArea() {
    return Math.PI * Math.pow(this.radius, 2);
  }
}
