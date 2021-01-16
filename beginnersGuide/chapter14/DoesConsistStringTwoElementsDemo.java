package lambdaExpressionsMain;
import java.io.*;

public class DoesConsistStringTwoElementsDemo {
  public static void main(String[] args) {
    PrintWriter pw = new PrintWriter(System.out, true);

    // creating lambda to check does String one consist String two
    lambdaExpressions.StringTwoElements checking = (String stringOne, String stringTwo) -> stringOne.indexOf(stringTwo) != -1;

    String first = "This is test";

    if(checking.doesConsist(first, "test"))
      pw.println("'test' is found");
    else
      pw.println("'test' is not found");

    if(checking.doesConsist(first, "something"))
      pw.println("'something' is found");
    else
      pw.println("'something' isn't found");
  }
}
