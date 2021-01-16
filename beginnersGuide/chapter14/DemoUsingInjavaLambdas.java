package lambdaExpressionsMain;

import java.util.function.Predicate;

public class DemoUsingInjavaLambdas {
  public static void main(String[] args) {
    Predicate<Integer> readyLambda = (n) -> (n % 2) == 0;

    if(readyLambda.test(4)) {
      System.out.println("Number 4 is Even");
    }

    if(!readyLambda.test(5)) {
      System.out.println("Number 5 is Not Even");
    }
  }
}
