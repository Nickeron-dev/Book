package classes;

import java.util.concurrent.Exchanger;

public class ExchangerDemo {
  public static void main(String[] args) {
    Exchanger<String> exchanging = new Exchanger<String>();

    new Thread(new UseString(exchanging)).start();
    new Thread(new MakeString(exchanging)).start();
  }
}

class MakeString implements Runnable {
  Exchanger<String> ex;
  String str;

  public MakeString(Exchanger<String> c) {
    ex = c;
    str = new String();
  }

  public void run() {
    char ch = 'A';

    for (int i = 0; i < 3; i++) {
      str += ch++;

      try {
        str = ex.exchange(str);
      } catch (InterruptedException exc) {
        System.out.println(exc);
      }
    }
  }
}

class UseString implements Runnable {
  Exchanger<String> ex;
  String str;
  UseString(Exchanger<String> c) {
    ex = c;
  }

  public void run() {
    for (int i = 0; i < 3; i++) {
      try {
        str = ex.exchange(new String());
        System.out.println("Got: " + str);
      } catch (InterruptedException exc) {
        exc.printStackTrace();
      }
    }
  }
}
