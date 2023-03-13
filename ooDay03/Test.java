package ooDay03;

public class Test {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog("小黑",2,"黑");
        dogs[1] = new Dog("小灰",1,"灰");
        dogs[2] = new Dog("小白",3,"白");
        System.out.println(dogs[0].name);
        dogs[1].age = 4;
        dogs[2].swim();
        for(int i=0;i<dogs.length;i++){
            System.out.println(dogs[i].name);
            dogs[i].eat();
        }
    }
}
