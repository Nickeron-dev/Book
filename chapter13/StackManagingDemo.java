package generalizationMain;
import java.io.*;
import generalization.*;

public class StackManagingDemo {
  public static void main(String[] args) {
    Integer[] array = new Integer[10];
    StackManaging<Integer> integerStack = new StackManaging<Integer>(array);
    PrintWriter pw = new PrintWriter(System.out, true);

    point: for(int i = 0; i < 11; i++) {
      try {
        integerStack.push(i);
      } catch(StackIsFullException exc) {
        pw.println(exc);
        continue point;
      } catch(ArrayIndexOutOfBoundsException e) {
        pw.println("Stack is full");
      }
      pw.println("Element: " + i + " added");
      pw.flush();
    }

    pw.println("\nThen we will take smth\n");

    for(int i = 0; i < 11; i++) {
      int element = -1;
      try{
        element = integerStack.pop();
        pw.println("Element: " + element + " is taken");
        pw.flush();
      } catch(StackIsEmptyException exc) {
        pw.println(exc);
      }
    }
  }
}
