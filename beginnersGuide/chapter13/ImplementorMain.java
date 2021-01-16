package generalizationMain;
import generalization.*;
import java.io.*;
public class ImplementorMain {
  public static void main(String[] args) {
    PrintWriter pw = new PrintWriter(System.out, true);
    Integer[] number = {2, 3, 4};
    Implementor<Integer> obj = new Implementor<Integer>(number);

    if(obj.contains(2)) pw.println("obj contains 2");
    else pw.println("obj doesn't contain 2");

    if(obj.contains(5)) pw.println("obj contains 5");
    else pw.println("obj doesn't contain 5");
  }
}
