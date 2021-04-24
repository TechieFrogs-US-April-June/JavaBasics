import java.util.Scanner;

public class ScannerExample17 {
    public static void main(String[] args){
        Scanner sc= new Scanner("Skip this method program 34234234");
        sc.skip("Skip");
        System.out.println("After skip the string is  : "+sc.nextLine());//Skips first left string
        String str= "999";
        
    
                while(sc.hasNext()){
            sc.skip(str);
            System.out.println("Give the correct String to skip"+sc.next());
        }
        sc.close();

    }

    
}
