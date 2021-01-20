package classes;

public class UsingConcatAndReplace {
  public static void main(String[] args) {
    String one = "one";
    String onetwo = one.concat("two");
    // this method appends to one string another
    System.out.println(onetwo);

    String replacing = "tattoo";
    String step1 = replacing.replace('t', 'w');
    String step2 = step1.replace('o', 'b');
    System.out.println(step2);
  }
}
