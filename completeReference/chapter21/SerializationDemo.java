package classes;

import java.io.*;

public class SerializationDemo {
  public static void main(String[] args) {
    try (ObjectOutputStream objOutput =
        new ObjectOutputStream(new FileOutputStream("serial"))) {
      MyClass obj1 = new MyClass("Hello", -7, 2.7e10);
      System.out.println("object1: " + obj1);

      objOutput.writeObject(obj1);
    } catch(IOException exc) {
      System.out.println("Exception during serialization" + exc);
    }

    // deserialization

    try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("serial"))) {
      MyClass obj2 = (MyClass) input.readObject();
      System.out.println("obj2: " + obj2);
    } catch(Exception exc) {
      System.out.println("Error while deserialization: " + exc);
    }

  }
}
