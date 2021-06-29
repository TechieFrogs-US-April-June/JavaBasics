package CollectionsAssignment;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IterateHashSet {
    public static void main(String[] args) {

        Set<String> s = new HashSet<>();
        s.add("a");
        s.add("b");
        s.add("c");
        s.add("d");
        System.out.println(s);

        Iterator<String> i = s.iterator();

        while (i.hasNext())
        {
            System.out.println(i.next());
        }

    }
}
