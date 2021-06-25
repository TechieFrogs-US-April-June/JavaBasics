package SirishaWork.src.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class AddElementOnTreeSetUsingIterator {
    public static void main(String args[]) {
        // Creating TreeSet and adding elements
        TreeSet<String> setVal = new TreeSet<String>(); // Declaring a TreeSet
        setVal.add("Welcome");
        setVal.add("To");
        setVal.add("QATechHub");

        Iterator<String> i = setVal.iterator(); // Iterating the whole HashSet
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
