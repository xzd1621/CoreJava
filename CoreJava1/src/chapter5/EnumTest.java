package chapter5;

import java.util.Scanner;

public class EnumTest {
    public static void main(String []args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Please input a Size");
        String input=in.next().toUpperCase();

        Size size=Enum.valueOf(Size.class,input);
        System.out.println("Size: "+size);
        System.out.println("abbreviation: "+size.getAbbreviation());

        if(size==Size.EXTRA_LARGE)
            System.out.println("Good Job!");

    }


}

/**
 * 比较两个枚举类型的值时不要用equals而使用==
 * 构造器在构造枚举常量时被调用
 */
enum Size
{
    SMALL("S"),MEDIUM("M"),LARGE("L"),EXTRA_LARGE("XL");
    private Size(String abbreviation)
    {
        this.abbreviation=abbreviation;
    }
    public String getAbbreviation()
    {
        return abbreviation;
    }
    private String abbreviation;
}