package classes;

import java.util.concurrent.*;

public class SimpExec {
  public static void main(String[] args) {
    CountDownLatch cdl = new CountDownLatch(5);
    CountDownLatch cdl2 = new CountDownLatch(5);
    CountDownLatch cdl3 = new CountDownLatch(5);
    CountDownLatch cdl4 = new CountDownLatch(5);
    ExecutorService es = Executors.newFixedThreadPool(2);

    System.out.println("Starting");

    es.execute(new MyExecutor(cdl, "A"));
    es.execute(new MyExecutor(cdl2, "B"));
    es.execute(new MyExecutor(cdl3, "C"));
    es.execute(new MyExecutor(cdl4, "D"));

    try {
      cdl.await();
      cdl2.await();
      cdl3.await();
      cdl4.await();
    } catch (InterruptedException exc) {
      System.out.println(exc);
    }

    es.shutdown();
    System.out.println("Done");
  }
}

class MyExecutor implements Runnable {
  String name;
  CountDownLatch latch;

  public MyExecutor(CountDownLatch latch, String name) {
    this.name = name;
    this.latch = latch;
  }

  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println(name + ": " + i);
      latch.countDown();
    }
  }
}
