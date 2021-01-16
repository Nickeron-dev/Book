package generalization;

public class GenConstructor {
  private int sum;

  public <T extends Number> GenConstructor(T argument){
    sum = 0;

    for(int i = 0; i < argument.intValue(); i++) {
       sum += i;
    }
  }

  public int getSum() {
    return sum;
  }
}
