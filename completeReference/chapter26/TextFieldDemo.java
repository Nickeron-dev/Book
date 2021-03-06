package classes;

import java.awt.*;
import java.awt.event.*;

public class TextFieldDemo extends Frame implements ActionListener {
  TextField name, pass;

  public TextFieldDemo() {
    setLayout(new FlowLayout());

    Label nameLabel = new Label("Name: " + Label.RIGHT);
    Label passLabel = new Label("Password: " + Label.RIGHT);
    name = new TextField(12);
    pass = new TextField(8);
    pass.setEchoChar('*');

    add(nameLabel);
    add(name);
    add(passLabel);
    add(pass);

    name.addActionListener(this);
    pass.addActionListener(this);

    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent we) {
        System.exit(0);
      }
    });
  }

  public void actionPerformed(ActionEvent ae) {
    repaint();
  }

  public void paint(Graphics g) {
    g.drawString("Name: " + name.getText(), 20, 100);
    g.drawString("Selected text in name: " + name.getSelectedText(), 20, 120);
    g.drawString("Password: " + pass.getText(), 20, 140);
    //g.drawString("Selected text in Password: " + pass.getSelectedText(), 20, 160);
  }

  public static void main(String[] args) {
    TextFieldDemo appObj = new TextFieldDemo();

    appObj.setSize(new Dimension(380, 180));
    appObj.setTitle("TextFieldDemo");
    appObj.setVisible(true);
  }
}
