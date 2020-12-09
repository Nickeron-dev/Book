package generalizationMain;
import generalization.*;

public class BasicTypeDemo {
  public static void main(String[] args) {
    BasicType<Integer> intObj = new BasicType<Integer>(12);

    BasicType<String> strObj = new BasicType<String>("Hello, World!");

    // it creates obj with basic type there is no <Double>
    BasicType doubleObj = new BasicType(new Double(3.5)); // it doesn't work because of this string
    // it doesn't provide safe

    // here (double) is necessary because doubleObj's type is unknown
  //  double value = (Double) doubleObj.get();
    //System.out.println("Value: " + value);

    // But there can be many time exceptions

    //here will be time exception
    //int i = (Integer) doubleObj.get();

    //here, too
    //strObj = doubleObj; // possible but potentially incorrect
    //String str = strObj.get();

    // Incorrect(unsafety)
    //doubleObj = intObj; // possible but potentially incorrect
    //value = (Double) doubleObj.get(); // time exception
  }
}
