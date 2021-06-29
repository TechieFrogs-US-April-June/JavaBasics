import java.util.Scanner;

public class HasNextMethodsPgm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Input:");
        if(sc.hasNextBigDecimal())
                System.out.println("Given BigDecimal number is:" + sc.next());
        //if(sc.hasNext())
          //      System.out.println("Given String is:" + sc.next());
        if(sc.hasNextInt())
            System.out.println("Given Integer is:" + sc.nextInt());
        if(sc.hasNextBoolean())
            System.out.println("Given Boolean is:" + sc.nextBoolean());
        if(sc.hasNextFloat())
            System.out.println("Given float is:" + sc.nextFloat());
        if(sc.hasNextDouble())
            System.out.println("Given number is:" + sc.nextDouble());


    }
}
