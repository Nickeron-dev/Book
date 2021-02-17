package classes;

import java.util.*;

class MyTimerTask extends TimerTask { // creating my task obj
  @Override
  public void run() {
    System.out.println("Completing task..."); // just simple action
  }
}

public class MyTimer {
  public static void main(String[] args) {
    MyTimerTask task = new MyTimerTask();
    Timer timer = new Timer();

    /* sceduling(making it completing) and adding waiting
       for 300 milliseconds between 20 repeaings */

    timer.schedule(task, 10, 10);
    try {
      System.out.println("Before");
      Thread.sleep(500); // waiting after each repeating(so it will do only 1 time)
      System.out.println("After sleeping(when MyTimerTask was completed )");
    } catch(InterruptedException exc) {
      System.out.println("main thread was interrupted");
    }
    timer.cancel(); // stopping timer
  }
}
