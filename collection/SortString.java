package collection;

import java.util.*;

public class SortString {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("王克晶");
        list.add("传奇sfjlkasdjslaf");
        list.add("国斌老师");
        System.out.println("list原始数据:"+list);
        Collections.sort(list, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });

        Collections.sort(list,(o1,o2)->o1.length()-o2.length());

        System.out.println("list排序后数据:"+list);
    }
}















