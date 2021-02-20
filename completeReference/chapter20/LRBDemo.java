package classes;

import java.util.*;

public class LRBDemo {
  public static void main(String[] args) {
    // Load the default bundle.
    ResourceBundle rd = ResourceBundle.getBundle("SampleRB");
    System.out.println("English version:");

    System.out.println("String for Title key: " + rd.getString("title"));
    System.out.println("String for StopText key: " + rd.getString("StopText"));
    System.out.println("String for StartText key: " + rd.getString("StartText"));

    rd = ResourceBundle.getBundle("SampleRB", Locale.GERMAN);
    System.out.println("German version:");

    System.out.println("String for Title key: " + rd.getString("title"));
    System.out.println("String for StopText key: " + rd.getString("StopText"));
    System.out.println("String for StartText key: " + rd.getString("StartText"));
  }
}
