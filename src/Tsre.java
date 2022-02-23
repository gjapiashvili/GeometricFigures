public class Tsre implements Figura {
  private double radiusi;

  //TODO კონსტრუქტორი public რო არ იყოს იმუშავებს?
  // თუ private იქნება, არ იმუშავებს. თუ არაფერს დავუწერთ, იმუშავებს, იმიტო რო იმავე package-დან ვიძახებთ
  public Tsre(double radiusi) {
    this.radiusi = radiusi;
  }

  @Override
  public double fartobi() {
    return Math.PI * radiusi * radiusi;
  }

  @Override
  public double perimetri() {
    return 2 * Math.PI * radiusi;
  }

  @Override
  public String figura() {
    return "წრე";
  }

  public double diametri() {
    return radiusi * 2.0;
  }
}
