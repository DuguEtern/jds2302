package Day04;
import java.util.Scanner;
public class CommandBySwinch {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("请输入年龄:");
        int age = scan.nextByte();
        System.out.println("请输入商品价格:");
        double price = scan.nextDouble();
        System.out.println("年龄为:"+age+"商品价格:"+price);
    }
}
