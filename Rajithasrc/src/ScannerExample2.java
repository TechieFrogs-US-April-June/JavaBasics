import java.util.Scanner;

public class ScannerExample2 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner("Th- _i~=s`>+.hg{},j< &^%$!String?| #is@ */tested for /delimiter34235235");  
              System.out.println("Delimiter is "+sc.delimiter());//used to get the pattern of the scanner
            sc.useDelimiter(" ");  //doesnot accept *,\,(,),?,{},+
             //takes | gives output in vertical form
             //takes / givesoutput as next tokens
             //takes ` ~ ! @ # % & , <  > - = _ gives output until that symbol in one line and after that in next line
             // takes $ ^ gives output as whole string
             // takes .gives output blank
             System.out.println("To find all "+sc.findAll("3"));
           while(sc.hasNext()){  
                System.out.println(sc.next());  
           }  
            sc.close(); 
}
}
