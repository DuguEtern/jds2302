package string;

public class ReplaceAllDemo {
    public static void main(String[] args) {
        String line = "abc123def456ghi78";
        line = line.replaceAll("[0-9]+","#NUMBER#");
        System.out.println(line);
    }
}
