package classes;

import java.util.*;

public class CurrencyDemo {
  public static void main(String[] args) {
    Currency cur = Currency.getInstance(Locale.US);

    System.out.println("Symbol: " + cur.getSymbol());
    System.out.println("Default fractional digits: " + cur.getDefaultFractionDigits());
  }
}
