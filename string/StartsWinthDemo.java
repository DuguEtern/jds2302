package string;

public class StartsWinthDemo {
    public static void main(String[] args) {
        String str = "thinking in java";
        boolean starts = str.startsWith("think");
        System.out.println(starts);
        boolean ends = str.endsWith(".png");
        System.out.println(ends);
    }
}
