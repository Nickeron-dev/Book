package classes;

import java.util.concurrent.Semaphore;

class Q {
  int n;
  static Semaphore semCon = new Semaphore(0);
  static Semaphore semProd = new Semaphore(1);

  public void get() {
    try {
      semCon.acquire();
    } catch (InterruptedException exc) {
      System.out.println("InterruptedException caught");
    }

    System.out.println("Got: " + n);
    semProd.release();
  }

  public void put(int n) {
    try {
      semProd.acquire();
    } catch (InterruptedException exc) {
      System.out.println("InterruptedException caught");
    }

    this.n = n;
    System.out.println("Put: " + n);
    semCon.release();
  }
}

class Producer implements Runnable {
  Q q;

  public Producer(Q q) {
    this.q = q;
  }

  public void run() {
    for (int i = 0; i < 20; i++) q.put(i);
  }
}

class Consumer implements Runnable {
  Q q;

  public Consumer(Q q) {
    this.q = q;
  }

  public void run() {
    for (int i = 0; i < 20; i++) q.get();
  }
}

public class ProdCon {
  public static void main(String[] args) {
    Q q = new Q();

    new Thread(new Consumer(q), "Consumer").start();
    new Thread(new Producer(q), "Producer").start();
  }
}
