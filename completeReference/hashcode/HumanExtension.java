package classes;

public class HumanExtension extends Human {
  public HumanExtension(int number, String name) {
    super(number, name);
  }

  @Override
  public int hashCode() {
    return 1123;
  }
}
