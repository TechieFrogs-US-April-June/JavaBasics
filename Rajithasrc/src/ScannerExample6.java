import java.util.Locale;
import java.util.Scanner;

public class ScannerExample6 {
    public static void main(String[] args){
        Scanner sc=new Scanner("false dsfds nvldsvn 43");
        do{
            System.out.println("print :"+sc.nextBoolean());
        }while(sc.hasNextBoolean());
        System.out.println("has next value is"+sc.hasNextBoolean());

        Locale locale= Locale.ITALY;
        sc.useLocale(locale);
        System.out.println("New locale "+sc.locale());
        sc.close();

    }
    
}
