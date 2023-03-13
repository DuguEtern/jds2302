package Day07;

import java.util.Scanner;

public class Guessing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mun = (int)(Math.random()*1000+1);

        while (true){ //自造死循环
            System.out.println("猜吧");
            int guess = scan.nextInt();
            if (guess>mun){
                System.out.println("猜大了");
            }else if (guess<mun){
                System.out.println("猜小了");
            }else {
                System.out.println("恭喜你答对了");
                break; //跳出循环
            }
        }
    }
}
