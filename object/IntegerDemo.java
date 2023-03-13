package object;

public class IntegerDemo {
    public static void main(String[] args) {
      String s1 = "39";
      int age = Integer.parseInt(s1);
      System.out.println(age);

      String s2 = "123.456";
      double price = Double.parseDouble(s2);
      System.out.println(price);

        /*
      int max = Integer.MAX_VALUE;
      int min = Integer.MAX_VALUE;
      System.out.println("int的最大值为："+max+",最小值为："+min);

      long max1 = Long.MAX_VALUE;
      long min1 = Long.MIN_VALUE;
      System.out.println("long的最大值为："+max1+",最小值为:"+min1);
*/
        /*
        //触发了自动装箱特性，会被编译为Integer i= Integer.valueof(5);
        Integer i = 5;
        int j = i;
*/


        /*
        Integer i1 = new Integer(5);
        Integer i2 = new Integer(5);
        System.out.println(i1==i2);
        System.out.println(i1.equals(i2));

        Integer i3 = Integer.valueOf(127);
        Integer i4 = Integer.valueOf(-128);
        System.out.println(i3==i4);
        System.out.println(i3.equals(i4));

        int i = i4.intValue();
        System.out.println(i);
         */

    }
}
