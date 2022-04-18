public class EquilateralTriangle extends Triangle {
  private double a;

  public EquilateralTriangle(double a) {
    super(a, a, a); //TODO აქ რო არ გვქონდეს fartobi() ხო უნდა იცოდეს მშობელთან რო მივა რეები მიანიჭოს გვერდებს? მაგისთვის არი აქ ეს
    //TODO ამის გარეშე იმუშავებს?
    // არა. შეცდომას არ ამოაგდებს, მაგრამ private a ცვლადს მნიშვნელობას ვერ მიანიჭებს და 0 იქნება ფართობიც და პერიმეტრიც
    this.a = a;
  }

  @Override
  public double area() {

    return  Format.round((Math.sqrt(3.0) / 4.0) * a * a);
  }

  @Override
  public double perimeter() {
    return Format.round(3 * a);
  }

  @Override
  public String figure() {
    return "ტოლგვერდა სამკუთხედი";
  }

}
