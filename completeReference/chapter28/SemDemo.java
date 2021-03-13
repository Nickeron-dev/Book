package classes;

import java.util.concurrent.*;

public class SemDemo {
  public static void main(String[] args) throws InterruptedException {
    Semaphore sem = new Semaphore(1);

    new Thread(new IncThread(sem, "A")).start();
    Thread.sleep(100);
    new Thread(new DecThread(sem, "B")).start();

  }
}

class Resource {
  static int count = 0;
}

class IncThread implements Runnable {
  String name;
  Semaphore sem;

  public IncThread(Semaphore sem, String name) {
    this.sem = sem;
    this.name = name;
  }

  public void run() {
    System.out.println("Starting " + name);

    try {
      System.out.println(name + " is waiting for a permit.");
      sem.acquire();
      System.out.println(name + " gets a permit.");

      for (int i = 0; i < 5; i++) {
        Resource.count++;
        System.out.println(name + ": " + Resource.count);

        // allowing a context switch -- if possible
        Thread.sleep(10);
      }
    } catch (InterruptedException exc) {
      System.out.println(exc);
    }

    System.out.println(name + " releases the permit");
    sem.release(); // giving a permission to another thread
  }
}

class DecThread implements Runnable {
  String name;
  Semaphore sem;

  public DecThread(Semaphore sem, String name) {
    this.name = name;
    this.sem = sem;
  }

  public void run() {
    System.out.println("Starting " + name);

    try {
      System.out.println(name + " is waiting for a permit.");
      sem.acquire();
      System.out.println(name + " gets a permit");

      for (int i = 0; i < 5; i++) {
        Resource.count--;
        System.out.println(name + ": " + Resource.count);

        Thread.sleep(10);
      }
    } catch (InterruptedException exc) {
      System.out.println(exc);
    }

    System.out.println(name + " releases a permit.");
    sem.release();
  }
}
