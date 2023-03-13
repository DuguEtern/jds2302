package ooDay01;

public class ConsDemo {
    public static void main(String[] args) {
        Student zs = new Student();
        Student ls = new Student("李四",25);
        Student ww = new Student("王五",26,"jsd2302","003");
        zs.sayHi();
        ls.sayHi();
        ww.sayHi();
    }
}
