package classes;
import java.io.*;

/**
  This class demonstrate how to use documentaries
  @author Nickeron-dev
  @version 1.0
*/

public class UsingDocs {
  /**
    This method gives us a square of number
    which we put
    @param num this is our variable
    @return square of num
  */
  public double square(double num) {
    return Math.pow(num, 2);
  }

  /**
    This method creates from InputStreamReader BufferedReader
    and reads number
    @return double value which got from input
    @exception IOException because of input and output errors
    @see IOException
  */
  public double reader() throws IOException{
      InputStreamReader streamReader = new InputStreamReader(System.in);
      BufferedReader buffReader = new BufferedReader(streamReader);
      String reading;

      reading = buffReader.readLine();
      return (new Double(reading)).doubleValue();
  }

  /**
    This method launches my previous ones
    @exception IOException because of using InputStreamReader and BufferedReader
  */
  public static void main(String[] args) throws IOException {
    PrintWriter pw = new PrintWriter(System.out, true);
    UsingDocs obj = new UsingDocs();
    double var;

    pw.println("Getting square of variable");
    var = obj.reader();
    var = obj.square(var);
    pw.println("The square of var is: " + var);
  }
}
