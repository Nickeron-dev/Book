package classes;

import java.io.*;

public class UsingSubstring {
  public static void main(String[] args) {
    PrintWriter pw = new PrintWriter(System.out, true);
    String origin = "I like programming and I like playing the trumpet";
    String searchFor = "like";
    String changeFor = "love";
    String result = "";
    int searching;
    do { // for changing "like" on "love"
      pw.println(origin);
      searching = origin.indexOf(searchFor);
      if(searching != -1) {
        String step1 = origin.substring(searching + searchFor.length());
        String step2 = origin.substring(0, searching);
        result = step2 + changeFor + step1;
        origin = result;
      }
    } while(searching != -1);
    pw.println("Result:" + origin);
  }
}
