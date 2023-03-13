package Day04;
import java.util.Scanner;
public class CommandBaySwinch {
    public static void main(String[] args) {

        Scanner scab = new Scanner(System.in);
        System.out.println("请输入功能:1.存款 2.取款 3.转帐 4.退出");
        int comand = scab.nextByte();

        switch (comand){
            case 1:
                System.out.println("存款业务...");
                break;
            case 2:
                System.out.println("取款业务...");
                break;
            case 3:
                System.out.println("转帐业务...");
                break;
            case 4:
                System.out.println("退出成功");
                break;
            default:
                System.out.println("输入错误");
        }
/*
        int count=0;
        while (count <3){
            System.out.println(1);
            count++;
        }

        int mun = 1;
        while (mun<10){
            System.out.println(mun+"*9="+mun*9);
            mun++;
        }

        int con = 0;
        while (con<5){
            System.out.println("执行结束");
            con++;
        }

        Scanner scan = new Scanner(System.in);
        int mux = 250;
        System.out.println("猜吧");
        int guess = scan.nextInt();
        while (guess!=mux){
            if (guess>mux){
                System.out.println("猜大了");
            }else {
                System.out.println("猜小了");
            }
            System.out.println("猜吧");
            guess = scan.nextByte();
        }
        System.out.println("猜对了");
*/


    }
}
//while 输出5次
//true 继续输出
//true 继续输出
//true 继续输出
//true 继续输出
//true 继续输出
//fales 结束输出
