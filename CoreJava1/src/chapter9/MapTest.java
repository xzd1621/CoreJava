package chapter9;

import chapter6.Employee;

import java.util.*;

/**
 * HashMap和TreeMap的比较：
 * 散列映射对键进行散列，树映射对键进行排序
 * 与集合一样，散列稍快，如果不需要排序就选择散列
 * 键值唯一
 */
public class MapTest {
    public static void main(String[] args)
    {
        Map<String, Employee> staff=new HashMap<>();
        staff.put("1",new Employee("a",9999));
        staff.put("2",new Employee("b",10000));
        staff.put("3",new Employee("c",100001));
        staff.put("4",new Employee("d",10002));

        System.out.println(staff);

        staff.remove("2");
        staff.put("3",new Employee("c",200000));

        System.out.println(staff.get("3"));

        staff.forEach((k,v)->
                System.out.println("k: "+k+" v: "+v));

        /*
        不能向键值视图添加元素，可以调用迭代器的remove方法
         */
        /**
         * 获取键集合
         */
        Set<String> keys=staff.keySet();
        for (String key:keys
             ) {
            System.out.println(key);
        }

        /**
         * 同时查看键值对
         */

        for (Map.Entry<String,Employee> entry:staff.entrySet()
             ) {
            String k=entry.getKey();
            Employee v=entry.getValue();
            System.out.println("k: "+k+"v: "+v);
        }

        /**
         * linkedHashSet和LinkedHashMap用来记住插入元素项的顺序
         */

        Map<String,Employee> staffs=new LinkedHashMap<>();
        staffs.put("1",new Employee("a",12));
        staffs.put("2",new Employee("b",13));
        staffs.put("3",new Employee("c",14));
        for (String a:staffs.keySet()
             ) {
            System.out.println(a);
        }

        /**
         * asList方法返回一个包装了普通java数组的List包装器
         * 返回的不是ArrayList，而是一个视图对象
         * 只能访问，不能修改
         */
        List<String> names= Arrays.asList("Amy","Bob","Jack");

        /**
         * 可以用subList方法获取一个列表的子范围视图
         * 包括第一个索引而不包括第二个索引
         * 对于有序集和映射，可以使用排序顺序而不是元素位置建立子范围
         * 使用clear方法清除
         */

        /**
         * 可以使用List接口的sort方法并传入一个Comparator对象对列表进排序
         *
         */
        ArrayList<Employee> employees=new ArrayList<>();
        employees.add(new Employee("Jack",30000));
        employees.add(new Employee("Bob",10000));
        employees.add(new Employee("John",20000));
        employees.sort(Comparator.comparing(Employee::getSalary).reversed());
        employees.forEach(
                e->System.out.println("name: "+e.getName()+" salary: "+e.getSalary()));

    }
}
