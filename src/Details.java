import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Map;
import java.util.TreeMap;

public class Details {


    public static String name;
    public static String value;

    static final String path = "/Users/AngelPavlov/ShippingCalculator/src/Details.txt";

    static Map<String, String> HashMapFromTextFile() {
        Map<String, String> map
                = new TreeMap<>();
        BufferedReader bufferedReader = null;

        try {

            File file = new File(path);

            bufferedReader = new BufferedReader(new FileReader(file));

            String line;

            while ((line = bufferedReader.readLine()) != null) {

                String[] parts = line.split(" : ");


                name = parts[0];
                value = parts[1];

                map.put(name, value);

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {


            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (Exception ignored) {
                }

            }
        }

        return map;
    }

    public static int[] getDetailInfo() {
        String[] array = value.split(", ");
        int quantity = Integer.parseInt(array[0]);
        int box = Integer.parseInt(array[1]);
        int weight = Integer.parseInt(array[2]);
        return new int[]{quantity, box, weight};
    }
}
