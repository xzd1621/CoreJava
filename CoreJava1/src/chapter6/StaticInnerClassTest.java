package chapter6;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class StaticInnerClassTest {
    public static void main(String[] args)
    {
        double[] d=new double[20];
        for(int i=0;i<d.length;i++)
            d[i]=Math.random()*100;
        ArrayAlg.Pair pair=ArrayAlg.minmax(d);
        System.out.println("min: "+pair.getFirst());
        System.out.println("max: "+pair.getSecond());
    }
}

class ArrayAlg
{
    public static class Pair
    {
        private double first;
        private double second;

        public double getFirst() {
            return first;
        }

        public double getSecond() {
            return second;
        }
        public Pair(double f,double s)
        {
            first=f;
            second=s;
        }
    }

    public static Pair minmax(double[] array)
    {
        double MIN=Double.POSITIVE_INFINITY;
        double MAX=Double.NEGATIVE_INFINITY;
        for(double v:array)
        {
            if(v<MIN)
                MIN=v;
            if(v>MAX)
                MAX=v;
        }
        return new Pair(MIN,MAX);
    }
}
