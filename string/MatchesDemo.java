package string;

public class MatchesDemo {
    public static void main(String[] args) {
        String email = "dwadaw@dwa.com";
        String regex = "[a-zA-Z0-9]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
        boolean match = email.matches(regex);
        if(match){
            System.out.println("是正确的邮箱格式");
        }else {
            System.out.println("不是正确的邮箱格式");
        }
    }
}
