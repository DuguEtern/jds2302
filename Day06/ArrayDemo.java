package Day06;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] a ={10,20,30,40,50};
        int[] b =new int[6];
        //源数组
        //源数组的起始下标
        //目标数组
        //目标数组的起始下标
        //要复制的元素个数
        System.arraycopy(a,1,b,4,1);
        for (int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}
