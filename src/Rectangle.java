public class Rectangle implements Figure {
  private double sigrdze;
  private double sigane;

  public Rectangle(double sigrdze, double sigane) {
    this.sigrdze = sigrdze;
    this.sigane = sigane;
  }

  @Override
  public double area() {
    return Format.round(sigrdze * sigane);
  }

  @Override
  public double perimeter() {
    return Format.round((sigrdze + sigane) * 2.0);
  }

  @Override
  public String figure() {
    return "მართკუთხედი";
  }

}
