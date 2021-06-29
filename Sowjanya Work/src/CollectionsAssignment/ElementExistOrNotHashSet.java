package CollectionsAssignment;

import java.util.HashSet;
import java.util.Set;

public class ElementExistOrNotHashSet {
    public static void main(String[] args) {

        Set<String> s = new HashSet<>();
        s.add("i");
        s.add("s");
        s.add("k");
        s.add("f");

        String name = "g";

        boolean flag = s.contains(name);
        if(flag)
        {
            System.out.println("element exist");
        }
        else
        {
            System.out.println("element does not exist");
        }
    }
}
