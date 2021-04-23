package practices;

import java.util.Scanner;

public class ScanDelimit {
    public static void main(String[] args) {
        //Scanner s = new Scanner("Hello java team; How are you?");
        Scanner s = new Scanner("Hello java team @ How are you?");
        s.useDelimiter(" @ ");
        //System.out.println("words in string: ");

        while(s.hasNext()){
            String st1 = s.next();
            System.out.println(st1);
        }
        s.close();

    }
}
