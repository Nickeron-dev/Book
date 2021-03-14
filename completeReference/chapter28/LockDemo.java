package classes;

import java.util.concurrent.locks.*;

public class LockDemo {
  public static void main(String[] args) {
    ReentrantLock lock = new ReentrantLock();

    new Thread(new LockThread(lock, "A")).start();
    new Thread(new LockThread(lock, "B")).start();
  }
}

class Resource {
  static int count = 0;
}

class LockThread implements Runnable {
  String name;
  ReentrantLock lock;

  public LockThread(ReentrantLock lock, String name) {
    this.name = name;
    this.lock = lock;
  }

  public void run() {
    System.out.println("Thread " + name + " is starting");

    try {
      System.out.println(name + " is waiting to lock count");
      lock.lock();
      System.out.println(name + " is locking count");

      Resource.count++;
      System.out.println(name + ": " + Resource.count);

      System.out.println(name + " is sleeping");
      Thread.sleep(1000);
    } catch (InterruptedException exc) {
      exc.printStackTrace();
    } finally {
      System.out.println(name + " is unlocking count");
      lock.unlock();
    }
  }
}
