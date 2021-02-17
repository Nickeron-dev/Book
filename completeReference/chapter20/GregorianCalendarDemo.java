package classes;

import java.util.*;

public class GregorianCalendarDemo {
  public static void main(String[] args) {
    String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug",
                      "Sep", "Oct", "Nov", "Dec"};
    int year;

    GregorianCalendar gcalendar = new GregorianCalendar();

    System.out.println("Date: ");
    System.out.println(gcalendar.get(Calendar.DATE) + " " + gcalendar.get(Calendar.MONTH) +
                       " " + gcalendar.get(Calendar.YEAR));
    System.out.println(year = gcalendar.get(Calendar.YEAR));

    System.out.println("Time: ");
    System.out.println(gcalendar.get(Calendar.HOUR) + " " +
                        gcalendar.get(Calendar.MINUTE) + " " +
                        gcalendar.get(Calendar.SECOND));
    // printed date and time

    if(gcalendar.isLeapYear(year)) {
      System.out.println("The current year is leap");
    } else {
      System.out.println("The current year is not leap");
    }

  }
}
