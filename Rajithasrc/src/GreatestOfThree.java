package src;

public class GreatestOfThree {
    public static void main(String[] args){
        int a=80;
        int b=50;//if we give b=80 like same values it will print b next part or else part we give all same values
        int c=70;

        if(a>b && a>c)//(40>50 && 40>70) false
            System.out.println("a is greatest number");
        else if(b>a && b>c)//(50>40 && 50>70) false
            System.out.println("b is greatest number");
        else //(70>40 && 70>50)
            System.out.println("c is greatest number");
            /*Scanner sc=new Scanner(System.in);
            System.out.println("Enter integer a");
            int a=sc.nextInt();
            System.out.println("a value is"+a);
            System.out.println("Enter integer b");
            int b=sc.nextInt();
            System.out.println("b value is"+b);
            System.out.println("Enter integer c");
            int c=sc.nextInt();
            System.out.println("c value is"+c);
            */
    }
}
    

