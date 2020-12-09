package generalization;

public class BasicType<T> {
  private T obj;

  public BasicType(T obj) {
    this.obj = obj;
  }

  public T get() {
    return obj;
  }
}
