package CollectionsAssignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertFromHashsetToArraylist {

    public static void main(String[] args) {

        //creating hashset
        Set<String> s = new HashSet<>();

        //add elements to HashSet
        s.add("j");
        s.add("a");
        s.add("m");
        s.add("u");

        // Displaying HashSet elements
        System.out.println("HashSet elements: "+s);

        // Creating a List of HashSet elements
        List<String> l = new ArrayList<>(s);

        // Displaying ArrayList elements
        System.out.println("ArrayList elements: "+l);

    }
}
