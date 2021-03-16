package classes;

import java.util.regex.*;

public class RegularExpressionDemo {
  public static void main(String[] args) {
    Pattern myPattern = Pattern.compile("Java");
    Matcher myMatcher = myPattern.matcher("Java");
    boolean isFound = myMatcher.matches(); // checking for matches

    System.out.println("Testing Java against Java.");
    if (isFound) System.out.println("Matches");
    else System.out.println("No match");

    System.out.println();

    System.out.println("Testing Java against Java SE.");
    myMatcher = myPattern.matcher("Java SE"); // creating new Matcher

    isFound = myMatcher.matches();

    if (isFound) System.out.println("Matches");
    else System.out.println("No match");

    if (myMatcher.find()) System.out.println("subsequence is found");
    else System.out.println("No match");
  }
}
