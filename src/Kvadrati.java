public class Kvadrati extends Martkutkhedi {
  private double a;

  public Kvadrati(double a) {
    super(a, a); //TODO ეს აუცილებელია. რატომ? იმიტომ. რომ მაგ. fartobi() რო არ გვქონდეს აქ და თუ main-ში figura.fartobi()
    // მეთოდს გამოვიძახებთ, მშობელთან წავა, ანუ მართკუთხედთან და იქ რა fartobi() მეთოდიც დახვდება იმას გაუშვებს.
    // და იქ sigrdze და sigane ხო უნდა იცოდეს? კი უნდა იცოდეს
    this.a = a;
  }

  @Override
  public double fartobi() {
    return Format.round(a * a);
  }

  @Override
  public double perimetri() {
    return Format.round(4 * a);
  }

  @Override
  public String figura() {
    return "კვადრატი";
  }

}
