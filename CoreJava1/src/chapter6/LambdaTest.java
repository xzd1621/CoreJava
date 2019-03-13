package chapter6;

import java.util.Arrays;

/**
 * lambda表达式中捕获的变量必须实际上是最终变量
 * 这个变量初始化之后就不会再为它赋新值
 */
public class LambdaTest {
    public static void main(String[] args)
    {
        String[] planets=new String[] {"Mercury","Venus",
        "Earth","Mars","Jupiter","Saturn","Uranus","Neptune"};

        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted in dictionary order ");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted in length order ");
        Arrays.sort(planets,(first,second)->first.length()-second.length());
        System.out.println(Arrays.toString(planets));

    }
}
