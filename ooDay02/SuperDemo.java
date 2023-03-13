package ooDay02;

public class SuperDemo {
    public static void main(String[] args) {
        Boo o = new Boo();
    }
}

class Coo{
    Coo(int a){
    }
}
class Doo extends Coo{
    Doo(){
        super(5);
    }
}
class Aoo{
    Aoo(){
        System.out.println("超类构造方法");
    }
}
class Boo extends Aoo{
    Boo(){
        super();
        System.out.println("派生类构造方法");
    }
}