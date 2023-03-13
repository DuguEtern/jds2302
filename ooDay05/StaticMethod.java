package ooDay05;

public class StaticMethod {
    int a;
    static int b;
/*
    void show(){
        System.out.println(this.a);
        System.out.println(StaticMethod.b);
    }
    static Void test(){
        System.out.println(StaticMethod.b);
    }
    */

    void say(){
        System.out.println(a);
    }
    static int plus(int mun1,int mun2){
        int mun = mun1+mun2;
        return mun;
    }






}
