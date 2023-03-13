package ooDay04;

public class AnimalTest{
    public static void main(String[] args) {
        /*
        Masret masret = new Masret();
        Dog dog = new Dog("小黑",2,"黑");
        Fish fish = new Fish("小金",1,"金");
        Chick chick = new Chick("小灰",3,"灰");
        */

        Animal[] animal = new Animal[5];
        animal[0] = new Dog("小黑",2,"黑");
        animal[1] = new Dog("小白",2,"白");
        animal[2] = new Fish("小花",2,"花");
        animal[3] = new Fish("小金",2,"金");
        animal[4] = new Chick("小灰",2,"灰");
        for(int i=0;i<animal.length;i++){
            System.out.println(animal[i].name);
            animal[i].eat();
            animal[i].drink();
        }
        /*if (animal[i] instanceof Dog){
            Dog dog = (Dog)animal[i];
            dog.lookHome();
            dog.swim();
        }
        if (animal[i] instanceof Chick){
            Chick chick = (Chick)animal[i];
            chick.layEggs();
        }
        if (animal[i] instanceof Fish){
            Fish fish = (Fish)animal[i];
            fish.swim();
        }*/
    }
}
