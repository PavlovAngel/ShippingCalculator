import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class ComboBox extends JComboBox {

    ComboBox() {


        Map<String, String> details = Details.HashMapFromTextFile();
        for (Map.Entry<String, String> entry : details.entrySet()
        ) {
            this.addItem(entry.getKey());
        }

        this.setVisible(true);
        this.setSize(400, 200);
        this.setFont(new Font("Consolas", Font.BOLD, 16));
        this.setPrototypeDisplayValue("######################################");


    }
}