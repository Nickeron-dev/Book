package generalization;

public interface IGenStack<T> {
  public T pop() throws StackIsEmptyException;
  public void push(T element) throws StackIsFullException;
}
