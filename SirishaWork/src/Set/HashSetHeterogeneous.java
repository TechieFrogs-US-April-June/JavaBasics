package SirishaWork.src.Set;

import java.util.Iterator;
import java.util.Set;

public class HashSetHeterogeneous {
    public static void main(String[] args) {
        Set s = new java.util.HashSet();
        s.add(10);
        s.add(10);
        s.add(true);
        s.add("A");
        s.add(null);
        //duplicates not allowed
        //System.out.println(s);
        //using iterator
        Iterator i = s.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
