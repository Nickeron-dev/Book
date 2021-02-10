package classes;

import java.util.*;
import java.io.*;

public class PhoneBookDemo {
  public static void main(String[] args) throws IOException {
    Properties prop = new Properties();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    FileInputStream file = null; // to avoid problem with reading
    boolean isChanged = false;
    String name, number;

    try {
      file = new FileInputStream("phoneBook.txt");
    } catch(FileNotFoundException exc) {
      // just ignore
    }

    // if file is found we should load data from it
    try {
      if(file != null) {
        prop.load(file);
        file.close();
      }
    } catch(IOException exc) {
      System.out.println("Error in reading file");
    }

    // let user enter name and number
    do {
      System.out.println("Enter the name ('quit' to stop)");
      name = br.readLine();
      if(name.equals("quit")) continue;

      System.out.println("Enter the number");
      number = br.readLine();

      prop.setProperty(name, number);
      isChanged = true;
    } while(!name.equals("quit"));

    // saving if file is changed
    if(isChanged) {
      FileOutputStream output = new FileOutputStream("phoneBook.txt");

      prop.store(output, "Telephone Book");
      output.close();
    }

    do {
      System.out.println("Enter the name to find ('quit' to stop)");
      name = br.readLine();
      if(name.equals("quit")) continue;

      number = (String) prop.get(name);
      System.out.println(number);
    } while(!name.equals("quit"));

  }
}
