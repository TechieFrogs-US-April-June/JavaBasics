package practices;

import java.util.Scanner;

public class ScanDelimiter {
    public static void main(String[] args) {
        Scanner s = new Scanner("hello, world \n hello world");
        //s.useDelimiter(",|\\n");
        s.useDelimiter("/n");
        while(s.hasNext()){
            System.out.println(s.next());
            //System.out.println(s.delimiter());

        }
    }
}
