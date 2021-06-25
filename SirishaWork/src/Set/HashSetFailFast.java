package SirishaWork.src.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetFailFast {
    public static void main(String[] args)
    {
        Set<String> s=new HashSet<String>();
        s.add("B");
        s.add("C");
        s.add("A");
        Iterator<String> i = s.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
            s.add("F");
        }

    }
}
