package CollectionsAssignment;

import java.util.Comparator;

public class SortBasedOnEnoComparator implements Comparator<EmpForComparator> {


    @Override
    public int compare(EmpForComparator e1, EmpForComparator e2) {
        if(e1.getEno() > e2.getEno())
            return 1;
        else if(e1.getEno() < e2.getEno())
            return -1;
        else
        return 0;
    }
}
