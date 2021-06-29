package Strings;

import java.util.Arrays;

public class CommonSubString {
    static int MAX_CHAR = 26;

    // function to return true if strings have
    // common substring and no if strings have
    // no common substring
    static boolean twoStrings(String s1, String s2)
    {
        // vector for storing character occurrences
        boolean v[]=new boolean[MAX_CHAR];
        Arrays.fill(v,false);

        // increment vector index for every
        // character of str1
        for (int i = 0; i < s1.length(); i++)
            v[s1.charAt(i) - 'a'] = true;

        // checking common substring of str2 in str1
        for (int i = 0; i < s2.length(); i++)
            if (v[s2.charAt(i) - 'a'])
                return true;

        return false;
    }

    // Driver code
    public static void main (String[] args)
    {
        String str1 = "hello";
        String str2 = "world";
        if (twoStrings(str1, str2))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}
