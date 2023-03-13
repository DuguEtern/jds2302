package ooDay02;

import org.omg.IOP.ComponentIdHelper;

public class Student extends Person{
    String className;
    String stuId;
   Student(String name,int age,String address,String className,String stuId){
        this.name = name;
        this.age = age;
        this.address = address;
        this.className = className;
        this.stuId = stuId;
    }

    void study(){
        System.out.println("正在学习...");
    }
    void sayHi(){
        System.out.println("大家好,我叫"+name+",今年"+age+"岁了");
    }
}
