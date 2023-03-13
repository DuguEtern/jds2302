package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortPoint {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        list.add(new Point(5,8));
        list.add(new Point(15,60));
        list.add(new Point(57,89));
        list.add(new Point(1,4));
        list.add(new Point(10,8));
        list.add(new Point(22,35));
        System.out.println("list原始数据:"+list);

        list.sort(new Comparator<Point>() {
            public int compare(Point o1, Point o2) {
                return o1.getX()-o2.getX();
            }
        });
        System.out.println("list排序后数据:"+list);

        list.sort((o1,o2)->{
            int len1 = o1.getX()*o1.getX()+o1.getY()*o1.getY();
            int len2 = o2.getX()*o2.getX()+o2.getY()*o2.getY();
            return len1-len2;
        });

        Collections.sort(list,(o1,o2)->{
            int len1 = o1.getX()*o1.getX()+o1.getY()*o1.getY();
            int len2 = o2.getX()*o2.getX()+o2.getY()*o2.getY();
            return len1-len2;
        });

        System.out.println("list排序后数据:"+list);

    }
}

















