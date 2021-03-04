package classes;

import java.awt.*;
import java.awt.event.*;

public class ListDemo extends Frame implements ActionListener {
  List os, browser;
  String msg = "";

  public ListDemo() {
    setLayout(new FlowLayout());

    os = new List(4, true); // it will be multi-selection

    browser = new List(4); // it will be single-selection list

    os.add("Widows");
    os.add("Android");
    os.add("Solaris");
    os.add("Mac OS");

    browser.add("Opera");
    browser.add("Firefox");
    browser.add("Chrome");

    browser.select(1);
    os.select(0);

    add(os);
    add(browser);

    os.addActionListener(this);
    browser.addActionListener(this);

    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent event) {
        System.exit(0);
      }
    });
  }

  public void actionPerformed(ActionEvent event) {
    repaint();
  }

  public void paint(Graphics g) {
    int[] idx;

    msg = "Current OS: ";
    idx = os.getSelectedIndexes();
    for(int i = 0; i < idx.length; i++) {
      msg += os.getItem(idx[i]) + "  ";
    }
    g.drawString(msg, 6, 120);
    msg = "Current Browser: ";
    msg += browser.getSelectedItem();
    g.drawString(msg, 6, 140);
  }

  public static void main(String[] args) {
    ListDemo appObj = new ListDemo();

    appObj.setSize(new Dimension(300, 180));
    appObj.setTitle("ListDemo");
    appObj.setVisible(true);
  }
}
