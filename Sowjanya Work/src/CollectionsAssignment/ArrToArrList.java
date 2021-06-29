package CollectionsAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrToArrList {
    //Converting Array to ArrayList

    public static void main(String[] args) {

        String[] st = {"A","B","C","D","E"};

        //Method 1
        List<String> l = Arrays.asList(st);
        System.out.println(l);

        //Method 2
        List<String> al = new ArrayList<>();
        for(String s : st)
        {
            al.add(s);
        }
        System.out.println(al);


    }
}
