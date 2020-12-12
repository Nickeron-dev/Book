package lambdaExpressionsMain;
import java.io.*;

public class GenInterfaceForTestsDemo {
  public static void main(String[] args) {
    PrintWriter pw = new PrintWriter(System.out, true);

    //creating generalized Integer lambda
    lambdaExpressions.GenInterfaceForTests<Integer> isFactor =
          (first, second) -> (first % second == 0);

    //demonstration
    if(isFactor.test(10, 3))
          pw.println("3 is a divider of 10");
    else
        pw.println("3 is not a divider of 10");

    if(isFactor.test(10, 2))
        pw.println("2 is a divider of 10");
    else
        pw.println("2 is not a divider of 10");

    // creating generalized Double lambda
    lambdaExpressions.GenInterfaceForTests<Double> isDoubleFactor =
        (Double first, Double second) -> (first % second == 0);

    // demonstration
    if(isDoubleFactor.test(45.0, 5.0))
        pw.println("5.0 is a divider of 45.0");
    else
        pw.println("5.0 is not a divider of 45.0");

    if(isDoubleFactor.test(10.3, 5.0))
        pw.println("5.0 is a divider of 10.3");
    else
        pw.println("5.0 is not a divider of 10.3");

    // creating generalized String lambda
    lambdaExpressions.GenInterfaceForTests<String> doesInclude =    // type is not necessary
        (mainElement, secondary) -> (mainElement.indexOf(secondary) != -1);

    // demonstration
    String mainStr = "This is for generalized lambda expression";
    pw.println("Checking string is: " + mainStr);
    if(doesInclude.test(mainStr, "lambda"))
        pw.println("String 'lambda'' is in mainStr");
    else
        pw.println("String 'lambda'' is not in mainStr");

    if(doesInclude.test(mainStr, "not here"))
        pw.println("String 'not here' is in mainStr");
    else
        pw.println("String 'not here' is not in mainStr");
  }
}
