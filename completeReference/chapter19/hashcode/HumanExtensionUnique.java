package classes;

public class HumanExtensionUnique extends Human {
  public HumanExtensionUnique(int number, String name) {
    super(number, name);
  }

  @Override
  public int hashCode() {
    return number;
  }
}
