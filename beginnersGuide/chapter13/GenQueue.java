package generalization;

public class GenQueue<T> implements IGenQ<T> {
  private T[] queue; // creating an array
  private int getloc, putloc;

  public GenQueue(T[] obj) {
    queue = obj;
    getloc = putloc = 0;
  }

  public void put(T obj) throws QueueIsFullException {
    if(getloc == queue.length) {
      throw new QueueIsFullException(queue.length);
    }
    queue[putloc] = obj;
    putloc += 1;
  }

  public T getT() throws QueueIsEmptyException {
    if(getloc == putloc) {
      throw new QueueIsEmptyException();
    }

    return queue[getloc++];
  }
}
