package chapter3;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String []args)
    {
        int[] annoymous={17,19,23,29,31,37};
        int[]smallPrimes;
        smallPrimes=annoymous;
        int []luckyNumbers=smallPrimes;

        //将一个数组变量拷贝给另一个数组变量时，两个变量将引用同一个数组
        luckyNumbers[5]=12;
        for(int a:smallPrimes)
            System.out.println(a);

        //Arrays.copyof用来增加数组的大小，
        // 数值型多余的元素被赋值为0，bool型赋值为false
        luckyNumbers= Arrays.copyOf(luckyNumbers,2*luckyNumbers.length);


    }
}
