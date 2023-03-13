package object;

public class ObjectDemo {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = new String("hello");

        System.out.println(s1.equals(s2));

        StringBuilder builder1 = new StringBuilder("hello");
        StringBuilder builder2 = new StringBuilder("hello");
        System.out.println(s1.equals(builder2));

        System.out.println(s1.equals(builder1));

        /*
        Point p1 = new Point(100,200);
        Point p2 = new Point(100,200);
        System.out.println(p1==p2);
        System.out.println(p1.equals(p2));

         */

        /*
        Point p = new Point(100,200);
        System.out.println(p);
        System.out.println(p.toString());
         */
    }
}
