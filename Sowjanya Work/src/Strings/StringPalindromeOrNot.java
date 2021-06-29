package Strings;

public class StringPalindromeOrNot {
    public static void main(String[] args) {
        String s = new String("sowjanya");

        //convert string into char array
        char ch[] = s.toCharArray();

        String reverse = "";//reverse is temporary variable

        for(int i=ch.length-1;i>=0;i--)
        {
            reverse = reverse+ch[i];
        }

        //Comparing s and reverse variables contents with equals().
        //If both contents are same print palindrome or else print not palindrome
        if(s.equals(reverse))
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not a palindrome");
        }


    }
}
