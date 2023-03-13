package Day05;
import java.rmi.MarshalException;
import java.util.Scanner;
public class Addition {
    public static void main(String[] args) {
        Scanner score = new Scanner(System.in);
        for (int i=1;i<=10;i++){
            int a =(int)(Math.random()*100);
            int b =(int)(Math.random()*100);
            int resulf = a+b;
            System.out.println("("+i+")"+a+("+")+b+("=?"));
            System.out.println("算吧");
            int answer = score.nextInt();
            if (answer==resulf){
                System.out.println("答对了");

            }
        }

        System.out.println("总分为"+score);
    }
}
