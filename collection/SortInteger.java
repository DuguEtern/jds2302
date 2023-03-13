package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SortInteger {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(rand.nextInt(100));
        }
        System.out.println("list原始数据:"+list);

        Collections.sort(list);
        System.out.println("list排序后数据:"+list);

        Collections.reverse(list);
        System.out.println("list反转后数据:"+list);
        System.out.println("第1个元素为:"+list.get(0));
    }
}




















