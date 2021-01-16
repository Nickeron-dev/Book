package generalization;

public class GenArraysErrors<T> {
  private T obj;
  private T[] array; // it is possible

  public GenArraysErrors(T obj, T[] nums) {
    this.obj = obj;

    //next line is impossible
//  array = new T[10]; // ERROR BECAUSE JAVA DOESN'T KNOW ACTUAL TYPE

    //this is possible
    array = nums; // possible because it knows type
  }
}
