package swingsMain;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AppWithButton implements ActionListener {
  JLabel jlab;

  public AppWithButton() {
    JFrame jfrm = new JFrame("Using JButton");

    jfrm.setLayout(new FlowLayout());

    jfrm.setSize(150, 200);

    jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JButton button1 = new JButton("Not Pressed");
    JButton button2 = new JButton("Pressed");

    button1.addActionListener(this);
    button2.addActionListener(this);

    jfrm.add(button1);
    jfrm.add(button2);

    jlab = new JLabel("Presses the button");

    jfrm.add(jlab);

    jfrm.setVisible(true);
  }

  public void actionPerformed(ActionEvent ae){
    if(ae.getActionCommand().equals("Pressed")) {
      jlab.setText("Pressed");
    } else {
      jlab.setText("Not Pressed");
    }
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        new AppWithButton();
      }
    });
  }
}
