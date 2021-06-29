package CollectionsList;

import java.util.ArrayList;
import java.util.List;

public class ReplaceParticularElementFromAL {
    public static void main(String[] args) {

        List<String> l = new ArrayList<>();
        l.add("abc");
        l.add("xyz");
        l.add("ast");
        l.add("pvr");
        l.add("itc");

        l.set(2,"ipl");
        System.out.println(l);
    }
}
