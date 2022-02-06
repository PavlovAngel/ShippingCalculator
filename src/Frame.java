import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Objects;

public class Frame extends JFrame implements ActionListener {
    TextFieldPanel textFieldPanel = new TextFieldPanel();
    ComboBoxPanel comboBoxPanel = new ComboBoxPanel();
    LabelPanel labelPanel = new LabelPanel();
    Button button = new Button();
    TextAreaPanel textAreaPanel = new TextAreaPanel();
    BoxLabelPanel boxLabelPanel = new BoxLabelPanel();
    public static int quantity;
    public static int weight;
    public static int boxSize;

    Image image = Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\IdeaProjects\\com.Impuls97.Shipping\\src\\calculator.png");

    Frame() throws IOException {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setIconImage(image);
        this.add(comboBoxPanel);
        comboBoxPanel.comboBox.addActionListener(this);
        this.setLayout(null);
        this.add(button);
        button.addActionListener(this);
        this.add(textFieldPanel);
        this.add(labelPanel);
        this.add(textAreaPanel);
        this.add(boxLabelPanel);
        this.pack();
        this.setVisible(true);
        this.setResizable(false);
        this.setTitle("Calculator");
        this.setSize(420, 420);
        this.getContentPane().setBackground(new Color(212, 212, 212));
        this.setLocation(800, 100);
        this.setAlwaysOnTop(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            Calculator.orderQuantity = Integer.parseInt(textFieldPanel.textField.getText());
            try {
                Calculator.calculate();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            textAreaPanel.textArea.setText(Calculator.myString);
            textFieldPanel.textField.setText("");
            boxLabelPanel.boxLabel.setText(Calculator.boxCounter);

        }
        if (e.getSource() == comboBoxPanel.comboBox) {
            String text = Objects.requireNonNull(comboBoxPanel.comboBox.getSelectedItem()).toString();
            String[] array = Details.HashMapFromTextFile().get(text).split(", ");
            quantity = Integer.parseInt(array[0]);
            boxSize = Integer.parseInt(array[1]);
            weight = Integer.parseInt(array[2]);


        }

    }

}

