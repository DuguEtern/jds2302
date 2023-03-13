package evensong;

import java.io.FileNotFoundException;

public class Student {
    private int age;

    public int getAge(){
        return age;
    }

    public void setAge(int age) throws FileNotFoundException {
        if (age<0 || age>100){
            throw new FileNotFoundException();
        }
        this.age = age;
    }
}
