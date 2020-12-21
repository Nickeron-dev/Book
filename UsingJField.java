package swingsMain;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class UsingJField implements ActionListener{
  public JLabel prompt, content;
  public JTextField jtf;
  public JButton button;

  public UsingJField() {
    JFrame jframe = new JFrame("Here is JTextField"); // creating a frame

    jframe.setLayout(new FlowLayout());

    jframe.setSize(250, 400);

    jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    jtf = new JTextField(10); // number 10 is amount of characters

    jtf.setActionCommand("myAction");

    button = new JButton("Pressed");

    jtf.addActionListener(this);
    button.addActionListener(this);

    prompt = new JLabel("Text is: ");
    content = new JLabel("");

    jframe.add(jtf);
    jframe.add(button);
    jframe.add(prompt);
    jframe.add(content);

    jframe.setVisible(true);
  }

  public void actionPerformed(ActionEvent ae) {
    if(ae.getActionCommand().equals("Pressed")) {
      String orgStr = jtf.getText();
      String resStr = ""; // some comments

      for(int i = 0; i < orgStr.length(); i++) {
        resStr += orgStr.charAt(i);
      }

      jtf.setText(resStr);
    } else {
      content.setText("You pressed enter. Text is: " + jtf.getText());
    }
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        new UsingJField();
      }
    });
  }
}
