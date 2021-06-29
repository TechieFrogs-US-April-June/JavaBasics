package CollectionsAssignment;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AddElementAndIterateHashSet {
    public static void main(String[] args) {

        Set<String> s = new HashSet<>();
        s.add("g");
        s.add("a");
        s.add("m");
        s.add("w");

        System.out.println(s);
        Iterator<String> i = s.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
