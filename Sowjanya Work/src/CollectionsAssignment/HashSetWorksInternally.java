package CollectionsAssignment;

import java.util.HashSet;
import java.util.Set;

public class HashSetWorksInternally {
    public static void main(String[] args) {

        Set<String> s = new HashSet<>();
        s.add("h");
        s.add("m");
        s.add("z");

        //internal conversion by the JVM
       // Map<String,constant> m=new HashMap<String,constant>();
        //  m.put("h",PRESENT);
    }
}
