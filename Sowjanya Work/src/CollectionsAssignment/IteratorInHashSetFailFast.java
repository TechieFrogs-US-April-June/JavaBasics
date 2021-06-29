package CollectionsAssignment;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class IteratorInHashSetFailFast {
    public static void main(String[] args) {

        //Iterator in HashSet is Fail-Fast
        /*Set<String> s = new HashSet<>();
        s.add("g");
        s.add("a");
        s.add("q");

        System.out.println(s);
        Iterator<String> i = s.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
            s.add("v"); //can't add it throws ConcurrentModificationException
        }
        */

        // Use CopyOnWriteArraySet for converting fail-fast iterator of HashSet into fail-safe
        Set<String> s1 = new CopyOnWriteArraySet<>();
        s1.add("g");
        s1.add("a");
        s1.add("q");

        System.out.println(s1);
        Iterator<String> i1 = s1.iterator();
        while (i1.hasNext())
        {
            System.out.println(i1.next());
            s1.add("j");
        }

    }
}
