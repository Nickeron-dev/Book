package lambdaExpressionsMain;
import java.io.*;

public class LambdaExpressionsFirstDemo {
  public static void main(String[] args) {
    // creating simple lambda expression which returns value: 98.4
    lambdaExpressions.ClearFInterface myLambda = () -> 98.4;

    PrintWriter pw = new PrintWriter(System.out, true);

    //demonstration
    pw.println("Value is " + myLambda.getValue());

    // changing value in myLambda
    myLambda = () -> 13.5;
    pw.println("Second value is " + myLambda.getValue());

    // creating lambda which takes double values and returns 1.0/value
    // Note: double n --(here word double is not necessary)
    lambdaExpressions.ParametricInterface parametricLambda = (double n) -> 1.0 / n;

    //demonstration
    pw.println("1.0 / 4.0 equals: " + parametricLambda.getValue(4.0));
    pw.println("1.0 / 8.0 equals: " + parametricLambda.getValue(8.0));

    // I'll add some examples of errors that people might face
//  myLambda = () -> "String"; // String can't be converted to double
//  parametricLambda = () -> Math.random(); // here must be parameter
  }
}
