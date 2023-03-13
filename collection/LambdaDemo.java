package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        Collections.sort(list, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });

        Collections.sort(list, (String o1, String o2) -> {
                return o1.length()-o2.length();
        });

        Collections.sort(list, (o1, o2) -> {
            return o1.length()-o2.length();
        });

        Collections.sort(list, (o1, o2) -> o1.length()-o2.length());
    }
}



















