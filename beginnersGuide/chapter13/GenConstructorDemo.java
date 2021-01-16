package generalizationMain;
import java.io.*;

public class GenConstructorDemo {
  public static void main(String[] args) {
    PrintWriter pw = new PrintWriter(System.out, true);
    generalization.GenConstructor objOne = new generalization.GenConstructor(4.0);
    pw.println("Result one: " + objOne.getSum());
    generalization.GenConstructor obj2 = new generalization.GenConstructor(23.5);
    pw.println("Result two: " + obj2.getSum());
  }
}
