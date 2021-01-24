package classes;

public class Append {
  public static void main(String[] args) {
    String answer;
    int value = 20;
    StringBuffer sb = new StringBuffer(40); // it is length

    // appending and putting value to String answer
    answer = sb.append("value: ").append(value).append("!").toString();
    System.out.println(answer);
  }
}
