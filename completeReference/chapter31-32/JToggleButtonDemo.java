package classes;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JToggleButtonDemo {
  public JToggleButtonDemo() {
    JFrame frame = new JFrame("JLabelDemo");
    frame.setLayout(new FlowLayout());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(260, 210);

    JLabel label = new JLabel("Press the button");

    JToggleButton toggle = new JToggleButton("ON/OFF");
    toggle.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent event) {
        if (toggle.isSelected())
          label.setText("Button is on");
        else
          label.setText("Button is off");
      }
    });

    frame.add(toggle);
    frame.add(label);

    frame.setVisible(true);
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        new JToggleButtonDemo();
      }
    });
  }
}
