package classes;

public class ThreadGroupDemo {
  public static void main(String[] args) {
    ThreadGroup first = new ThreadGroup("Group A");
    ThreadGroup second = new ThreadGroup("Group B");

    NewThread one = new NewThread("One", first);
    NewThread two = new NewThread("Two", first);
    NewThread three = new NewThread("Three", second);
    NewThread four = new NewThread("Four", second);

    one.start();
    two.start();
    three.start();
    four.start();

    System.out.println("List of all threads: ");
    first.list();
    second.list();
    System.out.println();

    System.out.println("Suspending group A");
    Thread[] arrayOfThreadsA = new Thread[first.activeCount()];
    first.enumerate(arrayOfThreadsA); // get threads in group;
    for(int i = 0; i < arrayOfThreadsA.length; i++) {
      ((NewThread)arrayOfThreadsA[i]).suspendIt();
    }

    try {
      Thread.sleep(4000);
    } catch(InterruptedException exc) {
      System.out.println("Main thread interrupted");
    }

    // Resuming Group A
    for(int i = 0; i < arrayOfThreadsA.length; i++) {
      ((NewThread)arrayOfThreadsA[i]).resumeProcess(); // resuming threads in group
    }

    try {
      System.out.println("Wait for threads to finish");
      one.join();
      two.join();
      three.join();
      four.join();
    } catch(Exception exc) {
      System.out.println("Exception in main thread");
    }

    System.out.println("Exiting from main thread");
  }
}
