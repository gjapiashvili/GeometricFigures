public class Main {
  public static void main(String[] args) {
    //demonstrateCasting();

    Figure[] figures =
        { new Tsre(5),
          new Rectangle(2, 4),
          new Triangle(6, 7, 10),
          new Square(8),
          new EquilateralTriangle(9) };

    for (Figure f : figures) {
      System.out.println("Figure: " + f.figure() + "; Area: " + f.area() + "; " + "Perimeter: " + f.perimeter());
    }

  }

  public static void demonstrateCasting() {
    Tsre tsre = new Tsre(3);

    System.out.printf("წრის ფართობია %s\n", tsre.area());

    System.out.printf("წრის სიგრძეა %s\n", tsre.perimeter());

    // ასევე შეგვიძლია მშობლის ტიპის ცვლადში შევინახოთ შვილი კლასის ობიექტი
    Figure tsre1 = new Tsre(5);

    // აქ არ შეგვიძლია tsre1.diametri() გამოვიძახოთ, იმიტო რო Figure ტიპის არი,
    // მარტო ის მეთოდები ჩანს, რომლებიც Figure კლასს აქვს
    //System.out.printf("tsre1-ის დიამეტრია %s\n", tsre1.diametri(););

    Tsre tsre2 = new Tsre(6);

    // tsre2-ისთვის შეგვიძლია
    System.out.printf("tsre2-ის დიამეტრია %s\n", tsre2.diametri());

    var c = (Tsre) tsre1;

    // ეხლა უკვე შეგვიძლია:
    System.out.printf("tsre1-ის დიამეტრია %s\n", c.diametri());

  }
}
