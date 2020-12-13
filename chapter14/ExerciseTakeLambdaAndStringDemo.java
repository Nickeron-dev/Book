package lambdaExpressionsMain;
import java.io.*;
import lambdaExpressions.*;

public class ExerciseTakeLambdaAndStringDemo {
  public static String returnString(TakeLambdaAndString obj, String str) {
    return obj.func(str);  // creating method for using functional interface
  }

  public static void main(String[] args) {
    String instr = "Lambda expressions make java larger";
    String outstr;
    PrintWriter pw = new PrintWriter(System.out, true);

    TakeLambdaAndString reverse = (str) -> {  // reversing given string
      String answer = "";

      for(int i = str.length()-1; i > 0; i--)
        answer += str.charAt(i);

      return answer;
    };

    pw.println("First string is: " + instr);
    outstr = returnString(reverse, instr);
    pw.println("Return is: " + outstr); // demonstration
  }
}
