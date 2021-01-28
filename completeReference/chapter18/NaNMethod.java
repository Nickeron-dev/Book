package classes;

public class NaNMethod {
  public static void main(String[] args) {
    Double var1 = Double.valueOf(1/0.);
    Double var2 = Double.valueOf(0/0.);

    System.out.println(var1 + ": " + var1.isInfinite() + ", " + var1.isNaN());
    System.out.println(var2 + ": " + var2.isInfinite() + ", " + var2.isNaN());
  }
}
