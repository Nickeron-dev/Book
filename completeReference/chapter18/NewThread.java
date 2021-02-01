package classes;

public class NewThread extends Thread {
  boolean suspendFlag;

  public NewThread(String name, ThreadGroup obj) {
    super(obj, name);
    System.out.println("New thread: " + this);
    suspendFlag = false;
  }

  public void run() {
    try {
      for(int i = 0; i < 5; i++) {
        System.out.println(getName() + ": " + i);
        Thread.sleep(1000);
        synchronized(this) {
          while(suspendFlag) {
            wait();
          }
        }
      }
    } catch(Exception exc) {
      System.out.println("Exception in: " + getName());
    }
    System.out.println("Exiting from: " + getName());
  }

  synchronized void suspendIt() {
    suspendFlag = true; // in order to wait
  }

  synchronized void resumeProcess() {
    suspendFlag = false; // to make check variable false(in order to continue)
    notify(); // to stop wait()
  }
}
