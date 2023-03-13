package Day06;

//方法的演示
public class MethotDemo {//args ,一般不用就是个标准方法,方法放上面,放下面都行

    public static void main(String[] args) {
        //Object a = say();

        //System.out.println(a);
        /*
        int[] b=testarr(10,100);//这个函数,没有参数接受的话,类型要匹配
        System.out.println("数组的长度"+b.length);//模拟对返回值的后续操作
        int[] e = testarr(10,100);
        //对数组进行排序
        Arrays.sort(e);

        //模拟取出最大的值
        System.out.println("最大的值e"+e[0]);
        //遍历数组
        for (int i = 0; i < b.length; i++) {
            System.out.println("每个元素"+b[i]);
        }
         */
   /*
    }
    //

    public static Object say() {

        System.out.println("大家好,我叫");

        return null;
    }
    //无参就是定死的
    public static int[] testarr(int len,//定义数组的长度
                                int max){//定义数组的
        //首先,生成10个元素类型的数组
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*(max+1));
        }
        return arr;
     */
        // return arr[0];//因为是数组,一个元素不行//方法尽可能独立,第一个就生成数组,所以输出不要写在里面,因为会有人用他的长度,第一个元素,;每个人拿到它的用处是不一样,所以尽可能独立.就
        /*
        sayhello("zhangsan",25);
        sayhello("lisi",59);
    }
    public static void sayhello(String name,int age){
        if (age>60){
            return;
        }
       System.out.println("大家好,我叫"+name+"今年"+age+"岁了");
         */
        /*
        aMethod();
        System.out.println(444);
    }
    public static void aMethod(){
        System.out.println(111);
        bMethod();
        System.out.println(222);
    }
    public static void bMethod(){
        System.out.println(333);
    }
    */
    }
}