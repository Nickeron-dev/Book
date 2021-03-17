package classes;

import java.awt.*;
import javax.swing.*;

public class JTableDemo {

  String[] colHeads = {"Name", "Extension", "ID#"};
  Object[][] data = {
                    {"Gail", "4567", "865"},
                    {"Ken", "5756", "755"},
                    {"Viviane", "8768", "345"},
                    {"Melanie", "6345", "534"},
                    {"Anne", "6553", "765"},
                    {"John", "2345", "753"},
                    {"Matt", "8763", "789"},
                    {"Claire", "4976", "865"},
                    {"Erwin", "2436", "451"},
                    {"Ellen", "9866", "745"},
                    {"Ed", "2345", "634"},
                    {"Helen", "6454", "781"},
                  };
  public JTableDemo() {
    JFrame frame = new JFrame("JTableDemo");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(260, 210);

    JTable table = new JTable(data, colHeads);

    JScrollPane scroll = new JScrollPane(table);

    frame.add(scroll);
    frame.setVisible(true);
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        new JTableDemo();
      }
    });
  }
}
