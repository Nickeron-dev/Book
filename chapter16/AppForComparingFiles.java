package swingsMain;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class AppForComparingFiles implements ActionListener{
  // creating stuff for file
  JLabel result, tipOne, tipTwo;
  JTextField fileInputOne, fileInputTwo;
  JButton button;

  public AppForComparingFiles() {
    // jframe
    JFrame frame = new JFrame("Compare");

    // set FlowLayout
    frame.setLayout(new FlowLayout());

    // set size
    frame.setSize(300, 250);

    // setting close operation
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // initializing elements
    result = new JLabel("");
    tipOne = new JLabel("Input first file's name");
    tipTwo = new JLabel("Input second file's name");
    fileInputOne = new JTextField(20);
    fileInputTwo = new JTextField(20);
    button = new JButton("Compare");

    // adding ActionListener to check out pressing
    button.addActionListener(this);

    // adding everything in correct order
    frame.add(tipOne);
    frame.add(fileInputOne);
    frame.add(tipTwo);
    frame.add(fileInputTwo);
    frame.add(button);
    frame.add(result);

    // setting visibility
    frame.setVisible(true);
  }

  public void actionPerformed(ActionEvent action) {
    int i, j;  // variables for comparing

    // checking if all files are inputted
    if(fileInputOne.getText().equals("")) {
      result.setText("Input first file");
      return;
    }
    if(fileInputTwo.getText().equals("")) {
      result.setText("Input second file");
      return;
    }

    // comparing files
    try(FileInputStream fileOne = new FileInputStream(fileInputOne.getText());
        FileInputStream fileTwo = new FileInputStream(fileInputTwo.getText())) {

      do {
        i = fileOne.read();
        j = fileTwo.read();
        if(i != j) break;
      } while(i != -1 && j != -1);


      if(i != j) {
        result.setText("Files are different");
      } else {
        result.setText("Files are same");
      }

    } catch(IOException exc) {
      result.setText("Problem with reading files");
    }
  }

  // here will be the main method to start the app
  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        new AppForComparingFiles();
      }
    });
  }
}
