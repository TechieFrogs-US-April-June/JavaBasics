package src.Assignments;

//Q25.	Print Pascal's triangle
public class PascalTriangle {
    public static void main(String[] args) {
        int k =1;
        // Number of Rows 5
        for(int i=0;i<=5; i++){ // i=0

            // spaces
            for(int j=1; j<=5-i; j++){ // j=0; 0<=5-1 = 4; 4 spaces
                System.out.print(" ");
            }

            //number 
            int number =1;
               for (k = 0; k <= i ; k++) {// k=1; 0<=1(i value); 1+1=2

                    System.out.print(number + " "); //number 1 will be printed
                    number = number * (i-k)/(k+1); //  number 1= 1* (0-0)/(0+1)= 1*0/1 = 1/1 = 1
                }
            System.out.println(" "); 
           
        }
    }
    
}
