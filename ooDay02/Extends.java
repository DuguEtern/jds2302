package ooDay02;

public class Extends {
    public static void main(String[] args) {
        Student zs = new Student("张三",25,"廊坊","jsd2302","001");
        zs.name = "张三";
        zs.age = 25;
        zs.address = "廊坊";
        zs.className = "jsd2302";
        zs.stuId = "001";
        zs.eat();
        zs.sleep();
        zs.sayHi();
        zs.study();
    }
}
