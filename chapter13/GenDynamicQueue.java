package generalization;

public class GenDynamicQueue<T> implements IGenQ<T> {
  private T[] queue;
  private int putloc, getloc;
  private T[] newQueue;

  public GenDynamicQueue(T[] array) {
    //Class typeOfArray
    queue = array;
    putloc = getloc = 0;
    //newQueue = array(length + 1)
  }

  public void put(T obj) {
    if(putloc == queue.length) {
      //T<?>[] newQueue = new T<?>[queue.length+1];  // generic array creation error
      //newQueue = creatingNewArray();

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

  //private Integer[] creatingNewArray(int lastLength) {
  //  Integer[] array;
  //  if(queue.getClass().getComponentType() == "Integer") {
  //    array = new Integer[queue.length+1];
//    }
    //queue.getClass().getComponentType() array = new queue.getClass().getComponentType()[queue.length+1];
  //  return array;
//  }
}
