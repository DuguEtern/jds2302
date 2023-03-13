package string;

public class SubstringDemo {
    public static void main(String[] args) {
        String str = "www.baidu," +
                ".com.cn";
        int start = str.indexOf(".")+1;
        int end = str.indexOf(".",start);
        String name = str.substring(start,end);
        System.out.println(name);


    }
}
