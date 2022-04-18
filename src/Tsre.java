public class Tsre implements Figure {
  private double radius;

  //TODO კონსტრუქტორი public რო არ იყოს იმუშავებს?
  // თუ private იქნება, არ იმუშავებს. თუ არაფერს დავუწერთ, იმუშავებს, იმიტო რო იმავე package-დან ვიძახებთ
  public Tsre(double radius) {
    this.radius = radius;
  }

  @Override
  public double area() {
    return Format.round(Math.PI * radius * radius);
  }

  @Override
  public double perimeter() {
    return Format.round(2 * Math.PI * radius);
  }

  @Override
  public String figure() {
    return "Circle";
  }

  public double diametri() {
    return Format.round(radius * 2.0);
  }
}
