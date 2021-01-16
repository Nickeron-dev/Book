package lambdaExpressionsMain;

public class VarCapture {
  public static void main(String[] args) {
    int sum = 10; // this variable will be used in lambda so it is impossible to
                  // touch it
    lambdaExpressions.ForVarCapture lambda = (plus) -> {
      int answer = plus + sum; // possible because we don't change sum

//    sum++; // impossible because we are changing sum(it becomes final)
      return answer;
    };

    System.out.println(lambda.func(10));

//  sum++; // impossible because after using sum in lambda it becomes final
  }
}
