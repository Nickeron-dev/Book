package swingsMain;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class HelpApp implements ListSelectionListener {
  JLabel discription;
  JList<String> list;
  JScrollPane pane;

  String[] helpCommands = {"for", "if", "while"};

  String[] helpDiscriptions = {"<html>For is a<br>loop for any amount of repeats<br>Syntax: for(int i = 0; i < n; i++)</html>)",
  "<html>If is for doing smth in fixed conditions<br>Syntax: <br>if(arguments){<br>     actions<br>}</html",
   "<html>It is for doing smth for a period of time<br> Syntax:<br>while(arguments) {<br>   actions<br>}</html"};

  public HelpApp() {
    JFrame frame = new JFrame("Help");

    frame.setLayout(new FlowLayout());

    frame.setSize(300, 400);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    list = new JList<String>(helpCommands);

    list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    pane = new JScrollPane(list);

    pane.setPreferredSize(new Dimension(90, 50));

    discription = new JLabel("Choose the element");

    list.addListSelectionListener(this);

    frame.add(pane);
    frame.add(discription);

    frame.setVisible(true);
  }

  public void valueChanged(ListSelectionEvent lse) {
    int index = list.getSelectedIndex();

    if(index != -1) {
      discription.setText(helpDiscriptions[index]);
    } else {
      discription.setText("Choose the element");
    }
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        new HelpApp();
      }
    });
  }

}
