package ooDay03;

public class AnimalTest {
    public static void main(String[] args) {
        {
            Dog dog = new Dog("小狗",2,"黑色");
            System.out.println(dog.age);
            Dog[] dogs = new Dog[3];
            dogs[0] = new Dog("小白",1,"白色");
            dogs[1] = new Dog("小黑",2,"黑色");
            dogs[2] = new Dog("小灰",3,"灰色");
            for (int i = 0; i < dogs.length; i++) {
                System.out.println(dogs[i].name);
                dogs[i].swim();
            }
            Chick[] chicks = new Chick[2];
            chicks[0] = new Chick("小鸡1",1,"灰色");
            chicks[1] = new Chick("小鸡2",2,"白色");
            for (int i = 0; i < chicks.length; i++) {
                System.out.println(chicks[i].name);
                chicks[i].eat();
                chicks[i].drink();
                chicks[i].layEggs();
            }
            Fish[] fish = new Fish[2];
            fish[0] = new Fish("金鱼1",1,"黄色");
            fish[1] = new Fish("金鱼2",2,"黑色");
            for (int i = 0; i < fish.length; i++) {
                System.out.println(fish[i].name);
                fish[i].eat();
                fish[i].swim();
            }

        }
    }
}
