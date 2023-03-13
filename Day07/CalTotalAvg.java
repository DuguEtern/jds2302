package Day07;

import java.util.Scanner;

public class CalTotalAvg {
    public static void main(String[] args) {
        double[] scores = enter();          //录入成绩
        double total = calTotal(scores);    //计算总分
        double avg =  calres(scores);
        System.out.println("计算平均分:"+avg);
    }
    //录入成绩
    public static double[] enter(){
        Scanner scan = new Scanner(System.in);
        double[] scores = new double[6];
        for (int i=0;i<scores.length;i++){
            System.out.println("请录入第"+(i+1)+"个评委的分数:");
            scores[i] = scan.nextDouble();
        }
        return scores;
    }
    //计算平均分
    public static double calres(double[]scores){
        double total = calTotal(scores);
        double avg = total/(scores.length-2);
        return avg;
    }
    //计算总分
    public static double calTotal(double[] scores){
        double total = 0.0;
        double max = scores[0];
        double mix = scores[0];
        for (int i=0;i<scores.length;i++){
            if (scores[i]>max){
                max=scores[i];
            }
            if (scores[i]<mix){
                mix=scores[i];
            }
            total += scores[i];
        }
        return total-max-mix;
    }
}