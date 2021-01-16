package generalization;

public class QueueIsFullException extends Exception{
  private int size;

  public QueueIsFullException(int s) {
    size = s;
  }

  public String toString() {
    return "End of queue reached: " + size;
  }
}
