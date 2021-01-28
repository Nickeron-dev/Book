package classes;

public class DoubleValue {
  public static void main(String[] args) {
    Double value1 = Double.valueOf(3.14159);
    Double value2 = Double.valueOf("314159E-5");

    System.out.println(value1 + " is equals to " + value2 + " -> " + value1.equals(value2));
  }
}
