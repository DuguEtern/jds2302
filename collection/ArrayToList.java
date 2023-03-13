package collection;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        String[] array = {"one","two","three","four","five"};
        System.out.println("array:"+ Arrays.toString(array));

        List<String> list = Arrays.asList(array);
        System.out.println("list:"+list);

        array[1] = "six";
        System.out.println("array:"+Arrays.toString(array));
        System.out.println("list:"+list);

        list.set(2,"seven");
        System.out.println("array:"+list);
        list.add("!!!");
    }
}
