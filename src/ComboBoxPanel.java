import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class ComboBoxPanel extends JPanel {


    ComboBox comboBox = new ComboBox();

    ComboBoxPanel() throws IOException {

        this.setBounds(0, 120, 400, 40);
        this.add(comboBox);

        this.setBackground(new Color(212, 212, 212));
    }
}