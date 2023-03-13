package Day07;

public class PrimeNumber {
    public static void main(String[] args) {
/**
 * 需求:----------常见面试题
 *   找到2到100之间的所有素数(质数)
 *   素数:除了1和它本身外，不能被其它任何自然数整数的数
 */
/*
                for(int num=2;num<=100;num++){
                    boolean flag = true; //假设是素数
                    for(int i=2;i<=num/2;i++){
                        if(num%i==0){
                            flag = false; //修改为不是素数
                            break;
                        }
                    }
                    if(flag){
                        System.out.print(num+"\t");
                    }
                }
*/

        int num = 12; //如果有能整除的，说明它不是素数
        boolean flag = true; //假设是素数
        for(int i=2;i<=num/2;i++){ //超出数据的一半，就没有意义再判断了
            if(num%i==0){
                flag = false; //修改为不是素数
                break;
            }
        }
        if(flag){
            System.out.println(num+"是素数");
        }else{
            System.out.println(num+"不是素数");
        }

            }
        }

















