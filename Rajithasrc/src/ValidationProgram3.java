import java.util.Scanner;

public class ValidationProgram3 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string for name");
        String str= sc.next();
        boolean flag = true;
      for (int i = 0; i < str.length(); i++) {
         char ch = str.charAt(i);
         if (!(ch >= 'a' && ch <= 'z'|| ch >= 'A' && ch <= 'Z')) {
            flag = false;
         }
      }
      if(flag)
         System.out.println("Given string is a proper name.");
      else
         System.out.println("Given string is a proper string is not a proper name.");

        

        sc.close();
    }
    
}
