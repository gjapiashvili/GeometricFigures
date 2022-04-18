import java.math.BigDecimal;
import java.math.RoundingMode;

public class Format {
  public static double round(double value) {
    int places = 1; // how many places (digits) do we want to have after the decimal point

    BigDecimal bd = BigDecimal.valueOf(value);
    bd = bd.setScale(places, RoundingMode.HALF_UP);
    return bd.doubleValue();
  }
}
