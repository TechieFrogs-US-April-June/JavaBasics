package Strings;

public class Reverse {
    public static void main(String[] args) {
        String s = new String("ghdhsbsjdyhkhcskhvuskyfhjvl");
        //convert string into char array
        char[] c = s.toCharArray();
        String rev = "";
        System.out.println(c.length);
        for (int i=c.length-1;i>=0;i--)//i=27-1;26>=0|25>=0
        {
            rev = rev+c[i];//""+l

        }
        System.out.println(rev);

    }
}
