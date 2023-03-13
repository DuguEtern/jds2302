package Day03;

public class IfDemo {
    public static void main(String[] args) {
        double price = 500.0;
        if (price>=500){
            price *= 0.8;
        }
        System.out.println("最终消费金额"+price);

        int score =100;
        if (score>=0 && score<=100){
            System.out.println("成绩合法");
        }else{
            System.out.println("成绩不合法");
        }
        System.out.println("继续执行...");
    }
}
