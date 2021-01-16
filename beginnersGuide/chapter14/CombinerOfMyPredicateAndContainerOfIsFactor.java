package lambdaExpressionsMain;

public class CombinerOfMyPredicateAndContainerOfIsFactor {
  public static void main(String[] args) {
    lambdaExpressions.ContainerOfIsFactor objOne = new lambdaExpressions.ContainerOfIsFactor(20);
    lambdaExpressions.ContainerOfIsFactor objTwo = new lambdaExpressions.ContainerOfIsFactor(30);

    boolean result;

    lambdaExpressions.MyIntNumPredicate reference = lambdaExpressions.ContainerOfIsFactor::isFactor;
    result = reference.test(objOne, 3);
    if(result) {
      System.out.println("3 is not a divider of " + objOne.getValue());
    }

    result = reference.test(objTwo, 3);
    if(!result) {
      System.out.println("3 is a divider of " + objTwo.getValue());
    }
  }
}
