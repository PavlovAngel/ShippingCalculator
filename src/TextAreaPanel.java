import javax.swing.*;
import java.awt.*;

public class TextAreaPanel extends JPanel {
    TextArea textArea = new TextArea();

    TextAreaPanel() {
        this.add(textArea);
        this.setBounds(0, 170, 450, 70);
        this.setBackground(new Color(212, 212, 212));
    }
}