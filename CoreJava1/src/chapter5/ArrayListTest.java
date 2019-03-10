package chapter5;

import java.util.ArrayList;

public class ArrayListTest {

    /**
     * Object ... values相当于Object []values
     * @param values 需要进行比较的数组
     * @return 返回最大值
     */
    public static double Max(double ... values)
    {
        double largest=Double.NEGATIVE_INFINITY;
        for(double v:values)
            if(v>largest)
                largest=v;
        return largest;
    }
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

        System.out.println(ArrayListTest.Max(3.14,23.4,5.6,1.2));
    }
}
