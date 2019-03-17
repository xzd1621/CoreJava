package chapter9;

import java.util.*;

public class TreeSetTest {
    public static void main(String[] args)
    {
        SortedSet<Item> parts=new TreeSet<>();
        parts.add(new Item("Toaster",1234));
        parts.add(new Item("Widget",4562));
        parts.add(new Item("Modem",9912));

        Item a=new Item("abc",123);
        Item b=new Item("bc",123);
        System.out.println(a.compareTo(b));

        System.out.println(parts);

        NavigableSet<Item> sortByDescription=new TreeSet<>(
                Comparator.comparing(Item::getDescription)
        );

        sortByDescription.addAll(parts);
        System.out.println(sortByDescription);

        List<String> aa = new ArrayList<String>();
        aa.add("F1");
        aa.add("F2");
        aa.add("F3");
        for (String temp : aa) {
            if ("F3".equals(temp)) {
                aa.remove(temp);
            }
        }

        for (String temp : aa){
            System.out.println(temp);
        }
    }
}
