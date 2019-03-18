package chapter9;

import java.util.*;

public class ShuffleTest {
    public static void main(String[] args)
    {
        List<Integer> numbers=new ArrayList<>();
        for(int i=0;i<49;i++)
            numbers.add(i);
        /**
         * shuffle方法讲排序的打乱
         */
        Collections.shuffle(numbers);
        List<Integer> winningCombination=numbers.subList(0,6);
        winningCombination.forEach(k->System.out.println(k));
        Collections.sort(winningCombination);
        System.out.println(winningCombination);

        /**
         * binarySearch方法用于在有序数组中进行二分查找
         * 找得到返回index，找不到返回-1
         * Collections类的max，min方法返回最大最小值
         * fill方法讲所有位置设置为相同的值
         * indexof和lastindexof返回第一个和最后一个等于子列表的索引
         * frequency方法返回列表中某个对象出现的次数
         * disjoint方法判断两集合中有无共同元素，如果没有就返回true
         */
        int index=Collections.binarySearch(numbers,6);
        System.out.println(index);
        System.out.println(Collections.max(numbers));
        System.out.println(Collections.frequency(numbers,22));

        /**
         * coll1.removeAll(coll2)删除coll1中所有在coll2中出现的元素
         * coll1.retainAll(coll2)删除coll1中所有未在coll2中出现的元素，即求交集
         */
        HashSet<String> coll1=new HashSet<>();
        coll1.add("a");
        coll1.add("b");
        coll1.add("c");
        String[] strings={"b","c","d"};
        HashSet<String>coll2=new HashSet<>();
        coll2.addAll(Arrays.asList(strings));
//        coll1.removeAll(coll2);
//        System.out.println(coll1);
        coll1.retainAll(coll2);
        System.out.println(coll1);

        /**
         * 数组转换成集合可以使用Arrays.asList
         * 集合转换成数组可以使用toArray()方法，得到一个对象数组
         * 可以使用toArray的变体形式来改变它的类型
         * String[] values=staff.toArray(new String[0]);
         */

    }
}
