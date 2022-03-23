import java.math.BigDecimal;
import java.math.RoundingMode;

public class Format {
  public static double round(double value) {
    int places = 1; // მძიმის შემდეგ რამდენი ციფრი გვჭირდება

    BigDecimal bd = BigDecimal.valueOf(value);
    bd = bd.setScale(places, RoundingMode.HALF_UP);
    return bd.doubleValue();
  }
}
