package chapter6;

/**
 * 实现Comparable接口时，必须将其CompareTo方法定义为抽象方法或者实现该方法
 * 接口不是类，不能被实例化
 * 虽然不能构造接口的对象，却能声明接口的变量
 * class A extends B implements C 若B和C有相同的方法，则继承B的方法，类优先原则
 */
public class Employee implements Comparable<Employee>{
    private String name;
    private double salary;

    public Employee(String name,double salary)
    {
        this.name=name;
        this.salary=salary;
    }
    public String getName()
    {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int compareTo(Employee other)
    {
        return Double.compare(salary,other.salary);
    }

}
