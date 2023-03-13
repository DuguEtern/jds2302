package ooDay01;

public class Student {
    String name;
    int age;
    String className;
    String stuId;
    Student(){
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Student(String name, int age, String chassName, String stuId) {
        this.name = name;
        this.age = age;
        this.className = chassName;
        this.stuId = stuId;
    }

    void study(){
        System.out.println(this.name+"在学习..");
    }
    void sayHi(){
        System.out.println("大家好我叫"+this.name+"今年"+this.age+"所在班级"+this.className+"学号为"+this.stuId);
    }
    void playWith(String anotherName){
        System.out.println(this.name+"正在和"+anotherName+"一起玩..");
    }
}
