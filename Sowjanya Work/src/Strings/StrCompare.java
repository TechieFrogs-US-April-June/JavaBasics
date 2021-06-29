package Strings;

public class StrCompare {
    public static void main(String[] args) {
        String s = "name";
        String st = "Same";
        String ss = "name";
        String s1 = "sowji";

        //compares first letters in two strings(checks the case) and
        // print the number that shows the difference of first letters
        System.out.println("s.compareTo(st): " +s.compareTo(st));

        System.out.println("s.compareTo(s1): " +s.compareTo(s1));

        //compares first letters in two strings(ignores the case) and
        //prints the number that shows the difference of first letters
        System.out.println("s.compareToIgnoreCase(st): " +s.compareToIgnoreCase(st));

        System.out.println("s.compareToIgnoreCase(s1): " +s.compareToIgnoreCase(s1));

        System.out.println("s.concat(s1): " +s.concat(s1));//add two strings

        System.out.println("s.intern(): " +s.intern());//prints the value of string

        System.out.println("s.length(): " +s.length());//prints the length of string

        System.out.println("s.split(s1): " +s.split(s1));

        //prints from given index to complete length of string
        System.out.println("s.substring(): " +s.substring(2));

        System.out.println("s.replace(oldChar, newChar): " +s.replace('n', 'c'));

        //checks if two strings have same values and prints true or false(here case is ignored)
        System.out.println("s.equalsIgnoreCase(s1): " +s.equalsIgnoreCase(s1));

        //checks if two strings have same values and prints true or false(here case is required)
        System.out.println(s.equals(st));

        //checks if two strings are pointing to the same memory location and prints true or false
        System.out.println(s == st);

    }

}
