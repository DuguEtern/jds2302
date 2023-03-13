package string;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SplitDemo {
    public static void main(String[] args) {
        String line = "abc123def456ghi";
        String[] data = line.split("[0-9]+");
        System.out.println(Arrays.toString(data));

        line = "123.456.78";
        data = line.split("\\.");
        System.out.println(Arrays.toString(data));

        line = ".123.456..78.784..7...6684..427.4....7.";
        data = line.split("\\.");
        System.out.println(Arrays.toString(data));
        System.out.println(data.length);
    }
}
