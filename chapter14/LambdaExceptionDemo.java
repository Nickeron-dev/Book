package lambdaExpressionsMain;
import java.io.*;

public class LambdaExceptionDemo {
  public static void main(String[] args) {
    lambdaExpressions.MyIOAction lambda = (rdr) -> {
      int get = rdr.read(); // it can generate IOException so we must throw it first
      return true;
    };
  }
}
