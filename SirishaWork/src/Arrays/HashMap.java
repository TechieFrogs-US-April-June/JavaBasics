package SirishaWork.src.Arrays;

import java.util.Map;

public class HashMap {
    public static void main(String[] args)
    {
        Map<String,String> m=new java.util.HashMap<>();
        m.put("A","Hyd");
        m.put("C","Calcy");
        m.put("B","Bglr");
        m.put(null, null);
        m.put("F", null);
        m.put(null, null);
        System.out.println(m);
    }
}
