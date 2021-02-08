package classes;

import java.util.*;

public class StackDemo {
  public static void showpush(Stack<Integer> st, int number) {
    st.push(number); // pushing element on the top of the stack
    System.out.println("Pushed: " + number);
    System.out.println("Now the stack is: " + st);
  }

  public static void showpop(Stack<Integer> st) {
    int element = st.pop(); // get element from the top and remove it
    System.out.println("pop -> " + element);
    System.out.println("Now the stack is: " + st);
  }

  public static void main(String[] args) {
    Stack<Integer> st = new Stack<Integer>();

    System.out.println("Stack is: " + st);
    showpush(st, 234);
    showpush(st, 534);
    showpush(st, 645);
    showpop(st);
    showpop(st);
    showpop(st);

    if(st.empty()) System.out.println("Stack is empty");

    try {
      showpop(st);
    } catch(EmptyStackException exc) {
      System.out.println("empty stack");
    }
  }
}
