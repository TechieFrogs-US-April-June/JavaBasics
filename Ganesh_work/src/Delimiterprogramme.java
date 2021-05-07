import java.util.Scanner;

public class DelimiterPgm {
    public static void main(String[] args) {
        //example 1
        String str="Techie#frogs#delimiter#program#java#practices";
        Scanner sc=new Scanner(str);
       sc.useDelimiter("#");
       while(sc.hasNext()) {
           System.out.println(sc.next());
       }
       sc.close();
       //example 2
        String str1=null;
        Scanner sc1=new Scanner(System.in).useDelimiter("&");
       System.out.print("Enter User Input:");
        str1=sc1.next();
        System.out.print(str1);
       sc1.close();
    }
}