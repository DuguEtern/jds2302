package Day07;

public class VerificationCode {
    public static void main(String[] args) {
        String code = gener(4);
        System.out.println("验证码"+code);
    }
    public static String gener(int len){
        String code ="";
        char[] chs = {'1','2','3','4','5','6','7','8','9'};
        for(int i=1;i<=len;i++){
            int index = (int)(Math.random()*chs.length);
            code += chs[index];
        }
        return code;
    }

}
