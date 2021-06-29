package CollectionsAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DriverForComparator {
    public static void main(String[] args) {

        List<EmpForComparator> lt = new ArrayList<>();
        lt.add(new EmpForComparator(6, "B"));
        lt.add(new EmpForComparator(5, "A"));
        lt.add(new EmpForComparator(7, "C"));

        System.out.println("**********Sorting data based on eno**********");
        Collections.sort(lt,new SortBasedOnEnoComparator());
        System.out.println(lt);

        System.out.println("**********Sorting data based on ename**********");
        Collections.sort(lt,new SortBaseOnEnameComparator());
        System.out.println(lt);
    }
}
