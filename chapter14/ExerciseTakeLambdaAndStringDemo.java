package lambdaExpressionsMain;
import java.io.*;
import lambdaExpressions.*;

public class ExerciseTakeLambdaAndStringDemo {
  public static String returnString(TakeLambdaAndString obj, String str) {
    return obj.func(str);  // creating method for using functional interface
  }

  public static void main(String[] args) {
    String instr = "Lambda Expressions Make Java Larger.";
    String outstr;
    PrintWriter pw = new PrintWriter(System.out, true);

    // Not to call method at the end I just called it here and typed lambda here
    outstr = returnString((str) -> {  // reversing given string
      String answer = "";

      for(int i = str.length()-1; i >= 0; i--) {
        switch(str.charAt(i)) {
          case ' ':  // changing space to -
            answer += '-';
            break;
          case '.':  // changing . to !
            answer += '!';
            break;
          default:
            if(Character.isUpperCase(str.charAt(i)))  // turning char to opposite
              answer += Character.toLowerCase(str.charAt(i)); // case
            else
              answer += Character.toUpperCase(str.charAt(i));
        }
      }
      return answer;
    }, instr);

    pw.println("First string is: " + instr);
    //outstr = returnString(reverse, instr);
    pw.println("Return is: " + outstr); // demonstration
  }
}
