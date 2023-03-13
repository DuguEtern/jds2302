package evensong;

import java.io.FileNotFoundException;

public class ThrowDemo {
    public static void main(String[] args) throws FileNotFoundException {
        Student zs = new Student();
        try {
            zs.setAge(1000);
            System.out.println("发生异常，并处理了");
        }catch (FileNotFoundException e) {
            System.out.println("此人的年龄为:" + zs.getAge() + "岁");
        }
    }
}
