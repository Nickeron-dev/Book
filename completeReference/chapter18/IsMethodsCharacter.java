package classes;

import java.io.*;

public class IsMethodsCharacter {
  public static void main(String[] args) {
    PrintWriter pw = new PrintWriter(System.out, true);
    Character[] array = {'a', 'h', ' ', '5', 'J'};

    for(int i = 0; i < array.length; i++) {
      if(Character.isLetter(array[i])) pw.println(array[i] + " is a letter");
      if(Character.isUpperCase(array[i])) pw.println(array[i] + " is uppercase");
      if(Character.isLowerCase(array[i])) pw.println(array[i] + " is lowercase");
      if(Character.isWhitespace(array[i])) pw.println(array[i] + " is a white space");
      if(Character.isDigit(array[i])) pw.println(array[i] + " is digit");
    }
    Runtime r = Runtime.getRuntime(); // creating Runtime obj
    r.exit(0); // exiting from process(destroying it)
    pw.println("hello"); // it won't be printed
  }
}
