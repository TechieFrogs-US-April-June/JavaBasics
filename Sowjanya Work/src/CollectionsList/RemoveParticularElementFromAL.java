package CollectionsList;

import java.util.ArrayList;
import java.util.List;

public class RemoveParticularElementFromAL {
    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(5);
        l.add(8);
        l.add(9);
        l.add(4);

        l.remove(2);
        System.out.println(l);

    }
}
