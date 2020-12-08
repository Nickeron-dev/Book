package generalization;

public class GenDynamicQueue<T> implements IGenQ<T> {
  private T[] queue;
  private int putloc, getloc;

  public GenDynamicQueue(T[] array) {
    queue = array;
    putloc = getloc = 0;
  }

  public void put(T obj) {
    if(putloc == queue.length) {
      T[] newQueue = new T[queue.length+1];  // generic array creation error
      for(int i = 0; i < queue.length; i++) { 
        newQueue[i] = queue[i];
      }
      queue = newQueue;
    }

    queue[putloc] = obj;
    putloc++;
  }

  public T getT() throws QueueIsEmptyException{
    if(getloc == putloc) {
      throw new QueueIsEmptyException();
    }

    return queue[getloc++];
  }
}
