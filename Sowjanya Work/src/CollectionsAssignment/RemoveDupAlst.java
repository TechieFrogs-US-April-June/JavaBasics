package CollectionsAssignment;

import java.util.ArrayList;
import java.util.List;

public class RemoveDupAlst {
    //Removing duplicates from ArrayList
    public static void main(String[] args) {
/*

        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(40);
        l.add(20);
        l.add(90);
        l.add(50);
        l.add(70);
        l.add(20);
        l.add(40);
        l.add(50);
        l.add(90);
        l.add(20);

        System.out.println(l.indexOf(70));//display that particular index value

        //display that particular index value and also if duplicates present displays the latest index value
        System.out.println(l.lastIndexOf(90));

        System.out.println("Duplicates List "+l);

        Object[] o = l.toArray();
        for (Object s : o) {
            if (l.indexOf(s) != l.lastIndexOf(s)) {
                l.remove(l.lastIndexOf(s));
            }
        }

        System.out.println("Distinct List "+l);

*/


        List<String> l = new ArrayList<>();
        List<String> uniqLst = new ArrayList<>();

        l.add("a");
        l.add("c");
        l.add("f");
        l.add("d");
        l.add("c");
        l.add("f");

        for(String temp : l)
        {
            if(!uniqLst.contains(temp))
            {
                uniqLst.add(temp);
            }
        }
        System.out.println(uniqLst);

    }
}
