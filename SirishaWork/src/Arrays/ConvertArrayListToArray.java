package SirishaWork.src.Arrays;

import java.util.ArrayList;
import java.util.List;

public class ConvertArrayListToArray {
    public static void main(String[] args)
    {
        List<String> al=new ArrayList<>();
        al.add("X");
        al.add("Y");
        al.add("Z");
        String[] s=al.toArray(new String[al.size()]);
        for(String temp:s)
        {
            System.out.println(temp);
        }

    }

}
