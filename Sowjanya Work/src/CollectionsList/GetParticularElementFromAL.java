package CollectionsList;

import java.util.ArrayList;
import java.util.List;

public class GetParticularElementFromAL {
    public static void main(String[] args) {

        List<String> l = new ArrayList<>();
        l.add("a");
        l.add("m");
        l.add("v");
        l.add("j");

        System.out.println(l.get(3));
    }
}
