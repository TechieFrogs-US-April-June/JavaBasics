public class ForLoop {
    public static void main(String[] args){
        /*for(int i = 0; i< 5; i++)
       // {

         //   System.out.println("Hello");
          //  i++;

        //}
        //for(int i=1;i<=5;++i){
          //  System.out.println(i);
        }
        for(int number = 100; number>0; number+= 10){
            System.out.println("number= " + number);


        }

      for(int i=1;i<=3;i++){
          for(int j=1;j<=i;j++){
              System.out.println(i+" "+j);
          }
      }


        for(int i=1;i<=5;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


            for(int i=0;i<=10;i++){
                for(int j=0;j<=i;j++){
                    System.out.print("* ");
                    if(i%2 == 0){
                        break;
                    }
                }
                System.out.println();
            }


        aa:
        for(int i=1;i<=3;i++){
        bb:
        for(int j=1;j<=3;j++){
            if(i==2&&j==2){
                break aa;
            }
            System.out.println(i+" "+j);
        }
        }

         */
        //for(int i = 0; i<5; i++)
        //{
            //System.out.println("Hello");
          //  i++;
       // }
        int count = 0;
        int sum = 0;
        for(int i = 1; i <= 1000; i++ ){
            if((i % 3 == 0) && (i % 5 == 0)){
                count++;
                sum += i;
                System.out.println("Found number = " +i);
            }
            if(count == 5)
              break;
        }
        System.out.println("Sum = " +sum);

    }

}
