package Strings;

public class StringCompareToExample {
    public static void main(String[] args) {
        String str = "ABC";

        //when “ABC” is compared to “DEF”, the character at first index is compared.
        // Since they are different and ‘A’ comes before ‘D’
        // so it returns a negative integer(-3) with the difference between them,
        // hence the output is -3.
        // It compares the character values one by one in compareTo()
        System.out.println(str.compareTo("DEF"));
        System.out.println(str.compareTo("abc"));//need to check
        System.out.println(str.compareTo("AKV"));

        //here it works same as compareTo() only, but will ignore the case
        System.out.println(str.compareToIgnoreCase("abc"));
        System.out.println(str.compareToIgnoreCase("Zef"));
        System.out.println(str.compareToIgnoreCase("Agf"));
    }
}
