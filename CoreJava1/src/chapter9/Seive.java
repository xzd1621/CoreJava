package chapter9;

import java.util.BitSet;

/**
 * 筛法求素数
 */
public class Seive {
    public static void main(String[] args)
    {
        int n=2000000;
        BitSet b=new BitSet(n+1);
        int count=0;
        int i;
        for(i=2;i<=n;i++)
            b.set(i);
        i=2;
        while (i*i<=n)
        {
            if(b.get(i))
            {
                count++;
                int k=2*i;
                while (k<=n)
                {
                    b.clear(k);
                    k+=i;
                }
            }
            i++;
        }
        while (i<=n)
        {
            if(b.get(i))
                count++;
            i++;
        }
        System.out.println(count+"primes");
    }
}
