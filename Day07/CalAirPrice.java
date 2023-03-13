package Day07;

import java.util.Scanner;

public class CalAirPrice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入机票原价");
        double price = scan.nextDouble();
        System.out.println("请输入月份");
        int month = scan.nextInt();
        System.out.println("请选择舱位:1.头等舱 2.商务舱 3.经济舱");
        int type = scan.nextInt();

        double finalPrice = calAirPrice(price, month, type);
        if (month<=0){
            System.out.println("最终价格" + finalPrice);
        }

    }

    public static double calAirPrice(double price, int month, int type){
        double finalPrice = 0.0;
        if (month < 1 || month > 12) {
            System.out.println("月份输入错误");
            return -1;
        }
        if (type < 1 || type > 3) {
            System.out.println("舱位输入错误");
            return -1;
        }
        if (month >= 5 && month <= 10) {
            switch (type) {
                case 1:
                    finalPrice = price * 0.9;
                    break;
                case 2:
                    finalPrice = price * 0.85;
                case 3:
                    finalPrice = price * 0.8;
            }
        } else {
            switch (type) {
                case 1:
                    finalPrice = price * 0.7;
                    break;
                case 2:
                    finalPrice = price * 0.65;
                case 3:
                    finalPrice = price * 0.6;
            }
            return finalPrice;
        }
        return finalPrice;
    }
}