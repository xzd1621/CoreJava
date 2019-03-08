package chapter5;

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
    }
}
