package chapter4;

import java.time.LocalDate;

class Employee
{
    private final String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String n, double s, int year,int month,int day)
    {
        name=n;
        salary=s;
        hireDay=LocalDate.of(year,month,day);
    }
    public String getName()
    {
        return name;
    }
    public double getSalary()
    {
        return salary;
    }
    public LocalDate getHireDay()
    {
        return hireDay;
    }
    public void raiseSalary(double byPercent)
    {
        salary+=salary*byPercent/100.0;
        //this将实例域与局部变量区分开来
//        this.salary=this.salary*byPercent/100.0;
    }
}
public class EmployeeTest {
    public static void main(String []args)
    {
        Employee[] staff=new Employee[3];
        staff[0]=new Employee("jack",12345.6,1998,3,12);
        staff[1]=new Employee("Bob",123678.9,1997,3,10);
        staff[2]=new Employee("Mary",19876.5,1994,5,6);

        for(Employee s:staff)
            s.raiseSalary(5);
        for (Employee s:staff)
            System.out.println("name:"+s.getName()+" salary: "+
                    s.getSalary()+" hireday: "+s.getHireDay());
    }
}
