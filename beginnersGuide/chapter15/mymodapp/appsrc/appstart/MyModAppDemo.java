package appstart.mymodappdemo;

import appfuncs.simplefuncs.SimpleMathFuncs;
import appsupport.supportfuncs.SupportFuncs;
import java.io.*;

public class MyModAppDemo {
  public static void main(String[] args) {
    PrintWriter pw = new PrintWriter(System.out, true);
    if(SupportFuncs.isFactor(2, 10)) pw.println("2 is a factor of 10");

    pw.println("The lowest multiplier of 35 and 105 is: " + getLowestMulitplier(35, 105));
    pw.println("The biggest st multiplier of 35 and 105 is: " + getBiggestMulitlier(35, 105));
  }
}
