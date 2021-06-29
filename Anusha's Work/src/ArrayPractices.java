public class ArrayPractices {
    public static void main(String[] args) {
            int a[]={1,2,3,4,5};
            //printing array values
           /* for(int i=0;i<a.length;i++){
                //a[i];
                System.out.println(a[i]);
            }*/
      /*  //printing array values in reverse order
        for(int i=a.length-1;i>=0;i--){
            System.out.println(a[i]);
        }*/
     /*   //enhanced for loop
        for(int b:a){
            System.out.println(b);
        }*/
      /*  for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                System.out.println(a[i] +" is Even Number ");
            }
            else{
                System.out.println(a[i] +" is Odd Number ");
            }
        }*/
        //printing EvenSum
      /*  int Sum=0;
        for(int d:a){
            if(d%2==0){
                Sum=Sum+d;
            }
        }
        System.out.println("EvenSum of the Given Array is:"+Sum);*/
        //to check whether given number exist in an array
        int a1[]={10,20,30,40,50};
        int numtocheck1=30;
        for(int i=0;i<a1.length;i++) {
            if (a1[i] == numtocheck1) {
                System.out.println(numtocheck1 + " exists in an array at " + a[i] + " position");
            }
        }
        //removing particular element in an array
      /*  int a2[]={1,2,3,4,5};
        int b[]=new int[a2.length];*/

    }
}
