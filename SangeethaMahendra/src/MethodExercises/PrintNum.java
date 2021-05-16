package src.MethodExercises;

public class PrintNum {
   int i = 100;
    void printNum(){
        System.out.println("Print the value of i : "+i);
    }
}
    class printj extends PrintNum{
        
      private int j =200;
        void printNum(){
            super.printNum();
            System.out.println("Print the value of j : "+j);
        }
        public static void main(String[] args) {
            printj jObj = new printj();
            jObj.i =100;
            jObj.j =200;
            jObj.printNum();
        }
    
}
