package CollectionsList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListToArray {

    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("A");
        l.add("B");
        l.add("C");
        l.add("D");

        System.out.println("ArrayList elements: " +l);
        Object[] obj = l.toArray();

        System.out.println("Array elements: ");
        for(Object o : obj)
        {
            System.out.println(o);

        }
    }
}
