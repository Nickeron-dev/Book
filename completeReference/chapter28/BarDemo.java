package classes;

import java.util.concurrent.*;

public class BarDemo {
  public static void main(String[] args) {
    CyclicBarrier cb = new CyclicBarrier(3, new BarAction());

    System.out.println("Starting");

    new Thread(new MyThread(cb, "A")).start();
    new Thread(new MyThread(cb, "B")).start();
    new Thread(new MyThread(cb, "C")).start();
    new Thread(new MyThread(cb, "X")).start();
    new Thread(new MyThread(cb, "Y")).start();
    new Thread(new MyThread(cb, "Z")).start();

  }
}

class MyThread implements Runnable {
  CyclicBarrier cbar;
  String name;

  public MyThread(CyclicBarrier cbar, String name) {
    this.cbar = cbar;
    this.name = name;
  }

  public void run() {
    System.out.println(name);

    try {
      cbar.await();
    } catch (BrokenBarrierException exc) {
      System.out.println(exc);
    } catch (InterruptedException exc) {
      System.out.println(exc);
    }
  }
}

class BarAction implements Runnable {
  public void run() {
    System.out.println("Barrier Reached!");
  }
}
