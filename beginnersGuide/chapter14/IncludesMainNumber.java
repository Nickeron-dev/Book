package lambdaExpressions;

public class IncludesMainNumber {
  private int variable;

  public IncludesMainNumber(int variable) { this.variable = variable; }
  public int getVariable() { return variable; }

  public boolean isFactor(int divider) {
    return (variable % divider) == 0;
  }
}
