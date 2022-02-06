import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;

public class Calculator {
    public static int detailPcsInBox;
    public static int boxSize;
    public static int boxes;
    public static int orderQuantity;
    public static int left;
    public static String myString;
    public static String boxCounter;
    public static int currentBoxes;
    public static int finalBoxes;

    public static void calculate() throws IOException {
        detailPcsInBox = Frame.value;

        boxSize = Details.getDetailInfo()[1];
        boxes = orderQuantity / detailPcsInBox;
        left = orderQuantity % detailPcsInBox;
        finalBoxes += getBoxSize();
        boxCounter = String.format("Boxes: %d", finalBoxes);

        if (left > 0 && orderQuantity > detailPcsInBox) {

            myString = String.format("(%d x %d pcs. + 1 x %d pcs. = %d pcs.)%n", boxes, detailPcsInBox, left, orderQuantity);


        } else if (left == 0) {
            myString = String.format("(%d x %d pcs. = %d pcs.)%n", boxes, detailPcsInBox, orderQuantity);


        } else {
            myString = String.format(" (1 x %d pcs. = %d pcs.)", left, orderQuantity);


        }

        StringSelection stringSelection = new StringSelection(myString);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }

    private static int getBoxSize() {
        currentBoxes = 0;

        for (int i = 0; i < orderQuantity / detailPcsInBox; i++) {

            currentBoxes++;
        }
        if (orderQuantity % detailPcsInBox > 0 && boxSize == 1) {
            return currentBoxes + 1;

        } else if (orderQuantity % detailPcsInBox > 0 && boxSize == 2) {
            currentBoxes *= 2;
            return currentBoxes + 2;
        } else if (orderQuantity % detailPcsInBox == 0 && boxSize == 1) {

            return currentBoxes;
        } else if (orderQuantity % detailPcsInBox == 0 && boxSize == 2) {

        }
        return currentBoxes * 2;
    }


}