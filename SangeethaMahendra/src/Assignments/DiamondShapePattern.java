package src.Assignments;

//Q27 : Diamond Shape Pattern

public class DiamondShapePattern {

    public static void main(String[] args) {
            int star = 0;
            int rows = 7;
            int i;
            for (i = 1; i <= rows; ++i, star = 0) { // 1<=5;1+1=2;
                for (int j = 1; j <= rows - i; ++j) {
                    System.out.print("  ");
                }
    
                while (star != 2 * i - 1) {
    
                    System.out.print("* ");
                    ++star;
    
                }
                System.out.println();
            }
            int r = 6;
        
            for (int i1 = r; i1 >= 1; --i1) { 
                for (int j = 0; j <= r - i1; ++j) {
                    System.out.print("  ");
                }
    
                for(int j=i1; j <= 2 * i1 - 1; j++) {
                    System.out.print("* ");
                  }
            
                  for(int j = 0; j < i1 - 1; ++j) {
                    System.out.print("* ");
                  
                }
                System.out.println();
            }
    
           
        }
    
    
}
