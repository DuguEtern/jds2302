package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("one");
        System.out.println("list:"+list);

        String e = list.get(2);
        System.out.println(e); //three
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        for(String s : list){
            System.out.println(s);
        }

        System.out.println("-----------------------------");

        String old = list.set(2,"six");
        System.out.println("list:"+list);
        System.out.println(old); //three

        String s = list.remove(2);
        System.out.println("list:"+list);
        System.out.println(s);

        list.add(3,"seven");
        System.out.println(list);

    }
}



















