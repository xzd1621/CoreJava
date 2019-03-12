package chapter6;

import java.util.Arrays;

public class EmployeeSortTest {
    public static void main(String []args)
    {
        Employee[] stuff=new Employee[3];
        stuff[0]=new Employee("jack",10000);
        stuff[1]=new Employee("Bob",20000);
        stuff[2]=new Employee("Mary",9999);

        Arrays.sort(stuff);

        for (Employee e:stuff
             ) {
            System.out.println("name: "+e.getName()+" salary: "+e.getSalary());
        }
    }
}
