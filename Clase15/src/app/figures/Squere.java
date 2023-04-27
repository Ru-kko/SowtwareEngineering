package app.figures;

public class Squere extends AbstracFigure {
  private Double lenght;

  public Squere(Double lenght) {
    this.lenght = lenght;
  }

  @Override
  public Double getArea() {
    return Math.pow(this.lenght, 2);
  }
}
