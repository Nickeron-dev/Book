package classes;

import java.awt.*;
import java.awt.event.*;

public class TextAreaDemo extends Frame {
  public TextAreaDemo() {
    setLayout(new FlowLayout());

    String val = "asoifjoasdifjdisojfoidsajfsdiaofjoifjofjdisajfosdjfoij\n" +
                 "siajfoiasjfsdaiofjlosdailjfilsjdifjsdaifjsdaifsdajifsdj\n" +
                 "asfijasdoifjoijoijfoisdjfoijiofjasdfiojsdafoidjfjsdoifjds\n" +
                 "aisfjasdifjoisdafjsdafiosdjfjoiadsjfiojoifjewjaifjeio\n" +
                 "ijfsaodifjasoidfjsoadifjsadiofoadisjfosdiajofjisdjfjsdiaf\n" +
                 "iofjasiofjoaisdjfoiasdjfoaisdjfoasdijfisdaofjasdofjisdjj\n" +
                 "afoijasofijwaeiorjwaiofjfidcjvioxjziofjwafoijwqoifjaosijd\n" +
                 "aisdfjasdoifjsd.";
    TextArea text = new TextArea(val, 5, 30);
    add(text);

    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent we) {
        System.exit(0);
      }
    });
  }

  public static void main(String[] args) {
    TextAreaDemo appObj = new TextAreaDemo();

    appObj.setSize(new Dimension(300, 220));
    appObj.setTitle("TextAreaDemo");
    appObj.setVisible(true);
  }
}
