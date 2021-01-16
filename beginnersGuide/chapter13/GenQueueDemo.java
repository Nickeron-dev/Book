package generalizationMain;
import java.io.*;
public class GenQueueDemo {
  public static void main(String[] args) {
    PrintWriter pw = new PrintWriter(System.out, true);
    Integer[] array = new Integer[10];
    generalization.GenQueue<Integer> intQueue = new generalization.GenQueue<Integer>(array);

    for(int i = 0; i < 9; i++) {
      try {
        intQueue.put(i); // added
        pw.println("element: " + i + " added");
      } catch(generalization.QueueIsFullException exc) {
        pw.println(exc);
      }
    }


    try {
      for(int i = 0; i < 5; i++) {
        pw.println("Element: " + intQueue.getT() + " taken");
        pw.flush();
      }
    } catch(generalization.QueueIsEmptyException exc) {
      pw.println(exc);
    }

    pw.println("\nDouble example: " + "\n");

    Double[] arrayDouble = new Double[10];
    generalization.GenQueue<Double> doubleQueue = new generalization.GenQueue<Double>(arrayDouble);

    for(int i = 0; i < 9; i++) {
      try {
        doubleQueue.put((double)i/2); // added
        pw.println("element: " + (double)i/2 + " added");
      } catch(generalization.QueueIsFullException exc) {
        pw.println(exc);
      }
    }

    try {
      for(int i = 0; i < 5; i++) {
        pw.println("Element: " + doubleQueue.getT() + " taken");
        pw.flush();
      }
    } catch(generalization.QueueIsEmptyException exc) {
      pw.println(exc);
    }
  }
}
