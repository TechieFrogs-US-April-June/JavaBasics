package CollectionsList;

import java.util.ArrayList;
import java.util.List;

public class ElementExistOrNotInArrayList {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        String s = "bnm";
        l.add("abc");
        l.add("def");
        l.add("mno");
        l.add("xyz");

        boolean flag = l.contains(s);
        if(flag)
        {
            System.out.println("Element exist");
        }
        else
        {
            System.out.println("Element does not exist");
        }
    }
}
