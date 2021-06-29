package Strings;

public class StringReverse {
    public static void main(String[] args) {

        String s = new String("Sowjanya");
        //convert string into char array
        char c[] = s.toCharArray();
        String reverse = "";

        for(int i = c.length-1;i>=0;i--)
        {
            //If string converted to char array then we can go for below to reverse a string
            reverse = reverse + c[i];

            //To reverse a given string we can go as below
            //reverse = reverse + s.charAt(i);

        }
        System.out.println(reverse);

    }
}
