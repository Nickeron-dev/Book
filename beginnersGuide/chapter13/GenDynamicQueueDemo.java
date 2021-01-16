package generalizationMain;
import java.io.*;

public class GenDynamicQueueDemo {
  public static void main(String[] args) {
    PrintWriter pw = new PrintWriter(System.out, true);
    Integer[] array = new Integer[10];
    generalization.GenDynamicQueue<Integer> queue = new GenDynamicQueue<Integer>(array);

    for(int i = 0; i < 15; i++) {
      queue.put(i);
      pw.println("Element " + i + " is put");
      pw.flush();
    }

    for(int i = 0; i < 15; i++) {
      pw.println("Element " + queue.get() + " is taken");
      pw.flush();
    }
  }
}
