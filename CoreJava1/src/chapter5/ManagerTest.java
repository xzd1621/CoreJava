package chapter5;

public class ManagerTest {

    public static void main(String []args)
    {
        Manager boss=new Manager("Carl Cracker",80000,1987,12,12);
        boss.setBonus(10000);

        Employee[] employee=new Employee[3];
        //可以将子类引用赋值给超类变量
        //但超类引用赋值给子类变量时必须进行类型转换
        employee[0]=boss;

        employee[1]=new Employee("Harry",10000,1998,10,1);
        employee[2]=new Employee("Jack",11000,1999,7,8);

        for (Employee e:
             employee) {
            System.out.println("name: "+e.getName()+" salary: "+e.getSalary()
            +" birthday: "+e.getHireDay());
        }
    }
}
