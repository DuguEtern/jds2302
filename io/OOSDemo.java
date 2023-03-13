package io;

import io.Student;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class OOSDemo extends Student {
    public static void main(String[] args) throws IOException {
        String name = "张三";
        int age = 25;
        String gender = "男";
        String[] otherInfo = {"是一名学生","黑龙江佳木斯的","喜欢打篮球","不知道了"};
        Student zs = new Student(name,age,gender,otherInfo);
        System.out.println(zs);

        FileOutputStream fos = new FileOutputStream("APS.jpg");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(zs);
        System.out.println("写出完毕");
        oos.close();
    }
}
