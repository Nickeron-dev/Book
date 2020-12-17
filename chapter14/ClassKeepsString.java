package lambdaExpressions;

public class ClassKeepsString {
  private String mainStr;

  public ClassKeepsString(String str) {  //  constructor with argument
    this.mainStr = str;
  }

  public ClassKeepsString() { // default constructor
    mainStr = "";
  }


  public String getString() {
    return mainStr;
  }
}
