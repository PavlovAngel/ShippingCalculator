import javax.swing.*;

public class BoxLabelPanel extends JPanel {
    BoxLabel boxLabel = new BoxLabel();

    BoxLabelPanel() {
        this.setBounds(0, 285, 150, 30);
        this.add(boxLabel);
    }
}