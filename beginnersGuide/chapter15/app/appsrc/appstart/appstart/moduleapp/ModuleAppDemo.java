package appstart.moduleapp;

import appfuncs.mathfuncs.MathFuncsDemo;
import userfuncs.binaryfuncs.*;

import java.io.*;
import java.util.ServiceLoader;

public class ModuleAppDemo {
  public static void main(String[] args) {
    PrintWriter pw = new PrintWriter(System.out, true);

    if(MathFuncsDemo.isFactor(2, 10)) pw.println("2 is a multiplier of 10");
    else pw.println("2 is not a multiplier of 10");

    pw.println(MathFuncsDemo.lowerFactor(35, 105) + " is the lowerst factor of 35 and 105");
    pw.println(MathFuncsDemo.greaterFactor(35, 105) + " is the largest factor of 35 and 105");

    ServiceLoader<BinFuncProvider> ldr = ServiceLoader.load(BinFuncProvider.class);

    BinaryFunc binOp = null;

    for(BinFuncProvider bfp : ldr) {
      if(bfp.get().getName().equals("absPlus")) {
        binOp = bfp.get();
        break;
      }
    }

    if(binOp != null) pw.println("Result of absPlus: " + binOp.func(12, -4));
    else pw.println("absPlus is not found");

    binOp = null;

    for(BinFuncProvider bfp : ldr) {
      if(bfp.get().getName().equals("absMinus")) {
        binOp = bfp.get();
        break;
      }
    }

    if(binOp != null) pw.println("Result of absMinus: " + binOp.func(12, -4));
    else pw.println("absMinus is not found");
  }
}
