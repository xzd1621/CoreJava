package chapter5;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String []args)
    {
        /**
         * set ,get方法来设置和获取指定索引的值
         * add向后移动元素，以便插入
         * remove删除指定位置元素，并将后面元素向前移动
         */
        ArrayList<Employee> staff=new ArrayList<>();

        staff.add(new Employee("John",30000,1999,9,9));
        staff.add(new Employee("BOb",20000,1995,3,4));
        staff.add(new Employee("Jack",20000,1993,4,5));

        for(Employee e:staff)
            System.out.println("name: "+e.getName()
            +" salay: "+e.getSalary()+" date: "+e.getHireDay());
    }
}
