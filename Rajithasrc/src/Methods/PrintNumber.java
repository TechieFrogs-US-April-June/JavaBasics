package Methods;

public class PrintNumber {

    void printn(){
        System.out.println("Printing no parameter method");
    }
     
    

     void printn(int c,long d){
         System.out.println("Printing integer and long values "+c+"    "+d);
     }
     double printn(double e,float f){
         System.out.println("Printing double and float values  "+e+"     "+f+"    "+(e+f));
         return e+f;
     }
     void printn(int a,char c,String s){
         System.out.println("Printing integer,character and String values  "+a+"   "+c+"     "+s);
     }

     public static void main(String[] args) {
         PrintNumber pnobj = new PrintNumber();
         pnobj.printn();
         pnobj.printn(565,6456456);
         pnobj.printn(55.55,65.55f);
         pnobj.printn(4,'r',"krishna");

     }
}
