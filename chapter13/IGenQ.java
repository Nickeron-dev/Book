package generalization;

public interface IGenQ<T> {
  // put element in queue
  public void put(T obj) throws QueueIsFullException;
  // get element from queue
  public T geT() throws QueueIsEmptyException;
}
