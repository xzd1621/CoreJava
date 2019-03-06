package chapter3;

import java.util.Scanner;
public class Basic {
    public static  void main(String []args)
    {
        //注意String类型判断两个字符串的值是否相等时需要用equals方法
        //而==判断两个字符串的引用是否相等，是否放置在同一个位置上
        //而在c++中，重写了==方法，使得其可以判断字符串的值是否相等
        String greet="Hello";
        String copy="Hello!";
        System.out.println(greet==copy.substring(0,5));
        System.out.println(greet.equals(copy.substring(0,5)));
        int index=greet.offsetByCodePoints(0,3);
        System.out.println(index);

        //通过StringBuilder来构建空的字符串构造器，
        // 在构建字符串时就调用toString()方法
        StringBuilder builder=new StringBuilder();
        builder.append("afsgsd");
        builder.append("rwee");
        String completedString=builder.toString();
        System.out.println(completedString);

        //输入输出
        Scanner in=new Scanner(System.in);
        System.out.println("What is your name?");
        String name=in.nextLine();
        System.out.println("How old are you?");
        int age=in.nextInt();
        System.out.println("My name is "+name+" and my age is "+age);

        //打印时间
//        System.out.printf("%tc",new Date());
    }
}
