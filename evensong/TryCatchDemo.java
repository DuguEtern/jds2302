package evensong;

public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了...");
        try{
        String line = null;
        System.out.println(line.length());
        String line1 = "";
        System.out.println(line1.charAt(0));
        String line2 = "abc";
        System.out.println(Integer.parseInt(line2));
        }catch (NullPointerException e){
            System.out.println("出现了空指针异常并解决了");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("。。。");
        }
        System.out.println("程序结束了...");
    }
}
