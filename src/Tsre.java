public class Tsre implements Figura {
  private double radiusi;

  //TODO კონსტრუქტორი public რო არ იყოს იმუშავებს?
  // თუ private იქნება, არ იმუშავებს. თუ არაფერს დავუწერთ, იმუშავებს, იმიტო რო იმავე package-დან ვიძახებთ
  public Tsre(double radiusi) {
    this.radiusi = radiusi;
  }

  @Override
  public double fartobi() {
    return Format.round(Math.PI * radiusi * radiusi);
  }

  @Override
  public double perimetri() {
    return Format.round(2 * Math.PI * radiusi);
  }

  @Override
  public String figura() {
    return "წრე";
  }

  public double diametri() {
    return Format.round(radiusi * 2.0);
  }
}
