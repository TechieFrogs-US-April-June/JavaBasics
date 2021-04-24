package practices;

import java.util.Scanner;

public class ScannerDelimiter {
    public static void main(String[] args) {
        Scanner sc = new Scanner("john,20 bob,25;hary,30 kia,35");
        sc.useDelimiter(";");
        System.out.println("The words in string are: ");

        while (sc.hasNext()){
            String str = sc.next();
            System.out.println(str);

        }
        sc.close();
    }
}
