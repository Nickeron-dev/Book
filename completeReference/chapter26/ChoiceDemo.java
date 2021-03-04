package classes;

import java.awt.*;
import java.awt.event.*;

public class ChoiceDemo extends Frame implements ItemListener {
  Choice os, browser;
  String msg = "";

  public ChoiceDemo() {
    setLayout(new FlowLayout());

    os = new Choice();
    browser = new Choice();

    os.add("Windows");
    os.add("Android");
    os.add("Solaris");
    os.add("Mac OS");

    browser.add("Firefox");
    browser.add("Google Chrome");
    browser.add("Opera");

    add(os);
    add(browser);

    os.addItemListener(this);
    browser.addItemListener(this);

    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent event) {
        System.exit(0);
      }
    });
  }

  public void itemStateChanged(ItemEvent event) {
    repaint();
  }

  public void paint(Graphics g) {
    msg = "Current OS: ";
    msg += os.getSelectedItem();
    g.drawString(msg, 20, 120);
    msg = "Current Browser: ";
    msg += browser.getSelectedItem();
    g.drawString(msg, 20, 140);
  }

  public static void main(String[] args) {
    ChoiceDemo appObj = new ChoiceDemo();

    appObj.setSize(new Dimension(240, 180));
    appObj.setTitle("ChoiceDemo");
    appObj.setVisible(true);
  }
}
