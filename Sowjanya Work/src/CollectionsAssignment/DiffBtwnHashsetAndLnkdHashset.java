package CollectionsAssignment;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DiffBtwnHashsetAndLnkdHashset {

    public static void main(String[] args) {
        //HashSet doesn't maintain any insertion order
        //one null is allowed,multiple null not allowed
        //doesn't accept duplicates
        Set<String> s = new HashSet<>();
        s.add("n");
        s.add("f");
        s.add("t");
        s.add(null);
        s.add("t");
        s.add(null);
        System.out.println(s);

        for(String st:s)
        {
            System.out.println(st);
        }


        //Linked hashSet maintain insertion order.
        //one null is allowed,multiple null not allowed
        //doesn't accept duplicates
        Set<String> s1 = new LinkedHashSet<>();
        s1.add("v");
        s1.add("l");
        s1.add("a");
        s1.add("e");
        s1.add("j");
        s1.add(null);
        s1.add("a");
        s1.add(null);
        System.out.println(s1);

        for(String temp:s1)
        {
            System.out.println(temp);
        }
    }
}
