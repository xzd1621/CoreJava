package chapter4;


class Employer
{
    private String name;
    private double salary;

    public Employer(String n,double s)
    {
        name=n;
        salary=s;
    }
    public String getName()
    {
        return name;
    }
    public double getSalary()
    {
        return salary;
    }
    public void raiseSalary(double byPercent)
    {
        salary+=salary*byPercent/100.0;
    }
}

public class ParamTest {
    public static void main(String []args)
    {
        //方法不能修改基本数据类型的参数
        double percent=10;
        System.out.println("Before tripleValue percent="+percent);
        tripleValue(percent);
        System.out.println("After tripValue percent= "+percent);

        //方法可以改变对象参数的状态
        Employer e=new Employer("Bob",10000);
        System.out.println("Before tripSalary salary= "+e.getSalary());
        tripleSalary(e);
        System.out.println("After tripSalary salary= "+e.getSalary());

        //方法不能让对象参数引用新的对象
        Employer a=new Employer("Jack",20000);
        Employer b=new Employer("Mary",30000);
        System.out.println("Before swap a="+a.getName());
        System.out.println("Before swap b="+b.getName());
        swap(a,b);
        System.out.println("After swap a="+a.getName());
        System.out.println("After swap b="+b.getName());

    }
    public static void tripleValue(double x)
    {
        x=3*x;
        System.out.println("End of the method: x= "+x);
    }
    public static void tripleSalary(Employer e)
    {
        e.raiseSalary(5);
        System.out.println("End of the method: salary= "+e.getSalary());
    }
    public static void swap(Employer a,Employer b)
    {
        Employer temp=a;
        a=b;
        b=temp;
        System.out.println("End of the method a= "+a.getName());
        System.out.println("End of the method b= "+b.getName());
    }
}
