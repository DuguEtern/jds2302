package Day04;

import java.util.Scanner;

public class Guessing {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int mun = (int)(Math.random()*1000+1);
        int out;
        do {
            System.out.println("猜吧");
            out = scan.nextInt();
            if (out>mun){
                System.out.println("猜大了");
            }else if (out<mun){
                System.out.println("猜小了");
            }else{
                System.out.println("猜对了");
            }
        }while (out!=mun);
        /*
        {
            if (out<mun){
                System.out.println("猜小了");
            }else {
                System.out.println("猜大了");
            }

        }
        System.out.println("猜对了");
        */


    }
}
