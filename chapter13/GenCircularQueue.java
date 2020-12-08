package generalization;

public class GenCircularQueue<T> implements IGenQ<T> {
  private T[] queue;
  private int getloc, putloc;

  public GenCircularQueue(T[] array) {
    queue = array;
    getloc = putloc = 0;
  }

  public void put(T obj) {
    if(putloc == queue.length) {
      putloc = 0;
    }
    queue[putloc] = obj;
    putloc++;
  }

  public T getT() {
    if(getloc == queue.length) {
      getloc = 0;
    }
    return queue[getloc++];
  }
}
