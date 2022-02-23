public class TolgverdaSamkutkhedi extends Samkutkhedi {
  private double a;

  public TolgverdaSamkutkhedi(double a) {
    super(a, a, a); //TODO აქ რო არ გვქონდეს fartobi() ხო უნდა იცოდეს მშობელთან რო მივა რეები მიანიჭოს გვერდებს? მაგისთვის არი აქ ეს
    //TODO ამის გარეშე იმუშავებს?
    // არა. შეცდომას არ ამოაგდებს, მაგრამ private a ცვლადს მნიშვნელობას ვერ მიანიჭებს და 0 იქნება ფართობიც და პერიმეტრიც
    this.a = a;
  }

  @Override
  public double fartobi() {
    return (Math.sqrt(3.0) / 4.0) * a * a;
  }

  @Override
  public double perimetri() {
    return 3 * a;
  }

  @Override
  public String figura() {
    return "ტოლგვერდა სამკუთხედი";
  }

}
