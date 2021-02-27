package classes;

import java.io.*;

public class ConsoleDemo {
  public static void main(String[] args) {
    String str;
    Console con;

    // if there is a console output it
    con = System.console();
    // otherwise, return
    if(con == null) return;

    // Reading and displaying a string if it exist
    str = con.readLine("Enter a string:");
    con.printf("Here is your string: %s\n", str);
  }
}
