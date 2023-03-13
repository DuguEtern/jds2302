package io;

import java.util.Arrays;

public class Student {
    private String name;
    private int age;
    private String getName;
    private String[] otherInfo;

    public Student() {

    }

    public Student(String name, int age, String getName, String[] otherInfo) {
        this.name = name;
        this.age = age;
        this.getName = getName;
        this.otherInfo = otherInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGetName() {
        return getName;
    }

    public void setGetName(String getName) {
        this.getName = getName;
    }

    public String[] getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String[] otherInfo) {
        this.otherInfo = otherInfo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", getName='" + getName + '\'' +
                ", otherInfo=" + Arrays.toString(otherInfo) +
                '}';
    }
}
