package classes;

import java.awt.*;
import java.awt.event.*;

public class ButtonDemo extends Frame implements ActionListener {
  String msg = "";
  Button yes, no, maybe;

  public ButtonDemo() {
    setLayout(new FlowLayout());

    yes = new Button("Yes");
    no = new Button("No");
    maybe = new Button("Undecided");

    add(yes);
    add(no);
    add(maybe);

    yes.addActionListener(this);
    no.addActionListener(this);
    maybe.addActionListener(this);

    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent we) {
        System.exit(0);
      }
    });
  }

  public void actionPerformed(ActionEvent event) {
    String str = event.getActionCommand();
    if (str.equals("Yes")) {
      msg = "You pressed Yes.";
    }
    else if (str.equals("No")) {
      msg = "You pressed No.";
    }
    else {
      msg = "You pressed Undecided.";
    }

    repaint();
  }

  public void paint(Graphics g) {
    g.drawString(msg, 20, 100);
  }

  public static void main(String[] args) {
    ButtonDemo appObj = new ButtonDemo();

    appObj.setSize(new Dimension(250, 150));
    appObj.setTitle("ButtonDemo");
    appObj.setVisible(true);
  }
}
