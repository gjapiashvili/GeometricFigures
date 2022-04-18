public class Triangle implements Figure {
  private double a;
  private double b;
  private double c;

  public Triangle(double a, double b, double c) {
    if (a + b <= c ||
        b + c <= a ||
        a + c <= b) {
      throw new IllegalArgumentException("ნებისმიერი ორი გვერდის სიგრძეების ჯამი მეტი უნდა იყოს მესამე გვერდის სიგრძეზე!");
    }

    this.a = a;
    this.b = b;
    this.c = c;
  }

  //TODO სწორია?
  @Override
  public double area() {
    var s = (a + b + c) / 2.0;

    return Format.round(Math.sqrt(s * (s - a) * (s - b) * (s - c)));
  }

  @Override
  public double perimeter() {
    return Format.round(a + b + c);
  }

  @Override
  public String figure() {
    return "Triangle";
  }

}
