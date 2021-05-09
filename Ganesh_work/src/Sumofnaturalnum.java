public class Sumofnaturalnum {

        public static void main(String[] args) {
            int num = 5;
            int sum = 1;
            //for loop
            /*for(int i = 1; i<=num; i++ )
            {
                sum  =  sum+i;
            }*/
            int i = 1;
            //while loop
            while(i<=num)
            {
                sum = sum+i;
                i++;
            }
    
    System.out.println("sum of  " + num + " is "  + sum);
        }
    
    }
