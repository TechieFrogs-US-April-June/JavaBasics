public class PrintHalfPyramid {
    public static void main(String[] args) {
        
        // HALF PYRAMID PATTERN
        for(int i=1; i<=5; i++) //1<=5; yes; ,2<=5; yes
        {
            for(int j=1; j<=i; j++)// 2<=1 no; 2=2 yes; print *;
            {
                System.out.print("* ");
            }
            System.out.println("");
        }

        //HALF PYRAMID PATTERN USING NUMBERS
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(" " + j);
            }
            System.out.println(" ");
        }

        //HALF PYRAMID PATTERN USING ALPHABETS
        char a = 'A';
        // char b = 'B';
        // char c = 'C';
        //char d = 'D';
        //char e = 'E';

     for(int i=1; i<=5; ++i)
     {
         for(int j=1;j<=i;++j)
         {
             System.out.print(" "+ a);

         }
         ++a;
         System.out.println("");
     }

        
    }
    
}
