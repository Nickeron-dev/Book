package classes;

import java.time.*;

public class DateTimeDemo {
  public static void main(String[] args) {
    LocalDate curDate = LocalDate.now();
    System.out.println(curDate);

    LocalTime curTime = LocalTime.now();
    System.out.println(curTime);
  }
}
