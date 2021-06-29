package SirishaWork.src.Set;

import java.util.HashSet;
import java.util.Set;

public class ParticularElementExistOrNot {
    public static void main(String[] args)
    {
        Set<String> s=new HashSet<>();
        s.add("B");
        s.add("C");
        s.add("A");
        s.add(null);
        s.contains(s);
        System.out.println(s.size());
    }
}

