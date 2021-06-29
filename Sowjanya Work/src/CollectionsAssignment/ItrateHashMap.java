package CollectionsAssignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ItrateHashMap {
    public static void main(String[] args) {

        // Creating Hash map
        Map<Integer,String> m = new HashMap<>();

        // Inserting data(Key-value pairs) in hashmap
        m.put(10,"g");
        m.put(60,"m");
        m.put(45,"r");
        m.put(25,"i");
        m.put(15,"p");
        m.put(99,"s");

        System.out.println("Map elements: " +m);

        Set<Entry<Integer, String>> st= m.entrySet();

        // Iterator
        Iterator<Entry<Integer, String>> i = st.iterator();

        // Iterating every set of entry in the HashMap
        while(i.hasNext())
        {
            System.out.println(i.next());
        }


    }
}
