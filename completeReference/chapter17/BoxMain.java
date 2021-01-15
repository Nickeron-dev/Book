package mainClasses;

import classes.BoxToStringMethodReturnsVolume;

public class BoxMain {
  public static void main(String[] args) {
    var box = new BoxToStringMethodReturnsVolume(12.3, 10.0, 14.0);
    String stringForReturn = "Volume of the box is: " + box; // concatenate object

    System.out.println(box); // convert it to String and println
    System.out.println(stringForReturn);
  }
}
