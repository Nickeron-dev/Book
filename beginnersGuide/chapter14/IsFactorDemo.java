package lambdaExpressionsMain;

public class IsFactorDemo {
  public static void main(String[] args) {
    lambdaExpressions.IncludesMainNumber firstObj =
      new lambdaExpressions.IncludesMainNumber(12);
    lambdaExpressions.IncludesMainNumber secondObj =
      new lambdaExpressions.IncludesMainNumber(10);

    // creating reference
    lambdaExpressions.IntFindingPredicate reference = firstObj::isFactor;

    boolean result = reference.test(4);
    if(result)
      System.out.println("Number 4 is a divider of " + firstObj.getVariable());

    reference = secondObj::isFactor;
    result = reference.test(4);
    if(!result)
      System.out.println("Number 4 is not a divider of " + secondObj.getVariable());
  }
}
