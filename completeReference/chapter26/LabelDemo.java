package classes;

import java.awt.*;
import java.awt.event.*;

public class LabelDemo extends Frame {
  public LabelDemo() {
    setLayout(new FlowLayout());

    Label one = new Label("One");
    Label two = new Label("Two");
    Label three = new Label("Three");

    add(one);
    add(two);
    add(three);

    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent event) {
        System.exit(0);
      }
    });
  }

  public static void main(String[] args) {
    LabelDemo appObj = new LabelDemo();

    appObj.setSize(new Dimension(300, 100));
    appObj.setTitle("LabelDemo");
    appObj.setVisible(true);
  }
}
