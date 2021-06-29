package CollectionsAssignment;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class AddElementAndIterateTreeSet {
    public static void main(String[] args) {

        Set<String> s = new TreeSet<>();
        s.add("u");
        s.add("b");
        s.add("m");
        s.add("q");
        s.add("t");

        System.out.println(s);

        Iterator<String> i = s.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

    }
}
