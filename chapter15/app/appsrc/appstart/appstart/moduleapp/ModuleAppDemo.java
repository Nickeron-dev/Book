package appstart.moduleapp;

import appfuncs.mathfuncs.MathFuncs;
import java.io.*;

public class ModuleAppDemo {
  public static void main(String[] args) {
    PrintWriter pw = new PrintWriter(System.out, true);

    if(isFactor(2, 10)) pw.println("2 is a multiplier of 10");
    else pw.println("2 is not a multiplier of 10");

    pw.println(lowerFactor(35, 105) + " is the lowerst factor of 35 and 105");
    pw.println(greaterFactor(35, 105) + " is the largest factor of 35 and 105");
  }
}
