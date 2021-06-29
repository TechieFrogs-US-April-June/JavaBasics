import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setUserDefinedPgm {
    public static void main(String[] args) {
        Set s=new HashSet();
        s.add(new Emp(10,"Java"));
        s.add(new Emp(20,"Techie"));
        s.add(new Emp(30,"Techie"));
        s.add(new Emp(10,"Java"));//duplicate user Defined Emp Object
        Iterator iterator = s.iterator();
        while(iterator.hasNext()){
            Emp e= (Emp) iterator.next();
            System.out.println(e.getEno()+"-"+e.getEname());
        }
    }
}
