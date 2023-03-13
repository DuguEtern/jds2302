package ooDay03;

public class Interface {
    public static void main(String[] args) {
//        Inter5 o = new Inter5();//编译错误,
            }
            interface  Inter4{
        void show();
    }
    interface Inter5 extends Inter4{
        void test();
    }
    class Doo implements Inter5{
        public void test(){}
        public void show(){}
    }

    interface Inter{
        public abstract void show();//完整写法
        void test();//默认public abstract
         //void say(){}//编译错误,抽象方法不能有方法体
    }
}

//演示接口的实现
interface Inter1{
    void show();
    void test();
}
class Aoo implements Inter1{
    public void show(){}
    public void test(){}
}
//
interface Inter2{
    void show();
}
interface Inter3{
    void test();
}
abstract class Boo{
    abstract void say();
}
class Coo extends Boo implements Inter2,Inter3{
    public void show(){}
    public void test(){}
    void say(){}}