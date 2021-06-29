package SirishaWork.src.Set;

import java.util.HashSet;
import java.util.Iterator;

public class AddElementOnHashSetUsingIterator {
    public static void main(String args[]) {
        // Creating HashSet and adding elements
        HashSet<String> setVal = new HashSet<String>(); //Declaring a HashSet
        setVal.add("Welcome");
        setVal.add("To");
        setVal.add("QATechHub");

        Iterator<String> i = setVal.iterator();   //Iterating the whole HashSet
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

}
