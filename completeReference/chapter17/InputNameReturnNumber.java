package classes;

import java.io.*;

public class InputNameReturnNumber {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Input stop to exit");
    String input = "";
    do {
      input = br.readLine();
      input = input.trim(); // removing white spaces

      switch(input) {
        case "John":
          System.out.println("First");
          break;
        case "Maria":
          System.out.println("Second");
      }
    } while(input.compareTo("stop") != 0);
  }
}
