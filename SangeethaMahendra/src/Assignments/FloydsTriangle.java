package src.Assignments;
//Q26.	Print Floyd's Triangle.

public class FloydsTriangle {
    public static void main(String[] args) {
        int k=1;
        //Rows
        for (int i = 1; i <= 4; i++) { 

            //Spaces
            for (int j = 1; j <= i; j++) {
               // System.out.print("");
          
               // Printing numbers
              
                System.out.print(k+" ");
                k++;
               
            }
            System.out.println();
        }
    }
    
}
