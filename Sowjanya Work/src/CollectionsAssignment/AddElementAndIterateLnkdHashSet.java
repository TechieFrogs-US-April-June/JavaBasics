package CollectionsAssignment;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class AddElementAndIterateLnkdHashSet {
    public static void main(String[] args) {

        Set<String> s = new LinkedHashSet<>();
        s.add("g");
        s.add("p");
        s.add("c");
        s.add("m");
        s.add("q");

        System.out.println(s);

        Iterator<String> i = s.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
