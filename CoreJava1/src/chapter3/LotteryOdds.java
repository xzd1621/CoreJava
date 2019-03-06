package chapter3;

import java.util.Scanner;

public class LotteryOdds {
    public static void main(String [] args)
    {
        Scanner in =new Scanner(System.in);
        System.out.println("How many numbers do you need to draw?");
        int k=in.nextInt();

        System.out.println("What is the highest number can you draw?");
        int n=in.nextInt();

        int lottery=1;
        for(int i=1;i<=k;i++)
            lottery=lottery*(n-i+1)/i;
        System.out.println("Your odds are 1 in "+lottery+".Good luck!");
    }
}
