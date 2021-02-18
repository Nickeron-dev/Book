package classes;

import java.util.*;

public class FormatterDemo {
  public static void main(String[] args) {
    Formatter form = new Formatter();

    form.format("Java is my %s language %d %f", "language", 100, 3.5);
    // so Formatter keep String in buffer and %s is for String,
    // %d is for decimal integer and %f is for double
    System.out.println(form);
    form.close(); // it is important to close Formatter obj

    Formatter formNumbers = new Formatter();

    for(double i = 1.23; i < 1.0e+6; i*= 100) {
      formNumbers.format("%f %e", i, i);
      System.out.println(formNumbers);
    }

    formNumbers.close(); // it is important to close obj!

    
  }
}
