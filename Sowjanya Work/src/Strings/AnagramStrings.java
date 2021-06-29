package Strings;

public class AnagramStrings {
    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listes";

        StringSort ss = new StringSort();

        if (s1.length() != s2.length()) {
            System.out.println("Given Strings are not Anagrams");
        } else {
            StringSort sort = new StringSort();
            String ss1 = sort.stringSort(s1);
            String ss2 = sort.stringSort(s2);

            if (ss1.equals(ss2)) {
                System.out.println("Given Strings are Anagrams");
            } else {
                System.out.println("Given Strings are not Anagrams");
            }
        }
    }
}
