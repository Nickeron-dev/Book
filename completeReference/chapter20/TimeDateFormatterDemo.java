package classes;

import java.util.*;

public class TimeDateFormatterDemo {
  public static void main(String[] args) {
    Formatter form = new Formatter();
    Calendar cal = Calendar.getInstance();

    // Displaying normal 12 hour format
    form.format("%tr", cal);
    System.out.println(form);
    form.close(); // important

    // Displaying complete date and time
    Formatter formDate = new Formatter();

    formDate.format("%tc", cal);
    System.out.println(formDate);
    formDate.close();

    // Displaying only hour and minute
    Formatter formHourMin = new Formatter();

    formHourMin.format("%tl:%tM", cal, cal);
    System.out.println(formHourMin);
    formHourMin.close();

    // Displaying month by name and number
    Formatter formMonth = new Formatter();

    formMonth.format("%tB %tb %tm", cal, cal, cal);
    System.out.println(formMonth);
    formMonth.close();

    Formatter formOther = new Formatter();

    formOther.format("Copying file%nTransfer is %d%% complete", 88);
    System.out.println(formOther);
    formOther.close();
  }
}
