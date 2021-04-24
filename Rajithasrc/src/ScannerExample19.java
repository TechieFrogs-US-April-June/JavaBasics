import java.util.Scanner;

public class ScannerExample19 {
    

public static void main(String[] args){
    Scanner sc= new Scanner("toString method 5455 ");
    System.out.println(sc.nextLine());
    while(sc.hasNext()){
    System.out.println(" String is "+sc.toString());
    }
    sc.close();
}
}

