public class Example {
    public static void main(String[] args) {
        //pattern 1
        for(int i=5;i>=1;i--) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        System.out.println(" ");

        //pattern 2 half pyramid
        for(int i=1;i<=5;i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

       //pattern 3(inverted half pyramid)
        for(int i=5;i>=1;i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        //pattern 4 half pyramid using numbers
        for(int i=1;i<=5;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j +" ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        //pattern 5 (inverted half pyramid using numbers)
        for(int i=5;i>=1;i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        //pattern 6 printing Alphabets in half pyramid form
        int j;
        for(int i=1;i<=5;i++)
        {
            j=1;
           for (char ch = 'A'; j <=i ; ch++,j++)
           {
               System.out.print(ch + " ");
           } System.out.println(" ");
       }
        System.out.println(" ");
       //pattern 7 printing alphabets in inverted half pyramid
        int j2;
        for(int i=5;i>=1;i--) {
            j2=1;
            for (char ch='A'; j2 <= i;ch++,j2++) {
                System.out.print(ch + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

    // pattern 8
        int j3;
        for(int i=1;i<=5;i++)
        {
            j3=1;
            for(char ch='A';j3<=i;ch++,j3++)
            {
                System.out.print(ch);
            }System.out.println(" ");
        }
    }

}
