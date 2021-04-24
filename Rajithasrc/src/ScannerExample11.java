import java.util.Scanner;

public class ScannerExample11 {
    public static void main(String[] args){
        Scanner sc= new Scanner("56 To check exception ");
        System.out.println("checking for integer "+sc.nextInt());//
        if(sc.hasNext()!=sc.hasNextInt()){

        System.out.println("Handling exception"+sc.ioException());
        }
        else{
        System.out.println("Exception error");
        }
        sc.close();
    }
    
}
