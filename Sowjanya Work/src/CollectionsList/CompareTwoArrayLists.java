package CollectionsList;

import java.util.ArrayList;
import java.util.List;

public class CompareTwoArrayLists {
    public static void main(String[] args) {

        List<String> l1 = new ArrayList<>();
        l1.add("g");
        l1.add("c");
        l1.add("r");

        List<String> l2 = new ArrayList<>();
        l2.add("g");
        l2.add("c");
        l2.add("r");
        l2.add("v");

        boolean flag = l1.equals(l2);
        if(flag)
        {
            System.out.println("Two array lists are equal");
        }
        else
        {
            System.out.println("Two array lists are not equal");
        }

    }
}
