package chapter6;

public class CloneTest {
    public static void main(String[] args)
    {
        try {
            CloneEmployee original=new CloneEmployee("Jack",16666);
            original.setHireDay(1999,9,9);
            CloneEmployee cloned=original.clone();
            cloned.raiseSalary(100);
            cloned.setHireDay(2000,1,1);

            System.out.println(original);
            System.out.println(cloned);


        }catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
    }
}
