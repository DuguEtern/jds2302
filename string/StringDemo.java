package string;

public class StringDemo {
    public static void main(String[] args) {
        /*

        */
        String s1 = "123adc";
        String s2 = "123adc";
        System.out.println(s1==s2);

        String s3 = "123";
        String s4 = s3+"abc";
        System.out.println(s1==s4);

        String s = new String("Hello");
        String s5 = "hello";
        System.out.println(s==s1);
        System.out.println(s.equals(s5));
    }
}
