package lambdaExpressions;

public class IntPredicatesTestsMethods {
  public static boolean isPositive(int value) {
    return value > 0;
  }

  public static boolean isEven(int value) {
    return (value % 2) == 0;
  }

  public static boolean isPrime(int value) {
    if(value < 2) return false;
    for(int i = 2; i < value/i; i++) {
      if((value % i) == 0) return false;
    }
    return true;
  }
}
