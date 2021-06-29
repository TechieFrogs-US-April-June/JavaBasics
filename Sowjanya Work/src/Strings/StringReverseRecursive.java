package Strings;

public class StringReverseRecursive {

    public String reverse(String str) {
        if(str.isEmpty()) {
            return str;
        }
        char[] ch = str.toCharArray();
        String revStr = reverse(str.substring(1)) + ch[0];
        return revStr;
    }

    public static void main(String[] args) {
        StringReverseRecursive strRev = new StringReverseRecursive();
        String s = "String Reverse Using Recursive";

        String rev = strRev.reverse(s);

        System.out.println("Original String: "+s);
        System.out.println("Reverse String: "+rev);
    }
}
