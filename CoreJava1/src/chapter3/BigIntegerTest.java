package chapter3;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerTest {
    public static void main(String [] args)
    {
        Scanner in =new Scanner(System.in);
        System.out.println("How many numbers do you need to draw?");
        int k=in.nextInt();

        System.out.println("What is the highest number can you draw?");
        int n=in.nextInt();

        //大整数类不能直接使用+-*/来运算
        //必须使用它内置的方法
        BigInteger lottery=BigInteger.valueOf(1);
        for(int i=1;i<=k;i++)
            lottery=lottery.multiply(BigInteger.valueOf(n-i+1))
            .divide(BigInteger.valueOf(i));
        System.out.println("Your odds are 1 in "+lottery+".Good luck!");
    }
}
