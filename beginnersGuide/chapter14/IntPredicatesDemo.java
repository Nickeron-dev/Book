package lambdaExpressionsMain;
import lambdaExpressions.*;

public class IntPredicatesDemo {
  public static boolean checking(IntPredicates obj, int value) {
    return obj.test(value);
  }

  public static void main(String[] args) {
    boolean result; // variable for results

    result = checking(IntPredicatesTestsMethods::isPrime, 13); //reference to
    if(result) System.out.println("Number 13 is prime"); // isPrime

    result = checking(IntPredicatesTestsMethods::isEven, 12); // reference to
    if(result) System.out.println("Number 12 is even");  // isEven

    result = checking(IntPredicatesTestsMethods::isPositive, 3); // reference to
    if(result) System.out.println("Number 3 is positive"); // isPositive
  }
}
