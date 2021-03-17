package classes;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class JButtonDemo implements ActionListener {
  JLabel label;
  public JButtonDemo() {
    JFrame frame = new JFrame("JButtonDemo");
    frame.setLayout(new FlowLayout());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(700, 700);

    ImageIcon differentT = new ImageIcon("30-60-90triangle.jpg");
    JButton button = new JButton(differentT);
    button.setActionCommand("Different");
    button.addActionListener(this);
    frame.add(button);

    ImageIcon sameT = new ImageIcon("triangle_equilateral.gif");
    JButton button2 = new JButton(sameT);
    button2.setActionCommand("Same");
    button2.addActionListener(this);
    frame.add(button2);

    ImageIcon completelyT = new ImageIcon("differentAngles.gif");
    JButton button3 = new JButton(completelyT);
    button3.setActionCommand("Completely");
    button3.addActionListener(this);
    frame.add(button3);

    label = new JLabel("Choose a picture");
    frame.add(label);

    frame.setVisible(true);
  }

  public void actionPerformed(ActionEvent event) {
      label.setText("Your selection: " + event.getActionCommand());
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        new JButtonDemo();
      }
    });
  }
}
