package chapter6;

import java.util.Date;
import java.util.GregorianCalendar;

public class CloneEmployee implements Cloneable {
    private String name;
    private double salary;
    private Date hireDay;

    public CloneEmployee(String name,double salary)
    {
        this.name=name;
        this.salary=salary;
        hireDay=new Date();
    }

    public void setHireDay(int year,int month,int day) {
        Date newHireDay=new GregorianCalendar(year,month,day).getTime();
        hireDay.setTime(newHireDay.getTime());
    }

    public void raiseSalary(double percent)
    {
        salary=salary*(1+percent/100);
    }

    /**
     * 深拷贝：对象在拷贝时，其引用的子对象也需要拷贝
     * 浅拷贝：单纯地拷贝对象，可能其子对象引用同一个对象
     * @return 返回科隆后的对象
     * @throws CloneNotSupportedException
     */
    public CloneEmployee clone() throws CloneNotSupportedException
    {
        CloneEmployee cm=(CloneEmployee) super.clone();

        cm.hireDay=(Date)hireDay.clone();
        return cm;
    }

    @Override
    public String toString() {
        return "name: "+name+" salry: "+salary+" date: "+hireDay;
    }
}
