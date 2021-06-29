package SirishaWork.src.practice;

import java.util.Scanner;

public class Usedelimiter {
    public static void main(String[] args) {
        //Initialize Scanner Object
        Scanner sc = new Scanner("Sirisha/Learning/Java");
        // initialize string delimiter
        sc.useDelimiter("/");
        //printing the token strings
        while (sc.hasNext()) {
            System.out.println(sc.next());
        }
        sc.close();
    }
}
