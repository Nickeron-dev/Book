package lambdaExpressionsMain;
import java.io.*;

public class FITwoParametersTestingDemo {
  public static void main(String[] args) {
    PrintWriter pw = new PrintWriter(System.out, true);

    // creating lambda which returns true if firstValue % secondValue = 0
    lambdaExpressions.FunctionalInterfaceTwoParameters isFactor = (a, b) -> (a % b) == 0;

    pw.println("Does 45 / 5 lefts 0? Answer: " + isFactor.test(45, 5));
    pw.println("Does 45 / 2 lefts 0? Answer: " + isFactor.test(45, 2));

    // if a < b return true
    lambdaExpressions.FunctionalInterfaceTwoParameters lessThan = (a, b) -> (a < b);

    pw.println("Does 5 < 8? Answer: " + lessThan.test(5, 8));
    pw.println("Does 3 < 1? Answer: " + lessThan.test(3, 1));

    // are equal?

    lambdaExpressions.FunctionalInterfaceTwoParameters areAbsEqual = (a, b) -> (Math.abs(a) == Math.abs(b));
    pw.println("Does abs(20) == abs(-20)? Answer: " + areAbsEqual.test(20, -20));
    pw.println("Does abs(30) == abs(30)? Answer: " + areAbsEqual.test(30, 30));
    pw.println("Does abs(30) == abs(-40)? Answer: " + areAbsEqual.test(30, -40));
  }
}
