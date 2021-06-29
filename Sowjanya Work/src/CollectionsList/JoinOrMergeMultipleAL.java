package CollectionsList;

import java.util.ArrayList;
import java.util.List;

public class JoinOrMergeMultipleAL {
    public static void main(String[] args) {

        List<String> l1 = new ArrayList<>();
        l1.add("b");
        l1.add("z");
        l1.add("g");

        List<String> l2 = new ArrayList<>();
        l2.add("d");
        l2.add("h");
        l2.add("n");

        l1.addAll(l2);
        System.out.println(l1);
    }
}
