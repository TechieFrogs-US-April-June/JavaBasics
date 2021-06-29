package CollectionsList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddElementsToArrList {

    public static void main(String[] args) {

        List<String> l = new ArrayList<>();
        l.add("g");
        l.add("A");
        l.add("I");
        l.add("D");
        l.add("S");

        Iterator<String> i = l.iterator();
        while(i.hasNext()) {

            System.out.println(i.next());
        }
    }
}
