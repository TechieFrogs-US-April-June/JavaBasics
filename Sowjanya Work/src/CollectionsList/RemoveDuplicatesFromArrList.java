package CollectionsList;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesFromArrList {

    public static void main(String[] args) {

        List<String> l = new ArrayList<>();
        List<String> uniqLst = new ArrayList<>();
        l.add("S");
        l.add("O");
        l.add("S");
        l.add("W");
        l.add("T");

        System.out.println("Duplicates List: "+l);

        for(String temp : l)
        {
            if(!uniqLst.contains(temp)) {

                uniqLst.add(temp);
            }
        }

        System.out.println("Unique List: " +uniqLst);

    }
}
