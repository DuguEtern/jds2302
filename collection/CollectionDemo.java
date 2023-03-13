package collection;
import object.Point;

import java.util.ArrayList;
import java.util.Collection;
public class CollectionDemo {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(new Point(1, 2));
        c.add(new Point(3, 4));
        c.add(new Point(5, 6));
        c.add(new Point(7, 8));
        c.add(new Point(9, 0));
        c.add(new Point(1, 2));

        System.out.println(c);

        Point p = new Point(1, 2);
        boolean contanins = c.contains(p);
        System.out.println("是否包含:" + contanins);
        c.remove(p);
        System.out.println(c);

        Collection cc = new ArrayList();
        Point pp = new Point(1, 2);
        cc.add(pp);
        System.out.println("pp" + pp);
        System.out.println("cc" + cc);

    }
}
