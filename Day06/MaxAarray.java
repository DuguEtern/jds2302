package Day06;
import java.util.Arrays;
public class MaxAarray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.println(arr[i]);
        }
        int max = arr[0];
        for (int i = 1; i <= 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("最大值" + max);

        arr = Arrays.copyOf(arr,arr.length+1);//扩容
        arr[arr.length-1] = max;//将max赋值给arr最后一个元素
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


    }
}
