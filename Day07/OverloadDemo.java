package Day07;

public class OverloadDemo {
    public static void main(String[] args) {
        show();
        show("zhangsan");
        show(34);
        show("zhangsan",42);
        show(84,"zhangsan");
    }
    public static void show(){

    }
    public static void show(String name){

    }
    public static void show(int age){

    }
    public static void show(String mame,int age){

    }
    public static void show(int age,String name){

    }
}
