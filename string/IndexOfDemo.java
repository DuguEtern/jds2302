package string;

public class IndexOfDemo {
    public static void main(String[] args) {
        String str = "thinking in java";
        int index = str.indexOf("in");
        System.out.println(index);
        index = str.indexOf("in",3);
        System.out.println(index);
        index = str.indexOf("abc");
        System.out.println(index);

        index = str.lastIndexOf("in");
        System.out.println(index);
    }
}
