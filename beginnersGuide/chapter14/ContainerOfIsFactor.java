package lambdaExpressions;

public class ContainerOfIsFactor {
  private int value;

  public ContainerOfIsFactor(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  public boolean isFactor(int divider) {
    return (value % divider) == 0;
  }
}
