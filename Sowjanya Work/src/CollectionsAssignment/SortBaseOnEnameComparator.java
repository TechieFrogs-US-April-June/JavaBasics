package CollectionsAssignment;

import java.util.Comparator;

public class SortBaseOnEnameComparator implements Comparator<EmpForComparator> {

    @Override
    public int compare(EmpForComparator e1, EmpForComparator e2) {
        return e1.getEname().compareTo(e2.getEname());
    }
}
