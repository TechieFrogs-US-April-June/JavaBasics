public class ScannerPractices {
    public class ScannerPractices {
        public static void main(String[] args) {
            //Adding two numbers
            int a,b,Sum;
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter a value:");
            a=sc.nextInt();
            System.out.print("Enter b value:");
            b=sc.nextInt();
            Sum=a+b;
            System.out.print("Sum of " + a +" and " + b + " is " + Sum);
    
             System.out.println("  ");
            sc.close();
    
            //EvenOrOdd pgm
            int a1;
            Scanner sc1=new Scanner(System.in);
            System.out.print("Enter Any Number:");
            a1=sc1.nextInt();
            if(a1%2==0)
            {
                System.out.print( a1 + " is an Even Number");
            }
            else
            {
                System.out.print(a1 + "is an Odd Number");
            }
            sc1.close();
            System.out.println("  ");
    
            //QuotientRemainderPgm
           int a2,b2;
            Scanner sc2=new Scanner(System.in);
            System.out.print("Enter value 1:");
            a2=sc2.nextInt();
            System.out.print("Enter value 2:");
            b2=sc2.nextInt();
            System.out.println("Quotient of " + a2  + " and " + b2 +" is " + a2/b2);
            System.out.println("Remainder is " + a2 + " and "+ b2 +" is " + a2%b2);
            sc2.close();
            System.out.println("  ");
            //swap two numbers
            int x,y,temp;
            Scanner sc3=new Scanner(System.in);
            System.out.print("Enter value 1:");
            x=sc3.nextInt();
            System.out.print("Enter value 2:");
            y=sc3.nextInt();
            System.out.println("Values of x and y before swapping:" + x  + " and " + y );
            temp=x;
            x=y;
            y=temp;
            System.out.println("Values of x and y After swapping:" + x  + " and " + y );
            sc3.close();
            System.out.println("  ");
    
    
           //Char is an Alphabet or not
            Scanner sc4=new Scanner(System.in);
            System.out.print("Enter any Character:");
            char a4=sc4.next().charAt(0);
    
    
            if(a4>=65 && a4<=90)
            {
                System.out.println(" given " + a4 + " is a UPPERCASE letter ");
            }
            else
                if(a4>=97 && a4<=122)
            {
                System.out.println(" given " + a4 + " is a LOWERCASE letter ");
            }
            else
            {
              System.out.println("Given character is a special character");
            }
            sc4.close();
            System.out.println("  ");
    
        }
    }
    
}
