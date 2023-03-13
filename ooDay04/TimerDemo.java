package ooDay04;
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {
    public static void main(String[] args) {
           Timer timer = new Timer();
           int interval = 1000;
           timer.schedule(new TimerTask() {
               public void run() {
                    System.out.println("= =");
               }
           },1000,1000);




























           /*
            Timer timer = new Timer();
            int interval = 1;
            timer.schedule(new TimerTask() {
                public void run() {
                    System.out.println("该起床了");
                }
            },1,100);
            */

    }
}
