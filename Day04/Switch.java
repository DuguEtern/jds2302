package Day04;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        /*
1. CommandBySwitch命令解析程序：

   要求：接收用户输入的命令，依据命令做不同的操作

2. Guessing猜数字之while版：

   要求：随机生成一个数，由用户来猜，猜不对则反复猜，并给出大小提示，猜对的则结束，用while来实现。

3. Guessing猜数字之do...while版

   要求：随机生成一个数，由用户来猜，猜不对则反复猜，并给出大小提示，猜对的则结束，用do...while来实现。

4. for循环：输出5次"行动是成功的阶梯"、输出9的乘法表(1到9、1/3/5/7/9、9到1)
         */
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

        Scanner scar = new Scanner(System.in);
        int mun = (int)(Math.random()*1000+1);
        System.out.println("猜吧");
        int out = scar.nextInt();
        while (out!=mun){
            if(out>mun){
                System.out.println("猜大了");
            }else{
                System.out.println("猜小了");
            }
            System.out.println("猜吧");
            out = scar.nextInt();
        }
        System.out.println("猜对了");


        Scanner scan = new Scanner(System.in);
        int mux = (int)(Math.random()*1000+1);
        int oux;
        do {
            System.out.println("猜吧");
            oux = scan.nextInt();
            if(oux>mux){
                System.out.println("猜大了");
            }else if (out<mun){
                System.out.println("猜小了");
            }else{
                System.out.println("猜对了");
            }
        }while (out!=mun);

        for(int times=0;times<5;times++){
            System.out.println("行动是成功的阶梯");
        }
        System.out.println("继续执行...");

        for(int num=1;num<=9;num++){
            System.out.println(num+"*9="+num*9);
        }
        for(int num=1;num<=9;num+=2){
            System.out.println(num+"*9="+num*9);
        }
        for(int num=9;num>=1;num--){
            System.out.println(num+"*9="+num*9);
        }


    }
}
