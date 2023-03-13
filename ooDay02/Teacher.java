package ooDay02;

public class Teacher extends Person{
    double salary;
    Teacher(String name){
        this.name = name;

    }

    void teach(){
        System.out.println(name+"正在讲课...");
    }
}
