package app.figures;

public class Pentagon extends AbstracFigure {
  private Double siedLenght;

  public Pentagon(Double sideLenght) {
    this.siedLenght = sideLenght;
  }

  @Override
  public Double getArea() {
    Double div = Math.pow(this.siedLenght, 2) / Math.tan(Math.toRadians(36));
    return (5d / 4d) * div;
  }
}
