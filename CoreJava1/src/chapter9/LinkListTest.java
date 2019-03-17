package chapter9;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * iterator和LsitIterator的区别
 * 1、使用范围不同，iterator可以应用于所有的集合，Set、List和Map以及这些集合的子类型。而ListIterator只能用于List及其子类型。
 *
 * 2、ListIterator有add方法，可以向List中添加对象，而Iterator不能。
 *
 * 3、ListIterator和Iterator都有hasNext()和next()方法，可以实现顺序向后遍历，但是ListIterator有hasPrevious()和previous()方法，可以实现逆向遍历，但是iterator不可以。
 *
 * 4、ListIterator可以定位当前索引的位置，nextIndex()和previousIndex()可以实现。Iterator没有此功能。
 *
 * 5、都可以实现删除操作，但是ListIterator可以实现对象的修改，set()方法可以实现。Iterator仅能遍历，不能实现修改。
 */


public class LinkListTest {
    public static void main(String[] args)
    {
        List<String> a=new LinkedList<>();
        a.add("Amy");
        a.add("Cral");
        a.add("Erica");

        List<String> b=new LinkedList<>();
        b.add("Bob");
        b.add("Doug");
        b.add("Frances");
        b.add("Gloria");

        ListIterator<String> aIter=a.listIterator();
        Iterator<String> bIter=b.iterator();

        while (bIter.hasNext())
        {
            if(aIter.hasNext())aIter.next();
            aIter.add(bIter.next());
        }
        System.out.println(a);

        bIter=b.iterator();
        while (bIter.hasNext())
        {
            bIter.next();
            if(bIter.hasNext())
            {
                bIter.next();
                bIter.remove();
            }
        }
        System.out.println(b);

        a.removeAll(b);
        System.out.println(a);
    }
}
