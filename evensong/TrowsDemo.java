package evensong;

import java.io.FileNotFoundException;

public class TrowsDemo extends Student{
    public static void main(String[] args) throws FileNotFoundException {
        Student zs = new Student();
        try {
            zs.setAge(1000);
        }catch (IllegalAccessError e){
            e.printStackTrace();
        }
        System.out.println("此人年龄为"+zs.getAge()+"岁");
    }
}
