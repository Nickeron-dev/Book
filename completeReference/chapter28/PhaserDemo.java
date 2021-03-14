package classes;

import java.util.concurrent.*;

public class PhaserDemo {
  public static void main(String[] args) {
    Phaser phsr = new Phaser(1);
    int curPhase;

    System.out.println("Starting");

    new Thread(new PhaserThread(phsr, "A")).start();
    new Thread(new PhaserThread(phsr, "B")).start();
    new Thread(new PhaserThread(phsr, "C")).start();

    // All thread are waiting for the first one
    curPhase = phsr.getPhase();
    phsr.arriveAndAwaitAdvance();
    System.out.println("Phase: " + curPhase + " Complete");

    // Wait for all threads to complete phase two
    curPhase = phsr.getPhase();
    phsr.arriveAndAwaitAdvance();
    System.out.println("Phase: " + curPhase + " Complete");

    curPhase = phsr.getPhase();
    phsr.arriveAndAwaitAdvance();
    System.out.println("Phase " + curPhase + " Complete");

    // Deregistering
    phsr.arriveAndDeregister();

    if (phsr.isTerminated()) {
      System.out.println("the phaser is terminated");
    }
  }
}

class PhaserThread implements Runnable {
  Phaser phsr;
  String name;

  public PhaserThread(Phaser phase, String n) {
    phsr = phase;
    name = n;
  }

  public void run() {
    System.out.println("Thread: " + name + " is beginning phase one");
    phsr.arriveAndAwaitAdvance(); // Signal arrival

    // pause to prevent issues
    try {
      Thread.sleep(5000);
    } catch (InterruptedException exc) {
      exc.printStackTrace();
    }

    System.out.println("Thread " + name + " is beginning phase two");
    phsr.arriveAndAwaitAdvance(); // Signal arrival

    try {
      Thread.sleep(5000);
    } catch (InterruptedException exc) {
      exc.printStackTrace();
    }

    System.out.println("Thread " + name + " is beginning phase three");
    phsr.arriveAndDeregister(); // Signal arrival and deregister
  }
}
