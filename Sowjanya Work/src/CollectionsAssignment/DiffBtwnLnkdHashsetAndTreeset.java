package CollectionsAssignment;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DiffBtwnLnkdHashsetAndTreeset {
    public static void main(String[] args) {

        //Linked HashSet
        Set<String> s=new LinkedHashSet<String>();
        s.add("m");
        s.add("e");
        s.add("p");

        Iterator<String> i = s.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }


        //TreeSet
        Set st=new TreeSet();
        st.add("B");
        st.add("C");
        st.add("A");
        Iterator it = st.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

    }

}
