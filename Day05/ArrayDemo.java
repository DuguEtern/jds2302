package Day05;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args){
        int[] arr = new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i] = (int)(Math.random()*100);
            System.out.println(arr[i]);
        }
        int max = arr[0];
        for(int i=1;i<=1;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("最大值为:"+max);

        int[] arr1 = new int[10];
        for(int i=0;i<arr1.length;i++){
            arr1[i] = (int)(Math.random()*100);
            System.out.println(arr1[i]);
        }
        Arrays.sort(arr1);
        System.out.println("排序后:");
        for (int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
        System.out.println("倒着输出:");
        for (int i=arr1.length-1;i>=0;i--){
            System.out.println(arr1[i]);
        }

        /*
        int[] arr = new int[3];
        System.out.println("数组的长度"+arr.length);
        System.out.println(arr[0]);//0,输出第1个元素的值
        arr[0] = 100;//给第1个元素赋值为100
        arr[1] = 200;//给第2个元素赋值为200
        arr[2] = 300;//给第3个元素赋值为300
        System.out.println(arr[arr.length-1]);//300,输出最后一个元素的值
        */
        /*
        int[] a = new int[5];
        double[] b = new double[10];
        boolean[] c = new boolean[26];

        int[] a1 = new int[5];
        double[] b1 = new double[10];
        boolean[] c1 = new boolean[26];

        int[] arr1 = new int[3];
        int[] arr2 = {2,5,8};
        int[] arr3 = new int[]{2,5,8};
        int[] arr4;
        arr4 = new int[]{2,5,8};

        int[] arr11 = new int[3];
        */
    }
}
