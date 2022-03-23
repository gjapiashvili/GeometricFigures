public class Martkutkhedi implements Figura {
  private double sigrdze;
  private double sigane;

  public Martkutkhedi(double sigrdze, double sigane) {
    this.sigrdze = sigrdze;
    this.sigane = sigane;
  }

  @Override
  public double fartobi() {
    return Format.round(sigrdze * sigane);
  }

  @Override
  public double perimetri() {
    return Format.round((sigrdze + sigane) * 2.0);
  }

  @Override
  public String figura() {
    return "მართკუთხედი";
  }

}
