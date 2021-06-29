import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class CollectionPgm {
    public static void main(String[] args) {
       // removeDuplicates();
        // arrayToArrayList();
        // ArrayListToArray();
        iterateHashMap();

    }

    public static void removeDuplicates(){
        List<String> a1=new ArrayList<String>();
        a1.add("Java");
        a1.add("Techie");
        a1.add("Frogs");
        a1.add("Java");
        List<String> a2=new ArrayList<String>();
        for(String temp:a1){
            if(!a2.contains(temp))
            {
                a2.add(temp);
            }
        }
        System.out.println(a2);
    }
    public static void arrayToArrayList(){
        String[] s1={"J","A","V","A"};
        List<String> s2=Arrays.asList(s1);
        System.out.println(s2);
    }
    public  static void ArrayListToArray(){
        ArrayList<String> l1=new ArrayList<String>();
        l1.add("J");
        l1.add("A");
        l1.add("V");
        l1.add("A");
        String[] l2= l1.toArray((new String[l1.size()]));
        for(String temp:l2){
            System.out.println(temp);
        }

    }
    public static void iterateHashMap(){
        Map<String,String> h1=new HashMap<String,String>();
        h1.put("A","B");
        h1.put("C","D");
        h1.put("E","F");
        Iterator h2=h1.entrySet().iterator();
        while(h2.hasNext()){
            System.out.println(h2.next());
        }



    }
}
