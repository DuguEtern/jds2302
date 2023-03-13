package Day03;

public class IfElseDemo {
    public static void main(String[] args) {
//        double price = 600.0;
//        if (price>=500){
//           price *=0.8;
//        }else {
//           price *=0.9;
//        }
//        System.out.println(price);
        double sore = 6000.0;
        if (sore>=500){
            sore*=0.8;
        }else if (sore>=1000){
            sore=0.7;
        }else if (sore>=2000){
            sore*=0.6;
        }else{
            sore*=0.5;
        }
        System.out.println("最终价格"+sore);
    }
}
