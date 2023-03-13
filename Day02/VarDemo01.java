package Day02;

public class VarDemo01 {
    public static void main(String[] args) {
        /*
        int a;      //声明变量a
        int b,c,d;  //同时声明多个变量b,c,d
        int e = 250;//声明变量e并为其赋值250
        int f;      //声明变量f
        f = 250;    //为变量f赋值250
        int g = f+10;//声明变量g等于变量f加10
        System.out.println(g);//输出变量g为260
        int a;//变量无法重名
        //System.out.println(a);编译错误,未变量无法编译
        int i = 50;//先声明在变量
        System.out.println(i);
        int a1_$;
        int %^=*;//语法错误无法为其声明并赋值
        */
        /*
        int a =45;
        int b =5;
        System.out.println(a/b);
        System.out.println(b/a);
        int c = 2147483647;
        int d = c+1;
        System.out.println(d);
        */
        /*
        long c = 5000000000000000000l*2*10;
        System.out.println(c);
        long d = 5000000000000000000l*3*50;
        System.out.println(d);
        long a = 5000000000000000000l;
        long b = 5000000000000000000l;
        System.out.println(a+b);//-8446744073709551616
        */
        /*
        double a = 3.1415926;
        double b = 3.1415975;
        double c = a/b;
        System.out.println(c);//0.9999984402839638
    `   */
        /*
        boolean a = true;
        boolean b = false;
        */
        /*
        char c1 = 451;
        char c2 = 95;
        char c3 = 52;
        char c4 = 426;
        char c5 = 7854;
        System.out.println(c1);//!
        System.out.println(c2);//_
        System.out.println(c3);//4
        System.out.println(c4);//ƪ
        System.out.println(c5);//Ắ
        */
        /*
        int a = 5;
        long b = 5;//自动转换类型
        int c =(int)b;//强制转换类型
        long d = 5;//自动转换类型
        double e = 5;//强制转换类型
        long f = 1000000000000000000l;
        int g = (int)f;
        System.out.println(g);//强转有可能发生溢出
        double h = 25.84200;
        int i = (int)h;
        System.out.println(i);//25,强转有可能丢失精度
        */
        /*
        byte b1 = 5;
        byte b2 = 5;
        byte b3 = (byte) (b1+b2);
        System.out.println(2+2);//4
        System.out.println(2+'2');//52,2的码是50
        System.out.println('2'+'2');//100,'2'的码50,加上'2'的码
        */
    }
}
