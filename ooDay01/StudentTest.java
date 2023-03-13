package ooDay01;

public class StudentTest {
    public static void main(String[] args) {
        Student zs = new Student();

        zs.name = "张三";
        zs.age = 24;
        zs.className = "jsd2302";
        zs.stuId = "001";

        zs.study();
        zs.sayHi();
        zs.playWith("李四");

        Student ls = new Student();
        ls.name = "李四";
        ls.age = 25;
        ls.className = "jsd2302";
        ls.stuId = "002";
        ls.study();
        ls.sayHi();
        ls.playWith("张三");

        Student ww = new Student();
        ww.study();
        ww.sayHi();
        ww.playWith("张三");
    }
}
