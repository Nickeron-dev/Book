package generalizationMain;
import java.io.*;
import generalization.*;

public class GenCircularQueueDemo {
  public static void main(String[] args) {
    PrintWriter pw = new PrintWriter(System.out, true);
    Integer[] intArray = new Integer[10];
    GenCircularQueue<Integer> integerQueue = new GenCircularQueue<Integer>(intArray); // creating queue

    for(int i = 0; i < 15; i++) {
      integerQueue.put(i); // putting an element
      pw.println("Element " + i + " was put");
      pw.flush();
      pw.println("Element " + integerQueue.getT() + " is gotten");
      pw.flush(); // emmediately take because in another loop it is not spectacular
    }   // array is staticly 10 that's why it won't catch first ones

  }
}
