package classes;

import java.util.concurrent.*;

class MyPhaser extends Phaser {
  int numPhases;

  public MyPhaser(int parties, int phaseCount) {
    super(parties);
    numPhases = phaseCount - 1;
  }

  protected boolean onAdvance(int p, int regParties) {
    System.out.println("Phase " + p + " completed.\n");

    if (p == numPhases || regParties == 0) return true;

    return false;
  }
}

public class PhaserDemo2 {
  public static void main(String[] args) {
    MyPhaser phsr = new MyPhaser(1, 4);

    System.out.println("Starting\n");

    new Thread(new MyThreadPh(phsr, "A")).start();
    new Thread(new MyThreadPh(phsr, "B")).start();
    new Thread(new MyThreadPh(phsr, "C")).start();

    while (!phsr.isTerminated()) {
      phsr.arriveAndAwaitAdvance();
    }

    System.out.println("The Phaser is terminated");
  }
}

class MyThreadPh implements Runnable {
  Phaser phsr;
  String name;

  public MyThreadPh(Phaser phsr, String name) {
    this.phsr = phsr;
    this.name = name;
  }

  public void run() {
    while (!phsr.isTerminated()) {
      System.out.println("Thread " + name + " beginning Phase" + phsr.getPhase());

      phsr.arriveAndAwaitAdvance();

      try {
        Thread.sleep(100);
      } catch (InterruptedException exc) {
        exc.printStackTrace();
      }
    }
  }
}
