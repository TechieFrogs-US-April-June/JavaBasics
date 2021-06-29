package CollectionsAssignment;

import java.util.ArrayList;
import java.util.List;

public class ArrListToArr {
    //Converting ArrayList to Array

    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("A");
        l.add("B");
        l.add("C");
        l.add("D");

        System.out.println("ArrayList elements: " +l);

        Object[] o = l.toArray();
        System.out.println("Array elements: ");
        for(Object s : o)
        {
            System.out.println(s);

        }

    }
}
