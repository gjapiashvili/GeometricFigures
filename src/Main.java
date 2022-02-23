import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    //demonstrateCasting();

    Figura[] figurebi =
        { new Tsre(5),
          new Martkutkhedi(2, 4),
          new Samkutkhedi(6, 7, 10),
          new Kvadrati(8),
          new TolgverdaSamkutkhedi(9) };

    for (Figura f : figurebi) {
      System.out.println("ფიგურა: " + f.figura() + "; ფართობი: " + f.fartobi() + "; " + "პერიმეტრი: " + f.perimetri());
    }

  }

  public static void demonstrateCasting() {
    Tsre tsre = new Tsre(3);

    System.out.printf("წრის ფართობია %s\n", tsre.fartobi());

    System.out.printf("წრის სიგრძეა %s\n", tsre.perimetri());

    // ასევე შეგვიძლია მშობლის ტიპის ცვლადში შევინახოთ შვილი კლასის ობიექტი
    Figura tsre1 = new Tsre(5);

    // აქ არ შეგვიძლია tsre1.diametri() გამოვიძახოთ, იმიტო რო Figura ტიპის არი,
    // მარტო ის მეთოდები ჩანს, რომლებიც Figura კლასს აქვს
    //System.out.printf("tsre1-ის დიამეტრია %s\n", tsre1.diametri(););

    Tsre tsre2 = new Tsre(6);

    // tsre2-ისთვის შეგვიძლია
    System.out.printf("tsre2-ის დიამეტრია %s\n", tsre2.diametri());

    var c = (Tsre) tsre1;

    // ეხლა უკვე შეგვიძლია:
    System.out.printf("tsre1-ის დიამეტრია %s\n", c.diametri());

  }
}
