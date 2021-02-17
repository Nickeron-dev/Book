package classes;

import java.util.Calendar;

public class CalendarDemo {
  public static void main(String[] args) {
    String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug",
                      "Sep", "Oct", "Nov", "Dec"};

    Calendar calend = Calendar.getInstance(); // getting time

    System.out.println("Date: " + months[calend.get(Calendar.MONTH)]);
    System.out.println(" "  + calend.get(Calendar.DATE) + " " +
                        calend.get(Calendar.YEAR));
    System.out.println("Time: " );
    System.out.println(calend.get(Calendar.HOUR) + " " + calend.get(Calendar.MINUTE) +
                      " " + calend.get(Calendar.SECOND));

    // setting time and date
    calend.set(Calendar.HOUR, 10);
    calend.set(Calendar.MINUTE, 29);
    calend.set(Calendar.SECOND, 43);
    System.out.println("New time");
    System.out.println(calend.get(Calendar.HOUR) + " " + calend.get(Calendar.MINUTE) +
                      " " + calend.get(Calendar.SECOND));
  }
}
