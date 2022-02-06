import javax.swing.*;
import java.awt.*;

public class LabelPanel extends JPanel {
    Label label = new Label();

    LabelPanel() {
        this.setBounds(-60, 5, 300, 35);
        this.setBackground(new Color(212, 212, 212));
        this.add(label);
    }
}