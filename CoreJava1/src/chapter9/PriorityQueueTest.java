package chapter9;

import java.time.LocalDate;
import java.util.PriorityQueue;

public class PriorityQueueTest<L> {
    public static void main(String[] args)
    {
        PriorityQueue<LocalDate> pq=new PriorityQueue<>();
        pq.add(LocalDate.of(1999,9,9));
        pq.add(LocalDate.of(2000,1,1));
        pq.add(LocalDate.of(1998,8,8));

        System.out.println("Iterating over elements");
        for(LocalDate date:pq)
            System.out.println(date);
        System.out.println("Remove elements");
        /**
         * Remove()方法总是删除剩余元素中优先级最小的元素
         */
        while (!pq.isEmpty())
            System.out.println(pq.remove());
    }
}
