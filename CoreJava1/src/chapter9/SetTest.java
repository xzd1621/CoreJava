package chapter9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SetTest {
    public static void main(String[] args)
    {
        Set<String> words=new HashSet<>();
        try(Scanner in=new Scanner(System.in))
        {
            while (in.hasNext())
            {
                if(words.size()>10)
                    break;
                words.add(in.next());
            }
        }
        Iterator<String> iter=words.iterator();
        for(int i=0;i<20&&iter.hasNext();i++)
            System.out.println(iter.next());

    }
}
