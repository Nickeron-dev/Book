package classes;

import java.util.Date;

public class DateDemo {
  public static void main(String[] args) {
    Date currentDate = new Date(); // creating Date obj

    System.out.println(currentDate); // printing current date

    long millisAfter = currentDate.getTime();
    System.out.println("Number of milliseconds since 1.01.1970: " + millisAfter);


  }
}
