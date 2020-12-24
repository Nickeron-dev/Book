package swingsMain;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class ListInScrollPane implements ListSelectionListener {
  JList<String> list;
  JLabel result;
  JScrollPane forScrolling;
  String[] listOfLanguages = {"English", "German", "Russian", "Ukrainian", "French",
                              "Chinese", "Polish", "Portugeese", "International"};

  public ListInScrollPane() {
    // creating a window
    JFrame frame = new JFrame("Here is a list!");

    // setting a layout
    frame.setLayout(new FlowLayout());

    frame.setSize(200, 160); // some more comments for convinience

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    list = new JList<String>(listOfLanguages);

    list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    forScrolling = new JScrollPane(list); // put in panel a list

    forScrolling.setPreferredSize(new Dimension(120, 90));

    result = new JLabel("Nothing is chosen");

    list.addListSelectionListener(this);

    frame.add(forScrolling);
    frame.add(result);

    frame.setVisible(true);
  }

  public void valueChanged(ListSelectionEvent lse) {
    // get an index of an element which is chosen
    int getIndex = list.getSelectedIndex(); // returns -1 if nothing is chosen

    if(getIndex != -1) {
      result.setText("Language is: " + listOfLanguages[getIndex]);
    }
    else {
      result.setText("Nothing is chosen");
    }
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        new ListInScrollPane();
      }
    });
  }
}
