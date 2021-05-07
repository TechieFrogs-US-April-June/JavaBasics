import java.util.Scanner;

public class ConstructorPgm {
    private static final int ID = 0;
    private static int i,j,i1;
    private static String j1;
    int a,b,x,y,Sum,Sub,Mul,Div,Mod;
    private String Name;

    ConstructorPgm(){
        a=10;
        b=20;
    }

     ConstructorPgm(int x,int y)
    {

         Sum=x+y;
         Sub=x-y;
         Mul=x*y;
        Div=x/y;
         Mod=x%2;
    }
    ConstructorPgm(int ID,String Name){
        i1=ID;
        j1=Name;
     // System.out.println(" ID :" + ID +" "+"Name:" +Name);
    }


    public static void main(String[] args) {
        ConstructorPgm constructorPgmObj=new ConstructorPgm();
        System.out.println(" a value:" +constructorPgmObj.a + " " + " b value:"+ constructorPgmObj.b);

         Scanner sc=new Scanner(System.in);
         System.out.println("Enter value 1: ");
         i=sc.nextInt();
         System.out.println("Enter value 2: ");
         j=sc.nextInt();

        ConstructorPgm constructorPgmAddObj=new ConstructorPgm(i,j);
        System.out.println(" x value:" +constructorPgmObj.x + " " + " y value:"+ constructorPgmObj.y);
        System.out.println( " Sum of x and y :" + constructorPgmAddObj.Sum);
        System.out.println( " Sub of x and y :" + constructorPgmAddObj.Sub);
        System.out.println( " Mul of x and y :" + constructorPgmAddObj.Mul);
        System.out.println( " Div of x and y :" + constructorPgmAddObj.Div);
        System.out.println( " Mod of x and y :" + constructorPgmAddObj.Mod);


        System.out.println("Enter value : ");
        i1=sc.nextInt();
        System.out.println("Enter any String: ");
        j1=sc.next();
        ConstructorPgm constructorPgmObj1=new ConstructorPgm(i1,j1);
        System.out.println("ID: "+ constructorPgmObj1.ID +" "+"Name:"+constructorPgmObj1.Name);


        
    }
}
