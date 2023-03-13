package collection;

import java.util.ArrayList;
import java.util.List;


public class SubListDemo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(i*10);
        }
        System.out.println("list:"+list);

        List<Integer> subList = list.subList(3,8);
        System.out.println("subList:"+subList);

        for(int i=0;i<subList.size();i++){
            subList.set(i,subList.get(i)*10);
        }
        System.out.println("subList:"+subList);

        System.out.println("list:"+list);

        list.set(3,1000);
        System.out.println("list:"+list);

        System.out.println("subList:"+subList);

        list.remove(0);
        System.out.println("list:"+list);
        System.out.println("subList:"+subList);

    }
}

















