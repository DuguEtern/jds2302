package ooDay05;

public class EnumDemo {
    public static void main(String[] args) {
        Season[] season = Season.values();
        for(int i=0;i<season.length;i++){

            System.out.println(season[i].getSeasonName());
            System.out.println(season[i].getSeasonDesc());
        }
    }
}
