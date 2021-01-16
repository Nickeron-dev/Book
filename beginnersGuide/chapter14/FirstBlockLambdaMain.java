package lambdaExpressionsMain;
import java.io.*;

public class FirstBlockLambdaMain {
  public static void main(String[] args){
    PrintWriter pw = new PrintWriter(System.out, true);

    // creating block lambda expression
    lambdaExpressions.FirstBlockLambda divider = (n) -> {
      int answer = 1;

      n = n >= 0 ? n : -n; // getting absolute value from n

      for(int i = 2; i <= n/i; i++) {
        if(n % i == 0) {
          answer = i;
          break;
        }
      }
      return answer;
    };
    pw.println("The smallest divider of 12 is " + divider.TheSmallestDivider(12));
    pw.println("The smallest divider of 11 is " + divider.TheSmallestDivider(11));
  }
}
