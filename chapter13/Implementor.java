package generalization;

public class Implementor<T> implements GenInterface<T> {
  T[] object;

  public Implementor(T[] object) {
    this.object = object;
  }

  public boolean contains(T object) {
    for(T x: this.object) {
      if(x.equals(object)) {
        return true;
      }
    }
    return false;
  }
}
