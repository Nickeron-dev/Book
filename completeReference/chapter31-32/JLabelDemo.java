package classes;

import java.awt.*;
import javax.swing.*;

public class JLabelDemo {
  public JLabelDemo() {
    JFrame frame = new JFrame("JLabelDemo");
    frame.setLayout(new FlowLayout());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(260, 210);

    ImageIcon ii = new ImageIcon("30-60-90triangle.jpg");
    JLabel label = new JLabel("Triangle", ii, JLabel.CENTER);

    frame.add(label);
    frame.setVisible(true);
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        new JLabelDemo();
      }
    });
  }
}
