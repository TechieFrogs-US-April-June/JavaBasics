package SirishaWork.src.Strings;

public class StringReverse {

    public static void main(String[] args) {
        String s = new String("Siri");
                //convert string into character array
                char[] ch = s.toCharArray();
                String rev="";
                for(int i =ch.length-1; i>=0;i--)
                {
                    rev = rev+ch[i];
                }
        System.out.println(rev);
    }
}
