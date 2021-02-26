package classes;

import java.io.*;

public class DataIODemo {
  public static void main(String[] args) {
    try (DataOutputStream output =
        new DataOutputStream(new FileOutputStream("text.txt"))) {
      output.writeDouble(123.3);
      output.writeInt(4234);
      output.writeBoolean(true);
    } catch(FileNotFoundException exc) {
      System.out.println("Cannot Open Output File");
      return;
    } catch(IOException exc) {
      System.out.println("I/O Error: " + exc);
    }

    // reading data back
    try (DataInputStream input =
        new DataInputStream(new FileInputStream("text.txt"))) {
      double valueD = input.readDouble();
      int valueI = input.readInt();
      boolean valueB = input.readBoolean();
      System.out.println("Values: " + valueD + " " + valueI + " " + valueB);
    } catch (FileNotFoundException exc) {
      System.out.println("Cannot Open Input File");
      return;
    } catch (IOException exc) {
      System.out.println("I/O Error: " + exc);
    }
  }
}
