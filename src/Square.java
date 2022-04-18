public class Square extends Rectangle {
  private double a;

  public Square(double a) {
    super(a, a); //TODO ეს აუცილებელია. რატომ? იმიტომ. რომ მაგ. fartobi() რო არ გვქონდეს აქ და თუ main-ში figura.fartobi()
    // მეთოდს გამოვიძახებთ, მშობელთან წავა, ანუ მართკუთხედთან და იქ რა fartobi() მეთოდიც დახვდება იმას გაუშვებს.
    // და იქ sigrdze და sigane ხო უნდა იცოდეს? კი უნდა იცოდეს
    this.a = a;
  }

  @Override
  public double area() {
    return Format.round(a * a);
  }

  @Override
  public double perimeter() {
    return Format.round(4 * a);
  }

  @Override
  public String figure() {
    return "კვადრატი";
  }

}
