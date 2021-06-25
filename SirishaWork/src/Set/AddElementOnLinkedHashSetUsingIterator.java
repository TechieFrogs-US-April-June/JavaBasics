package SirishaWork.src.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class AddElementOnLinkedHashSetUsingIterator {
    public static void main(String args[]) {
        // Creating LinkedHashSet and adding elements
        LinkedHashSet<String> setVal = new LinkedHashSet<String>(); // Declaring a LinkedHashSet
        setVal.add("Welcome");
        setVal.add("To");
        setVal.add("QATechHub");

        Iterator<String> i = setVal.iterator(); // Iterating the whole LinkedHashSet
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
