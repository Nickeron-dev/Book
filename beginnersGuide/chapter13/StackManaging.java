package generalization;

public class StackManaging<T> implements IGenStack<T> {
  // creating stack and int variable to manage which element to take
  private T[] stack;
  private int getElement, putElement;

  public StackManaging(T[] array) {
    stack = array;
    getElement = array.length-1;
    putElement = 0;
  }

  public T pop() throws StackIsEmptyException {
    if(getElement < 0) {
      throw new StackIsEmptyException();
    }

    return stack[getElement--];
  }

  public void push(T element) throws StackIsFullException{
    if(putElement == stack.length) {
      throw new StackIsFullException();
    }

    stack[putElement] = element;
    putElement++;
  }
}
