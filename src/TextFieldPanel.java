import javax.swing.*;
import java.awt.*;

public class TextFieldPanel extends JPanel {
    TextField textField = new TextField();

    TextFieldPanel() {
        this.setBounds(0, 25, 450, 70);
        this.add(textField);
        this.setBackground(new Color(212, 212, 212));
    }
}