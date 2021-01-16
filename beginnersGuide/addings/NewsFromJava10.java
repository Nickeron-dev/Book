package classes;

import java.util.Arrays;
import java.io.*;

public class NewsFromJava10 {
  public static void main(String[] args) {
    var counter = 10; // this is local variable
    int var = 1; // still possible
    var k = -var; // it makes k equal -var(int 10)
    var pw = new PrintWriter(System.out, true);
//it is possible to type var as a type of variable(just not to write it two times)
    // java recognises the type of variable by default
    pw.println("var counter = " + counter +
              "\nint var = " + var + "\nvar k = " + k);
    var array = new int[10];
//  var[] array = new int[10]; impossible because of [] near var
//  var array[] = new int[10]; still impossible because of [] near array
    for(int i = 0; i < array.length; i++) {
      array[i] += i;
    }
    var outputArray = Arrays.toString(array);
    pw.println(outputArray);
  }
}
