package Strings;

public class StringLowerCase {
    public static void main(String[] args) {
        String s = "SOWJANYA";
        String l = "";
        char[] ch = s.toCharArray();
        System.out.println("Original string: "+s);
        for(int i=0; i<ch.length; i++) {
            if(ch[i]>=65 && ch[i]<=90) {
                ch[i] = (char) (ch[i]+32);
            }
            l = l+ch[i];
        }
        System.out.println("lower case string: "+l);

        /*s = s.toLowerCase();
        System.out.println(s);*/
    }
}
