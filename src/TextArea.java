import javax.swing.*;
import java.awt.*;

public class TextArea extends JTextArea {
    TextArea() {
        this.setVisible(true);
        this.setPreferredSize(new Dimension(450, 70));
        this.setFont(new Font("Consolas", Font.BOLD, 16));


    }
}