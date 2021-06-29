package CollectionsAssignment;

import java.util.ArrayList;
import java.util.List;

public class DriverComparable {
    public static void main(String[] args) {

        List<EmpComparable> l = new ArrayList<>();

        //Comparing with eno
        /*l.add(new EmpComparable(5,"f"));
        l.add(new EmpComparable(2,"b"));
        l.add((new EmpComparable(9,"h")));
        l.add(new EmpComparable(1,"s"));
        System.out.println(l);
        Collections.sort(l);
        System.out.println(l);*/


        //Comparing with ename
        EmpComparable e1 = new EmpComparable(8,"b");
        EmpComparable e2 = new EmpComparable(2,"k");

        System.out.println(e2.compareTo(e1));

    }
}
