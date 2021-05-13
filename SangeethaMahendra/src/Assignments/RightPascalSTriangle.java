package src.Assignments;

// Q28 : 	Right Pascal's Triangle
public class RightPascalSTriangle {
    public static void main(String[] args) {
        
        for(int i=1; i<=7; i++) //1<=5; yes; ,2<=7; yes
        {
            for(int j=1; j<=i; j++)// 2<=1 no; 2=2 yes; print *;
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
      
        for(int i=7; i>=1; i--)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
}
